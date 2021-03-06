package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "InternalTexture")
@js.native
class InternalTexture protected ()
  extends typingsSlinky.babylonjs.materialsIndexMod.InternalTexture {
  /**
    * Creates a new InternalTexture
    * @param engine defines the engine to use
    * @param source defines the type of data that will be used
    * @param delayAllocation if the texture allocation should be delayed (default: false)
    */
  def this(
    engine: typingsSlinky.babylonjs.thinEngineMod.ThinEngine,
    source: typingsSlinky.babylonjs.internalTextureMod.InternalTextureSource
  ) = this()
  def this(
    engine: typingsSlinky.babylonjs.thinEngineMod.ThinEngine,
    source: typingsSlinky.babylonjs.internalTextureMod.InternalTextureSource,
    delayAllocation: Boolean
  ) = this()
}

/* static members */
@JSImport("babylonjs/index", "InternalTexture")
@js.native
object InternalTexture extends js.Object {
  /** @hidden */
  def _UpdateRGBDAsync(
    internalTexture: typingsSlinky.babylonjs.internalTextureMod.InternalTexture,
    data: js.Array[js.Array[js.typedarray.ArrayBufferView]],
    sphericalPolynomial: Nullable[typingsSlinky.babylonjs.sphericalPolynomialMod.SphericalPolynomial],
    lodScale: Double,
    lodOffset: Double
  ): js.Promise[Unit] = js.native
}

