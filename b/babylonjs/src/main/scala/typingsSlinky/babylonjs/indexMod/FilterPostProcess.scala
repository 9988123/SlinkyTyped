package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.postProcessMod.PostProcessOptions
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "FilterPostProcess")
@js.native
class FilterPostProcess protected ()
  extends typingsSlinky.babylonjs.postProcessesIndexMod.FilterPostProcess {
  /**
    *
    * @param name The name of the effect.
    * @param kernelMatrix The matrix to be applied to the image
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    */
  def this(
    name: String,
    /** The matrix to be applied to the image */
  kernelMatrix: typingsSlinky.babylonjs.mathVectorMod.Matrix,
    options: Double,
    camera: Nullable[typingsSlinky.babylonjs.cameraMod.Camera]
  ) = this()
  def this(
    name: String,
    /** The matrix to be applied to the image */
  kernelMatrix: typingsSlinky.babylonjs.mathVectorMod.Matrix,
    options: PostProcessOptions,
    camera: Nullable[typingsSlinky.babylonjs.cameraMod.Camera]
  ) = this()
  def this(
    name: String,
    /** The matrix to be applied to the image */
  kernelMatrix: typingsSlinky.babylonjs.mathVectorMod.Matrix,
    options: Double,
    camera: Nullable[typingsSlinky.babylonjs.cameraMod.Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    /** The matrix to be applied to the image */
  kernelMatrix: typingsSlinky.babylonjs.mathVectorMod.Matrix,
    options: PostProcessOptions,
    camera: Nullable[typingsSlinky.babylonjs.cameraMod.Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    /** The matrix to be applied to the image */
  kernelMatrix: typingsSlinky.babylonjs.mathVectorMod.Matrix,
    options: Double,
    camera: Nullable[typingsSlinky.babylonjs.cameraMod.Camera],
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.engineMod.Engine
  ) = this()
  def this(
    name: String,
    /** The matrix to be applied to the image */
  kernelMatrix: typingsSlinky.babylonjs.mathVectorMod.Matrix,
    options: PostProcessOptions,
    camera: Nullable[typingsSlinky.babylonjs.cameraMod.Camera],
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.engineMod.Engine
  ) = this()
  def this(
    name: String,
    /** The matrix to be applied to the image */
  kernelMatrix: typingsSlinky.babylonjs.mathVectorMod.Matrix,
    options: Double,
    camera: Nullable[typingsSlinky.babylonjs.cameraMod.Camera],
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.engineMod.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    /** The matrix to be applied to the image */
  kernelMatrix: typingsSlinky.babylonjs.mathVectorMod.Matrix,
    options: PostProcessOptions,
    camera: Nullable[typingsSlinky.babylonjs.cameraMod.Camera],
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.engineMod.Engine,
    reusable: Boolean
  ) = this()
}

