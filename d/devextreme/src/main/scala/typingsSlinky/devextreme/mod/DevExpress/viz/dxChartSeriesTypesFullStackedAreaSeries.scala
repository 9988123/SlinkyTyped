package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.excludePoints
import typingsSlinky.devextreme.devextremeStrings.includePoints
import typingsSlinky.devextreme.devextremeStrings.nearestPoint
import typingsSlinky.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.FullStackedAreaSeries */
@js.native
trait dxChartSeriesTypesFullStackedAreaSeries extends dxChartSeriesTypesCommonSeries {
  /** @name dxChartSeriesTypes.FullStackedAreaSeries.aggregation */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesFullStackedAreaSeries: js.UndefOr[dxChartSeriesTypesFullStackedAreaSeriesAggregation] = js.native
  /** @name dxChartSeriesTypes.FullStackedAreaSeries.hoverMode */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesFullStackedAreaSeries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.native
  /** @name dxChartSeriesTypes.FullStackedAreaSeries.label */
  @JSName("label")
  var label_dxChartSeriesTypesFullStackedAreaSeries: js.UndefOr[dxChartSeriesTypesFullStackedAreaSeriesLabel] = js.native
  /** @name dxChartSeriesTypes.FullStackedAreaSeries.point */
  @JSName("point")
  var point_dxChartSeriesTypesFullStackedAreaSeries: js.UndefOr[dxChartSeriesTypesFullStackedAreaSeriesPoint] = js.native
  /** @name dxChartSeriesTypes.FullStackedAreaSeries.selectionMode */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesFullStackedAreaSeries: js.UndefOr[includePoints | excludePoints | none] = js.native
}

object dxChartSeriesTypesFullStackedAreaSeries {
  @scala.inline
  def apply(): dxChartSeriesTypesFullStackedAreaSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesFullStackedAreaSeries]
  }
  @scala.inline
  implicit class dxChartSeriesTypesFullStackedAreaSeriesOps[Self <: dxChartSeriesTypesFullStackedAreaSeries] (val x: Self) extends AnyVal {
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
    def setAggregation(value: dxChartSeriesTypesFullStackedAreaSeriesAggregation): Self = this.set("aggregation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregation: Self = this.set("aggregation", js.undefined)
    @scala.inline
    def setHoverMode(value: nearestPoint | includePoints | excludePoints | none): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    @scala.inline
    def setLabel(value: dxChartSeriesTypesFullStackedAreaSeriesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setPoint(value: dxChartSeriesTypesFullStackedAreaSeriesPoint): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    @scala.inline
    def setSelectionMode(value: includePoints | excludePoints | none): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
  }
  
}

