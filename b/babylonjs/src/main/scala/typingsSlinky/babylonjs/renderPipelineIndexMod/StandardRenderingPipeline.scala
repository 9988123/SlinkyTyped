package typingsSlinky.babylonjs.renderPipelineIndexMod

import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.postProcessMod.PostProcess
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/PostProcesses/RenderPipeline/index", "StandardRenderingPipeline")
@js.native
class StandardRenderingPipeline protected ()
  extends typingsSlinky.babylonjs.pipelinesIndexMod.StandardRenderingPipeline {
  /**
    * Default pipeline should be used going forward but the standard pipeline will be kept for backwards compatibility.
    * @constructor
    * @param name The rendering pipeline name
    * @param scene The scene linked to this pipeline
    * @param ratio The size of the postprocesses (0.5 means that your postprocess will have a width = canvas.width 0.5 and a height = canvas.height 0.5)
    * @param originalPostProcess the custom original color post-process. Must be "reusable". Can be null.
    * @param cameras The array of cameras that the rendering pipeline will be attached to
    */
  def this(name: String, scene: Scene, ratio: Double) = this()
  def this(name: String, scene: Scene, ratio: Double, originalPostProcess: Nullable[PostProcess]) = this()
  def this(
    name: String,
    scene: Scene,
    ratio: Double,
    originalPostProcess: Nullable[PostProcess],
    cameras: js.Array[Camera]
  ) = this()
}

/* static members */
@JSImport("babylonjs/PostProcesses/RenderPipeline/index", "StandardRenderingPipeline")
@js.native
object StandardRenderingPipeline extends js.Object {
  /**
    * Luminance steps
    */
  var LuminanceSteps: Double = js.native
  /**
    * Parse the serialized pipeline
    * @param source Source pipeline.
    * @param scene The scene to load the pipeline to.
    * @param rootUrl The URL of the serialized pipeline.
    * @returns An instantiated pipeline from the serialized object.
    */
  def Parse(source: js.Any, scene: Scene, rootUrl: String): typingsSlinky.babylonjs.standardRenderingPipelineMod.StandardRenderingPipeline = js.native
}

