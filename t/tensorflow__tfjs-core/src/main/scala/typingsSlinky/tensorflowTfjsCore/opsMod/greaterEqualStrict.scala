package typingsSlinky.tensorflowTfjsCore.opsMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "greaterEqualStrict")
@js.native
object greaterEqualStrict extends js.Object {
  def apply[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
}

