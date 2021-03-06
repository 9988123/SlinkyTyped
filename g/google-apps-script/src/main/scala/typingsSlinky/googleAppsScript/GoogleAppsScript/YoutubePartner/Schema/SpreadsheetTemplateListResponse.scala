package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadsheetTemplateListResponse extends js.Object {
  var items: js.UndefOr[js.Array[SpreadsheetTemplate]] = js.native
  var kind: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
}

object SpreadsheetTemplateListResponse {
  @scala.inline
  def apply(): SpreadsheetTemplateListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetTemplateListResponse]
  }
  @scala.inline
  implicit class SpreadsheetTemplateListResponseOps[Self <: SpreadsheetTemplateListResponse] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: SpreadsheetTemplate*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SpreadsheetTemplate]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

