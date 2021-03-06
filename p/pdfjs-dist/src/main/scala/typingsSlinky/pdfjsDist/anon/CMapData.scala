package typingsSlinky.pdfjsDist.anon

import typingsSlinky.pdfjsDist.mod.CMapCompressionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CMapData extends js.Object {
  var cMapData: js.Any = js.native
  var compressionType: CMapCompressionType = js.native
}

object CMapData {
  @scala.inline
  def apply(cMapData: js.Any, compressionType: CMapCompressionType): CMapData = {
    val __obj = js.Dynamic.literal(cMapData = cMapData.asInstanceOf[js.Any], compressionType = compressionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMapData]
  }
  @scala.inline
  implicit class CMapDataOps[Self <: CMapData] (val x: Self) extends AnyVal {
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
    def setCMapData(value: js.Any): Self = this.set("cMapData", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompressionType(value: CMapCompressionType): Self = this.set("compressionType", value.asInstanceOf[js.Any])
  }
  
}

