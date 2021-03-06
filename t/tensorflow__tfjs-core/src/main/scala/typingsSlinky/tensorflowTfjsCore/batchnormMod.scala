package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor1D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/batchnorm", JSImport.Namespace)
@js.native
object batchnormMod extends js.Object {
  @js.native
  object batchNorm extends js.Object {
    def apply[R /* <: Rank */](
      x: Tensor[R] | TensorLike,
      mean: Tensor[R] | Tensor1D | TensorLike,
      variance: Tensor[R] | Tensor1D | TensorLike,
      offset: js.UndefOr[Tensor[R] | Tensor1D | TensorLike],
      scale: js.UndefOr[Tensor[R] | Tensor1D | TensorLike],
      varianceEpsilon: js.UndefOr[Double]
    ): Tensor[R] = js.native
  }
  
}

