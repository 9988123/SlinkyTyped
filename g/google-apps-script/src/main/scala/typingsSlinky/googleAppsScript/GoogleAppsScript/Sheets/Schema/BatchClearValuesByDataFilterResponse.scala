package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchClearValuesByDataFilterResponse extends js.Object {
  var clearedRanges: js.UndefOr[js.Array[String]] = js.native
  var spreadsheetId: js.UndefOr[String] = js.native
}

object BatchClearValuesByDataFilterResponse {
  @scala.inline
  def apply(): BatchClearValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchClearValuesByDataFilterResponse]
  }
  @scala.inline
  implicit class BatchClearValuesByDataFilterResponseOps[Self <: BatchClearValuesByDataFilterResponse] (val x: Self) extends AnyVal {
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
    def setClearedRangesVarargs(value: String*): Self = this.set("clearedRanges", js.Array(value :_*))
    @scala.inline
    def setClearedRanges(value: js.Array[String]): Self = this.set("clearedRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearedRanges: Self = this.set("clearedRanges", js.undefined)
    @scala.inline
    def setSpreadsheetId(value: String): Self = this.set("spreadsheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpreadsheetId: Self = this.set("spreadsheetId", js.undefined)
  }
  
}

