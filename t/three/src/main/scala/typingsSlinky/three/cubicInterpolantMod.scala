package typingsSlinky.three

import typingsSlinky.three.interpolantMod.Interpolant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/interpolants/CubicInterpolant", JSImport.Namespace)
@js.native
object cubicInterpolantMod extends js.Object {
  @js.native
  class CubicInterpolant protected () extends Interpolant {
    def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: Double) = this()
    def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: Double, resultBuffer: js.Any) = this()
    def interpolate_(i1: Double, t0: Double, t: Double, t1: Double): js.Any = js.native
  }
  
}

