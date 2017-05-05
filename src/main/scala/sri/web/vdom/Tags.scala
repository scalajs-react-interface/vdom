package sri.web.vdom

import org.scalajs.dom
import sri.core._
import sri.macros.{
  FunctionObjectMacro,
  exclude,
  OptDefault => NoValue,
  OptionalParam => U
}
import sri.universal.MergeJSObjects

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.`|`

trait Tags extends ReactEventAliases {

  @inline
  def solidcolor[T <: dom.Node](style: U[js.Any] = NoValue,
                                id: U[String] = NoValue,
                                className: U[String] = NoValue,
                                @exclude key: String | Int = null,
                                @exclude ref: js.Function1[T, Unit] = null,
                                @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("solidcolor", props, children = children.toJSArray)
  }

  @inline
  def big[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("big", props, children = children.toJSArray)
  }

  @inline
  def tr[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("tr", props, children = children.toJSArray)
  }

  @inline
  def cite[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("cite", props, children = children.toJSArray)
  }

  @inline
  def html[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("html", props, children = children.toJSArray)
  }

  @inline
  def footer[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("footer", props, children = children.toJSArray)
  }

  @inline
  def h4[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("h4", props, children = children.toJSArray)
  }

  @inline
  def caption[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("caption", props, children = children.toJSArray)
  }

  @inline
  def datalist[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("datalist", props, children = children.toJSArray)
  }

  @inline
  def header[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("header", props, children = children.toJSArray)
  }

  @inline
  def wbr[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("wbr", props)
  }

  @inline
  def canvas[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("canvas", props, children = children.toJSArray)
  }

  @inline
  def base[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("base", props)
  }

  @inline
  def source[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("source", props)
  }

  @inline
  def feFuncB[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feFuncB", props, children = children.toJSArray)
  }

  @inline
  def b[T <: dom.Node](style: U[js.Any] = NoValue,
                       id: U[String] = NoValue,
                       className: U[String] = NoValue,
                       @exclude key: String | Int = null,
                       @exclude ref: js.Function1[T, Unit] = null,
                       @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("b", props, children = children.toJSArray)
  }

  @inline
  def mesh[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("mesh", props, children = children.toJSArray)
  }

  @inline
  def table[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("table", props, children = children.toJSArray)
  }

  @inline
  def style[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("style", props, children = children.toJSArray)
  }

  @inline
  def title[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("title", props, children = children.toJSArray)
  }

  @inline
  def keygen[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("keygen", props)
  }

  @inline
  def tfoot[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("tfoot", props, children = children.toJSArray)
  }

  @inline
  def view[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("view", props, children = children.toJSArray)
  }

  @inline
  def area[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("area", props)
  }

  @inline
  def details[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("details", props, children = children.toJSArray)
  }

  @inline
  def feDistantLight[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feDistantLight", props, children = children.toJSArray)
  }

  @inline
  def hgroup[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("hgroup", props, children = children.toJSArray)
  }

  @inline
  def hr[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("hr", props)
  }

  @inline
  def q[T <: dom.Node](style: U[js.Any] = NoValue,
                       id: U[String] = NoValue,
                       className: U[String] = NoValue,
                       @exclude key: String | Int = null,
                       @exclude ref: js.Function1[T, Unit] = null,
                       @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("q", props, children = children.toJSArray)
  }

  @inline
  def meshpatch[T <: dom.Node](style: U[js.Any] = NoValue,
                               id: U[String] = NoValue,
                               className: U[String] = NoValue,
                               @exclude key: String | Int = null,
                               @exclude ref: js.Function1[T, Unit] = null,
                               @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("meshpatch", props, children = children.toJSArray)
  }

  @inline
  def legend[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("legend", props, children = children.toJSArray)
  }

  @inline
  def feTurbulence[T <: dom.Node](style: U[js.Any] = NoValue,
                                  id: U[String] = NoValue,
                                  className: U[String] = NoValue,
                                  @exclude key: String | Int = null,
                                  @exclude ref: js.Function1[T, Unit] = null,
                                  @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feTurbulence", props, children = children.toJSArray)
  }

  @inline
  def set[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("set", props, children = children.toJSArray)
  }

  @inline
  def link[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("link", props)
  }

