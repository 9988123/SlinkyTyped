package typingsSlinky.phaser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Matter.Axes` module contains methods for creating and manipulating sets of axes.
  *
  * @class Axes
  */
@JSImport("matter", "Axes")
@js.native
class Axes ()
  extends typingsSlinky.phaser.MatterJS.Axes

/* static members */
@JSImport("matter", "Axes")
@js.native
object Axes extends js.Object {
  /**
    * Creates a new set of axes from the given vertices.
    * @method fromVertices
    * @param {vertices} vertices
    * @return {axes} A new axes from the given vertices
    */
  def fromVertices(vertices: js.Array[typingsSlinky.phaser.MatterJS.Vector]): js.Array[typingsSlinky.phaser.MatterJS.Vector] = js.native
  /**
    * Rotates a set of axes by the given angle.
    * @method rotate
    * @param {axes} axes
    * @param {number} angle
    */
  def rotate(axes: js.Array[typingsSlinky.phaser.MatterJS.Vector], angle: Double): Unit = js.native
}

