package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetMetadataRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var FleetArn: typingsSlinky.awsSdk.worklinkMod.FleetArn = js.native
}

object DescribeFleetMetadataRequest {
  @scala.inline
  def apply(FleetArn: FleetArn): DescribeFleetMetadataRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetMetadataRequest]
  }
  @scala.inline
  implicit class DescribeFleetMetadataRequestOps[Self <: DescribeFleetMetadataRequest] (val x: Self) extends AnyVal {
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
    def setFleetArn(value: FleetArn): Self = this.set("FleetArn", value.asInstanceOf[js.Any])
  }
  
}

