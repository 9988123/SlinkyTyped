package typingsSlinky.hdrHistogramJs.mod

import typingsSlinky.hdrHistogramJs.sparseArrayHistogramMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hdr-histogram-js", "SparseArrayHistogram")
@js.native
class SparseArrayHistogram protected () extends default {
  def this(
    lowestDiscernibleValue: Double,
    highestTrackableValue: Double,
    numberOfSignificantValueDigits: Double
  ) = this()
}

