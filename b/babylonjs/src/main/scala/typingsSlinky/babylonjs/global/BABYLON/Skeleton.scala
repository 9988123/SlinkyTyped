package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.Skeleton")
@js.native
class Skeleton protected ()
  extends typingsSlinky.babylonjs.BABYLON.Skeleton {
  /**
    * Creates a new skeleton
    * @param name defines the skeleton name
    * @param id defines the skeleton Id
    * @param scene defines the hosting scene
    */
  def this(
    /** defines the skeleton name */
  name: String,
    /** defines the skeleton Id */
  id: String,
    scene: typingsSlinky.babylonjs.BABYLON.Scene
  ) = this()
  /**
    * Array of animations
    */
  /* CompleteClass */
  override var animations: Nullable[js.Array[typingsSlinky.babylonjs.BABYLON.Animation]] = js.native
}

/* static members */
@JSGlobal("BABYLON.Skeleton")
@js.native
object Skeleton extends js.Object {
  /**
    * Creates a new skeleton from serialized data
    * @param parsedSkeleton defines the serialized data
    * @param scene defines the hosting scene
    * @returns a new skeleton
    */
  def Parse(parsedSkeleton: js.Any, scene: typingsSlinky.babylonjs.BABYLON.Scene): typingsSlinky.babylonjs.BABYLON.Skeleton = js.native
}

