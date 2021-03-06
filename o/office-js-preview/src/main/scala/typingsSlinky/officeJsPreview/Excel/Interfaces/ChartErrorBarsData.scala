package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.ChartErrorBarsInclude
import typingsSlinky.officeJsPreview.Excel.ChartErrorBarsType
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Both
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Custom
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.FixedValue
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.MinusValues
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Percent
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.PlusValues
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.StDev
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.StError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartErrorBars.toJSON()`. */
@js.native
trait ChartErrorBarsData extends js.Object {
  /**
    *
    * Specifies if error bars have an end style cap.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endStyleCap: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the formatting type of the error bars.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[ChartErrorBarsFormatData] = js.native
  /**
    *
    * Specifies which parts of the error bars to include.
    *
    * [Api set: ExcelApi 1.9]
    */
  var include: js.UndefOr[ChartErrorBarsInclude | Both | MinusValues | PlusValues] = js.native
  /**
    *
    * The type of range marked by the error bars.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[ChartErrorBarsType | FixedValue | Percent | StDev | StError | Custom] = js.native
  /**
    *
    * Specifies whether the error bars are displayed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object ChartErrorBarsData {
  @scala.inline
  def apply(): ChartErrorBarsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartErrorBarsData]
  }
  @scala.inline
  implicit class ChartErrorBarsDataOps[Self <: ChartErrorBarsData] (val x: Self) extends AnyVal {
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
    def setEndStyleCap(value: Boolean): Self = this.set("endStyleCap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndStyleCap: Self = this.set("endStyleCap", js.undefined)
    @scala.inline
    def setFormat(value: ChartErrorBarsFormatData): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setInclude(value: ChartErrorBarsInclude | Both | MinusValues | PlusValues): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    @scala.inline
    def setType(value: ChartErrorBarsType | FixedValue | Percent | StDev | StError | Custom): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

