package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLoaRequest extends js.Object {
  /**
    * The ID of a connection, LAG, or interconnect.
    */
  var connectionId: ConnectionId = js.native
  /**
    * The standard media type for the LOA-CFA document. The only supported value is application/pdf.
    */
  var loaContentType: js.UndefOr[LoaContentType] = js.native
  /**
    * The name of the service provider who establishes connectivity on your behalf. If you specify this parameter, the LOA-CFA lists the provider name alongside your company name as the requester of the cross connect.
    */
  var providerName: js.UndefOr[ProviderName] = js.native
}

object DescribeLoaRequest {
  @scala.inline
  def apply(connectionId: ConnectionId): DescribeLoaRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoaRequest]
  }
  @scala.inline
  implicit class DescribeLoaRequestOps[Self <: DescribeLoaRequest] (val x: Self) extends AnyVal {
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
    def setConnectionId(value: ConnectionId): Self = this.set("connectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoaContentType(value: LoaContentType): Self = this.set("loaContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoaContentType: Self = this.set("loaContentType", js.undefined)
    @scala.inline
    def setProviderName(value: ProviderName): Self = this.set("providerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviderName: Self = this.set("providerName", js.undefined)
  }
  
}

