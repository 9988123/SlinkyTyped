package typingsSlinky.weighted

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.weighted.weightedMod.RandomFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("weighted", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val select: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof weighted */ js.Any = js.native
  def apply(obj: StringDictionary[Double]): String = js.native
  def apply(obj: StringDictionary[Double], rand: RandomFunc): String = js.native
  /**
    * Weighted returns a Function additionally available as `weighted.select`
    */
  def apply[T](set: js.Array[T], weights: js.Array[Double]): T = js.native
  def apply[T](set: js.Array[T], weights: js.Array[Double], rand: RandomFunc): T = js.native
}

