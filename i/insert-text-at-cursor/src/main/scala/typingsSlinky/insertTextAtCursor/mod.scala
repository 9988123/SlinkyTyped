package typingsSlinky.insertTextAtCursor

import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("insert-text-at-cursor", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(input: HTMLInputElement, text: String): Unit = js.native
  def apply(input: HTMLTextAreaElement, text: String): Unit = js.native
}

