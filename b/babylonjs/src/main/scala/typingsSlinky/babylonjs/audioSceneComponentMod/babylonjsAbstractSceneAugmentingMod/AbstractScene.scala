package typingsSlinky.babylonjs.audioSceneComponentMod.babylonjsAbstractSceneAugmentingMod

import typingsSlinky.babylonjs.soundMod.Sound
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractScene extends js.Object {
  /**
    * The list of sounds used in the scene.
    */
  var sounds: Nullable[js.Array[Sound]]
}

object AbstractScene {
  @scala.inline
  def apply(sounds: Nullable[js.Array[Sound]] = null): AbstractScene = {
    val __obj = js.Dynamic.literal(sounds = sounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractScene]
  }
}

