package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartLegendEntry object, for use in `chartLegendEntry.set({ ... })`. */
@js.native
trait ChartLegendEntryUpdateData extends js.Object {
  /**
    *
    * Represents the visible of a chart legend entry.
    *
    * [Api set: ExcelApi 1.7]
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object ChartLegendEntryUpdateData {
  @scala.inline
  def apply(): ChartLegendEntryUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendEntryUpdateData]
  }
  @scala.inline
  implicit class ChartLegendEntryUpdateDataOps[Self <: ChartLegendEntryUpdateData] (val x: Self) extends AnyVal {
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
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

