package typingsSlinky.webcola.layoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  var alpha: Double = js.native
  var listener: js.UndefOr[js.Function0[Unit]] = js.native
  var stress: js.UndefOr[Double] = js.native
  var `type`: EventType = js.native
}

object Event {
  @scala.inline
  def apply(alpha: Double, `type`: EventType): Event = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: EventType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setListener(value: () => Unit): Self = this.set("listener", js.Any.fromFunction0(value))
    @scala.inline
    def deleteListener: Self = this.set("listener", js.undefined)
    @scala.inline
    def setStress(value: Double): Self = this.set("stress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStress: Self = this.set("stress", js.undefined)
  }
  
}

