package typingsSlinky.nextReactDevOverlay

import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import slinky.core.ReactComponentClass
import typingsSlinky.nextReactDevOverlay.nextReactDevOverlayStrings.error
import typingsSlinky.nextReactDevOverlay.nextReactDevOverlayStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@next/react-dev-overlay/lib/internal/components/Dialog/Dialog", JSImport.Namespace)
@js.native
object dialogDialogMod extends js.Object {
  @js.native
  trait DialogProps extends js.Object {
    var `aria-describedby`: String = js.native
    var `aria-labelledby`: String = js.native
    var `type`: error | warning = js.native
    def onClose(e: MouseEvent): Unit = js.native
    def onClose(e: TouchEvent): Unit = js.native
  }
  
  val Dialog: ReactComponentClass[DialogProps] = js.native
}