  @inline
  def meshgradient[T <: dom.Node](style: U[js.Any] = NoValue,
                                  id: U[String] = NoValue,
                                  className: U[String] = NoValue,
                                  @exclude key: String | Int = null,
                                  @exclude ref: js.Function1[T, Unit] = null,
                                  @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("meshgradient", props, children = children.toJSArray)
  }

  @inline
  def del[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("del", props, children = children.toJSArray)
  }

  @inline
  def line[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("line", props, children = children.toJSArray)
  }

  @inline
  def rt[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("rt", props, children = children.toJSArray)
  }

  @inline
  def map[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("map", props, children = children.toJSArray)
  }

  @inline
  def fieldset[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("fieldset", props, children = children.toJSArray)
  }

  @inline
  def menu[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("menu", props, children = children.toJSArray)
  }

  @inline
  def polygon[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("polygon", props, children = children.toJSArray)
  }

  @inline
  def ol[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("ol", props, children = children.toJSArray)
  }

  @inline
  def unknown[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("unknown", props, children = children.toJSArray)
  }

  @inline
  def tbody[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("tbody", props, children = children.toJSArray)
  }

  @inline
  def feDiffuseLighting[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feDiffuseLighting", props, children = children.toJSArray)
  }

  @inline
  def feImage[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feImage", props, children = children.toJSArray)
  }

  @inline
  def pre[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("pre", props, children = children.toJSArray)
  }

  @inline
  def filter[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("filter", props, children = children.toJSArray)
  }

  @inline
  def optgroup[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("optgroup", props, children = children.toJSArray)
  }

  @inline
  def mask[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("mask", props, children = children.toJSArray)
  }

  @inline
  def embed[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("embed", props)
  }

  @inline
  def u[T <: dom.Node](style: U[js.Any] = NoValue,
                       id: U[String] = NoValue,
                       className: U[String] = NoValue,
                       @exclude key: String | Int = null,
                       @exclude ref: js.Function1[T, Unit] = null,
                       @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("u", props, children = children.toJSArray)
  }

  @inline
  def image[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("image", props, children = children.toJSArray)
  }

  @inline
  def select[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("select", props, children = children.toJSArray)
  }

  @inline
  def s[T <: dom.Node](style: U[js.Any] = NoValue,
                       id: U[String] = NoValue,
                       className: U[String] = NoValue,
                       @exclude key: String | Int = null,
                       @exclude ref: js.Function1[T, Unit] = null,
                       @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("s", props, children = children.toJSArray)
  }

  @inline
  def use[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("use", props, children = children.toJSArray)
  }

  @inline
  def input[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      onChange: U[ReactEventI => _] = NoValue,
      value: U[String | Int | Double] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    import sri.universal.DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("input", props)
  }

  @inline
  def thead[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("thead", props, children = children.toJSArray)
  }

  @inline
  def feMergeNode[T <: dom.Node](style: U[js.Any] = NoValue,
                                 id: U[String] = NoValue,
                                 className: U[String] = NoValue,
                                 @exclude key: String | Int = null,
                                 @exclude ref: js.Function1[T, Unit] = null,
                                 @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feMergeNode", props, children = children.toJSArray)
  }

  @inline
  def h6[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("h6", props, children = children.toJSArray)
  }

  @inline
  def abbr[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("abbr", props, children = children.toJSArray)
  }

  @inline
  def meshrow[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("meshrow", props, children = children.toJSArray)
  }

  @inline
  def td[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("td", props, children = children.toJSArray)
  }

  @inline
  def em[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("em", props, children = children.toJSArray)
  }

  @inline
  def feFlood[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feFlood", props, children = children.toJSArray)
  }

  @inline
  def svg[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("svg", props, children = children.toJSArray)
  }

  @inline
  def colgroup[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("colgroup", props, children = children.toJSArray)
  }

  @inline
  def track[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("track", props)
  }

  @inline
  def bdo[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("bdo", props, children = children.toJSArray)
  }

  @inline
  def circle[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("circle", props, children = children.toJSArray)
  }

  @inline
  def time[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("time", props, children = children.toJSArray)
  }

  @inline
  def feBlend[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feBlend", props, children = children.toJSArray)
  }

  @inline
  def ul[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("ul", props, children = children.toJSArray)
  }

