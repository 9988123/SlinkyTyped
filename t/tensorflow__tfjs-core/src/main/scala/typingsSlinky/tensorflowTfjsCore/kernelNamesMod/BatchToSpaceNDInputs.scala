package typingsSlinky.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x'> */
@js.native
trait BatchToSpaceNDInputs extends js.Object {
  var x: js.UndefOr[js.Any] = js.native
}

object BatchToSpaceNDInputs {
  @scala.inline
  def apply(): BatchToSpaceNDInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchToSpaceNDInputs]
  }
  @scala.inline
  implicit class BatchToSpaceNDInputsOps[Self <: BatchToSpaceNDInputs] (val x: Self) extends AnyVal {
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
    def setX(value: js.Any): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
  }
  
}

