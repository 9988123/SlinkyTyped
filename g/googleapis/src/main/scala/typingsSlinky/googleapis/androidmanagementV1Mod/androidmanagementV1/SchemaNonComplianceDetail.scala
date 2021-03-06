package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides detail about non-compliance with a policy setting.
  */
@js.native
trait SchemaNonComplianceDetail extends js.Object {
  /**
    * If the policy setting could not be applied, the current value of the
    * setting on the device.
    */
  var currentValue: js.UndefOr[js.Any] = js.native
  /**
    * For settings with nested fields, if a particular nested field is out of
    * compliance, this specifies the full path to the offending field. The path
    * is formatted in the same way the policy JSON field would be referenced in
    * JavaScript, that is: 1) For object-typed fields, the field name is
    * followed by a dot then by a  subfield name. 2) For array-typed fields,
    * the field name is followed by the array index  enclosed in brackets. For
    * example, to indicate a problem with the url field in the externalData
    * field in the 3rd application, the path would be
    * applications[2].externalData.url
    */
  var fieldPath: js.UndefOr[String] = js.native
  /**
    * If package_name is set and the non-compliance reason is APP_NOT_INSTALLED
    * or APP_NOT_UPDATED, the detailed reason the app can&#39;t be installed or
    * updated.
    */
  var installationFailureReason: js.UndefOr[String] = js.native
  /**
    * The reason the device is not in compliance with the setting.
    */
  var nonComplianceReason: js.UndefOr[String] = js.native
  /**
    * The package name indicating which app is out of compliance, if
    * applicable.
    */
  var packageName: js.UndefOr[String] = js.native
  /**
    * The name of the policy setting. This is the JSON field name of a
    * top-level Policy  field.
    */
  var settingName: js.UndefOr[String] = js.native
}

object SchemaNonComplianceDetail {
  @scala.inline
  def apply(): SchemaNonComplianceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNonComplianceDetail]
  }
  @scala.inline
  implicit class SchemaNonComplianceDetailOps[Self <: SchemaNonComplianceDetail] (val x: Self) extends AnyVal {
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
    def setCurrentValue(value: js.Any): Self = this.set("currentValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentValue: Self = this.set("currentValue", js.undefined)
    @scala.inline
    def setFieldPath(value: String): Self = this.set("fieldPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldPath: Self = this.set("fieldPath", js.undefined)
    @scala.inline
    def setInstallationFailureReason(value: String): Self = this.set("installationFailureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstallationFailureReason: Self = this.set("installationFailureReason", js.undefined)
    @scala.inline
    def setNonComplianceReason(value: String): Self = this.set("nonComplianceReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonComplianceReason: Self = this.set("nonComplianceReason", js.undefined)
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    @scala.inline
    def setSettingName(value: String): Self = this.set("settingName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettingName: Self = this.set("settingName", js.undefined)
  }
  
}

