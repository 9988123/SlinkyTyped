package typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataRequest extends IDataRequest

object DataRequest {
  @scala.inline
  def apply(
    data: DataPackage,
    deadline: js.Date,
    failWithDisplayText: String => Unit,
    getDeferral: () => DataRequestDeferral
  ): DataRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], deadline = deadline.asInstanceOf[js.Any], failWithDisplayText = js.Any.fromFunction1(failWithDisplayText), getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[DataRequest]
  }
}

