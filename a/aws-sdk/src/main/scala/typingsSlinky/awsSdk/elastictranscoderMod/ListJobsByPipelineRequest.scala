package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsByPipelineRequest extends js.Object {
  /**
    *  To list jobs in chronological order by the date and time that they were submitted, enter true. To list jobs in reverse chronological order, enter false. 
    */
  var Ascending: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Ascending] = js.native
  /**
    *  When Elastic Transcoder returns more than one page of results, use pageToken in subsequent GET requests to get each successive page of results. 
    */
  var PageToken: js.UndefOr[Id] = js.native
  /**
    * The ID of the pipeline for which you want to get job information.
    */
  var PipelineId: Id = js.native
}

object ListJobsByPipelineRequest {
  @scala.inline
  def apply(PipelineId: Id): ListJobsByPipelineRequest = {
    val __obj = js.Dynamic.literal(PipelineId = PipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsByPipelineRequest]
  }
  @scala.inline
  implicit class ListJobsByPipelineRequestOps[Self <: ListJobsByPipelineRequest] (val x: Self) extends AnyVal {
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
    def setPipelineId(value: Id): Self = this.set("PipelineId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAscending(value: Ascending): Self = this.set("Ascending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAscending: Self = this.set("Ascending", js.undefined)
    @scala.inline
    def setPageToken(value: Id): Self = this.set("PageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("PageToken", js.undefined)
  }
  
}

