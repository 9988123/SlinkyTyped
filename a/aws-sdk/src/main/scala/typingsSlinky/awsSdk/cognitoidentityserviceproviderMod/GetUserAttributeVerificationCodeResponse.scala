package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUserAttributeVerificationCodeResponse extends js.Object {
  /**
    * The code delivery details returned by the server in response to the request to get the user attribute verification code.
    */
  var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.native
}

object GetUserAttributeVerificationCodeResponse {
  @scala.inline
  def apply(): GetUserAttributeVerificationCodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserAttributeVerificationCodeResponse]
  }
  @scala.inline
  implicit class GetUserAttributeVerificationCodeResponseOps[Self <: GetUserAttributeVerificationCodeResponse] (val x: Self) extends AnyVal {
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
    def setCodeDeliveryDetails(value: CodeDeliveryDetailsType): Self = this.set("CodeDeliveryDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeDeliveryDetails: Self = this.set("CodeDeliveryDetails", js.undefined)
  }
  
}

