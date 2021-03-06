package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetValuesByDataFilterRequest extends js.Object {
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.native
  var dateTimeRenderOption: js.UndefOr[String] = js.native
  var majorDimension: js.UndefOr[String] = js.native
  var valueRenderOption: js.UndefOr[String] = js.native
}

object BatchGetValuesByDataFilterRequest {
  @scala.inline
  def apply(): BatchGetValuesByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetValuesByDataFilterRequest]
  }
  @scala.inline
  implicit class BatchGetValuesByDataFilterRequestOps[Self <: BatchGetValuesByDataFilterRequest] (val x: Self) extends AnyVal {
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
    def setDataFiltersVarargs(value: DataFilter*): Self = this.set("dataFilters", js.Array(value :_*))
    @scala.inline
    def setDataFilters(value: js.Array[DataFilter]): Self = this.set("dataFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataFilters: Self = this.set("dataFilters", js.undefined)
    @scala.inline
    def setDateTimeRenderOption(value: String): Self = this.set("dateTimeRenderOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateTimeRenderOption: Self = this.set("dateTimeRenderOption", js.undefined)
    @scala.inline
    def setMajorDimension(value: String): Self = this.set("majorDimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorDimension: Self = this.set("majorDimension", js.undefined)
    @scala.inline
    def setValueRenderOption(value: String): Self = this.set("valueRenderOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueRenderOption: Self = this.set("valueRenderOption", js.undefined)
  }
  
}

