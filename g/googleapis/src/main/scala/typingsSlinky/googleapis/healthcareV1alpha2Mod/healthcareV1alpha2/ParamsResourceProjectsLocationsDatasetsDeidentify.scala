package typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsDatasetsDeidentify extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDeidentifyDatasetRequest] = js.native
  /**
    * Source dataset resource name. (e.g.,
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`).
    */
  var sourceDataset: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsLocationsDatasetsDeidentify {
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsDatasetsDeidentify = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsDeidentify]
  }
  @scala.inline
  implicit class ParamsResourceProjectsLocationsDatasetsDeidentifyOps[Self <: ParamsResourceProjectsLocationsDatasetsDeidentify] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaDeidentifyDatasetRequest): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setSourceDataset(value: String): Self = this.set("sourceDataset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceDataset: Self = this.set("sourceDataset", js.undefined)
  }
  
}

