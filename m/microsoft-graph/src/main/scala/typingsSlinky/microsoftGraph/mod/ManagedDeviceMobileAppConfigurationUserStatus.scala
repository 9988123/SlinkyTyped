package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedDeviceMobileAppConfigurationUserStatus extends Entity {
  // Devices count for that user.
  var devicesCount: js.UndefOr[Double] = js.native
  // Last modified date time of the policy report.
  var lastReportedDateTime: js.UndefOr[String] = js.native
  /**
    * Compliance status of the policy report. Possible values are: unknown, notApplicable, compliant, remediated,
    * nonCompliant, error, conflict, notAssigned.
    */
  var status: js.UndefOr[ComplianceStatus] = js.native
  // User name of the DevicePolicyStatus.
  var userDisplayName: js.UndefOr[String] = js.native
  // UserPrincipalName.
  var userPrincipalName: js.UndefOr[String] = js.native
}

object ManagedDeviceMobileAppConfigurationUserStatus {
  @scala.inline
  def apply(): ManagedDeviceMobileAppConfigurationUserStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedDeviceMobileAppConfigurationUserStatus]
  }
  @scala.inline
  implicit class ManagedDeviceMobileAppConfigurationUserStatusOps[Self <: ManagedDeviceMobileAppConfigurationUserStatus] (val x: Self) extends AnyVal {
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
    def setDevicesCount(value: Double): Self = this.set("devicesCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevicesCount: Self = this.set("devicesCount", js.undefined)
    @scala.inline
    def setLastReportedDateTime(value: String): Self = this.set("lastReportedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastReportedDateTime: Self = this.set("lastReportedDateTime", js.undefined)
    @scala.inline
    def setStatus(value: ComplianceStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setUserDisplayName(value: String): Self = this.set("userDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserDisplayName: Self = this.set("userDisplayName", js.undefined)
    @scala.inline
    def setUserPrincipalName(value: String): Self = this.set("userPrincipalName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPrincipalName: Self = this.set("userPrincipalName", js.undefined)
  }
  
}

