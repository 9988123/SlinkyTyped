package typingsSlinky.activexExcel.anon

import typingsSlinky.activexExcel.Excel.XlXmlImportResult
import typingsSlinky.activexExcel.Excel.XmlMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsRefreshMap extends js.Object {
  val IsRefresh: Boolean = js.native
  val Map: XmlMap = js.native
  val Result: XlXmlImportResult = js.native
}

object IsRefreshMap {
  @scala.inline
  def apply(IsRefresh: Boolean, Map: XmlMap, Result: XlXmlImportResult): IsRefreshMap = {
    val __obj = js.Dynamic.literal(IsRefresh = IsRefresh.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsRefreshMap]
  }
  @scala.inline
  implicit class IsRefreshMapOps[Self <: IsRefreshMap] (val x: Self) extends AnyVal {
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
    def setIsRefresh(value: Boolean): Self = this.set("IsRefresh", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: XmlMap): Self = this.set("Map", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: XlXmlImportResult): Self = this.set("Result", value.asInstanceOf[js.Any])
  }
  
}

