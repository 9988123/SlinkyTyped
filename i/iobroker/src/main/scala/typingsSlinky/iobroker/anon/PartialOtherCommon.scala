package typingsSlinky.iobroker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<iobroker.iobroker.<global>.ioBroker.OtherCommon> */
@js.native
trait PartialOtherCommon extends js.Object {
  var custom: js.UndefOr[scala.Nothing] = js.native
  var icon: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var role: js.UndefOr[String] = js.native
}

object PartialOtherCommon {
  @scala.inline
  def apply(): PartialOtherCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOtherCommon]
  }
  @scala.inline
  implicit class PartialOtherCommonOps[Self <: PartialOtherCommon] (val x: Self) extends AnyVal {
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
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
  
}

