package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketTaggingOutput extends js.Object {
  /**
    * Contains the tag set.
    */
  var TagSet: typingsSlinky.awsSdk.s3Mod.TagSet = js.native
}

object GetBucketTaggingOutput {
  @scala.inline
  def apply(TagSet: TagSet): GetBucketTaggingOutput = {
    val __obj = js.Dynamic.literal(TagSet = TagSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketTaggingOutput]
  }
  @scala.inline
  implicit class GetBucketTaggingOutputOps[Self <: GetBucketTaggingOutput] (val x: Self) extends AnyVal {
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
    def setTagSetVarargs(value: Tag*): Self = this.set("TagSet", js.Array(value :_*))
    @scala.inline
    def setTagSet(value: TagSet): Self = this.set("TagSet", value.asInstanceOf[js.Any])
  }
  
}

