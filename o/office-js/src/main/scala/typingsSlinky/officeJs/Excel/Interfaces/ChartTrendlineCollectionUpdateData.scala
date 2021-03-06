package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartTrendlineCollection object, for use in `chartTrendlineCollection.set({ ... })`. */
@js.native
trait ChartTrendlineCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[ChartTrendlineData]] = js.native
}

object ChartTrendlineCollectionUpdateData {
  @scala.inline
  def apply(): ChartTrendlineCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTrendlineCollectionUpdateData]
  }
  @scala.inline
  implicit class ChartTrendlineCollectionUpdateDataOps[Self <: ChartTrendlineCollectionUpdateData] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: ChartTrendlineData*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[ChartTrendlineData]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}

