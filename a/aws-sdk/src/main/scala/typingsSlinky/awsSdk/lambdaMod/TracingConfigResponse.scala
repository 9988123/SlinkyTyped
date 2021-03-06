package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TracingConfigResponse extends js.Object {
  /**
    * The tracing mode.
    */
  var Mode: js.UndefOr[TracingMode] = js.native
}

object TracingConfigResponse {
  @scala.inline
  def apply(): TracingConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracingConfigResponse]
  }
  @scala.inline
  implicit class TracingConfigResponseOps[Self <: TracingConfigResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMode(value: TracingMode): Self = this.set("Mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("Mode", js.undefined)
  }
  
}

