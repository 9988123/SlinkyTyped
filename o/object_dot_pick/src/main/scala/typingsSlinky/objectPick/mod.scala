package typingsSlinky.objectPick

import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("object.pick", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[T /* <: js.Object */, U /* <: /* keyof T */ String */](`object`: T, keys: js.Array[U]): Pick[T, U] = js.native
}

