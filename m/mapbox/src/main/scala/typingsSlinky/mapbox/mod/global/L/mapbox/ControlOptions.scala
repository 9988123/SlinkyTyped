package typingsSlinky.mapbox.mod.global.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////
//////////////////////////////// CONTROLS ////////////////////////////
//////////////////////////////////////////////////////////////////////
@js.native
trait ControlOptions
  extends typingsSlinky.leaflet.mod.ControlOptions {
  var sanitizer: js.UndefOr[js.Function1[/* template */ String, String]] = js.native
}

object ControlOptions {
  @scala.inline
  def apply(): ControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlOptions]
  }
  @scala.inline
  implicit class ControlOptionsOps[Self <: ControlOptions] (val x: Self) extends AnyVal {
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
    def setSanitizer(value: /* template */ String => String): Self = this.set("sanitizer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSanitizer: Self = this.set("sanitizer", js.undefined)
  }
  
}

