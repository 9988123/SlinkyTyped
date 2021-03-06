package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderContext extends Object {
  /**
    * The camera used to render the current frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    */
  var camera: RenderCamera = js.native
  /**
    * The WebGL rendering context.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    */
  var gl: WebGLRenderingContext = js.native
  /**
    * The lighting used by [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) to render the current frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    */
  var sunLight: SunLight = js.native
  /**
    * Binds the color and depth buffers an external renderer is supposed to render into.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    *
    *
    */
  def bindRenderTarget(): Unit = js.native
  /**
    * A convenience function provided to completely reset the WebGL state after using it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#RenderContext)
    *
    *
    */
  def resetWebGLState(): Unit = js.native
}

object RenderContext {
  @scala.inline
  def apply(
    bindRenderTarget: () => Unit,
    camera: RenderCamera,
    constructor: js.Function,
    gl: WebGLRenderingContext,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    resetWebGLState: () => Unit,
    sunLight: SunLight
  ): RenderContext = {
    val __obj = js.Dynamic.literal(bindRenderTarget = js.Any.fromFunction0(bindRenderTarget), camera = camera.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], gl = gl.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), resetWebGLState = js.Any.fromFunction0(resetWebGLState), sunLight = sunLight.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderContext]
  }
  @scala.inline
  implicit class RenderContextOps[Self <: RenderContext] (val x: Self) extends AnyVal {
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
    def setBindRenderTarget(value: () => Unit): Self = this.set("bindRenderTarget", js.Any.fromFunction0(value))
    @scala.inline
    def setCamera(value: RenderCamera): Self = this.set("camera", value.asInstanceOf[js.Any])
    @scala.inline
    def setGl(value: WebGLRenderingContext): Self = this.set("gl", value.asInstanceOf[js.Any])
    @scala.inline
    def setResetWebGLState(value: () => Unit): Self = this.set("resetWebGLState", js.Any.fromFunction0(value))
    @scala.inline
    def setSunLight(value: SunLight): Self = this.set("sunLight", value.asInstanceOf[js.Any])
  }
  
}

