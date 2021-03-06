package typingsSlinky.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RopeGeometry allows you to draw a geometry across several points and then manipulate these points.
  *
  * ```js
  * for (let i = 0; i < 20; i++) {
  *     points.push(new PIXI.Point(i * 50, 0));
  * };
  * const rope = new PIXI.RopeGeometry(100, points);
  * ```
  *
  * @class
  * @extends PIXI.MeshGeometry
  * @memberof PIXI
  *
  */
@JSImport("pixi.js", "RopeGeometry")
@js.native
class RopeGeometry ()
  extends typingsSlinky.pixiJs.PIXI.RopeGeometry {
  def this(width: Double) = this()
  def this(width: js.UndefOr[scala.Nothing], points: js.Array[typingsSlinky.pixiJs.PIXI.Point]) = this()
  def this(width: Double, points: js.Array[typingsSlinky.pixiJs.PIXI.Point]) = this()
  def this(width: js.UndefOr[scala.Nothing], points: js.UndefOr[scala.Nothing], textureScale: Double) = this()
  def this(
    width: js.UndefOr[scala.Nothing],
    points: js.Array[typingsSlinky.pixiJs.PIXI.Point],
    textureScale: Double
  ) = this()
  def this(width: Double, points: js.UndefOr[scala.Nothing], textureScale: Double) = this()
  def this(width: Double, points: js.Array[typingsSlinky.pixiJs.PIXI.Point], textureScale: Double) = this()
}

