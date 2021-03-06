package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`max-change`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassedColorSliderMaxChangeEvent extends js.Object {
  var oldValue: Double = js.native
  var `type`: `max-change` = js.native
  var value: Double = js.native
}

object ClassedColorSliderMaxChangeEvent {
  @scala.inline
  def apply(oldValue: Double, `type`: `max-change`, value: Double): ClassedColorSliderMaxChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassedColorSliderMaxChangeEvent]
  }
  @scala.inline
  implicit class ClassedColorSliderMaxChangeEventOps[Self <: ClassedColorSliderMaxChangeEvent] (val x: Self) extends AnyVal {
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
    def setOldValue(value: Double): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `max-change`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