  @inline
  def body[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("body", props, children = children.toJSArray)
  }

  @inline
  def output[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("output", props, children = children.toJSArray)
  }

  @inline
  def feOffset[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feOffset", props, children = children.toJSArray)
  }

  @inline
  def `var`[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("var", props, children = children.toJSArray)
  }

  @inline
  def progress[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("progress", props, children = children.toJSArray)
  }

  @inline
  def h1[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("h1", props, children = children.toJSArray)
  }

  @inline
  def figcaption[T <: dom.Node](style: U[js.Any] = NoValue,
                                id: U[String] = NoValue,
                                className: U[String] = NoValue,
                                @exclude key: String | Int = null,
                                @exclude ref: js.Function1[T, Unit] = null,
                                @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("figcaption", props, children = children.toJSArray)
  }

  @inline
  def stop[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("stop", props, children = children.toJSArray)
  }

  @inline
  def defs[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("defs", props, children = children.toJSArray)
  }

  @inline
  def iframe[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("iframe", props, children = children.toJSArray)
  }

  @inline
  def small[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("small", props, children = children.toJSArray)
  }

  @inline
  def textPath[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("textPath", props, children = children.toJSArray)
  }

  @inline
  def picture[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("picture", props, children = children.toJSArray)
  }

  @inline
  def a[T <: dom.Node](style: U[js.Any] = NoValue,
                       id: U[String] = NoValue,
                       className: U[String] = NoValue,
                       href: U[String] = NoValue,
                       target: U[String] = NoValue,
                       @exclude key: String | Int = null,
                       @exclude ref: js.Function1[T, Unit] = null,
                       @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("a", props, children = children.toJSArray)
  }

  @inline
  def meta[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("meta", props)
  }

  @inline
  def article[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("article", props, children = children.toJSArray)
  }

  @inline
  def blockquote[T <: dom.Node](style: U[js.Any] = NoValue,
                                id: U[String] = NoValue,
                                className: U[String] = NoValue,
                                @exclude key: String | Int = null,
                                @exclude ref: js.Function1[T, Unit] = null,
                                @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("blockquote", props, children = children.toJSArray)
  }

  @inline
  def fePointLight[T <: dom.Node](style: U[js.Any] = NoValue,
                                  id: U[String] = NoValue,
                                  className: U[String] = NoValue,
                                  @exclude key: String | Int = null,
                                  @exclude ref: js.Function1[T, Unit] = null,
                                  @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("fePointLight", props, children = children.toJSArray)
  }

  @inline
  def feFuncA[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feFuncA", props, children = children.toJSArray)
  }

  @inline
  def bdi[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("bdi", props, children = children.toJSArray)
  }

  @inline
  def li[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("li", props, children = children.toJSArray)
  }

  @inline
  def cursor[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("cursor", props, children = children.toJSArray)
  }

  @inline
  def h5[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("h5", props, children = children.toJSArray)
  }

  @inline
  def col[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("col", props)
  }

  @inline
  def dialog[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("dialog", props, children = children.toJSArray)
  }

  @inline
  def kbd[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("kbd", props, children = children.toJSArray)
  }

  @inline
  def nav[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("nav", props, children = children.toJSArray)
  }

  @inline
  def aside[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("aside", props, children = children.toJSArray)
  }

  @inline
  def animateTransform[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("animateTransform", props, children = children.toJSArray)
  }

  @inline
  def g[T <: dom.Node](style: U[js.Any] = NoValue,
                       id: U[String] = NoValue,
                       className: U[String] = NoValue,
                       @exclude key: String | Int = null,
                       @exclude ref: js.Function1[T, Unit] = null,
                       @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("g", props, children = children.toJSArray)
  }

  @inline
  def span[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("span", props, children = children.toJSArray)
  }

  @inline
  def ellipse[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("ellipse", props, children = children.toJSArray)
  }

  @inline
  def feSpotLight[T <: dom.Node](style: U[js.Any] = NoValue,
                                 id: U[String] = NoValue,
                                 className: U[String] = NoValue,
                                 @exclude key: String | Int = null,
                                 @exclude ref: js.Function1[T, Unit] = null,
                                 @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feSpotLight", props, children = children.toJSArray)
  }

