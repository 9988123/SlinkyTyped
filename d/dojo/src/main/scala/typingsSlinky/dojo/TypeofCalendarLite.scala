package typingsSlinky.dojo

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.dojo.dijit.CalendarLite.MonthWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofCalendarLite extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/CalendarLite._MonthWidget.html
    *
    * Displays name of current month padded to the width of the month
    * w/the longest name, so that changing months doesn't change width.
    * 
    * Create as:
    * 
    * new Calendar._MonthWidget({
    *         lang: ...,
    *         dateLocaleModule: ...
    *     })
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var _MonthWidget: Instantiable2[
    js.UndefOr[/* params */ js.Object], 
    js.UndefOr[/* srcNodeRef */ HTMLElement], 
    MonthWidget
  ] = js.native
}

object TypeofCalendarLite {
  @scala.inline
  def apply(
    _MonthWidget: Instantiable2[
      js.UndefOr[/* params */ js.Object], 
      js.UndefOr[/* srcNodeRef */ HTMLElement], 
      MonthWidget
    ]
  ): TypeofCalendarLite = {
    val __obj = js.Dynamic.literal(_MonthWidget = _MonthWidget.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCalendarLite]
  }
  @scala.inline
  implicit class TypeofCalendarLiteOps[Self <: TypeofCalendarLite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_MonthWidget(
      value: Instantiable2[
          js.UndefOr[/* params */ js.Object], 
          js.UndefOr[/* srcNodeRef */ HTMLElement], 
          MonthWidget
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_MonthWidget")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

