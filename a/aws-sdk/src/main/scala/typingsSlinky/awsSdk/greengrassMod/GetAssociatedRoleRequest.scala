package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAssociatedRoleRequest extends js.Object {
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string = js.native
}

object GetAssociatedRoleRequest {
  @scala.inline
  def apply(GroupId: string): GetAssociatedRoleRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssociatedRoleRequest]
  }
  @scala.inline
  implicit class GetAssociatedRoleRequestOps[Self <: GetAssociatedRoleRequest] (val x: Self) extends AnyVal {
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
    def setGroupId(value: string): Self = this.set("GroupId", value.asInstanceOf[js.Any])
  }
  
}

