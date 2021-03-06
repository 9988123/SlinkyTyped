package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorDetails extends js.Object {
  var ErrorMessage: js.UndefOr[typingsSlinky.awsSdk.esMod.ErrorMessage] = js.native
  var ErrorType: js.UndefOr[typingsSlinky.awsSdk.esMod.ErrorType] = js.native
}

object ErrorDetails {
  @scala.inline
  def apply(): ErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorDetails]
  }
  @scala.inline
  implicit class ErrorDetailsOps[Self <: ErrorDetails] (val x: Self) extends AnyVal {
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
    def setErrorMessage(value: ErrorMessage): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    @scala.inline
    def setErrorType(value: ErrorType): Self = this.set("ErrorType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorType: Self = this.set("ErrorType", js.undefined)
  }
  
}

