package sri.web.template

import org.scalajs.dom
import sri.web.ReactDOM
import sri.web.template.components.HomeScreen
import sri.web.template.styles.AppStyles

import scala.scalajs.js.JSApp

object WebApp extends JSApp {

  def main(): Unit = {
    AppStyles.load()
    ReactDOM.render(HomeScreen(), dom.document.getElementById("app"))
    println("[info] Client rendering completed.")
  }

}
