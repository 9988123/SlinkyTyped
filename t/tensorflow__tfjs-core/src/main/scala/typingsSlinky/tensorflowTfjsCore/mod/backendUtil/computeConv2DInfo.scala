package typingsSlinky.tensorflowTfjsCore.mod.backendUtil

import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typingsSlinky.tensorflowTfjsCore.convUtilMod.ExplicitPadding
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsFirst
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsLast
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "backend_util.computeConv2DInfo")
@js.native
object computeConv2DInfo extends js.Object {
  def apply(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same_ | valid_ | Double | ExplicitPadding,
    roundingMode: js.UndefOr[floor | round | ceil],
    depthwise: js.UndefOr[Boolean],
    dataFormat: js.UndefOr[channelsFirst | channelsLast]
  ): Conv2DInfo = js.native
}

