package typingsSlinky.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnterpriseAdminSetInformationForProvisionedEnterpriseUserParamsEmails extends js.Object {
  var primary: Boolean = js.native
  var `type`: String = js.native
  var value: String = js.native
}

object EnterpriseAdminSetInformationForProvisionedEnterpriseUserParamsEmails {
  @scala.inline
  def apply(primary: Boolean, `type`: String, value: String): EnterpriseAdminSetInformationForProvisionedEnterpriseUserParamsEmails = {
    val __obj = js.Dynamic.literal(primary = primary.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminSetInformationForProvisionedEnterpriseUserParamsEmails]
  }
  @scala.inline
  implicit class EnterpriseAdminSetInformationForProvisionedEnterpriseUserParamsEmailsOps[Self <: EnterpriseAdminSetInformationForProvisionedEnterpriseUserParamsEmails] (val x: Self) extends AnyVal {
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
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

