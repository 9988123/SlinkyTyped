package typingsSlinky.tablesorter

import typingsSlinky.jquery.JQuery.TriggeredEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/System/CommonEventHandler", JSImport.Namespace)
@js.native
object commonEventHandlerMod extends js.Object {
  type CommonEventHandler[TElement] = js.Function1[/* eventArgs */ TriggeredEvent[TElement, Null, TElement, TElement], Unit]
}

