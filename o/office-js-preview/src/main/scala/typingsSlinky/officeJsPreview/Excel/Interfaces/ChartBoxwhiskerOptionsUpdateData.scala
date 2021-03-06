package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.ChartBoxQuartileCalculation
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Exclusive
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Inclusive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartBoxwhiskerOptions object, for use in `chartBoxwhiskerOptions.set({ ... })`. */
@js.native
trait ChartBoxwhiskerOptionsUpdateData extends js.Object {
  /**
    *
    * Specifies if the quartile calculation type of a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var quartileCalculation: js.UndefOr[ChartBoxQuartileCalculation | Inclusive | Exclusive] = js.native
  /**
    *
    * Specifies if inner points are shown in a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showInnerPoints: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the mean line is shown in a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showMeanLine: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the mean marker is shown in a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showMeanMarker: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if outlier points are shown in a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showOutlierPoints: js.UndefOr[Boolean] = js.native
}

object ChartBoxwhiskerOptionsUpdateData {
  @scala.inline
  def apply(): ChartBoxwhiskerOptionsUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartBoxwhiskerOptionsUpdateData]
  }
  @scala.inline
  implicit class ChartBoxwhiskerOptionsUpdateDataOps[Self <: ChartBoxwhiskerOptionsUpdateData] (val x: Self) extends AnyVal {
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
    def setQuartileCalculation(value: ChartBoxQuartileCalculation | Inclusive | Exclusive): Self = this.set("quartileCalculation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuartileCalculation: Self = this.set("quartileCalculation", js.undefined)
    @scala.inline
    def setShowInnerPoints(value: Boolean): Self = this.set("showInnerPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInnerPoints: Self = this.set("showInnerPoints", js.undefined)
    @scala.inline
    def setShowMeanLine(value: Boolean): Self = this.set("showMeanLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMeanLine: Self = this.set("showMeanLine", js.undefined)
    @scala.inline
    def setShowMeanMarker(value: Boolean): Self = this.set("showMeanMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMeanMarker: Self = this.set("showMeanMarker", js.undefined)
    @scala.inline
    def setShowOutlierPoints(value: Boolean): Self = this.set("showOutlierPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowOutlierPoints: Self = this.set("showOutlierPoints", js.undefined)
  }
  
}

