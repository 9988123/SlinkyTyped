package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeSliderViewModelMaxChangeEvent extends js.Object {
  var oldValue: Double = js.native
  var `type`: max = js.native
  var value: Double = js.native
}

object SizeSliderViewModelMaxChangeEvent {
  @scala.inline
  def apply(oldValue: Double, `type`: max, value: Double): SizeSliderViewModelMaxChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeSliderViewModelMaxChangeEvent]
  }
  @scala.inline
  implicit class SizeSliderViewModelMaxChangeEventOps[Self <: SizeSliderViewModelMaxChangeEvent] (val x: Self) extends AnyVal {
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
    def setType(value: max): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

