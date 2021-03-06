package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/add_n", JSImport.Namespace)
@js.native
object addNMod extends js.Object {
  @js.native
  object addN extends js.Object {
    def apply[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike]): T = js.native
  }
  
}