  @inline
  def feFuncG[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feFuncG", props, children = children.toJSArray)
  }

  @inline
  def th[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("th", props, children = children.toJSArray)
  }

  @inline
  def pattern[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("pattern", props, children = children.toJSArray)
  }

  @inline
  def ins[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("ins", props, children = children.toJSArray)
  }

  @inline
  def p[T <: dom.Node](style: U[js.Any] = NoValue,
                       id: U[String] = NoValue,
                       className: U[String] = NoValue,
                       @exclude key: String | Int = null,
                       @exclude ref: js.Function1[T, Unit] = null,
                       @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("p", props, children = children.toJSArray)
  }

  @inline
  def `object`[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("object", props, children = children.toJSArray)
  }

  @inline
  def hatchpath[T <: dom.Node](style: U[js.Any] = NoValue,
                               id: U[String] = NoValue,
                               className: U[String] = NoValue,
                               @exclude key: String | Int = null,
                               @exclude ref: js.Function1[T, Unit] = null,
                               @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("hatchpath", props, children = children.toJSArray)
  }

  @inline
  def feMerge[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feMerge", props, children = children.toJSArray)
  }

  @inline
  def feColorMatrix[T <: dom.Node](style: U[js.Any] = NoValue,
                                   id: U[String] = NoValue,
                                   className: U[String] = NoValue,
                                   @exclude key: String | Int = null,
                                   @exclude ref: js.Function1[T, Unit] = null,
                                   @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feColorMatrix", props, children = children.toJSArray)
  }

  @inline
  def script[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("script", props, children = children.toJSArray)
  }

  @inline
  def feMorphology[T <: dom.Node](style: U[js.Any] = NoValue,
                                  id: U[String] = NoValue,
                                  className: U[String] = NoValue,
                                  @exclude key: String | Int = null,
                                  @exclude ref: js.Function1[T, Unit] = null,
                                  @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feMorphology", props, children = children.toJSArray)
  }

  @inline
  def summary[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("summary", props, children = children.toJSArray)
  }

  @inline
  def feFuncR[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feFuncR", props, children = children.toJSArray)
  }

  @inline
  def br[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("br", props)
  }

  @inline
  def sup[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("sup", props, children = children.toJSArray)
  }

  @inline
  def clipPath[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("clipPath", props, children = children.toJSArray)
  }

  @inline
  def dt[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("dt", props, children = children.toJSArray)
  }

  @inline
  def hatch[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("hatch", props, children = children.toJSArray)
  }

  @inline
  def code[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("code", props, children = children.toJSArray)
  }

  @inline
  def polyline[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("polyline", props, children = children.toJSArray)
  }

  @inline
  def h2[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("h2", props, children = children.toJSArray)
  }

  @inline
  def menuitem[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("menuitem", props)
  }

  @inline
  def address[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("address", props, children = children.toJSArray)
  }

