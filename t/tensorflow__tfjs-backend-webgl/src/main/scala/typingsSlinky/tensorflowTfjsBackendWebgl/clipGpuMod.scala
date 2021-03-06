package typingsSlinky.tensorflowTfjsBackendWebgl

import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLUniformLocation
import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuContextMod.GPGPUContext
import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-webgl/dist/clip_gpu", JSImport.Namespace)
@js.native
object clipGpuMod extends js.Object {
  @js.native
  class ClipProgram protected () extends GPGPUProgram {
    def this(aShape: js.Array[Double]) = this()
    var maxLoc: WebGLUniformLocation = js.native
    var minLoc: WebGLUniformLocation = js.native
    def getCustomSetupFunc(min: Double, max: Double): js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit] = js.native
  }
  
}

