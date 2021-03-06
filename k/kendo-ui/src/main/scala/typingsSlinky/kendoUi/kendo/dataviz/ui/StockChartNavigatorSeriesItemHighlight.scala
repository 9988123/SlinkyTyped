package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockChartNavigatorSeriesItemHighlight extends js.Object {
  var border: js.UndefOr[StockChartNavigatorSeriesItemHighlightBorder] = js.native
  var color: js.UndefOr[String] = js.native
  var line: js.UndefOr[StockChartNavigatorSeriesItemHighlightLine] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object StockChartNavigatorSeriesItemHighlight {
  @scala.inline
  def apply(): StockChartNavigatorSeriesItemHighlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartNavigatorSeriesItemHighlight]
  }
  @scala.inline
  implicit class StockChartNavigatorSeriesItemHighlightOps[Self <: StockChartNavigatorSeriesItemHighlight] (val x: Self) extends AnyVal {
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
    def setBorder(value: StockChartNavigatorSeriesItemHighlightBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setLine(value: StockChartNavigatorSeriesItemHighlightLine): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

