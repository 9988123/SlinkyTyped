package typingsSlinky.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "AngleLockEquation")
@js.native
class AngleLockEquation protected () extends Equation {
  def this(bodyA: Body, bodyB: Body) = this()
  def this(bodyA: Body, bodyB: Body, options: AngleLockEquationOptions) = this()
  var angle: Double = js.native
  var ratio: Double = js.native
  def setMaxTorque(torque: Double): Unit = js.native
  def setRatio(ratio: Double): Double = js.native
}

