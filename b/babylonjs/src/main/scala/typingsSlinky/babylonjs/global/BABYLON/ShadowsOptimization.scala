package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ShadowsOptimization")
@js.native
class ShadowsOptimization ()
  extends typingsSlinky.babylonjs.BABYLON.ShadowsOptimization {
  /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  /* CompleteClass */
  override var priority: Double = js.native
  /**
    * This function will be called by the SceneOptimizer when its priority is reached in order to apply the change required by the current optimization
    * @param scene defines the current scene where to apply this optimization
    * @param optimizer defines the current optimizer
    * @returns true if everything that can be done was applied
    */
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    optimizer: typingsSlinky.babylonjs.BABYLON.SceneOptimizer
  ): Boolean = js.native
  /**
    * Gets a string describing the action executed by the current optimization
    * @returns description string
    */
  /* CompleteClass */
  override def getDescription(): String = js.native
}

