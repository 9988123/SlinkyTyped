package typingsSlinky.three

import typingsSlinky.three.anon.Holes
import typingsSlinky.three.extrudeGeometryMod.ExtrudeGeometry
import typingsSlinky.three.pathMod.Path
import typingsSlinky.three.shapeGeometryMod.ShapeGeometry
import typingsSlinky.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/core/Shape", JSImport.Namespace)
@js.native
object shapeMod extends js.Object {
  @js.native
  class Shape () extends Path {
    def this(points: js.Array[Vector2]) = this()
    var holes: js.Array[Path] = js.native
    /**
    	 * @deprecated Use {@link Shape#extractPoints .extractPoints()} instead.
    	 */
    def extractAllPoints(divisions: Double): Holes = js.native
    def extractPoints(divisions: Double): Holes = js.native
    /**
    	 * @deprecated Use {@link ExtrudeGeometry ExtrudeGeometry()} instead.
    	 */
    def extrude(): ExtrudeGeometry = js.native
    def extrude(options: js.Any): ExtrudeGeometry = js.native
    def getPointsHoles(divisions: Double): js.Array[js.Array[Vector2]] = js.native
    /**
    	 * @deprecated Use {@link ShapeGeometry ShapeGeometry()} instead.
    	 */
    def makeGeometry(): ShapeGeometry = js.native
    def makeGeometry(options: js.Any): ShapeGeometry = js.native
  }
  
}

