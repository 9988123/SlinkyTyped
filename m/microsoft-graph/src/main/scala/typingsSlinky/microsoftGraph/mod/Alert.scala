package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alert extends Entity {
  // Name or alias of the activity group (attacker) this alert is attributed to.
  var activityGroupName: js.UndefOr[String] = js.native
  // Name of the analyst the alert is assigned to for triage, investigation, or remediation (supports update).
  var assignedTo: js.UndefOr[String] = js.native
  // Azure subscription ID, present if this alert is related to an Azure resource.
  var azureSubscriptionId: js.UndefOr[String] = js.native
  // Azure Active Directory tenant ID. Required.
  var azureTenantId: js.UndefOr[String] = js.native
  // Category of the alert (for example, credentialTheft, ransomware, etc.).
  var category: js.UndefOr[String] = js.native
  /**
    * Time at which the alert was closed. The Timestamp type represents date and time information using ISO 8601 format and
    * is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z' (supports
    * update).
    */
  var closedDateTime: js.UndefOr[String] = js.native
  // Security-related stateful information generated by the provider about the cloud application/s related to this alert.
  var cloudAppStates: js.UndefOr[js.Array[CloudAppSecurityState]] = js.native
  // Customer-provided comments on alert (for customer alert management) (supports update).
  var comments: js.UndefOr[js.Array[String]] = js.native
  // Confidence of the detection logic (percentage between 1-100).
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Time at which the alert was created by the alert provider. The Timestamp type represents date and time information
    * using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'. Required.
    */
  var createdDateTime: js.UndefOr[String] = js.native
  // Alert description.
  var description: js.UndefOr[String] = js.native
  // Set of alerts related to this alert entity (each alert is pushed to the SIEM as a separate record).
  var detectionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Time at which the event(s) that served as the trigger(s) to generate the alert occurred. The Timestamp type represents
    * date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014
    * would look like this: '2014-01-01T00:00:00Z'. Required.
    */
  var eventDateTime: js.UndefOr[String] = js.native
  /**
    * Analyst feedback on the alert. Possible values are: unknown, truePositive, falsePositive, benignPositive. (supports
    * update)
    */
  var feedback: js.UndefOr[AlertFeedback] = js.native
  // Security-related stateful information generated by the provider about the file(s) related to this alert.
  var fileStates: js.UndefOr[js.Array[FileSecurityState]] = js.native
  var historyStates: js.UndefOr[js.Array[AlertHistoryState]] = js.native
  // Security-related stateful information generated by the provider about the host(s) related to this alert.
  var hostStates: js.UndefOr[js.Array[HostSecurityState]] = js.native
  // IDs of incidents related to current alert.
  var incidentIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Time at which the alert entity was last modified. The Timestamp type represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'.
    */
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // Threat Intelligence pertaining to malware related to this alert.
  var malwareStates: js.UndefOr[js.Array[MalwareState]] = js.native
  // Security-related stateful information generated by the provider about the network connection(s) related to this alert.
  var networkConnections: js.UndefOr[js.Array[NetworkConnection]] = js.native
  // Security-related stateful information generated by the provider about the process or processes related to this alert.
  var processes: js.UndefOr[js.Array[Process]] = js.native
  /**
    * Vendor/provider recommended action(s) to take as a result of the alert (for example, isolate machine, enforce2FA,
    * reimage host).
    */
  var recommendedActions: js.UndefOr[js.Array[String]] = js.native
  // Security-related stateful information generated by the provider about the registry keys related to this alert.
  var registryKeyStates: js.UndefOr[js.Array[RegistryKeyState]] = js.native
  // Resources related to current alert. For example, for some alerts this can have the Azure Resource value.
  var securityResources: js.UndefOr[js.Array[SecurityResource]] = js.native
  // Alert severity - set by vendor/provider. Possible values are: unknown, informational, low, medium, high. Required.
  var severity: js.UndefOr[AlertSeverity] = js.native
  /**
    * Hyperlinks (URIs) to the source material related to the alert, for example, provider's user interface for alerts or log
    * search, etc.
    */
  var sourceMaterials: js.UndefOr[js.Array[String]] = js.native
  /**
    * Alert lifecycle status (stage). Possible values are: unknown, newAlert, inProgress, resolved. (supports update).
    * Required.
    */
  var status: js.UndefOr[AlertStatus] = js.native
  /**
    * User-definable labels that can be applied to an alert and can serve as filter conditions (for example 'HVA', 'SAW',
    * etc.) (supports update).
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
  // Alert title. Required.
  var title: js.UndefOr[String] = js.native
  /**
    * Security-related information about the specific properties that triggered the alert (properties appearing in the
    * alert). Alerts might contain information about multiple users, hosts, files, ip addresses. This field indicates which
    * properties triggered the alert generation.
    */
  var triggers: js.UndefOr[js.Array[AlertTrigger]] = js.native
  // Security-related stateful information generated by the provider about the user accounts related to this alert.
  var userStates: js.UndefOr[js.Array[UserSecurityState]] = js.native
  /**
    * Complex type containing details about the security product/service vendor, provider, and subprovider (for example,
    * vendor=Microsoft; provider=Windows Defender ATP; subProvider=AppLocker). Required.
    */
  var vendorInformation: js.UndefOr[SecurityVendorInformation] = js.native
  // Threat intelligence pertaining to one or more vulnerabilities related to this alert.
  var vulnerabilityStates: js.UndefOr[js.Array[VulnerabilityState]] = js.native
}

