package typingsSlinky.wordpressEditor.mod

import typingsSlinky.wordpressBlockEditor.mod.EditorColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/editor", "getColorObjectByColorValue")
@js.native
object getColorObjectByColorValue extends js.Object {
  def apply(colors: js.Array[EditorColor]): js.UndefOr[EditorColor] = js.native
  def apply(colors: js.Array[EditorColor], colorValue: String): js.UndefOr[EditorColor] = js.native
}

