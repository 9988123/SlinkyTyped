package typingsSlinky.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.BloomFilter")
@js.native
class BloomFilter protected ()
  extends typingsSlinky.typescriptServices.TypeScript.BloomFilter {
  def this(expectedCount: Double) = this()
}

/* static members */
@JSGlobal("TypeScript.BloomFilter")
@js.native
object BloomFilter extends js.Object {
  var falsePositiveProbability: Double = js.native
  def computeK(expectedCount: Double): Double = js.native
  def computeM(expectedCount: Double): Double = js.native
  def isEquivalent(array1: js.Array[Boolean], array2: js.Array[Boolean]): Boolean = js.native
}

