package typingsSlinky.sharepoint.global

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.sharepoint.sharepointStrings.waiting
import typingsSlinky.std.GlobalEventHandlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_waiting extends js.Object {
  def apply(
    `type`: waiting,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

