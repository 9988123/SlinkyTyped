package typingsSlinky.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "GroundMesh")
@js.native
class GroundMesh protected ()
  extends typingsSlinky.babylonjs.legacyMod.GroundMesh {
  def this(name: String, scene: typingsSlinky.babylonjs.sceneMod.Scene) = this()
}

/* static members */
@JSImport("babylonjs", "GroundMesh")
@js.native
object GroundMesh extends js.Object {
  /**
    * Parses a serialized ground mesh
    * @param parsedMesh the serialized mesh
    * @param scene the scene to create the ground mesh in
    * @returns the created ground mesh
    */
  def Parse(parsedMesh: js.Any, scene: typingsSlinky.babylonjs.sceneMod.Scene): typingsSlinky.babylonjs.groundMeshMod.GroundMesh = js.native
}

