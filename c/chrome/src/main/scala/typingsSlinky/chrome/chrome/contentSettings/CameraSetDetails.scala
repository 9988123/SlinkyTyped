package typingsSlinky.chrome.chrome.contentSettings

import typingsSlinky.chrome.chromeStrings.allow
import typingsSlinky.chrome.chromeStrings.ask
import typingsSlinky.chrome.chromeStrings.block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraSetDetails extends SetDetails {
  @JSName("setting")
  var setting_CameraSetDetails: allow | block | ask = js.native
}

object CameraSetDetails {
  @scala.inline
  def apply(primaryPattern: String, setting: allow | block | ask): CameraSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraSetDetails]
  }
  @scala.inline
  implicit class CameraSetDetailsOps[Self <: CameraSetDetails] (val x: Self) extends AnyVal {
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
    def setSetting(value: allow | block | ask): Self = this.set("setting", value.asInstanceOf[js.Any])
  }
  
}

