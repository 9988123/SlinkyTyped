package typingsSlinky.naverWhale.whale.fontSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetFontSizeDetails extends js.Object {
  /** The font size in pixels. */
  var pixelSize: Double = js.native
}

object SetFontSizeDetails {
  @scala.inline
  def apply(pixelSize: Double): SetFontSizeDetails = {
    val __obj = js.Dynamic.literal(pixelSize = pixelSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFontSizeDetails]
  }
  @scala.inline
  implicit class SetFontSizeDetailsOps[Self <: SetFontSizeDetails] (val x: Self) extends AnyVal {
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
    def setPixelSize(value: Double): Self = this.set("pixelSize", value.asInstanceOf[js.Any])
  }
  
}

