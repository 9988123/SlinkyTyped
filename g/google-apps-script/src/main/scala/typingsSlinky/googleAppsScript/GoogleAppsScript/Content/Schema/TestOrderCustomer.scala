package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestOrderCustomer extends js.Object {
  var email: js.UndefOr[String] = js.native
  var explicitMarketingPreference: js.UndefOr[Boolean] = js.native
  var fullName: js.UndefOr[String] = js.native
  var marketingRightsInfo: js.UndefOr[TestOrderCustomerMarketingRightsInfo] = js.native
}

object TestOrderCustomer {
  @scala.inline
  def apply(): TestOrderCustomer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestOrderCustomer]
  }
  @scala.inline
  implicit class TestOrderCustomerOps[Self <: TestOrderCustomer] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setExplicitMarketingPreference(value: Boolean): Self = this.set("explicitMarketingPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplicitMarketingPreference: Self = this.set("explicitMarketingPreference", js.undefined)
    @scala.inline
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullName: Self = this.set("fullName", js.undefined)
    @scala.inline
    def setMarketingRightsInfo(value: TestOrderCustomerMarketingRightsInfo): Self = this.set("marketingRightsInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarketingRightsInfo: Self = this.set("marketingRightsInfo", js.undefined)
  }
  
}

