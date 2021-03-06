package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CubeTexture extends BaseTexture {
  var _boundingBoxSize: js.Any = js.native
  var _createPolynomials: js.Any = js.native
  var _delayedOnLoad: js.Any = js.native
  var _extensions: js.Any = js.native
  var _files: js.Any = js.native
  var _forcedExtension: Nullable[String] = js.native
  var _format: js.Any = js.native
  var _noMipmap: js.Any = js.native
  /** @hidden */
  var _prefiltered: Boolean = js.native
  var _rotationY: Double = js.native
  var _textureMatrix: js.Any = js.native
  /**
    * Gets or sets the center of the bounding box associated with the cube texture.
    * It must define where the camera used to render the texture was set
    * @see http://doc.babylonjs.com/how_to/reflect#using-local-cubemap-mode
    */
  var boundingBoxPosition: Vector3 = js.native
  /**
    * Observable triggered once the texture has been loaded.
    */
  var onLoadObservable: Observable[CubeTexture] = js.native
  /**
    * The url of the texture
    */
  var url: String = js.native
  /**
    * Returns the bounding box size
    * @see http://doc.babylonjs.com/how_to/reflect#using-local-cubemap-mode
    */
  def boundingBoxSize: Vector3 = js.native
  /**
    * Gets or sets the size of the bounding box associated with the cube texture
    * When defined, the cubemap will switch to local mode
    * @see https://community.arm.com/graphics/b/blog/posts/reflections-based-on-local-cubemaps-in-unity
    * @example https://www.babylonjs-playground.com/#RNASML
    */
  def boundingBoxSize(value: Vector3): js.Any = js.native
  def delayLoad(forcedExtension: String): Unit = js.native
  /**
    * Gets a boolean indicating if the cube texture contains prefiltered mips (used to simulate roughness with PBR)
    */
  def isPrefiltered: Boolean = js.native
  /**
    * Gets texture matrix rotation angle around Y axis radians.
    */
  def rotationY: Double = js.native
  /**
    * Sets texture matrix rotation angle around Y axis in radians.
    */
  def rotationY(value: Double): js.Any = js.native
  /**
    * Sets the reflection texture matrix
    * @param value Reflection texture matrix
    */
  def setReflectionTextureMatrix(value: Matrix): Unit = js.native
  /**
    * Update the url (and optional buffer) of this texture if url was null during construction.
    * @param url the url of the texture
    * @param forcedExtension defines the extension to use
    * @param onLoad callback called when the texture is loaded  (defaults to null)
    * @param prefiltered Defines whether the updated texture is prefiltered or not
    */
  def updateURL(url: String): Unit = js.native
  def updateURL(url: String, forcedExtension: String): Unit = js.native
  def updateURL(url: String, forcedExtension: String, onLoad: js.Function0[Unit]): Unit = js.native
  def updateURL(url: String, forcedExtension: String, onLoad: js.Function0[Unit], prefiltered: Boolean): Unit = js.native
}

