package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePipelineOutput extends js.Object {
  /**
    * The structure of the updated pipeline.
    */
  var pipeline: js.UndefOr[PipelineDeclaration] = js.native
}

object UpdatePipelineOutput {
  @scala.inline
  def apply(): UpdatePipelineOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePipelineOutput]
  }
  @scala.inline
  implicit class UpdatePipelineOutputOps[Self <: UpdatePipelineOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPipeline(value: PipelineDeclaration): Self = this.set("pipeline", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePipeline: Self = this.set("pipeline", js.undefined)
  }
  
}

