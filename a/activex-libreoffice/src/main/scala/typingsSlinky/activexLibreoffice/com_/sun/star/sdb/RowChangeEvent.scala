package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** indicates the type of change action on the data source. */
@js.native
trait RowChangeEvent extends EventObject {
  /**
    * indicates the type of change.
    * @see com.sun.star.sdb.RowChangeAction
    */
  var Action: Double = js.native
  /** indicates the number of rows affected by the change. */
  var Rows: Double = js.native
}

object RowChangeEvent {
  @scala.inline
  def apply(Action: Double, Rows: Double, Source: XInterface): RowChangeEvent = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowChangeEvent]
  }
  @scala.inline
  implicit class RowChangeEventOps[Self <: RowChangeEvent] (val x: Self) extends AnyVal {
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
    def setAction(value: Double): Self = this.set("Action", value.asInstanceOf[js.Any])
    @scala.inline
    def setRows(value: Double): Self = this.set("Rows", value.asInstanceOf[js.Any])
  }
  
}

