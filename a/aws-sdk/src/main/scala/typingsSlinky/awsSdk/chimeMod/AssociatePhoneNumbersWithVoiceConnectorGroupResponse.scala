package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociatePhoneNumbersWithVoiceConnectorGroupResponse extends js.Object {
  /**
    * If the action fails for one or more of the phone numbers in the request, a list of the phone numbers is returned, along with error codes and error messages.
    */
  var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.native
}

object AssociatePhoneNumbersWithVoiceConnectorGroupResponse {
  @scala.inline
  def apply(): AssociatePhoneNumbersWithVoiceConnectorGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociatePhoneNumbersWithVoiceConnectorGroupResponse]
  }
  @scala.inline
  implicit class AssociatePhoneNumbersWithVoiceConnectorGroupResponseOps[Self <: AssociatePhoneNumbersWithVoiceConnectorGroupResponse] (val x: Self) extends AnyVal {
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
    def setPhoneNumberErrorsVarargs(value: PhoneNumberError*): Self = this.set("PhoneNumberErrors", js.Array(value :_*))
    @scala.inline
    def setPhoneNumberErrors(value: PhoneNumberErrorList): Self = this.set("PhoneNumberErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumberErrors: Self = this.set("PhoneNumberErrors", js.undefined)
  }
  
}

