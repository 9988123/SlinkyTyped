package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/tile", JSImport.Namespace)
@js.native
object tileMod extends js.Object {
  @js.native
  object tile extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: T, reps: js.Array[Double]): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, reps: js.Array[Double]): T = js.native
  }
  
}

