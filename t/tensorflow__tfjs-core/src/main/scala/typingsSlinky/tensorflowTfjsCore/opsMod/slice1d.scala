package typingsSlinky.tensorflowTfjsCore.opsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor1D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "slice1d")
@js.native
object slice1d
  extends TopLevel[
      js.Function3[/* x */ Tensor1D | TensorLike, /* begin */ Double, /* size */ Double, Tensor1D]
    ]

