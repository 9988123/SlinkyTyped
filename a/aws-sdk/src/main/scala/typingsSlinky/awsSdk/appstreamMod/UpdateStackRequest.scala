package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateStackRequest extends js.Object {
  /**
    * The list of interface VPC endpoint (interface endpoint) objects. Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
    */
  var AccessEndpoints: js.UndefOr[AccessEndpointList] = js.native
  /**
    * The persistent application settings for users of a stack. When these settings are enabled, changes that users make to applications and Windows settings are automatically saved after each session and applied to the next session.
    */
  var ApplicationSettings: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.ApplicationSettings] = js.native
  /**
    * The stack attributes to delete.
    */
  var AttributesToDelete: js.UndefOr[StackAttributes] = js.native
  /**
    * Deletes the storage connectors currently enabled for the stack.
    */
  var DeleteStorageConnectors: js.UndefOr[Boolean] = js.native
  /**
    * The description to display.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.Description] = js.native
  /**
    * The stack name to display.
    */
  var DisplayName: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.DisplayName] = js.native
  /**
    * The domains where AppStream 2.0 streaming sessions can be embedded in an iframe. You must approve the domains that you want to host embedded AppStream 2.0 streaming sessions.
    */
  var EmbedHostDomains: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.EmbedHostDomains] = js.native
  /**
    * The URL that users are redirected to after they choose the Send Feedback link. If no URL is specified, no Send Feedback link is displayed.
    */
  var FeedbackURL: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.FeedbackURL] = js.native
  /**
    * The name of the stack.
    */
  var Name: String = js.native
  /**
    * The URL that users are redirected to after their streaming session ends.
    */
  var RedirectURL: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.RedirectURL] = js.native
  /**
    * The storage connectors to enable.
    */
  var StorageConnectors: js.UndefOr[StorageConnectorList] = js.native
  /**
    * The actions that are enabled or disabled for users during their streaming sessions. By default, these actions are enabled.
    */
  var UserSettings: js.UndefOr[UserSettingList] = js.native
}

object UpdateStackRequest {
  @scala.inline
  def apply(Name: String): UpdateStackRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStackRequest]
  }
  @scala.inline
  implicit class UpdateStackRequestOps[Self <: UpdateStackRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessEndpointsVarargs(value: AccessEndpoint*): Self = this.set("AccessEndpoints", js.Array(value :_*))
    @scala.inline
    def setAccessEndpoints(value: AccessEndpointList): Self = this.set("AccessEndpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessEndpoints: Self = this.set("AccessEndpoints", js.undefined)
    @scala.inline
    def setApplicationSettings(value: ApplicationSettings): Self = this.set("ApplicationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationSettings: Self = this.set("ApplicationSettings", js.undefined)
    @scala.inline
    def setAttributesToDeleteVarargs(value: StackAttribute*): Self = this.set("AttributesToDelete", js.Array(value :_*))
    @scala.inline
    def setAttributesToDelete(value: StackAttributes): Self = this.set("AttributesToDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributesToDelete: Self = this.set("AttributesToDelete", js.undefined)
    @scala.inline
    def setDeleteStorageConnectors(value: Boolean): Self = this.set("DeleteStorageConnectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteStorageConnectors: Self = this.set("DeleteStorageConnectors", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDisplayName(value: DisplayName): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    @scala.inline
    def setEmbedHostDomainsVarargs(value: EmbedHostDomain*): Self = this.set("EmbedHostDomains", js.Array(value :_*))
    @scala.inline
    def setEmbedHostDomains(value: EmbedHostDomains): Self = this.set("EmbedHostDomains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbedHostDomains: Self = this.set("EmbedHostDomains", js.undefined)
    @scala.inline
    def setFeedbackURL(value: FeedbackURL): Self = this.set("FeedbackURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeedbackURL: Self = this.set("FeedbackURL", js.undefined)
    @scala.inline
    def setRedirectURL(value: RedirectURL): Self = this.set("RedirectURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectURL: Self = this.set("RedirectURL", js.undefined)
    @scala.inline
    def setStorageConnectorsVarargs(value: StorageConnector*): Self = this.set("StorageConnectors", js.Array(value :_*))
    @scala.inline
    def setStorageConnectors(value: StorageConnectorList): Self = this.set("StorageConnectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageConnectors: Self = this.set("StorageConnectors", js.undefined)
    @scala.inline
    def setUserSettingsVarargs(value: UserSetting*): Self = this.set("UserSettings", js.Array(value :_*))
    @scala.inline
    def setUserSettings(value: UserSettingList): Self = this.set("UserSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserSettings: Self = this.set("UserSettings", js.undefined)
  }
  
}

