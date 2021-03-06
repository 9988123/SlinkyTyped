package typingsSlinky.googleapis.datatransferV1Mod.adminDatatransferV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceTransfersList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Immutable ID of the Google Apps account.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * Maximum number of results to return. Default is 100.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Destination user's profile ID.
    */
  var newOwnerUserId: js.UndefOr[String] = js.native
  /**
    * Source user's profile ID.
    */
  var oldOwnerUserId: js.UndefOr[String] = js.native
  /**
    * Token to specify the next page in the list.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Status of the transfer.
    */
  var status: js.UndefOr[String] = js.native
}

object ParamsResourceTransfersList {
  @scala.inline
  def apply(): ParamsResourceTransfersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTransfersList]
  }
  @scala.inline
  implicit class ParamsResourceTransfersListOps[Self <: ParamsResourceTransfersList] (val x: Self) extends AnyVal {
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
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNewOwnerUserId(value: String): Self = this.set("newOwnerUserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewOwnerUserId: Self = this.set("newOwnerUserId", js.undefined)
    @scala.inline
    def setOldOwnerUserId(value: String): Self = this.set("oldOwnerUserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldOwnerUserId: Self = this.set("oldOwnerUserId", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

