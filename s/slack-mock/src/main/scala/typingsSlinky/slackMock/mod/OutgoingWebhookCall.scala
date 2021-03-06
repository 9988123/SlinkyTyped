package typingsSlinky.slackMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutgoingWebhookCall[T] extends js.Object {
  var headers: OutgoingWebhookHttpHeaders = js.native
  var params: T = js.native
  var statusCode: Double = js.native
  var url: OutgoingWebhookUrl = js.native
}

object OutgoingWebhookCall {
  @scala.inline
  def apply[T](headers: OutgoingWebhookHttpHeaders, params: T, statusCode: Double, url: OutgoingWebhookUrl): OutgoingWebhookCall[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutgoingWebhookCall[T]]
  }
  @scala.inline
  implicit class OutgoingWebhookCallOps[Self <: OutgoingWebhookCall[_], T] (val x: Self with OutgoingWebhookCall[T]) extends AnyVal {
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
    def setHeaders(value: OutgoingWebhookHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: T): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: OutgoingWebhookUrl): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

