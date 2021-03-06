package typingsSlinky.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "BoneAxesViewer")
@js.native
class BoneAxesViewer protected ()
  extends typingsSlinky.babylonjs.debugIndexMod.BoneAxesViewer {
  /**
    * Creates a new BoneAxesViewer
    * @param scene defines the hosting scene
    * @param bone defines the target bone
    * @param mesh defines the target mesh
    * @param scaleLines defines a scaling factor for line length (1 by default)
    */
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    bone: typingsSlinky.babylonjs.boneMod.Bone,
    mesh: typingsSlinky.babylonjs.meshMod.Mesh
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    bone: typingsSlinky.babylonjs.boneMod.Bone,
    mesh: typingsSlinky.babylonjs.meshMod.Mesh,
    scaleLines: Double
  ) = this()
}

