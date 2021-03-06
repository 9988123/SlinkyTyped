package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.LensFlare")
@js.native
class LensFlare protected ()
  extends typingsSlinky.babylonjs.BABYLON.LensFlare {
  /**
    * Instantiates a new Lens Flare.
    * This represents one of the lens effect in a `lensFlareSystem`.
    * It controls one of the indiviual texture used in the effect.
    * @see http://doc.babylonjs.com/how_to/how_to_use_lens_flares
    * @param size Define the size of the lens flare in the system (a floating value between 0 and 1)
    * @param position Define the position of the lens flare in the system. (a floating value between -1 and 1). A value of 0 is located on the emitter. A value greater than 0 is beyond the emitter and a value lesser than 0 is behind.
    * @param color Define the lens color
    * @param imgUrl Define the lens texture url
    * @param system Define the `lensFlareSystem` this flare is part of
    */
  def this(
    /**
    * Define the size of the lens flare in the system (a floating value between 0 and 1)
    */
  size: Double,
    /**
    * Define the position of the lens flare in the system. (a floating value between -1 and 1). A value of 0 is located on the emitter. A value greater than 0 is beyond the emitter and a value lesser than 0 is behind.
    */
  position: Double,
    color: typingsSlinky.babylonjs.BABYLON.Color3,
    imgUrl: String,
    system: typingsSlinky.babylonjs.BABYLON.LensFlareSystem
  ) = this()
  /* CompleteClass */
  override var _system: js.Any = js.native
  /**
    * Define the alpha mode to render this particular lens.
    */
  /* CompleteClass */
  override var alphaMode: Double = js.native
  /**
    * Define the lens color.
    */
  /* CompleteClass */
  override var color: typingsSlinky.babylonjs.BABYLON.Color3 = js.native
  /**
    * Define the position of the lens flare in the system. (a floating value between -1 and 1). A value of 0 is located on the emitter. A value greater than 0 is beyond the emitter and a value lesser than 0 is behind.
    */
  /* CompleteClass */
  override var position: Double = js.native
  /**
    * Define the size of the lens flare in the system (a floating value between 0 and 1)
    */
  /* CompleteClass */
  override var size: Double = js.native
  /**
    * Define the lens texture.
    */
  /* CompleteClass */
  override var texture: Nullable[typingsSlinky.babylonjs.BABYLON.Texture] = js.native
  /**
    * Dispose and release the lens flare with its associated resources.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.LensFlare")
@js.native
object LensFlare extends js.Object {
  /**
    * Creates a new Lens Flare.
    * This represents one of the lens effect in a `lensFlareSystem`.
    * It controls one of the indiviual texture used in the effect.
    * @see http://doc.babylonjs.com/how_to/how_to_use_lens_flares
    * @param size Define the size of the lens flare (a floating value between 0 and 1)
    * @param position Define the position of the lens flare in the system. (a floating value between -1 and 1). A value of 0 is located on the emitter. A value greater than 0 is beyond the emitter and a value lesser than 0 is behind.
    * @param color Define the lens color
    * @param imgUrl Define the lens texture url
    * @param system Define the `lensFlareSystem` this flare is part of
    * @returns The newly created Lens Flare
    */
  def AddFlare(
    size: Double,
    position: Double,
    color: typingsSlinky.babylonjs.BABYLON.Color3,
    imgUrl: String,
    system: typingsSlinky.babylonjs.BABYLON.LensFlareSystem
  ): typingsSlinky.babylonjs.BABYLON.LensFlare = js.native
}

