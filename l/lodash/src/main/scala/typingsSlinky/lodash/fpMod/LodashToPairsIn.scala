package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.Dictionary
import typingsSlinky.lodash.mod.NumericDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashToPairsIn extends LodashConvertible {
  def apply(`object`: js.Object): js.Array[js.Tuple2[String, _]] = js.native
  def apply[T](`object`: Dictionary[T]): js.Array[js.Tuple2[String, T]] = js.native
  def apply[T](`object`: NumericDictionary[T]): js.Array[js.Tuple2[String, T]] = js.native
}

