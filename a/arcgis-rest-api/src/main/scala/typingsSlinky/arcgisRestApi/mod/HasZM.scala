package typingsSlinky.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasZM extends js.Object {
  var hasM: js.UndefOr[Boolean] = js.native
  var hasZ: js.UndefOr[Boolean] = js.native
}

object HasZM {
  @scala.inline
  def apply(): HasZM = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasZM]
  }
  @scala.inline
  implicit class HasZMOps[Self <: HasZM] (val x: Self) extends AnyVal {
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
    def setHasM(value: Boolean): Self = this.set("hasM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasM: Self = this.set("hasM", js.undefined)
    @scala.inline
    def setHasZ(value: Boolean): Self = this.set("hasZ", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasZ: Self = this.set("hasZ", js.undefined)
  }
  
}

