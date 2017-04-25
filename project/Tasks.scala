import sbt.Keys._
import sbt._

object Tasks {
  private val tagFile = new File("./src/main/scala/sri/web/vdom/Tags.scala")

  //see #2
  private val removeOverloadedTags = taskKey[Unit]("Remove overloaded tags.")
  private val recoverOverloadedTags = taskKey[Unit]("Recover Tags.scala file from bak.")

  //create scalatags-like dom style.
  private val genStyledDomNode = taskKey[Unit]("Generate styled dom node.")
  private val genStyledDomProps = taskKey[Unit]("Generate styled dom props.")

  // ------------- definitions: --------------
  val taskSettings = Seq[Setting[_]](
    removeOverloadedTags := {
      val logger = streams.value.log
      val src = tagFile
      val dest = new File("./bak/Tags.scala")
      if (dest.exists()) logger.error("Tags.scala bak file already exists. Give up task!")
      else {
        IO.copyFile(src, dest)
        val all = IO.read(src).split("""@inline""")
        val head = all.head
        val first = "@inline" + all.tail.filter(_.contains("dom.Node")).mkString("@inline")
          .dropRight(3) //drop tail whiteSpace line.
        val second = all.tail.filter(!_.contains("dom.Node")).mkString("@inline")

        IO.write(new File("./bak/second.txt"), second)
        IO.write(src, head + first + IO.Newline + "}" + IO.Newline)
        logger.info(s"Removed second tag method in Tags.scala, file backed up in ./bak")
      }
    },
    recoverOverloadedTags := {
      val src = new File("./bak/Tags.scala")
      val dest = tagFile
      IO.copyFile(src, dest)
      streams.value.log.info(s"Tags.scala recovered from ./bak")
    },
    genStyledDomNode := {
      val head =
        s"""
           |package sri.web.vdom.domstyle
           |
           |object < {
          """.stripMargin + IO.Newline

      val NameExtr = """.* def (name)[.*""".r
      val body = IO.readLines(tagFile).filter(_.contains("def")).map {
        case NameExtr(domName) =>
          s"""
             |  @inline def $domName(propss: SingleDomProps | ReactNode*): ReactElement = {
             |    val domProps = propss collect { case p: SingleDomProps => p }
             |    val nodes = propss collect { case n: ReactNode => n }
             |    sri.web.vdom.tags.$domName(propss2DomProps(domProps))(nodes: _*)
             |  }
          """.stripMargin + IO.Newline
      }
      val dest = new File("./src/main/scala/sri/web/vdom/domstyle/<.scala")
      IO.write(dest, head + body + "}" + IO.Newline)
      streams.value.log.info(s"Dom < generated into ${dest.getCanonicalPath}")
    },
    genStyledDomProps := {

    }
  )
}