package typingsSlinky.googleapis.betaMod.computeBeta

import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceRegiondisksGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Name of the regional persistent disk to return.
    */
  var disk: js.UndefOr[String] = js.native
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.native
  /**
    * Name of the region for this request.
    */
  var region: js.UndefOr[String] = js.native
}

object ParamsResourceRegiondisksGet {
  @scala.inline
  def apply(): ParamsResourceRegiondisksGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRegiondisksGet]
  }
  @scala.inline
  implicit class ParamsResourceRegiondisksGetOps[Self <: ParamsResourceRegiondisksGet] (val x: Self) extends AnyVal {
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
    def setDisk(value: String): Self = this.set("disk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisk: Self = this.set("disk", js.undefined)
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
  
}

