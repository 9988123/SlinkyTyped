package typingsSlinky.semanticUiReact

import slinky.core.ReactComponentClass
import typingsSlinky.semanticUiReact.buttonContentMod.ButtonContentProps
import typingsSlinky.semanticUiReact.buttonGroupMod.ButtonGroupProps
import typingsSlinky.semanticUiReact.buttonOrMod.ButtonOrProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/elements/Button", JSImport.Namespace)
@js.native
object buttonMod extends js.Object {
  @js.native
  class default ()
    extends typingsSlinky.semanticUiReact.buttonButtonMod.default
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Content: ReactComponentClass[ButtonContentProps] = js.native
    var Group: ReactComponentClass[ButtonGroupProps] = js.native
    var Or: ReactComponentClass[ButtonOrProps] = js.native
  }
  
}

