package typingsSlinky.dojo.dojox.widget

import typingsSlinky.dojo.AnonUnwatch
import typingsSlinky.dojo.dojoStrings.parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/Calendar3Pane.html
  *
  * A Calendar with three panes, includes day, month, and year views
  *
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.dojo.dojox.widget.CalendarYear because Inheritance from two classes. Inlined 
- typingsSlinky.dojo.dojox.widget.CalendarMonth because Inheritance from two classes. Inlined 
- typingsSlinky.dojo.dojox.widget.CalendarDay because Inheritance from two classes. Inlined parent */ @JSGlobal("dojox.widget.Calendar3Pane")
@js.native
class Calendar3Pane () extends CalendarBase {
  /**
    *
    */
  var parent: js.Object = js.native
  @JSName("get")
  def get_parent(property: parent): js.Object = js.native
  @JSName("set")
  def set_parent(property: parent, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_parent(
    property: parent,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

