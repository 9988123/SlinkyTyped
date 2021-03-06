package typingsSlinky.devtoolsProtocol.mod.Protocol.Browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHistogramRequest extends js.Object {
  /**
    * If true, retrieve delta since last call.
    */
  var delta: js.UndefOr[Boolean] = js.native
  /**
    * Requested histogram name.
    */
  var name: String = js.native
}

object GetHistogramRequest {
  @scala.inline
  def apply(name: String): GetHistogramRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHistogramRequest]
  }
  @scala.inline
  implicit class GetHistogramRequestOps[Self <: GetHistogramRequest] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelta(value: Boolean): Self = this.set("delta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelta: Self = this.set("delta", js.undefined)
  }
  
}

