package typingsSlinky.tensorflowTfjs.mod

import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsCore.serializationMod.Serializable
import typingsSlinky.tensorflowTfjsCore.serializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "AdamaxOptimizer")
@js.native
class AdamaxOptimizer protected ()
  extends typingsSlinky.tensorflowTfjsCore.mod.AdamaxOptimizer {
  def this(learningRate: Double, beta1: Double, beta2: Double) = this()
  def this(learningRate: Double, beta1: Double, beta2: Double, epsilon: Double) = this()
  def this(
    learningRate: Double,
    beta1: Double,
    beta2: Double,
    epsilon: js.UndefOr[scala.Nothing],
    decay: Double
  ) = this()
  def this(learningRate: Double, beta1: Double, beta2: Double, epsilon: Double, decay: Double) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs", "AdamaxOptimizer")
@js.native
object AdamaxOptimizer extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}

