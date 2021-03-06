package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the altimeter reading–changed event. */
@js.native
trait AltimeterReadingChangedEventArgs extends js.Object {
  /** Gets the most recent barometer reading. */
  var reading: AltimeterReading = js.native
}

object AltimeterReadingChangedEventArgs {
  @scala.inline
  def apply(reading: AltimeterReading): AltimeterReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[AltimeterReadingChangedEventArgs]
  }
  @scala.inline
  implicit class AltimeterReadingChangedEventArgsOps[Self <: AltimeterReadingChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setReading(value: AltimeterReading): Self = this.set("reading", value.asInstanceOf[js.Any])
  }
  
}

