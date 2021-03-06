package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminLicenseManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseAssignmentInsert extends js.Object {
  var userId: js.UndefOr[String] = js.native
}

object LicenseAssignmentInsert {
  @scala.inline
  def apply(): LicenseAssignmentInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseAssignmentInsert]
  }
  @scala.inline
  implicit class LicenseAssignmentInsertOps[Self <: LicenseAssignmentInsert] (val x: Self) extends AnyVal {
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
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
  
}

