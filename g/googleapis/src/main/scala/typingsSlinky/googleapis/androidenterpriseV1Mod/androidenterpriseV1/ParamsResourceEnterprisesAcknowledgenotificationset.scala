package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceEnterprisesAcknowledgenotificationset extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The notification set ID as returned by Enterprises.PullNotificationSet.
    * This must be provided.
    */
  var notificationSetId: js.UndefOr[String] = js.native
}

object ParamsResourceEnterprisesAcknowledgenotificationset {
  @scala.inline
  def apply(): ParamsResourceEnterprisesAcknowledgenotificationset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesAcknowledgenotificationset]
  }
  @scala.inline
  implicit class ParamsResourceEnterprisesAcknowledgenotificationsetOps[Self <: ParamsResourceEnterprisesAcknowledgenotificationset] (val x: Self) extends AnyVal {
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
    def setNotificationSetId(value: String): Self = this.set("notificationSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationSetId: Self = this.set("notificationSetId", js.undefined)
  }
  
}

