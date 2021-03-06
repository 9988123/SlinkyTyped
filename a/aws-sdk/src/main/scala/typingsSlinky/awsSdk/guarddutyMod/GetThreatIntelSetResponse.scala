package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetThreatIntelSetResponse extends js.Object {
  /**
    * The format of the threatIntelSet.
    */
  var Format: ThreatIntelSetFormat = js.native
  /**
    * The URI of the file that contains the ThreatIntelSet. For example: https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key.
    */
  var Location: typingsSlinky.awsSdk.guarddutyMod.Location = js.native
  /**
    * A user-friendly ThreatIntelSet name displayed in all findings that are generated by activity that involves IP addresses included in this ThreatIntelSet.
    */
  var Name: typingsSlinky.awsSdk.guarddutyMod.Name = js.native
  /**
    * The status of threatIntelSet file uploaded.
    */
  var Status: ThreatIntelSetStatus = js.native
  /**
    * The tags of the threat list resource.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object GetThreatIntelSetResponse {
  @scala.inline
  def apply(Format: ThreatIntelSetFormat, Location: Location, Name: Name, Status: ThreatIntelSetStatus): GetThreatIntelSetResponse = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetThreatIntelSetResponse]
  }
  @scala.inline
  implicit class GetThreatIntelSetResponseOps[Self <: GetThreatIntelSetResponse] (val x: Self) extends AnyVal {
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
    def setFormat(value: ThreatIntelSetFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: Location): Self = this.set("Location", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: ThreatIntelSetStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

