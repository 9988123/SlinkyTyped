package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHITResponse extends js.Object {
  /**
    *  Contains the newly created HIT data. For a description of the HIT data structure as it appears in responses, see the HIT Data Structure documentation. 
    */
  var HIT: js.UndefOr[typingsSlinky.awsSdk.mturkMod.HIT] = js.native
}

object CreateHITResponse {
  @scala.inline
  def apply(): CreateHITResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHITResponse]
  }
  @scala.inline
  implicit class CreateHITResponseOps[Self <: CreateHITResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHIT(value: HIT): Self = this.set("HIT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHIT: Self = this.set("HIT", js.undefined)
  }
  
}

