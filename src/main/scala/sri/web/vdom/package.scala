package sri.web

import scala.scalajs.js.Dynamic.{literal => json}

package object vdom {

  object tags extends Tags

  object tagsPrefix_< extends ReactEventAliases {
    @inline def < = tags
  }

}
