package typingsSlinky.clsx

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clsx", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait ClassArray extends Array[ClassValue]
  
  def default(classes: ClassValue*): String = js.native
  type ClassDictionary = StringDictionary[js.Any]
  type ClassValue = js.UndefOr[ClassArray | ClassDictionary | String | Double | Null | Boolean]
}

