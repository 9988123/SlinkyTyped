package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceComplianceSettingState extends Entity {
  // The DateTime when device compliance grace period expires
  var complianceGracePeriodExpirationDateTime: js.UndefOr[String] = js.native
  // The Device Id that is being reported
  var deviceId: js.UndefOr[String] = js.native
  // The device model that is being reported
  var deviceModel: js.UndefOr[String] = js.native
  // The Device Name that is being reported
  var deviceName: js.UndefOr[String] = js.native
  // The setting class name and property name.
  var setting: js.UndefOr[String] = js.native
  // The Setting Name that is being reported
  var settingName: js.UndefOr[String] = js.native
  /**
    * The compliance state of the setting. Possible values are: unknown, notApplicable, compliant, remediated, nonCompliant,
    * error, conflict, notAssigned.
    */
  var state: js.UndefOr[ComplianceStatus] = js.native
  // The User email address that is being reported
  var userEmail: js.UndefOr[String] = js.native
  // The user Id that is being reported
  var userId: js.UndefOr[String] = js.native
  // The User Name that is being reported
  var userName: js.UndefOr[String] = js.native
  // The User PrincipalName that is being reported
  var userPrincipalName: js.UndefOr[String] = js.native
}

object DeviceComplianceSettingState {
  @scala.inline
  def apply(): DeviceComplianceSettingState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceComplianceSettingState]
  }
  @scala.inline
  implicit class DeviceComplianceSettingStateOps[Self <: DeviceComplianceSettingState] (val x: Self) extends AnyVal {
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
    def setComplianceGracePeriodExpirationDateTime(value: String): Self = this.set("complianceGracePeriodExpirationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplianceGracePeriodExpirationDateTime: Self = this.set("complianceGracePeriodExpirationDateTime", js.undefined)
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    @scala.inline
    def setDeviceModel(value: String): Self = this.set("deviceModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceModel: Self = this.set("deviceModel", js.undefined)
    @scala.inline
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceName: Self = this.set("deviceName", js.undefined)
    @scala.inline
    def setSetting(value: String): Self = this.set("setting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetting: Self = this.set("setting", js.undefined)
    @scala.inline
    def setSettingName(value: String): Self = this.set("settingName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettingName: Self = this.set("settingName", js.undefined)
    @scala.inline
    def setState(value: ComplianceStatus): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setUserEmail(value: String): Self = this.set("userEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserEmail: Self = this.set("userEmail", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
    @scala.inline
    def setUserPrincipalName(value: String): Self = this.set("userPrincipalName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPrincipalName: Self = this.set("userPrincipalName", js.undefined)
  }
  
}

