import sbt.Keys._
import sbt._

object Tasks {

  private val removeOverloadedTags = taskKey[Unit]("Remove overloaded tags.")
  private val recoverOverloadedTags = taskKey[Unit]("Recover Tags.scala file from bak.")
  val taskSettings = Seq[Setting[_]](
    removeOverloadedTags := {
      val src = new File("./src/main/scala/sri/web/vdom/Tags.scala")
      val dest = new File("./bak/Tags.scala")
      IO.copyFile(src, dest)
      val regex ="""^ @inline$\t"""

      val all = IO.read(src).split("""@inline""")
      val head = all.head
      val first = all.tail.filter(_.contains("dom.Node")).mkString("@inline")
        .dropRight(3) //drop tail whiteSpace line.
      val second = all.tail.filter(!_.contains("dom.Node")).mkString("@inline")

      IO.write(new File("./bak/second.txt"), second)
      IO.write(src, head + first + IO.Newline + "}" + IO.Newline)
      streams.value.log.info(s"Removed second tag method in Tags.scala, file backed up in ./bak")
    },
    recoverOverloadedTags := {
      val src = new File("./bak/Tags.scala")
      val dest = new File("./src/main/scala/sri/web/vdom/Tags.scala")
      IO.copyFile(src, dest)
      streams.value.log.info(s"Tags.scala recovered from ./bak")
    }
  )
}