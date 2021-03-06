package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "EngineStore")
@js.native
class EngineStore ()
  extends typingsSlinky.babylonjs.enginesIndexMod.EngineStore

/* static members */
@JSImport("babylonjs/index", "EngineStore")
@js.native
object EngineStore extends js.Object {
  /**
    * Texture content used if a texture cannot loaded
    * @ignorenaming
    */
  var FallbackTexture: String = js.native
  /** Gets the list of created engines */
  var Instances: js.Array[typingsSlinky.babylonjs.engineMod.Engine] = js.native
  /**
    * Gets or sets a global variable indicating if fallback texture must be used when a texture cannot be loaded
    * @ignorenaming
    */
  var UseFallbackTexture: Boolean = js.native
  /** @hidden */
  var _LastCreatedScene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
  /**
    * Gets the latest created engine
    */
  def LastCreatedEngine: Nullable[typingsSlinky.babylonjs.engineMod.Engine] = js.native
  /**
    * Gets the latest created scene
    */
  def LastCreatedScene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene] = js.native
}

