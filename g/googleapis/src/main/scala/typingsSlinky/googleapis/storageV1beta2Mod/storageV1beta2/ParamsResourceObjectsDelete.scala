package typingsSlinky.googleapis.storageV1beta2Mod.storageV1beta2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceObjectsDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Name of the bucket in which the object resides.
    */
  var bucket: js.UndefOr[String] = js.native
  /**
    * If present, permanently deletes a specific revision of this object (as
    * opposed to the latest version, the default).
    */
  var generation: js.UndefOr[String] = js.native
  /**
    * Makes the operation conditional on whether the object's current
    * generation matches the given value.
    */
  var ifGenerationMatch: js.UndefOr[String] = js.native
  /**
    * Makes the operation conditional on whether the object's current
    * generation does not match the given value.
    */
  var ifGenerationNotMatch: js.UndefOr[String] = js.native
  /**
    * Makes the operation conditional on whether the object's current
    * metageneration matches the given value.
    */
  var ifMetagenerationMatch: js.UndefOr[String] = js.native
  /**
    * Makes the operation conditional on whether the object's current
    * metageneration does not match the given value.
    */
  var ifMetagenerationNotMatch: js.UndefOr[String] = js.native
  /**
    * Name of the object.
    */
  var `object`: js.UndefOr[String] = js.native
}

object ParamsResourceObjectsDelete {
  @scala.inline
  def apply(): ParamsResourceObjectsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceObjectsDelete]
  }
  @scala.inline
  implicit class ParamsResourceObjectsDeleteOps[Self <: ParamsResourceObjectsDelete] (val x: Self) extends AnyVal {
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
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    @scala.inline
    def setGeneration(value: String): Self = this.set("generation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneration: Self = this.set("generation", js.undefined)
    @scala.inline
    def setIfGenerationMatch(value: String): Self = this.set("ifGenerationMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfGenerationMatch: Self = this.set("ifGenerationMatch", js.undefined)
    @scala.inline
    def setIfGenerationNotMatch(value: String): Self = this.set("ifGenerationNotMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfGenerationNotMatch: Self = this.set("ifGenerationNotMatch", js.undefined)
    @scala.inline
    def setIfMetagenerationMatch(value: String): Self = this.set("ifMetagenerationMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfMetagenerationMatch: Self = this.set("ifMetagenerationMatch", js.undefined)
    @scala.inline
    def setIfMetagenerationNotMatch(value: String): Self = this.set("ifMetagenerationNotMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfMetagenerationNotMatch: Self = this.set("ifMetagenerationNotMatch", js.undefined)
    @scala.inline
    def setObject(value: String): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObject: Self = this.set("object", js.undefined)
  }
  
}

