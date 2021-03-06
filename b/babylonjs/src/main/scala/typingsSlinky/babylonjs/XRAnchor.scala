package typingsSlinky.babylonjs

import org.scalajs.dom.raw.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XRAnchor extends js.Object {
  var anchorSpace: EventTarget
  // remove?
  var id: js.UndefOr[String] = js.undefined
  var lastChangedTime: Double
  def detach(): Unit
}

object XRAnchor {
  @scala.inline
  def apply(anchorSpace: EventTarget, detach: () => Unit, lastChangedTime: Double, id: String = null): XRAnchor = {
    val __obj = js.Dynamic.literal(anchorSpace = anchorSpace.asInstanceOf[js.Any], detach = js.Any.fromFunction0(detach), lastChangedTime = lastChangedTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRAnchor]
  }
}

