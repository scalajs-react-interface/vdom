package sri.web.vdom.styles

import sri.universal.styles.InlineStylesMacro

import scala.language.experimental.macros
import scala.scalajs.js

trait InlineStyleSheetWeb {

  object dsl extends InlineStyleSheetWebProps

  def style(props: InlineStylePropWeb.type*): js.Any =
    macro InlineStylesWebMacro.styleMacroImpl
}
