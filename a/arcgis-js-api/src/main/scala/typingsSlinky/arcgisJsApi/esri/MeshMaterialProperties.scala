package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.ImageData
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.auto
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.blend
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.mask
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.opaque
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshMaterialProperties extends js.Object {
  /**
    * Specifies how transparency on the object is handled. If [alphaMode](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaMode) is set to either `mask` or `auto` this property specifies the cutoff value below which masking happens (that is, the coresponding part of the Mesh is rendered fully transparent).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaCutoff)
    *
    * @default 0.5
    */
  var alphaCutoff: js.UndefOr[Double] = js.native
  /**
    * Specifies how transparency on the object is handled. See also [alphaCutoff](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaCutoff).
    *
    * | Type | Description |
    * |------|-------------|
    * | opaque | Alpha is ignored, and the object is rendered fully opaque. |
    * | blend | Alpha values are used for gradual transparency, blending between the object and its background. |
    * | mask | Alpha values are used for binary transparency, either displaying the object, or its background. See also [alphaCutoff](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaCutoff). |
    * | auto | The implementation mixes the `mask` and `blend` settings, masking below `alphaCutoff` and blending above it. |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaMode)
    *
    * @default "auto"
    */
  var alphaMode: js.UndefOr[auto | blend | opaque | mask] = js.native
  /**
    * Specifies a single, uniform color for the mesh component. This can be autocast with a named string, hex string, array of rgb or rgba values, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#color)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  /**
    * Specifies a texture from which to get color information. The texture is accessed using the uv coordinate specified for each vertex in the [Mesh.vertexAttributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#colorTexture)
    */
  var colorTexture: js.UndefOr[
    MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String
  ] = js.native
  /**
    * Specifies whether both sides of each triangle are displayed, or only the front sides.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#doubleSided)
    *
    * @default true
    */
  var doubleSided: js.UndefOr[Boolean] = js.native
  /**
    * Specifies a texture from which to get normal information. The texture is accessed using the uv coordinate specified for each vertex in the [Mesh.vertexAttributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#normalTexture)
    */
  var normalTexture: js.UndefOr[
    MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String
  ] = js.native
}

object MeshMaterialProperties {
  @scala.inline
  def apply(): MeshMaterialProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshMaterialProperties]
  }
  @scala.inline
  implicit class MeshMaterialPropertiesOps[Self <: MeshMaterialProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlphaCutoff(value: Double): Self = this.set("alphaCutoff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlphaCutoff: Self = this.set("alphaCutoff", js.undefined)
    @scala.inline
    def setAlphaMode(value: auto | blend | opaque | mask): Self = this.set("alphaMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlphaMode: Self = this.set("alphaMode", js.undefined)
    @scala.inline
    def setColorVarargs(value: Double*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: Color_ | js.Array[Double] | String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setColorTextureImageData(value: ImageData): Self = this.set("colorTexture", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorTextureHTMLImageElement(value: HTMLImageElement): Self = this.set("colorTexture", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorTextureHTMLCanvasElement(value: HTMLCanvasElement): Self = this.set("colorTexture", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorTexture(value: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String): Self = this.set("colorTexture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorTexture: Self = this.set("colorTexture", js.undefined)
    @scala.inline
    def setDoubleSided(value: Boolean): Self = this.set("doubleSided", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleSided: Self = this.set("doubleSided", js.undefined)
    @scala.inline
    def setNormalTextureImageData(value: ImageData): Self = this.set("normalTexture", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalTextureHTMLImageElement(value: HTMLImageElement): Self = this.set("normalTexture", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalTextureHTMLCanvasElement(value: HTMLCanvasElement): Self = this.set("normalTexture", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalTexture(value: MeshTextureProperties | HTMLImageElement | HTMLCanvasElement | ImageData | String): Self = this.set("normalTexture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalTexture: Self = this.set("normalTexture", js.undefined)
  }
  
}

