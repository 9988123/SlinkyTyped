package typingsSlinky.jsts.mod.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsts", "geom.IntersectionMatrix")
@js.native
class IntersectionMatrix ()
  extends typingsSlinky.jsts.jsts.geom.IntersectionMatrix {
  def this(elements: js.Array[String]) = this()
  def this(other: typingsSlinky.jsts.jsts.geom.IntersectionMatrix) = this()
}

/* static members */
@JSImport("jsts", "geom.IntersectionMatrix")
@js.native
object IntersectionMatrix extends js.Object {
  def isTrue(actualDimensionValue: Double): Boolean = js.native
  def matches(actualDimensionSymbols: String, requiredDimensionSymbols: String): Boolean = js.native
  def matches(actualDimensionValue: Double, requiredDimensionSymbol: String): Boolean = js.native
}

