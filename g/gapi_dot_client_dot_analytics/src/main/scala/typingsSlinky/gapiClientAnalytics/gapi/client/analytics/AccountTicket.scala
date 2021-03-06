package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountTicket extends js.Object {
  /** Account for this ticket. */
  var account: js.UndefOr[Account] = js.native
  /** Account ticket ID used to access the account ticket. */
  var id: js.UndefOr[String] = js.native
  /** Resource type for account ticket. */
  var kind: js.UndefOr[String] = js.native
  /** View (Profile) for the account. */
  var profile: js.UndefOr[Profile] = js.native
  /** Redirect URI where the user will be sent after accepting Terms of Service. Must be configured in APIs console as a callback URL. */
  var redirectUri: js.UndefOr[String] = js.native
  /** Web property for the account. */
  var webproperty: js.UndefOr[Webproperty] = js.native
}

object AccountTicket {
  @scala.inline
  def apply(): AccountTicket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountTicket]
  }
  @scala.inline
  implicit class AccountTicketOps[Self <: AccountTicket] (val x: Self) extends AnyVal {
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
    def setAccount(value: Account): Self = this.set("account", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setProfile(value: Profile): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    @scala.inline
    def setRedirectUri(value: String): Self = this.set("redirectUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectUri: Self = this.set("redirectUri", js.undefined)
    @scala.inline
    def setWebproperty(value: Webproperty): Self = this.set("webproperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebproperty: Self = this.set("webproperty", js.undefined)
  }
  
}

