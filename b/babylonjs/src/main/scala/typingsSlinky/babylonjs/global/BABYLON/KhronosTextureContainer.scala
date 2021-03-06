package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.KhronosTextureContainer")
@js.native
class KhronosTextureContainer protected ()
  extends typingsSlinky.babylonjs.BABYLON.KhronosTextureContainer {
  /**
    * Creates a new KhronosTextureContainer
    * @param data contents of the KTX container file
    * @param facesExpected should be either 1 or 6, based whether a cube texture or or
    * @param threeDExpected provision for indicating that data should be a 3D texture, not implemented
    * @param textureArrayExpected provision for indicating that data should be a texture array, not implemented
    */
  def this(
    /** contents of the KTX container file */
  data: js.typedarray.ArrayBufferView,
    facesExpected: Double
  ) = this()
  def this(
    /** contents of the KTX container file */
  data: js.typedarray.ArrayBufferView,
    facesExpected: Double,
    threeDExpected: Boolean
  ) = this()
  def this(
    /** contents of the KTX container file */
  data: js.typedarray.ArrayBufferView,
    facesExpected: Double,
    threeDExpected: Boolean,
    textureArrayExpected: Boolean
  ) = this()
  /* CompleteClass */
  override var _upload2DCompressedLevels: js.Any = js.native
  /**
    * Gets the bytes of key value data
    */
  /* CompleteClass */
  override var bytesOfKeyValueData: Double = js.native
  /** contents of the KTX container file */
  /* CompleteClass */
  override var data: js.typedarray.ArrayBufferView = js.native
  /**
    * Gets the base internal format
    */
  /* CompleteClass */
  override var glBaseInternalFormat: Double = js.native
  /**
    * Gets the openGL format
    */
  /* CompleteClass */
  override var glFormat: Double = js.native
  /**
    * Gets the openGL internal format
    */
  /* CompleteClass */
  override var glInternalFormat: Double = js.native
  /**
    * Gets the openGL type
    */
  /* CompleteClass */
  override var glType: Double = js.native
  /**
    * Gets the openGL type size
    */
  /* CompleteClass */
  override var glTypeSize: Double = js.native
  /**
    * If the container has been made invalid (eg. constructor failed to correctly load array buffer)
    */
  /* CompleteClass */
  override var isInvalid: Boolean = js.native
  /**
    * Gets the load type
    */
  /* CompleteClass */
  override var loadType: Double = js.native
  /**
    * Gets the number of array elements
    */
  /* CompleteClass */
  override var numberOfArrayElements: Double = js.native
  /**
    * Gets the number of faces
    */
  /* CompleteClass */
  override var numberOfFaces: Double = js.native
  /**
    * Gets the number of mipmap levels
    */
  /* CompleteClass */
  override var numberOfMipmapLevels: Double = js.native
  /**
    * Gets image depth in pixels
    */
  /* CompleteClass */
  override var pixelDepth: Double = js.native
  /**
    * Gets image height in pixel
    */
  /* CompleteClass */
  override var pixelHeight: Double = js.native
  /**
    * Gets image width in pixel
    */
  /* CompleteClass */
  override var pixelWidth: Double = js.native
  /**
    * Uploads KTX content to a Babylon Texture.
    * It is assumed that the texture has already been created & is currently bound
    * @hidden
    */
  /* CompleteClass */
  override def uploadLevels(texture: typingsSlinky.babylonjs.BABYLON.InternalTexture, loadMipmaps: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.KhronosTextureContainer")
@js.native
object KhronosTextureContainer extends js.Object {
  var COMPRESSED_2D: js.Any = js.native
  var COMPRESSED_3D: js.Any = js.native
  var HEADER_LEN: js.Any = js.native
  var TEX_2D: js.Any = js.native
  var TEX_3D: js.Any = js.native
  /**
    * Checks if the given data starts with a KTX file identifier.
    * @param data the data to check
    * @returns true if the data is a KTX file or false otherwise
    */
  def IsValid(data: js.typedarray.ArrayBufferView): Boolean = js.native
}

