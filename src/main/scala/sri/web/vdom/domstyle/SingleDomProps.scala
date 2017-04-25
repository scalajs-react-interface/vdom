package sri.web.vdom.domstyle

import sri.web.vdom.DOMProps

/**
  * Standing for single var or val of `DOMProps`.
  *
  * Provide a scalatags-like style to unify `DOMProps` and `ReactNode`.
  *
  * @author Cause Chung
  */
trait SingleDomProps

private object SingleDomConversion{
  def propss2DomProps(propss: Seq[SingleDomProps]): DOMProps = {
    ???
  }
}
