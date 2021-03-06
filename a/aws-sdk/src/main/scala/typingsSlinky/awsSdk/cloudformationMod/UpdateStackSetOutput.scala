package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateStackSetOutput extends js.Object {
  /**
    * The unique ID for this stack set operation.
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.native
}

object UpdateStackSetOutput {
  @scala.inline
  def apply(): UpdateStackSetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateStackSetOutput]
  }
  @scala.inline
  implicit class UpdateStackSetOutputOps[Self <: UpdateStackSetOutput] (val x: Self) extends AnyVal {
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
    def setOperationId(value: ClientRequestToken): Self = this.set("OperationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationId: Self = this.set("OperationId", js.undefined)
  }
  
}

