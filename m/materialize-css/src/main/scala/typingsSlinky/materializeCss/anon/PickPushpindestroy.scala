package typingsSlinky.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Pushpin, 'destroy'> */
@js.native
trait PickPushpindestroy extends js.Object {
  var destroy: js.UndefOr[js.Any] = js.native
}

object PickPushpindestroy {
  @scala.inline
  def apply(): PickPushpindestroy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickPushpindestroy]
  }
  @scala.inline
  implicit class PickPushpindestroyOps[Self <: PickPushpindestroy] (val x: Self) extends AnyVal {
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
    def setDestroy(value: js.Any): Self = this.set("destroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
  }
  
}

