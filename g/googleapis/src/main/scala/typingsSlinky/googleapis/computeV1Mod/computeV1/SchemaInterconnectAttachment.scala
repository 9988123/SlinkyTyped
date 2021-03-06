package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an InterconnectAttachment (VLAN attachment) resource. For more
  * information, see  Creating VLAN Attachments. (== resource_for
  * beta.interconnectAttachments ==) (== resource_for
  * v1.interconnectAttachments ==)
  */
@js.native
trait SchemaInterconnectAttachment extends js.Object {
  /**
    * Determines whether this Attachment will carry packets. Not present for
    * PARTNER_PROVIDER.
    */
  var adminEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Provisioned bandwidth capacity for the interconnectAttachment. Can be set
    * by the partner to update the customer&#39;s provisioned bandwidth. Output
    * only for PARTNER type, mutable for PARTNER_PROVIDER and DEDICATED.
    */
  var bandwidth: js.UndefOr[String] = js.native
  /**
    * Up to 16 candidate prefixes that can be used to restrict the allocation
    * of cloudRouterIpAddress and customerRouterIpAddress for this attachment.
    * All prefixes must be within link-local address space (169.254.0.0/16) and
    * must be /29 or shorter (/28, /27, etc). Google will attempt to select an
    * unused /29 from the supplied candidate prefix(es). The request will fail
    * if all possible /29s are in use on Google?s edge. If not supplied, Google
    * will randomly select an unused /29 from all of link-local space.
    */
  var candidateSubnets: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Output Only] IPv4 address + prefix length to be configured on Cloud
    * Router Interface for this interconnect attachment.
    */
  var cloudRouterIpAddress: js.UndefOr[String] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * [Output Only] IPv4 address + prefix length to be configured on the
    * customer router subinterface for this interconnect attachment.
    */
  var customerRouterIpAddress: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Desired availability domain for the attachment. Only available for type
    * PARTNER, at creation time. For improved reliability, customers should
    * configure a pair of attachments with one per availability domain. The
    * selected availability domain will be provided to the Partner via the
    * pairing key so that the provisioned circuit will lie in the specified
    * domain. If not specified, the value will default to
    * AVAILABILITY_DOMAIN_ANY.
    */
  var edgeAvailabilityDomain: js.UndefOr[String] = js.native
  /**
    * [Output Only] Google reference ID, to be used when raising support
    * tickets with Google or otherwise to debug backend connectivity issues.
    */
  var googleReferenceId: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * URL of the underlying Interconnect object that this attachment&#39;s
    * traffic will traverse through.
    */
  var interconnect: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#interconnectAttachment
    * for interconnect attachments.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output Only] The current status of whether or not this interconnect
    * attachment is functional.
    */
  var operationalStatus: js.UndefOr[String] = js.native
  /**
    * [Output only for type PARTNER. Input only for PARTNER_PROVIDER. Not
    * present for DEDICATED]. The opaque identifier of an PARTNER attachment
    * used to initiate provisioning with a selected partner. Of the form
    * &quot;XXXXX/region/domain&quot;
    */
  var pairingKey: js.UndefOr[String] = js.native
  /**
    * Optional BGP ASN for the router that should be supplied by a layer 3
    * Partner if they configured BGP on behalf of the customer. Output only for
    * PARTNER type, input only for PARTNER_PROVIDER, not available for
    * DEDICATED.
    */
  var partnerAsn: js.UndefOr[String] = js.native
  /**
    * Informational metadata about Partner attachments from Partners to display
    * to customers. Output only for for PARTNER type, mutable for
    * PARTNER_PROVIDER, not available for DEDICATED.
    */
  var partnerMetadata: js.UndefOr[SchemaInterconnectAttachmentPartnerMetadata] = js.native
  /**
    * [Output Only] Information specific to an InterconnectAttachment. This
    * property is populated if the interconnect that this is attached to is of
    * type DEDICATED.
    */
  var privateInterconnectInfo: js.UndefOr[SchemaInterconnectAttachmentPrivateInfo] = js.native
  /**
    * [Output Only] URL of the region where the regional interconnect
    * attachment resides. You must specify this field as part of the HTTP
    * request URL. It is not settable as a field in the request body.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * URL of the Cloud Router to be used for dynamic routing. This router must
    * be in the same region as this InterconnectAttachment. The
    * InterconnectAttachment will automatically connect the Interconnect to the
    * network &amp; region within which the Cloud Router is configured.
    */
  var router: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] The current state of this attachment&#39;s functionality.
    */
  var state: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  /**
    * The IEEE 802.1Q VLAN tag for this attachment, in the range 2-4094. Only
    * specified at creation time.
    */
  var vlanTag8021q: js.UndefOr[Double] = js.native
}

object SchemaInterconnectAttachment {
  @scala.inline
  def apply(): SchemaInterconnectAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectAttachment]
  }
  @scala.inline
  implicit class SchemaInterconnectAttachmentOps[Self <: SchemaInterconnectAttachment] (val x: Self) extends AnyVal {
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
    def setAdminEnabled(value: Boolean): Self = this.set("adminEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdminEnabled: Self = this.set("adminEnabled", js.undefined)
    @scala.inline
    def setBandwidth(value: String): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBandwidth: Self = this.set("bandwidth", js.undefined)
    @scala.inline
    def setCandidateSubnetsVarargs(value: String*): Self = this.set("candidateSubnets", js.Array(value :_*))
    @scala.inline
    def setCandidateSubnets(value: js.Array[String]): Self = this.set("candidateSubnets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCandidateSubnets: Self = this.set("candidateSubnets", js.undefined)
    @scala.inline
    def setCloudRouterIpAddress(value: String): Self = this.set("cloudRouterIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudRouterIpAddress: Self = this.set("cloudRouterIpAddress", js.undefined)
    @scala.inline
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    @scala.inline
    def setCustomerRouterIpAddress(value: String): Self = this.set("customerRouterIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerRouterIpAddress: Self = this.set("customerRouterIpAddress", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEdgeAvailabilityDomain(value: String): Self = this.set("edgeAvailabilityDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeAvailabilityDomain: Self = this.set("edgeAvailabilityDomain", js.undefined)
    @scala.inline
    def setGoogleReferenceId(value: String): Self = this.set("googleReferenceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoogleReferenceId: Self = this.set("googleReferenceId", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInterconnect(value: String): Self = this.set("interconnect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterconnect: Self = this.set("interconnect", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOperationalStatus(value: String): Self = this.set("operationalStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationalStatus: Self = this.set("operationalStatus", js.undefined)
    @scala.inline
    def setPairingKey(value: String): Self = this.set("pairingKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePairingKey: Self = this.set("pairingKey", js.undefined)
    @scala.inline
    def setPartnerAsn(value: String): Self = this.set("partnerAsn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartnerAsn: Self = this.set("partnerAsn", js.undefined)
    @scala.inline
    def setPartnerMetadata(value: SchemaInterconnectAttachmentPartnerMetadata): Self = this.set("partnerMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartnerMetadata: Self = this.set("partnerMetadata", js.undefined)
    @scala.inline
    def setPrivateInterconnectInfo(value: SchemaInterconnectAttachmentPrivateInfo): Self = this.set("privateInterconnectInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateInterconnectInfo: Self = this.set("privateInterconnectInfo", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setRouter(value: String): Self = this.set("router", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouter: Self = this.set("router", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVlanTag8021q(value: Double): Self = this.set("vlanTag8021q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVlanTag8021q: Self = this.set("vlanTag8021q", js.undefined)
  }
  
}

