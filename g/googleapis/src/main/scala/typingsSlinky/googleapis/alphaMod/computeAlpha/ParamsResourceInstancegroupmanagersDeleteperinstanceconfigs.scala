package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceInstancegroupmanagersDeleteperinstanceconfigs extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The name of the managed instance group. It should conform to RFC1035.
    */
  var instanceGroupManager: js.UndefOr[String] = js.native
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaInstanceGroupManagersDeletePerInstanceConfigsReq] = js.native
  /**
    * The name of the zone where the managed instance group is located. It
    * should conform to RFC1035.
    */
  var zone: js.UndefOr[String] = js.native
}

object ParamsResourceInstancegroupmanagersDeleteperinstanceconfigs {
  @scala.inline
  def apply(): ParamsResourceInstancegroupmanagersDeleteperinstanceconfigs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInstancegroupmanagersDeleteperinstanceconfigs]
  }
  @scala.inline
  implicit class ParamsResourceInstancegroupmanagersDeleteperinstanceconfigsOps[Self <: ParamsResourceInstancegroupmanagersDeleteperinstanceconfigs] (val x: Self) extends AnyVal {
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
    def setInstanceGroupManager(value: String): Self = this.set("instanceGroupManager", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceGroupManager: Self = this.set("instanceGroupManager", js.undefined)
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaInstanceGroupManagersDeletePerInstanceConfigsReq): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
  
}

