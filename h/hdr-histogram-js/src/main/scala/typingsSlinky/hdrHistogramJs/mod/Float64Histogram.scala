package typingsSlinky.hdrHistogramJs.mod

import typingsSlinky.hdrHistogramJs.float64HistogramMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hdr-histogram-js", "Float64Histogram")
@js.native
class Float64Histogram protected () extends default {
  def this(
    lowestDiscernibleValue: Double,
    highestTrackableValue: Double,
    numberOfSignificantValueDigits: Double
  ) = this()
}

