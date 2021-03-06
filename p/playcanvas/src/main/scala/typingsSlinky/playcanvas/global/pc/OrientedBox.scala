package typingsSlinky.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new oriented box.
  * @property [worldTransform] - The world transform of the OBB.
  * @param [worldTransform] - Transform that has the orientation and position of the box. Scale is assumed to be one.
  * @param [halfExtents] - Half the distance across the box in each local axis. The constructor takes a reference of this parameter.
  */
@JSGlobal("pc.OrientedBox")
@js.native
class OrientedBox ()
  extends typingsSlinky.playcanvas.pc.OrientedBox {
  def this(worldTransform: typingsSlinky.playcanvas.pc.Mat4) = this()
  def this(worldTransform: js.UndefOr[scala.Nothing], halfExtents: typingsSlinky.playcanvas.pc.Vec3) = this()
  def this(worldTransform: typingsSlinky.playcanvas.pc.Mat4, halfExtents: typingsSlinky.playcanvas.pc.Vec3) = this()
}

