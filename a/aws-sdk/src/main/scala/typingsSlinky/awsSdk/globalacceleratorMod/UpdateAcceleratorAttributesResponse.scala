package typingsSlinky.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAcceleratorAttributesResponse extends js.Object {
  /**
    * Updated attributes for the accelerator.
    */
  var AcceleratorAttributes: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.AcceleratorAttributes] = js.native
}

object UpdateAcceleratorAttributesResponse {
  @scala.inline
  def apply(): UpdateAcceleratorAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAcceleratorAttributesResponse]
  }
  @scala.inline
  implicit class UpdateAcceleratorAttributesResponseOps[Self <: UpdateAcceleratorAttributesResponse] (val x: Self) extends AnyVal {
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
    def setAcceleratorAttributes(value: AcceleratorAttributes): Self = this.set("AcceleratorAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceleratorAttributes: Self = this.set("AcceleratorAttributes", js.undefined)
  }
  
}

