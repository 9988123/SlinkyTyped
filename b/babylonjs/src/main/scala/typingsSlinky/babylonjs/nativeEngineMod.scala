package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.anon.Width
import typingsSlinky.babylonjs.dataBufferMod.DataBuffer
import typingsSlinky.babylonjs.engineMod.Engine
import typingsSlinky.babylonjs.internalTextureMod.InternalTexture
import typingsSlinky.babylonjs.mathMod.Color3
import typingsSlinky.babylonjs.mathMod.Matrix
import typingsSlinky.babylonjs.mathMod.Viewport
import typingsSlinky.babylonjs.renderTargetCreationOptionsMod.RenderTargetCreationOptions
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import typingsSlinky.std.WebGLVertexArrayObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Engines/nativeEngine", JSImport.Namespace)
@js.native
object nativeEngineMod extends js.Object {
  /**
    * Container for accessors for natively-stored mesh data buffers.
    */
  @js.native
  trait NativeDataBuffer extends DataBuffer {
    /**
      * Accessor value used to identify/retrieve a natively-stored index buffer.
      */
    var nativeIndexBuffer: js.UndefOr[js.Any] = js.native
    /**
      * Accessor value used to identify/retrieve a natively-stored vertex buffer.
      */
    var nativeVertexBuffer: js.UndefOr[js.Any] = js.native
  }
  
  @js.native
  class NativeEngine () extends Engine {
    /** Defines the invalid handle returned by bgfx when resource creation goes wrong */
    val INVALID_HANDLE: js.Any = js.native
    var _getAddressMode: js.Any = js.native
    var _getSamplingFilter: js.Any = js.native
    val _native: js.Any = js.native
    var _updateAnisotropicLevel: js.Any = js.native
    /** @hidden */
    def _bindTexture(channel: Double, texture: InternalTexture): Unit = js.native
    /* protected */ def _deleteBuffer(buffer: NativeDataBuffer): Unit = js.native
    def bindFramebuffer(texture: InternalTexture): Unit = js.native
    def bindFramebuffer(texture: InternalTexture, faceIndex: Double): Unit = js.native
    def bindFramebuffer(texture: InternalTexture, faceIndex: Double, requiredWidth: Double): Unit = js.native
    def bindFramebuffer(texture: InternalTexture, faceIndex: Double, requiredWidth: Double, requiredHeight: Double): Unit = js.native
    def bindFramebuffer(
      texture: InternalTexture,
      faceIndex: Double,
      requiredWidth: Double,
      requiredHeight: Double,
      forceFullscreenViewport: Boolean
    ): Unit = js.native
    def bindVertexArrayObject(vertexArray: WebGLVertexArrayObject): Unit = js.native
    /**
      * Creates a cube texture
      * @param rootUrl defines the url where the files to load is located
      * @param scene defines the current scene
      * @param files defines the list of files to load (1 per face)
      * @param noMipmap defines a boolean indicating that no mipmaps shall be generated (false by default)
      * @param onLoad defines an optional callback raised when the texture is loaded
      * @param onError defines an optional callback raised if there is an issue to load the texture
      * @param format defines the format of the data
      * @param forcedExtension defines the extension to use to pick the right loader
      * @param createPolynomials if a polynomial sphere should be created for the cube texture
      * @param lodScale defines the scale applied to environment texture. This manages the range of LOD level used for IBL according to the roughness
      * @param lodOffset defines the offset applied to environment texture. This manages first LOD level used for IBL according to the roughness
      * @param fallback defines texture to use while falling back when (compressed) texture file not found.
      * @returns the cube texture as an InternalTexture
      */
    def createCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      files: Nullable[js.Array[String]],
      noMipmap: js.UndefOr[Boolean],
      onLoad: js.UndefOr[Nullable[js.Function1[/* data */ js.UndefOr[_], Unit]]],
      onError: js.UndefOr[
          Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
          ]
        ],
      format: js.UndefOr[Double],
      forcedExtension: js.UndefOr[js.Any],
      createPolynomials: js.UndefOr[Boolean],
      lodScale: js.UndefOr[Double],
      lodOffset: js.UndefOr[Double],
      fallback: js.UndefOr[Nullable[InternalTexture]]
    ): InternalTexture = js.native
    def createRenderTargetTexture(size: Width, options: Boolean): NativeTexture = js.native
    def createRenderTargetTexture(size: Width, options: RenderTargetCreationOptions): NativeTexture = js.native
    def setArray(uniform: WebGLUniformLocation, array: js.Array[Double]): Unit = js.native
    def setArray2(uniform: WebGLUniformLocation, array: js.Array[Double]): Unit = js.native
    def setArray3(uniform: WebGLUniformLocation, array: js.Array[Double]): Unit = js.native
    def setArray4(uniform: WebGLUniformLocation, array: js.Array[Double]): Unit = js.native
    def setColor3(uniform: WebGLUniformLocation, color3: Color3): Unit = js.native
    def setColor4(uniform: WebGLUniformLocation, color3: Color3, alpha: Double): Unit = js.native
    def setFloat(uniform: WebGLUniformLocation, value: Double): Unit = js.native
    def setFloat2(uniform: WebGLUniformLocation, x: Double, y: Double): Unit = js.native
    def setFloat3(uniform: WebGLUniformLocation, x: Double, y: Double, z: Double): Unit = js.native
    def setFloat4(uniform: WebGLUniformLocation, x: Double, y: Double, z: Double, w: Double): Unit = js.native
    def setFloatArray(uniform: WebGLUniformLocation, array: js.typedarray.Float32Array): Unit = js.native
    def setFloatArray2(uniform: WebGLUniformLocation, array: js.typedarray.Float32Array): Unit = js.native
    def setFloatArray3(uniform: WebGLUniformLocation, array: js.typedarray.Float32Array): Unit = js.native
    def setFloatArray4(uniform: WebGLUniformLocation, array: js.typedarray.Float32Array): Unit = js.native
    def setInt(uniform: WebGLUniformLocation, int: Double): Unit = js.native
    def setIntArray(uniform: WebGLUniformLocation, array: js.typedarray.Int32Array): Unit = js.native
    def setIntArray2(uniform: WebGLUniformLocation, array: js.typedarray.Int32Array): Unit = js.native
    def setIntArray3(uniform: WebGLUniformLocation, array: js.typedarray.Int32Array): Unit = js.native
    def setIntArray4(uniform: WebGLUniformLocation, array: js.typedarray.Int32Array): Unit = js.native
    def setMatrices(uniform: WebGLUniformLocation, matrices: js.typedarray.Float32Array): Unit = js.native
    def setMatrix(uniform: WebGLUniformLocation, matrix: Matrix): Unit = js.native
    def setMatrix2x2(uniform: WebGLUniformLocation, matrix: js.typedarray.Float32Array): Unit = js.native
    def setMatrix3x3(uniform: WebGLUniformLocation, matrix: js.typedarray.Float32Array): Unit = js.native
    def setViewport(viewport: Viewport): Unit = js.native
    def setViewport(viewport: Viewport, requiredWidth: Double): Unit = js.native
    def setViewport(viewport: Viewport, requiredWidth: Double, requiredHeight: Double): Unit = js.native
  }
  
  /** @hidden */
  @js.native
  trait NativeTexture extends InternalTexture {
    def getInternalTexture(): InternalTexture = js.native
    def getViewCount(): Double = js.native
  }
  
  /* static members */
  @js.native
  object NativeEngine extends js.Object {
    var _GetNativeTextureFormat: js.Any = js.native
  }
  
}

