package typingsSlinky.officeUiFabricReact.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "getNextElement")
@js.native
object getNextElement extends js.Object {
  def apply(
    rootElement: HTMLElement,
    currentElement: HTMLElement | Null,
    checkNode: js.UndefOr[Boolean],
    suppressParentTraversal: js.UndefOr[Boolean],
    suppressChildTraversal: js.UndefOr[Boolean],
    includeElementsInFocusZones: js.UndefOr[Boolean],
    allowFocusRoot: js.UndefOr[Boolean],
    tabbable: js.UndefOr[Boolean]
  ): HTMLElement | Null = js.native
}

