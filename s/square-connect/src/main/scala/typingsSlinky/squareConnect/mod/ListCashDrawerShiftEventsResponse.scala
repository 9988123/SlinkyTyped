package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ListCashDrawerShiftEventsResponse")
@js.native
class ListCashDrawerShiftEventsResponse () extends js.Object {
  /**
    * Opaque cursor for fetching the next page. Cursor is not present in the last page of results.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  /**
    * All of the events (payments, refunds, etc.) for a cash drawer during the shift.
    */
  var events: js.UndefOr[js.Array[CashDrawerShiftEvent]] = js.native
}

