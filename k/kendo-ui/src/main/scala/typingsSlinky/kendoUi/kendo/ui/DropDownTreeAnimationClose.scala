package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropDownTreeAnimationClose extends js.Object {
  var duration: js.UndefOr[Double] = js.native
  var effects: js.UndefOr[String] = js.native
}

object DropDownTreeAnimationClose {
  @scala.inline
  def apply(): DropDownTreeAnimationClose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownTreeAnimationClose]
  }
  @scala.inline
  implicit class DropDownTreeAnimationCloseOps[Self <: DropDownTreeAnimationClose] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEffects(value: String): Self = this.set("effects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffects: Self = this.set("effects", js.undefined)
  }
  
}

