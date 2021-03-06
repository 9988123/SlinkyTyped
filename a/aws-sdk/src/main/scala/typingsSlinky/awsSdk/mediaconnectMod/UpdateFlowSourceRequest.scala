package typingsSlinky.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFlowSourceRequest extends js.Object {
  /**
    * The type of encryption used on the content ingested from this source.
    */
  var Decryption: js.UndefOr[UpdateEncryption] = js.native
  /**
    * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The ARN of the entitlement that allows you to subscribe to this flow. The entitlement is set by the flow originator, and the ARN is generated as part of the originator's flow.
    */
  var EntitlementArn: js.UndefOr[string] = js.native
  /**
    * The flow that is associated with the source that you want to update.
    */
  var FlowArn: string = js.native
  /**
    * The port that the flow will be listening on for incoming content.
    */
  var IngestPort: js.UndefOr[integer] = js.native
  /**
    * The smoothing max bitrate for RIST, RTP, and RTP-FEC streams.
    */
  var MaxBitrate: js.UndefOr[integer] = js.native
  /**
    * The maximum latency in milliseconds. This parameter applies only to RIST-based and Zixi-based streams.
    */
  var MaxLatency: js.UndefOr[integer] = js.native
  /**
    * The protocol that is used by the source.
    */
  var Protocol: js.UndefOr[typingsSlinky.awsSdk.mediaconnectMod.Protocol] = js.native
  /**
    * The ARN of the source that you want to update.
    */
  var SourceArn: string = js.native
  /**
    * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
    */
  var StreamId: js.UndefOr[string] = js.native
  /**
    * The name of the VPC Interface to configure this Source with.
    */
  var VpcInterfaceName: js.UndefOr[string] = js.native
  /**
    * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var WhitelistCidr: js.UndefOr[string] = js.native
}

object UpdateFlowSourceRequest {
  @scala.inline
  def apply(FlowArn: string, SourceArn: string): UpdateFlowSourceRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], SourceArn = SourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowSourceRequest]
  }
  @scala.inline
  implicit class UpdateFlowSourceRequestOps[Self <: UpdateFlowSourceRequest] (val x: Self) extends AnyVal {
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
    def setFlowArn(value: string): Self = this.set("FlowArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceArn(value: string): Self = this.set("SourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecryption(value: UpdateEncryption): Self = this.set("Decryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecryption: Self = this.set("Decryption", js.undefined)
    @scala.inline
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setEntitlementArn(value: string): Self = this.set("EntitlementArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntitlementArn: Self = this.set("EntitlementArn", js.undefined)
    @scala.inline
    def setIngestPort(value: integer): Self = this.set("IngestPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIngestPort: Self = this.set("IngestPort", js.undefined)
    @scala.inline
    def setMaxBitrate(value: integer): Self = this.set("MaxBitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBitrate: Self = this.set("MaxBitrate", js.undefined)
    @scala.inline
    def setMaxLatency(value: integer): Self = this.set("MaxLatency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLatency: Self = this.set("MaxLatency", js.undefined)
    @scala.inline
    def setProtocol(value: Protocol): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("Protocol", js.undefined)
    @scala.inline
    def setStreamId(value: string): Self = this.set("StreamId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamId: Self = this.set("StreamId", js.undefined)
    @scala.inline
    def setVpcInterfaceName(value: string): Self = this.set("VpcInterfaceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcInterfaceName: Self = this.set("VpcInterfaceName", js.undefined)
    @scala.inline
    def setWhitelistCidr(value: string): Self = this.set("WhitelistCidr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhitelistCidr: Self = this.set("WhitelistCidr", js.undefined)
  }
  
}

