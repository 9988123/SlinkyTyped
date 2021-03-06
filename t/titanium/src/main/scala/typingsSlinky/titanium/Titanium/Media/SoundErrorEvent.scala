package typingsSlinky.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when an error occurs while playing the audio.
  */
@js.native
trait SoundErrorEvent extends SoundBaseEvent {
  /**
    * Error code.
    * If the error was generated by the operating system, that system's error value
    * is used. Otherwise, this value will be -1.
    */
  var code: Double = js.native
  /**
    * Error message, if any returned. May be undefined.
    */
  var error: String = js.native
  /**
    * Error message. Use the error property instead.
    * @deprecated
    */
  var message: String = js.native
  /**
    * Indicates a successful operation. Returns `false`.
    */
  var success: Boolean = js.native
}

object SoundErrorEvent {
  @scala.inline
  def apply(code: Double, error: String, message: String, source: Sound, success: Boolean): SoundErrorEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundErrorEvent]
  }
  @scala.inline
  implicit class SoundErrorEventOps[Self <: SoundErrorEvent] (val x: Self) extends AnyVal {
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

