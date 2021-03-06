package typingsSlinky.tensorflowTfjsCore.mod

import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "tensor_util")
@js.native
object tensorUtil extends js.Object {
  def assertTypesMatch(
    a: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    b: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): Unit = js.native
  def getTensorsInContainer(result: TensorContainer): js.Array[Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]] = js.native
  def isTensorInList(
    tensor: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    tensorList: js.Array[Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]]
  ): Boolean = js.native
  def makeTypesMatch[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](a: T, b: T): js.Tuple2[T, T] = js.native
}

