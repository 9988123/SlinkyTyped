package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R4
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R5
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor5D
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/conv3d_backprop_filter", JSImport.Namespace)
@js.native
object conv3dBackpropFilterMod extends js.Object {
  @js.native
  object conv3DBackpropFilter extends js.Object {
    def apply(
      x: Tensor[R4 | R5],
      dy: Tensor[R4 | R5],
      filterShape: js.Tuple5[Double, Double, Double, Double, Double],
      strides: js.Tuple3[Double, Double, Double],
      pad: same_
    ): Tensor5D = js.native
    def apply(
      x: Tensor[R4 | R5],
      dy: Tensor[R4 | R5],
      filterShape: js.Tuple5[Double, Double, Double, Double, Double],
      strides: js.Tuple3[Double, Double, Double],
      pad: valid_
    ): Tensor5D = js.native
    def apply(
      x: Tensor[R4 | R5],
      dy: Tensor[R4 | R5],
      filterShape: js.Tuple5[Double, Double, Double, Double, Double],
      strides: Double,
      pad: same_
    ): Tensor5D = js.native
    def apply(
      x: Tensor[R4 | R5],
      dy: Tensor[R4 | R5],
      filterShape: js.Tuple5[Double, Double, Double, Double, Double],
      strides: Double,
      pad: valid_
    ): Tensor5D = js.native
  }
  
}

