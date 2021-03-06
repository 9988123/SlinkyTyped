package typingsSlinky.pulumiAws.outputMod.cloudtrail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrailEventSelectorDataResource extends js.Object {
  /**
    * The resource type in which you want to log data events. You can specify only the following value: "AWS::S3::Object", "AWS::Lambda::Function"
    */
  var `type`: String = js.native
  /**
    * A list of ARN for the specified S3 buckets and object prefixes..
    */
  var values: js.Array[String] = js.native
}

object TrailEventSelectorDataResource {
  @scala.inline
  def apply(`type`: String, values: js.Array[String]): TrailEventSelectorDataResource = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrailEventSelectorDataResource]
  }
  @scala.inline
  implicit class TrailEventSelectorDataResourceOps[Self <: TrailEventSelectorDataResource] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

