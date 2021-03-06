package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DfpSettings extends js.Object {
  /** DFP network code for this directory site. */
  var dfpNetworkCode: js.UndefOr[String] = js.native
  /** DFP network name for this directory site. */
  var dfpNetworkName: js.UndefOr[String] = js.native
  /** Whether this directory site accepts programmatic placements. */
  var programmaticPlacementAccepted: js.UndefOr[Boolean] = js.native
  /** Whether this directory site accepts publisher-paid tags. */
  var pubPaidPlacementAccepted: js.UndefOr[Boolean] = js.native
  /** Whether this directory site is available only via DoubleClick Publisher Portal. */
  var publisherPortalOnly: js.UndefOr[Boolean] = js.native
}

object DfpSettings {
  @scala.inline
  def apply(): DfpSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DfpSettings]
  }
  @scala.inline
  implicit class DfpSettingsOps[Self <: DfpSettings] (val x: Self) extends AnyVal {
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
    def setDfpNetworkCode(value: String): Self = this.set("dfpNetworkCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDfpNetworkCode: Self = this.set("dfpNetworkCode", js.undefined)
    @scala.inline
    def setDfpNetworkName(value: String): Self = this.set("dfpNetworkName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDfpNetworkName: Self = this.set("dfpNetworkName", js.undefined)
    @scala.inline
    def setProgrammaticPlacementAccepted(value: Boolean): Self = this.set("programmaticPlacementAccepted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgrammaticPlacementAccepted: Self = this.set("programmaticPlacementAccepted", js.undefined)
    @scala.inline
    def setPubPaidPlacementAccepted(value: Boolean): Self = this.set("pubPaidPlacementAccepted", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubPaidPlacementAccepted: Self = this.set("pubPaidPlacementAccepted", js.undefined)
    @scala.inline
    def setPublisherPortalOnly(value: Boolean): Self = this.set("publisherPortalOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisherPortalOnly: Self = this.set("publisherPortalOnly", js.undefined)
  }
  
}

