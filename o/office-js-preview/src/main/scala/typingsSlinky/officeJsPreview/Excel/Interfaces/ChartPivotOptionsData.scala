package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartPivotOptions.toJSON()`. */
@js.native
trait ChartPivotOptionsData extends js.Object {
  /**
    *
    * Specifies whether to display the axis field buttons on a PivotChart. The ShowAxisFieldButtons property corresponds to the "Show Axis Field Buttons" command on the "Field Buttons" drop-down list of the "Analyze" tab, which is available when a PivotChart is selected.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showAxisFieldButtons: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether to display the legend field buttons on a PivotChart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showLegendFieldButtons: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether to display the report filter field buttons on a PivotChart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showReportFilterFieldButtons: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether to display the show value field buttons on a PivotChart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showValueFieldButtons: js.UndefOr[Boolean] = js.native
}

object ChartPivotOptionsData {
  @scala.inline
  def apply(): ChartPivotOptionsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPivotOptionsData]
  }
  @scala.inline
  implicit class ChartPivotOptionsDataOps[Self <: ChartPivotOptionsData] (val x: Self) extends AnyVal {
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
    def setShowAxisFieldButtons(value: Boolean): Self = this.set("showAxisFieldButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAxisFieldButtons: Self = this.set("showAxisFieldButtons", js.undefined)
    @scala.inline
    def setShowLegendFieldButtons(value: Boolean): Self = this.set("showLegendFieldButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLegendFieldButtons: Self = this.set("showLegendFieldButtons", js.undefined)
    @scala.inline
    def setShowReportFilterFieldButtons(value: Boolean): Self = this.set("showReportFilterFieldButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowReportFilterFieldButtons: Self = this.set("showReportFilterFieldButtons", js.undefined)
    @scala.inline
    def setShowValueFieldButtons(value: Boolean): Self = this.set("showValueFieldButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowValueFieldButtons: Self = this.set("showValueFieldButtons", js.undefined)
  }
  
}

