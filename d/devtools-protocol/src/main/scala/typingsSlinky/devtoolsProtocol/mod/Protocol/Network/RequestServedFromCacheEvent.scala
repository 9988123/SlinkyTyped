package typingsSlinky.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestServedFromCacheEvent extends js.Object {
  /**
    * Request identifier.
    */
  var requestId: RequestId = js.native
}

object RequestServedFromCacheEvent {
  @scala.inline
  def apply(requestId: RequestId): RequestServedFromCacheEvent = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestServedFromCacheEvent]
  }
  @scala.inline
  implicit class RequestServedFromCacheEventOps[Self <: RequestServedFromCacheEvent] (val x: Self) extends AnyVal {
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
    def setRequestId(value: RequestId): Self = this.set("requestId", value.asInstanceOf[js.Any])
  }
  
}

