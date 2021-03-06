package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PPScanRegions extends js.Object {
  var `x-dimension`: js.UndefOr[Double] = js.native
  var `x-origin`: js.UndefOr[Double] = js.native
  var `y-dimension`: js.UndefOr[Double] = js.native
  var `y-origin`: js.UndefOr[Double] = js.native
}

object PPScanRegions {
  @scala.inline
  def apply(): PPScanRegions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PPScanRegions]
  }
  @scala.inline
  implicit class PPScanRegionsOps[Self <: PPScanRegions] (val x: Self) extends AnyVal {
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
    def `setX-dimension`(value: Double): Self = this.set("x-dimension", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-dimension`: Self = this.set("x-dimension", js.undefined)
    @scala.inline
    def `setX-origin`(value: Double): Self = this.set("x-origin", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-origin`: Self = this.set("x-origin", js.undefined)
    @scala.inline
    def `setY-dimension`(value: Double): Self = this.set("y-dimension", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteY-dimension`: Self = this.set("y-dimension", js.undefined)
    @scala.inline
    def `setY-origin`(value: Double): Self = this.set("y-origin", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteY-origin`: Self = this.set("y-origin", js.undefined)
  }
  
}

