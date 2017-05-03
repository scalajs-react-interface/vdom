package sri.web.template.components

import org.scalajs.dom
import sri.core._
import sri.scalacss.Defaults._
import sri.web.styledtagsPrefix_<^._
import sri.web.template.styles.GlobalStyle

import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
private class StyledTagsComTest extends ComponentS[State] {
  initialState(State("sri"))
  override def render(): ReactElement = test
  def onTextChange(e: ReactEventI) = {
    val value = e.target.value
    dom.window.console.log(value)
    setState(_.copy(text = value))
  }
  private def test1 = <.div()("Only contents.")
  private def test2 = <.div(^.value := "some value")("Contents with value")
  private def test3 = <.div(^.value := "some value")(
    "Has child:",
    <.p(^.value := "v1")("I'm a child <p>")
  )
  private def test4 = <.a(
    ^.onClick := ((e: ReactEventI) => println("something1"))
  )("Click me will log something.")

  private def test = <.div(
    ^.key := 3,
    ^.ref := ((n: dom.Node) => n),
    ^.className := GlobalStyle.flexOneAndCenter
  )(
    <.p()("This is generated by styled tags."),
    <.input(
      ^.onChange := onTextChange _,
      ^.value := state.text
    ),
    <.button(^.onClick := ((e: ReactEvent) => setState(_ => State(""))))("Click me to clear.")
  )

}
case class State(text: String)
object StyledTagsComTest {
  def apply(): ReactElement = CreateElementNoProps[StyledTagsComTest]()
}