package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides access to the office art formatting for chart title.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartTitleFormatLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the border format of chart title, which includes color, linestyle, and weight.
    *
    * [Api set: ExcelApi 1.7]
    */
  var border: js.UndefOr[ChartBorderLoadOptions] = js.native
  /**
    *
    * Represents the font attributes (font name, font size, color, etc.) for an object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontLoadOptions] = js.native
}

object ChartTitleFormatLoadOptions {
  @scala.inline
  def apply(): ChartTitleFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTitleFormatLoadOptions]
  }
  @scala.inline
  implicit class ChartTitleFormatLoadOptionsOps[Self <: ChartTitleFormatLoadOptions] (val x: Self) extends AnyVal {
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def setBorder(value: ChartBorderLoadOptions): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setFont(value: ChartFontLoadOptions): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
  }
  
}

