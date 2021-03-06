package typingsSlinky.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryResultContinuation extends js.Object {
  var tableService: TableService = js.native
}

object QueryResultContinuation {
  @scala.inline
  def apply(tableService: TableService): QueryResultContinuation = {
    val __obj = js.Dynamic.literal(tableService = tableService.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResultContinuation]
  }
  @scala.inline
  implicit class QueryResultContinuationOps[Self <: QueryResultContinuation] (val x: Self) extends AnyVal {
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
    def setTableService(value: TableService): Self = this.set("tableService", value.asInstanceOf[js.Any])
  }
  
}

