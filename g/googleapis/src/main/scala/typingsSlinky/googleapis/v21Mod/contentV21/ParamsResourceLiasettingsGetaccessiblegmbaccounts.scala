package typingsSlinky.googleapis.v21Mod.contentV21

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceLiasettingsGetaccessiblegmbaccounts extends StandardParameters {
  /**
    * The ID of the account for which to retrieve accessible Google My Business
    * accounts.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ID of the managing account. If this parameter is not the same as
    * accountId, then this account must be a multi-client account and accountId
    * must be the ID of a sub-account of this account.
    */
  var merchantId: js.UndefOr[String] = js.native
}

object ParamsResourceLiasettingsGetaccessiblegmbaccounts {
  @scala.inline
  def apply(): ParamsResourceLiasettingsGetaccessiblegmbaccounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLiasettingsGetaccessiblegmbaccounts]
  }
  @scala.inline
  implicit class ParamsResourceLiasettingsGetaccessiblegmbaccountsOps[Self <: ParamsResourceLiasettingsGetaccessiblegmbaccounts] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerchantId: Self = this.set("merchantId", js.undefined)
  }
  
}