  @inline
  def feComponentTransfer[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feComponentTransfer",
                     props,
                     children = children.toJSArray)
  }

  @inline
  def feDropShadow[T <: dom.Node](style: U[js.Any] = NoValue,
                                  id: U[String] = NoValue,
                                  className: U[String] = NoValue,
                                  @exclude key: String | Int = null,
                                  @exclude ref: js.Function1[T, Unit] = null,
                                  @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feDropShadow", props, children = children.toJSArray)
  }

  @inline
  def ruby[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("ruby", props, children = children.toJSArray)
  }

  @inline
  def feSpecularLighting[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feSpecularLighting",
                     props,
                     children = children.toJSArray)
  }

  @inline
  def path[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("path", props, children = children.toJSArray)
  }

  @inline
  def feTile[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feTile", props, children = children.toJSArray)
  }

  @inline
  def metadata[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("metadata", props, children = children.toJSArray)
  }

  @inline
  def feGaussianBlur[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feGaussianBlur", props, children = children.toJSArray)
  }

  @inline
  def symbol[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("symbol", props, children = children.toJSArray)
  }

  @inline
  def desc[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("desc", props, children = children.toJSArray)
  }

  @inline
  def dl[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("dl", props, children = children.toJSArray)
  }

  @inline
  def meter[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("meter", props, children = children.toJSArray)
  }

  @inline
  def figure[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("figure", props, children = children.toJSArray)
  }

  @inline
  def samp[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("samp", props, children = children.toJSArray)
  }

  @inline
  def rp[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("rp", props, children = children.toJSArray)
  }

  @inline
  def foreignObject[T <: dom.Node](style: U[js.Any] = NoValue,
                                   id: U[String] = NoValue,
                                   className: U[String] = NoValue,
                                   @exclude key: String | Int = null,
                                   @exclude ref: js.Function1[T, Unit] = null,
                                   @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("foreignObject", props, children = children.toJSArray)
  }

  @inline
  def dfn[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("dfn", props, children = children.toJSArray)
  }

  @inline
  def feConvolveMatrix[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feConvolveMatrix", props, children = children.toJSArray)
  }

  @inline
  def option[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("option", props, children = children.toJSArray)
  }

  @inline
  def head[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("head", props, children = children.toJSArray)
  }

  @inline
  def video[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("video", props, children = children.toJSArray)
  }

  @inline
  def main[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("main", props, children = children.toJSArray)
  }

  @inline
  def i[T <: dom.Node](style: U[js.Any] = NoValue,
                       id: U[String] = NoValue,
                       className: U[String] = NoValue,
                       @exclude key: String | Int = null,
                       @exclude ref: js.Function1[T, Unit] = null,
                       @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("i", props, children = children.toJSArray)
  }

  @inline
  def sub[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("sub", props, children = children.toJSArray)
  }

  @inline
  def label[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("label", props, children = children.toJSArray)
  }

  @inline
  def button[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("button", props, children = children.toJSArray)
  }

  @inline
  def feComposite[T <: dom.Node](style: U[js.Any] = NoValue,
                                 id: U[String] = NoValue,
                                 className: U[String] = NoValue,
                                 @exclude key: String | Int = null,
                                 @exclude ref: js.Function1[T, Unit] = null,
                                 @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feComposite", props, children = children.toJSArray)
  }

  @inline
  def mpath[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("mpath", props, children = children.toJSArray)
  }

  @inline
  def h3[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("h3", props, children = children.toJSArray)
  }

  @inline
  def animate[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("animate", props, children = children.toJSArray)
  }

  @inline
  def discard[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("discard", props, children = children.toJSArray)
  }

  @inline
  def section[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("section", props, children = children.toJSArray)
  }

  @inline
  def linearGradient[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("linearGradient", props, children = children.toJSArray)
  }

  @inline
  def text[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("text", props, children = children.toJSArray)
  }

  @inline
  def div[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         onClick: U[ReactEventH => Unit] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("div", props, children = children.toJSArray)
  }

  @inline
  def audio[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("audio", props, children = children.toJSArray)
  }

  @inline
  def tspan[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("tspan", props, children = children.toJSArray)
  }

  @inline
  def mark[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("mark", props, children = children.toJSArray)
  }

  @inline
  def animateMotion[T <: dom.Node](style: U[js.Any] = NoValue,
                                   id: U[String] = NoValue,
                                   className: U[String] = NoValue,
                                   @exclude key: String | Int = null,
                                   @exclude ref: js.Function1[T, Unit] = null,
                                   @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("animateMotion", props, children = children.toJSArray)
  }

  @inline
  def form[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("form", props, children = children.toJSArray)
  }

  @inline
  def textarea[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("textarea", props, children = children.toJSArray)
  }

  @inline
  def param[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("param", props)
  }

  @inline
  def marker[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("marker", props, children = children.toJSArray)
  }

  @inline
  def noscript[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("noscript", props, children = children.toJSArray)
  }

  @inline
  def dd[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("dd", props, children = children.toJSArray)
  }

  @inline
  def radialGradient[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("radialGradient", props, children = children.toJSArray)
  }

  @inline
  def rect[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("rect", props, children = children.toJSArray)
  }

  @inline
  def feDisplacementMap[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feDisplacementMap", props, children = children.toJSArray)
  }

  @inline
  def switch[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("switch", props, children = children.toJSArray)
  }

  @inline
  def data[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("data", props, children = children.toJSArray)
  }

  @inline
  def img[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("img", props)
  }

  @inline
  def strong[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("strong", props, children = children.toJSArray)
  }

}
