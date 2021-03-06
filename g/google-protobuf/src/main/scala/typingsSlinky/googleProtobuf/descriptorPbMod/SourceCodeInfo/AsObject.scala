package typingsSlinky.googleProtobuf.descriptorPbMod.SourceCodeInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var locationList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    locationList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(locationList = locationList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
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
    def setLocationListVarargs(value: typingsSlinky.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location.AsObject*): Self = this.set("locationList", js.Array(value :_*))
    @scala.inline
    def setLocationList(value: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location.AsObject]): Self = this.set("locationList", value.asInstanceOf[js.Any])
  }
  
}

