package typingsSlinky.googleapis.v21Mod.contentV21

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceDatafeedstatusesGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The country for which to get the datafeed status. If this parameter is
    * provided then language must also be provided. Note that this parameter is
    * required for feeds targeting multiple countries and languages, since a
    * feed may have a different status for each target.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The ID of the datafeed.
    */
  var datafeedId: js.UndefOr[String] = js.native
  /**
    * The language for which to get the datafeed status. If this parameter is
    * provided then country must also be provided. Note that this parameter is
    * required for feeds targeting multiple countries and languages, since a
    * feed may have a different status for each target.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * The ID of the account that manages the datafeed. This account cannot be a
    * multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.native
}

object ParamsResourceDatafeedstatusesGet {
  @scala.inline
  def apply(): ParamsResourceDatafeedstatusesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDatafeedstatusesGet]
  }
  @scala.inline
  implicit class ParamsResourceDatafeedstatusesGetOps[Self <: ParamsResourceDatafeedstatusesGet] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setDatafeedId(value: String): Self = this.set("datafeedId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatafeedId: Self = this.set("datafeedId", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerchantId: Self = this.set("merchantId", js.undefined)
  }
  
}

