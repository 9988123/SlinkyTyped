package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartSeriesFormat.toJSON()`. */
@js.native
trait ChartSeriesFormatData extends js.Object {
  /**
    *
    * Represents line formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var line: js.UndefOr[ChartLineFormatData] = js.native
}

object ChartSeriesFormatData {
  @scala.inline
  def apply(): ChartSeriesFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesFormatData]
  }
  @scala.inline
  implicit class ChartSeriesFormatDataOps[Self <: ChartSeriesFormatData] (val x: Self) extends AnyVal {
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
    def setLine(value: ChartLineFormatData): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
  }
  
}

