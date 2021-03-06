package typingsSlinky.nextReactDevOverlay.busMod

import typingsSlinky.stacktraceParser.mod.StackFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnhandledRejection extends BusEvent {
  var frames: js.Array[StackFrame] = js.native
  var reason: js.Error = js.native
  var `type`: /* "unhandled-rejection" */ String = js.native
}

object UnhandledRejection {
  @scala.inline
  def apply(frames: js.Array[StackFrame], reason: js.Error, `type`: /* "unhandled-rejection" */ String): UnhandledRejection = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnhandledRejection]
  }
  @scala.inline
  implicit class UnhandledRejectionOps[Self <: UnhandledRejection] (val x: Self) extends AnyVal {
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
    def setFramesVarargs(value: StackFrame*): Self = this.set("frames", js.Array(value :_*))
    @scala.inline
    def setFrames(value: js.Array[StackFrame]): Self = this.set("frames", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: js.Error): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: /* "unhandled-rejection" */ String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

