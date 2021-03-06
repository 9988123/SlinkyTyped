package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FanFundingEventSnippet extends js.Object {
  /** The amount of funding in micros of fund_currency. e.g., 1 is represented */
  var amountMicros: js.UndefOr[String] = js.native
  /** Channel id where the funding event occurred. */
  var channelId: js.UndefOr[String] = js.native
  /** The text contents of the comment left by the user. */
  var commentText: js.UndefOr[String] = js.native
  /** The date and time when the funding occurred. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var createdAt: js.UndefOr[String] = js.native
  /** The currency in which the fund was made. ISO 4217. */
  var currency: js.UndefOr[String] = js.native
  /** A rendered string that displays the fund amount and currency (e.g., "$1.00"). The string is rendered for the given language. */
  var displayString: js.UndefOr[String] = js.native
  /** Details about the supporter. Only filled if the event was made public by the user. */
  var supporterDetails: js.UndefOr[ChannelProfileDetails] = js.native
}

object FanFundingEventSnippet {
  @scala.inline
  def apply(): FanFundingEventSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FanFundingEventSnippet]
  }
  @scala.inline
  implicit class FanFundingEventSnippetOps[Self <: FanFundingEventSnippet] (val x: Self) extends AnyVal {
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
    def setAmountMicros(value: String): Self = this.set("amountMicros", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmountMicros: Self = this.set("amountMicros", js.undefined)
    @scala.inline
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    @scala.inline
    def setCommentText(value: String): Self = this.set("commentText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommentText: Self = this.set("commentText", js.undefined)
    @scala.inline
    def setCreatedAt(value: String): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setDisplayString(value: String): Self = this.set("displayString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayString: Self = this.set("displayString", js.undefined)
    @scala.inline
    def setSupporterDetails(value: ChannelProfileDetails): Self = this.set("supporterDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupporterDetails: Self = this.set("supporterDetails", js.undefined)
  }
  
}

