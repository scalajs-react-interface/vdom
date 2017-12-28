package sri.web.vdom

import sri.web.vdom.styles.InlineStyleSheetWeb

import scala.scalajs.js

class InlineStyleSheetWebTest extends BaseTest {

  object styles extends InlineStyleSheetWeb {
    import dsl._
    import sri.universal.styles.units._

    val container = style(display.flex,
                          fontSize := 15.px,
                          alignItems.center,
                          background := "red")
  }

  test("InlineStyleSheetWebTest") {

      val input = styles.container.asInstanceOf[js.Dynamic]
      expect(input).toEqual(
        js.Dynamic.literal(display = "flex",
                           fontSize = "15px",
                           alignItems = "center",
                           background = "red"))
    }
}
