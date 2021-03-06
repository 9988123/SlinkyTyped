package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatSuperStickerDetails extends js.Object {
  var amountDisplayString: js.UndefOr[String] = js.native
  var amountMicros: js.UndefOr[String] = js.native
  var currency: js.UndefOr[String] = js.native
  var superStickerMetadata: js.UndefOr[SuperStickerMetadata] = js.native
  var tier: js.UndefOr[Double] = js.native
}

object LiveChatSuperStickerDetails {
  @scala.inline
  def apply(): LiveChatSuperStickerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatSuperStickerDetails]
  }
  @scala.inline
  implicit class LiveChatSuperStickerDetailsOps[Self <: LiveChatSuperStickerDetails] (val x: Self) extends AnyVal {
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
    def setAmountDisplayString(value: String): Self = this.set("amountDisplayString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmountDisplayString: Self = this.set("amountDisplayString", js.undefined)
    @scala.inline
    def setAmountMicros(value: String): Self = this.set("amountMicros", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmountMicros: Self = this.set("amountMicros", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setSuperStickerMetadata(value: SuperStickerMetadata): Self = this.set("superStickerMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuperStickerMetadata: Self = this.set("superStickerMetadata", js.undefined)
    @scala.inline
    def setTier(value: Double): Self = this.set("tier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTier: Self = this.set("tier", js.undefined)
  }
  
}

