package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartSeriesItemMarkersFrom extends js.Object {
  var background: js.UndefOr[String | js.Function] = js.native
  var border: js.UndefOr[js.Function | ChartSeriesItemMarkersFromBorder] = js.native
  var rotation: js.UndefOr[Double | js.Function] = js.native
  var size: js.UndefOr[Double | js.Function] = js.native
  var `type`: js.UndefOr[String | js.Function] = js.native
  var visible: js.UndefOr[Boolean | js.Function] = js.native
  var visual: js.UndefOr[js.Function] = js.native
}

object ChartSeriesItemMarkersFrom {
  @scala.inline
  def apply(): ChartSeriesItemMarkersFrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemMarkersFrom]
  }
  @scala.inline
  implicit class ChartSeriesItemMarkersFromOps[Self <: ChartSeriesItemMarkersFrom] (val x: Self) extends AnyVal {
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
    def setBackground(value: String | js.Function): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBorder(value: js.Function | ChartSeriesItemMarkersFromBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setRotation(value: Double | js.Function): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setSize(value: Double | js.Function): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setType(value: String | js.Function): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisible(value: Boolean | js.Function): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setVisual(value: js.Function): Self = this.set("visual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisual: Self = this.set("visual", js.undefined)
  }
  
}

