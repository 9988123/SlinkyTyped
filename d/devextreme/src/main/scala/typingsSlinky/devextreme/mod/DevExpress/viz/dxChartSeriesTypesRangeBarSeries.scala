package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.allArgumentPoints
import typingsSlinky.devextreme.devextremeStrings.allSeriesPoints
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.onlyPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.RangeBarSeries */
@js.native
trait dxChartSeriesTypesRangeBarSeries extends dxChartSeriesTypesCommonSeries {
  /** @name dxChartSeriesTypes.RangeBarSeries.aggregation */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesRangeBarSeries: js.UndefOr[dxChartSeriesTypesRangeBarSeriesAggregation] = js.native
  /** @name dxChartSeriesTypes.RangeBarSeries.hoverMode */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesRangeBarSeries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.native
  /** @name dxChartSeriesTypes.RangeBarSeries.label */
  @JSName("label")
  var label_dxChartSeriesTypesRangeBarSeries: js.UndefOr[dxChartSeriesTypesRangeBarSeriesLabel] = js.native
  /** @name dxChartSeriesTypes.RangeBarSeries.selectionMode */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesRangeBarSeries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.native
}

object dxChartSeriesTypesRangeBarSeries {
  @scala.inline
  def apply(): dxChartSeriesTypesRangeBarSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesRangeBarSeries]
  }
  @scala.inline
  implicit class dxChartSeriesTypesRangeBarSeriesOps[Self <: dxChartSeriesTypesRangeBarSeries] (val x: Self) extends AnyVal {
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
    def setAggregation(value: dxChartSeriesTypesRangeBarSeriesAggregation): Self = this.set("aggregation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregation: Self = this.set("aggregation", js.undefined)
    @scala.inline
    def setHoverMode(value: onlyPoint | allSeriesPoints | allArgumentPoints | none): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    @scala.inline
    def setLabel(value: dxChartSeriesTypesRangeBarSeriesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setSelectionMode(value: onlyPoint | allSeriesPoints | allArgumentPoints | none): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
  }
  
}

