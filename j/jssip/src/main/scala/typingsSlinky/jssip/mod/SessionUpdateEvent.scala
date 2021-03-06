package typingsSlinky.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionUpdateEvent extends js.Object {
  var request: IncomingRequest = js.native
  def callback(): Unit = js.native
  def reject(options: SessionRejectOptions): Unit = js.native
}

object SessionUpdateEvent {
  @scala.inline
  def apply(callback: () => Unit, reject: SessionRejectOptions => Unit, request: IncomingRequest): SessionUpdateEvent = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), reject = js.Any.fromFunction1(reject), request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionUpdateEvent]
  }
  @scala.inline
  implicit class SessionUpdateEventOps[Self <: SessionUpdateEvent] (val x: Self) extends AnyVal {
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
    def setCallback(value: () => Unit): Self = this.set("callback", js.Any.fromFunction0(value))
    @scala.inline
    def setReject(value: SessionRejectOptions => Unit): Self = this.set("reject", js.Any.fromFunction1(value))
    @scala.inline
    def setRequest(value: IncomingRequest): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}

