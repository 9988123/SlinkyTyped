package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotPcBottomLineOptions extends js.Object {
  var styles: js.UndefOr[PlotPcBottomLineStylesOptions] = js.native
}

object PlotPcBottomLineOptions {
  @scala.inline
  def apply(): PlotPcBottomLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPcBottomLineOptions]
  }
  @scala.inline
  implicit class PlotPcBottomLineOptionsOps[Self <: PlotPcBottomLineOptions] (val x: Self) extends AnyVal {
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
    def setStyles(value: PlotPcBottomLineStylesOptions): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

