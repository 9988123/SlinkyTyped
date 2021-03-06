package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.CloneWithCustomizer
import typingsSlinky.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashCloneWith extends LodashConvertible {
  def apply[T](customizer: __, value: T): LodashCloneWith1x2[T] = js.native
  def apply[T, TResult](customizer: CloneWithCustomizer[T, js.UndefOr[TResult]]): LodashCloneWith2x1[T, TResult] = js.native
  def apply[T, TResult /* <: js.Object | String | Double | Boolean | Null */](customizer: CloneWithCustomizer[T, TResult], value: T): TResult = js.native
}

