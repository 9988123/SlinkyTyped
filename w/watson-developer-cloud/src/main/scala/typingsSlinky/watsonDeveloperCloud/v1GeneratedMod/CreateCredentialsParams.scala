package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.CreateCredentialsConstants.SourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createCredentials` operation. */
@js.native
trait CreateCredentialsParams extends js.Object {
  /** Object containing details of the stored credentials. Obtain credentials for your source from the administrator of the source. */
  var credential_details: js.UndefOr[CredentialDetails] = js.native
  /** The ID of the environment. */
  var environment_id: String = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** The source that this credentials object connects to. -  `box` indicates the credentials are used to connect an instance of Enterprise Box. -  `salesforce` indicates the credentials are used to connect to Salesforce. -  `sharepoint` indicates the credentials are used to connect to Microsoft SharePoint Online. -  `web_crawl` indicates the credentials are used to perform a web crawl. =  `cloud_object_storage` indicates the credentials are used to connect to an IBM Cloud Object Store. */
  var source_type: js.UndefOr[SourceType | String] = js.native
}

object CreateCredentialsParams {
  @scala.inline
  def apply(environment_id: String): CreateCredentialsParams = {
    val __obj = js.Dynamic.literal(environment_id = environment_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCredentialsParams]
  }
  @scala.inline
  implicit class CreateCredentialsParamsOps[Self <: CreateCredentialsParams] (val x: Self) extends AnyVal {
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
    def setEnvironment_id(value: String): Self = this.set("environment_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredential_details(value: CredentialDetails): Self = this.set("credential_details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredential_details: Self = this.set("credential_details", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
    @scala.inline
    def setSource_type(value: SourceType | String): Self = this.set("source_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource_type: Self = this.set("source_type", js.undefined)
  }
  
}

