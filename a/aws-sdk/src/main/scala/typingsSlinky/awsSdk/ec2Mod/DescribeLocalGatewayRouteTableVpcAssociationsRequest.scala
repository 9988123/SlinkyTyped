package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocalGatewayRouteTableVpcAssociationsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more filters.    local-gateway-id - The ID of a local gateway.    local-gateway-route-table-id - The ID of the local gateway route table.    local-gateway-route-table-vpc-association-id - The ID of the association.    state - The state of the association.    vpc-id - The ID of the VPC.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The IDs of the associations.
    */
  var LocalGatewayRouteTableVpcAssociationIds: js.UndefOr[LocalGatewayRouteTableVpcAssociationIdSet] = js.native
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[LocalGatewayMaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeLocalGatewayRouteTableVpcAssociationsRequest {
  @scala.inline
  def apply(): DescribeLocalGatewayRouteTableVpcAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocalGatewayRouteTableVpcAssociationsRequest]
  }
  @scala.inline
  implicit class DescribeLocalGatewayRouteTableVpcAssociationsRequestOps[Self <: DescribeLocalGatewayRouteTableVpcAssociationsRequest] (val x: Self) extends AnyVal {
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
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setLocalGatewayRouteTableVpcAssociationIdsVarargs(value: LocalGatewayRouteTableVpcAssociationId*): Self = this.set("LocalGatewayRouteTableVpcAssociationIds", js.Array(value :_*))
    @scala.inline
    def setLocalGatewayRouteTableVpcAssociationIds(value: LocalGatewayRouteTableVpcAssociationIdSet): Self = this.set("LocalGatewayRouteTableVpcAssociationIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalGatewayRouteTableVpcAssociationIds: Self = this.set("LocalGatewayRouteTableVpcAssociationIds", js.undefined)
    @scala.inline
    def setMaxResults(value: LocalGatewayMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

