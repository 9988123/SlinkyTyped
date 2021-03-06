package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Universal Integrated Circuit Card (UICC), normally called a SIM Card on a mobile broadband device. */
@js.native
trait MobileBroadbandUicc extends js.Object {
  /** Gets the unique SIM Card identity on a mobile broadband device. */
  var simIccId: String = js.native
  /**
    * Asynchronously retrieves a list of mobile broadband UICC (SIM card) applications.
    * @return An asynchronous retrieval operation. On successful completion, returns an object with the results of the retrieval operation.
    */
  def getUiccAppsAsync(): IPromiseWithIAsyncOperation[MobileBroadbandUiccAppsResult] = js.native
}

object MobileBroadbandUicc {
  @scala.inline
  def apply(
    getUiccAppsAsync: () => IPromiseWithIAsyncOperation[MobileBroadbandUiccAppsResult],
    simIccId: String
  ): MobileBroadbandUicc = {
    val __obj = js.Dynamic.literal(getUiccAppsAsync = js.Any.fromFunction0(getUiccAppsAsync), simIccId = simIccId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandUicc]
  }
  @scala.inline
  implicit class MobileBroadbandUiccOps[Self <: MobileBroadbandUicc] (val x: Self) extends AnyVal {
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
    def setGetUiccAppsAsync(value: () => IPromiseWithIAsyncOperation[MobileBroadbandUiccAppsResult]): Self = this.set("getUiccAppsAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setSimIccId(value: String): Self = this.set("simIccId", value.asInstanceOf[js.Any])
  }
  
}