object Alert {
  @scala.inline
  def apply(): Alert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alert]
  }
  @scala.inline
  implicit class AlertOps[Self <: Alert] (val x: Self) extends AnyVal {
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
    def setActivityGroupName(value: String): Self = this.set("activityGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityGroupName: Self = this.set("activityGroupName", js.undefined)
    @scala.inline
    def setAssignedTo(value: String): Self = this.set("assignedTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignedTo: Self = this.set("assignedTo", js.undefined)
    @scala.inline
    def setAzureSubscriptionId(value: String): Self = this.set("azureSubscriptionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAzureSubscriptionId: Self = this.set("azureSubscriptionId", js.undefined)
    @scala.inline
    def setAzureTenantId(value: String): Self = this.set("azureTenantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAzureTenantId: Self = this.set("azureTenantId", js.undefined)
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setClosedDateTime(value: String): Self = this.set("closedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosedDateTime: Self = this.set("closedDateTime", js.undefined)
    @scala.inline
    def setCloudAppStatesVarargs(value: CloudAppSecurityState*): Self = this.set("cloudAppStates", js.Array(value :_*))
    @scala.inline
    def setCloudAppStates(value: js.Array[CloudAppSecurityState]): Self = this.set("cloudAppStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudAppStates: Self = this.set("cloudAppStates", js.undefined)
    @scala.inline
    def setCommentsVarargs(value: String*): Self = this.set("comments", js.Array(value :_*))
    @scala.inline
    def setComments(value: js.Array[String]): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDetectionIdsVarargs(value: String*): Self = this.set("detectionIds", js.Array(value :_*))
    @scala.inline
    def setDetectionIds(value: js.Array[String]): Self = this.set("detectionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectionIds: Self = this.set("detectionIds", js.undefined)
    @scala.inline
    def setEventDateTime(value: String): Self = this.set("eventDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventDateTime: Self = this.set("eventDateTime", js.undefined)
    @scala.inline
    def setFeedback(value: AlertFeedback): Self = this.set("feedback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeedback: Self = this.set("feedback", js.undefined)
    @scala.inline
    def setFileStatesVarargs(value: FileSecurityState*): Self = this.set("fileStates", js.Array(value :_*))
    @scala.inline
    def setFileStates(value: js.Array[FileSecurityState]): Self = this.set("fileStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileStates: Self = this.set("fileStates", js.undefined)
    @scala.inline
    def setHistoryStatesVarargs(value: AlertHistoryState*): Self = this.set("historyStates", js.Array(value :_*))
    @scala.inline
    def setHistoryStates(value: js.Array[AlertHistoryState]): Self = this.set("historyStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistoryStates: Self = this.set("historyStates", js.undefined)
    @scala.inline
    def setHostStatesVarargs(value: HostSecurityState*): Self = this.set("hostStates", js.Array(value :_*))
    @scala.inline
    def setHostStates(value: js.Array[HostSecurityState]): Self = this.set("hostStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostStates: Self = this.set("hostStates", js.undefined)
    @scala.inline
    def setIncidentIdsVarargs(value: String*): Self = this.set("incidentIds", js.Array(value :_*))
    @scala.inline
    def setIncidentIds(value: js.Array[String]): Self = this.set("incidentIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncidentIds: Self = this.set("incidentIds", js.undefined)
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    @scala.inline
    def setMalwareStatesVarargs(value: MalwareState*): Self = this.set("malwareStates", js.Array(value :_*))
    @scala.inline
    def setMalwareStates(value: js.Array[MalwareState]): Self = this.set("malwareStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMalwareStates: Self = this.set("malwareStates", js.undefined)
    @scala.inline
    def setNetworkConnectionsVarargs(value: NetworkConnection*): Self = this.set("networkConnections", js.Array(value :_*))
    @scala.inline
    def setNetworkConnections(value: js.Array[NetworkConnection]): Self = this.set("networkConnections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkConnections: Self = this.set("networkConnections", js.undefined)
    @scala.inline
    def setProcessesVarargs(value: Process*): Self = this.set("processes", js.Array(value :_*))
    @scala.inline
    def setProcesses(value: js.Array[Process]): Self = this.set("processes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcesses: Self = this.set("processes", js.undefined)
    @scala.inline
    def setRecommendedActionsVarargs(value: String*): Self = this.set("recommendedActions", js.Array(value :_*))
    @scala.inline
    def setRecommendedActions(value: js.Array[String]): Self = this.set("recommendedActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecommendedActions: Self = this.set("recommendedActions", js.undefined)
    @scala.inline
    def setRegistryKeyStatesVarargs(value: RegistryKeyState*): Self = this.set("registryKeyStates", js.Array(value :_*))
    @scala.inline
    def setRegistryKeyStates(value: js.Array[RegistryKeyState]): Self = this.set("registryKeyStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistryKeyStates: Self = this.set("registryKeyStates", js.undefined)
    @scala.inline
    def setSecurityResourcesVarargs(value: SecurityResource*): Self = this.set("securityResources", js.Array(value :_*))
    @scala.inline
    def setSecurityResources(value: js.Array[SecurityResource]): Self = this.set("securityResources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityResources: Self = this.set("securityResources", js.undefined)
    @scala.inline
    def setSeverity(value: AlertSeverity): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    @scala.inline
    def setSourceMaterialsVarargs(value: String*): Self = this.set("sourceMaterials", js.Array(value :_*))
    @scala.inline
    def setSourceMaterials(value: js.Array[String]): Self = this.set("sourceMaterials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMaterials: Self = this.set("sourceMaterials", js.undefined)
    @scala.inline
    def setStatus(value: AlertStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTriggersVarargs(value: AlertTrigger*): Self = this.set("triggers", js.Array(value :_*))
    @scala.inline
    def setTriggers(value: js.Array[AlertTrigger]): Self = this.set("triggers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggers: Self = this.set("triggers", js.undefined)
    @scala.inline
    def setUserStatesVarargs(value: UserSecurityState*): Self = this.set("userStates", js.Array(value :_*))
    @scala.inline
    def setUserStates(value: js.Array[UserSecurityState]): Self = this.set("userStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserStates: Self = this.set("userStates", js.undefined)
    @scala.inline
    def setVendorInformation(value: SecurityVendorInformation): Self = this.set("vendorInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVendorInformation: Self = this.set("vendorInformation", js.undefined)
    @scala.inline
    def setVulnerabilityStatesVarargs(value: VulnerabilityState*): Self = this.set("vulnerabilityStates", js.Array(value :_*))
    @scala.inline
    def setVulnerabilityStates(value: js.Array[VulnerabilityState]): Self = this.set("vulnerabilityStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVulnerabilityStates: Self = this.set("vulnerabilityStates", js.undefined)
  }
  
}

