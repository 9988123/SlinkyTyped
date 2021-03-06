package typingsSlinky.divaJs.anon

import typingsSlinky.divaJs.interfacesMod.Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Col extends js.Object {
  var col: Double = js.native
  var dimensions: typingsSlinky.divaJs.interfacesMod.Dimensions = js.native
  var offset: Offset = js.native
  var row: Double = js.native
  var url: String = js.native
}

object Col {
  @scala.inline
  def apply(
    col: Double,
    dimensions: typingsSlinky.divaJs.interfacesMod.Dimensions,
    offset: Offset,
    row: Double,
    url: String
  ): Col = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Col]
  }
  @scala.inline
  implicit class ColOps[Self <: Col] (val x: Self) extends AnyVal {
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
    def setCol(value: Double): Self = this.set("col", value.asInstanceOf[js.Any])
    @scala.inline
    def setDimensions(value: typingsSlinky.divaJs.interfacesMod.Dimensions): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Offset): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

