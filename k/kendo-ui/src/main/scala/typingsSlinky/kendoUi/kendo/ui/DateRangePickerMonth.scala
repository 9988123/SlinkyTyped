package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateRangePickerMonth extends js.Object {
  var content: js.UndefOr[String] = js.native
  var empty: js.UndefOr[String] = js.native
  var weekNumber: js.UndefOr[String] = js.native
}

object DateRangePickerMonth {
  @scala.inline
  def apply(): DateRangePickerMonth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRangePickerMonth]
  }
  @scala.inline
  implicit class DateRangePickerMonthOps[Self <: DateRangePickerMonth] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setEmpty(value: String): Self = this.set("empty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    @scala.inline
    def setWeekNumber(value: String): Self = this.set("weekNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekNumber: Self = this.set("weekNumber", js.undefined)
  }
  
}

