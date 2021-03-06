package typingsSlinky.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayValue extends js.Object {
  /** Values in the array. */
  var values: js.UndefOr[js.Array[Value]] = js.native
}

object ArrayValue {
  @scala.inline
  def apply(): ArrayValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayValue]
  }
  @scala.inline
  implicit class ArrayValueOps[Self <: ArrayValue] (val x: Self) extends AnyVal {
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
    def setValuesVarargs(value: Value*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[Value]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

