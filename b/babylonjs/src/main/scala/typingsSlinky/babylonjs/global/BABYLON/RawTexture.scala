package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.RawTexture")
@js.native
class RawTexture protected ()
  extends typingsSlinky.babylonjs.BABYLON.RawTexture {
  /**
    * Instantiates a new RawTexture.
    * Raw texture can help creating a texture directly from an array of data.
    * This can be super useful if you either get the data from an uncompressed source or
    * if you wish to create your texture pixel by pixel.
    * @param data define the array of data to use to create the texture
    * @param width define the width of the texture
    * @param height define the height of the texture
    * @param format define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    * @param scene  define the scene the texture belongs to
    * @param generateMipMaps define whether mip maps should be generated or not
    * @param invertY define if the data should be flipped on Y when uploaded to the GPU
    * @param samplingMode define the texture sampling mode (Texture.xxx_SAMPLINGMODE)
    * @param type define the format of the data (int, float... Engine.TEXTURETYPE_xxx)
    */
  def this(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    /**
    * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    */
  format: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene
  ) = this()
  def this(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    /**
    * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    */
  format: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean
  ) = this()
  def this(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    /**
    * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    */
  format: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean,
    invertY: Boolean
  ) = this()
  def this(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    /**
    * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    */
  format: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double
  ) = this()
  def this(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    /**
    * Define the format of the data (RGB, RGBA... Engine.TEXTUREFORMAT_xxx)
    */
  format: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    `type`: Double
  ) = this()
  /**
    * Array of animations
    */
  /* CompleteClass */
  override var animations: Nullable[js.Array[typingsSlinky.babylonjs.BABYLON.Animation]] = js.native
}

/* static members */
@JSGlobal("BABYLON.RawTexture")
@js.native
object RawTexture extends js.Object {
  /**
    * Creates an alpha texture from some data.
    * @param data Define the texture data
    * @param width Define the width of the texture
    * @param height Define the height of the texture
    * @param scene Define the scene the texture belongs to
    * @param generateMipMaps Define whether or not to create mip maps for the texture
    * @param invertY define if the data should be flipped on Y when uploaded to the GPU
    * @param samplingMode define the texture sampling mode (Texture.xxx_SAMPLINGMODE)
    * @returns the alpha texture
    */
  def CreateAlphaTexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  def CreateAlphaTexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  def CreateAlphaTexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean,
    invertY: Boolean
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  def CreateAlphaTexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  /**
    * Creates a luminance alpha texture from some data.
    * @param data Define the texture data
    * @param width Define the width of the texture
    * @param height Define the height of the texture
    * @param scene Define the scene the texture belongs to
    * @param generateMipMaps Define whether or not to create mip maps for the texture
    * @param invertY define if the data should be flipped on Y when uploaded to the GPU
    * @param samplingMode define the texture sampling mode (Texture.xxx_SAMPLINGMODE)
    * @returns the luminance alpha texture
    */
  def CreateLuminanceAlphaTexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  def CreateLuminanceAlphaTexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  def CreateLuminanceAlphaTexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean,
    invertY: Boolean
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  def CreateLuminanceAlphaTexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  /**
    * Creates a luminance texture from some data.
    * @param data Define the texture data
    * @param width Define the width of the texture
    * @param height Define the height of the texture
    * @param scene Define the scene the texture belongs to
    * @param generateMipMaps Define whether or not to create mip maps for the texture
    * @param invertY define if the data should be flipped on Y when uploaded to the GPU
    * @param samplingMode define the texture sampling mode (Texture.xxx_SAMPLINGMODE)
    * @returns the luminance texture
    */
  def CreateLuminanceTexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  def CreateLuminanceTexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  def CreateLuminanceTexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean,
    invertY: Boolean
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  def CreateLuminanceTexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  /**
    * Creates a RGBA texture from some data.
    * @param data Define the texture data
    * @param width Define the width of the texture
    * @param height Define the height of the texture
    * @param scene Define the scene the texture belongs to
    * @param generateMipMaps Define whether or not to create mip maps for the texture
    * @param invertY define if the data should be flipped on Y when uploaded to the GPU
    * @param samplingMode define the texture sampling mode (Texture.xxx_SAMPLINGMODE)
    * @param type define the format of the data (int, float... Engine.TEXTURETYPE_xxx)
    * @returns the RGBA texture
    */
  def CreateRGBATexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  def CreateRGBATexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  def CreateRGBATexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean,
    invertY: Boolean
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  def CreateRGBATexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  def CreateRGBATexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    `type`: Double
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  /**
    * Creates a RGB texture from some data.
    * @param data Define the texture data
    * @param width Define the width of the texture
    * @param height Define the height of the texture
    * @param scene Define the scene the texture belongs to
    * @param generateMipMaps Define whether or not to create mip maps for the texture
    * @param invertY define if the data should be flipped on Y when uploaded to the GPU
    * @param samplingMode define the texture sampling mode (Texture.xxx_SAMPLINGMODE)
    * @param type define the format of the data (int, float... Engine.TEXTURETYPE_xxx)
    * @returns the RGB alpha texture
    */
  def CreateRGBTexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  def CreateRGBTexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  def CreateRGBTexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean,
    invertY: Boolean
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  def CreateRGBTexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  def CreateRGBTexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    `type`: Double
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  /**
    * Creates a R texture from some data.
    * @param data Define the texture data
    * @param width Define the width of the texture
    * @param height Define the height of the texture
    * @param scene Define the scene the texture belongs to
    * @param generateMipMaps Define whether or not to create mip maps for the texture
    * @param invertY define if the data should be flipped on Y when uploaded to the GPU
    * @param samplingMode define the texture sampling mode (Texture.xxx_SAMPLINGMODE)
    * @param type define the format of the data (int, float... Engine.TEXTURETYPE_xxx)
    * @returns the R texture
    */
  def CreateRTexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  def CreateRTexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  def CreateRTexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean,
    invertY: Boolean
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  def CreateRTexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
  def CreateRTexture(
    data: js.typedarray.ArrayBufferView,
    width: Double,
    height: Double,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    generateMipMaps: Boolean,
    invertY: Boolean,
    samplingMode: Double,
    `type`: Double
  ): typingsSlinky.babylonjs.BABYLON.RawTexture = js.native
}

