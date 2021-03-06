package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLagsRequest extends js.Object {
  /**
    * The ID of the LAG.
    */
  var lagId: js.UndefOr[LagId] = js.native
}

object DescribeLagsRequest {
  @scala.inline
  def apply(): DescribeLagsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLagsRequest]
  }
  @scala.inline
  implicit class DescribeLagsRequestOps[Self <: DescribeLagsRequest] (val x: Self) extends AnyVal {
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
    def setLagId(value: LagId): Self = this.set("lagId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLagId: Self = this.set("lagId", js.undefined)
  }
  
}

