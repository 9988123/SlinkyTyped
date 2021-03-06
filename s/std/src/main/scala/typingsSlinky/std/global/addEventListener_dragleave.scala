package typingsSlinky.std.global

import org.scalajs.dom.raw.Window
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.stdStrings.dragleave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_dragleave extends js.Object {
  def apply(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.DragEvent, _]
  ): Unit = js.native
  def apply(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.DragEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalajs.dom.raw.DragEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

