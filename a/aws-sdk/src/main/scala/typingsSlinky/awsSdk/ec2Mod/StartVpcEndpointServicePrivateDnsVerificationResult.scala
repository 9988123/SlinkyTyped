package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartVpcEndpointServicePrivateDnsVerificationResult extends js.Object {
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var ReturnValue: js.UndefOr[Boolean] = js.native
}

object StartVpcEndpointServicePrivateDnsVerificationResult {
  @scala.inline
  def apply(): StartVpcEndpointServicePrivateDnsVerificationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartVpcEndpointServicePrivateDnsVerificationResult]
  }
  @scala.inline
  implicit class StartVpcEndpointServicePrivateDnsVerificationResultOps[Self <: StartVpcEndpointServicePrivateDnsVerificationResult] (val x: Self) extends AnyVal {
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
    def setReturnValue(value: Boolean): Self = this.set("ReturnValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnValue: Self = this.set("ReturnValue", js.undefined)
  }
  
}

