package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputCaptions extends js.Object {
  /**
    * Source files for the input sidecar captions used during the transcoding process. To omit all sidecar captions, leave CaptionSources blank.
    */
  var CaptionSources: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.CaptionSources] = js.native
  /**
    * A policy that determines how Elastic Transcoder handles the existence of multiple captions.    MergeOverride: Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If captions for a language are embedded in the input file and also appear in a sidecar file, Elastic Transcoder uses the sidecar captions and ignores the embedded captions for that language.    MergeRetain: Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If captions for a language are embedded in the input file and also appear in a sidecar file, Elastic Transcoder uses the embedded captions and ignores the sidecar captions for that language. If CaptionSources is empty, Elastic Transcoder omits all sidecar captions from the output files.    Override: Elastic Transcoder transcodes only the sidecar captions that you specify in CaptionSources.    MergePolicy cannot be null.
    */
  var MergePolicy: js.UndefOr[CaptionMergePolicy] = js.native
}

object InputCaptions {
  @scala.inline
  def apply(): InputCaptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputCaptions]
  }
  @scala.inline
  implicit class InputCaptionsOps[Self <: InputCaptions] (val x: Self) extends AnyVal {
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
    def setCaptionSourcesVarargs(value: CaptionSource*): Self = this.set("CaptionSources", js.Array(value :_*))
    @scala.inline
    def setCaptionSources(value: CaptionSources): Self = this.set("CaptionSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptionSources: Self = this.set("CaptionSources", js.undefined)
    @scala.inline
    def setMergePolicy(value: CaptionMergePolicy): Self = this.set("MergePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergePolicy: Self = this.set("MergePolicy", js.undefined)
  }
  
}

