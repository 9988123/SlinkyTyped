package typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallFunctionOnResponse extends js.Object {
  /**
    * Exception details.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.native
  /**
    * Call result.
    */
  var result: RemoteObject = js.native
}

object CallFunctionOnResponse {
  @scala.inline
  def apply(result: RemoteObject): CallFunctionOnResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallFunctionOnResponse]
  }
  @scala.inline
  implicit class CallFunctionOnResponseOps[Self <: CallFunctionOnResponse] (val x: Self) extends AnyVal {
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
    def setResult(value: RemoteObject): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setExceptionDetails(value: ExceptionDetails): Self = this.set("exceptionDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExceptionDetails: Self = this.set("exceptionDetails", js.undefined)
  }
  
}

