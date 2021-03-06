package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocalGatewayVirtualInterfaceGroupsResult extends js.Object {
  /**
    * The virtual interface groups.
    */
  var LocalGatewayVirtualInterfaceGroups: js.UndefOr[LocalGatewayVirtualInterfaceGroupSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeLocalGatewayVirtualInterfaceGroupsResult {
  @scala.inline
  def apply(): DescribeLocalGatewayVirtualInterfaceGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocalGatewayVirtualInterfaceGroupsResult]
  }
  @scala.inline
  implicit class DescribeLocalGatewayVirtualInterfaceGroupsResultOps[Self <: DescribeLocalGatewayVirtualInterfaceGroupsResult] (val x: Self) extends AnyVal {
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
    def setLocalGatewayVirtualInterfaceGroupsVarargs(value: LocalGatewayVirtualInterfaceGroup*): Self = this.set("LocalGatewayVirtualInterfaceGroups", js.Array(value :_*))
    @scala.inline
    def setLocalGatewayVirtualInterfaceGroups(value: LocalGatewayVirtualInterfaceGroupSet): Self = this.set("LocalGatewayVirtualInterfaceGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalGatewayVirtualInterfaceGroups: Self = this.set("LocalGatewayVirtualInterfaceGroups", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

