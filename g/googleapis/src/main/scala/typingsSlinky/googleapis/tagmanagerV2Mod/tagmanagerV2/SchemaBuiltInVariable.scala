package typingsSlinky.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Built-in variables are a special category of variables that are pre-created
  * and non-customizable. They provide common functionality like accessing
  * propeties of the gtm data layer, monitoring clicks, or accessing elements
  * of a page URL.
  */
@js.native
trait SchemaBuiltInVariable extends js.Object {
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  /**
    * Name of the built-in variable to be used to refer to the built-in
    * variable.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * GTM BuiltInVariable&#39;s API relative path.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Type of built-in variable.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * GTM Workspace ID.
    */
  var workspaceId: js.UndefOr[String] = js.native
}

object SchemaBuiltInVariable {
  @scala.inline
  def apply(): SchemaBuiltInVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuiltInVariable]
  }
  @scala.inline
  implicit class SchemaBuiltInVariableOps[Self <: SchemaBuiltInVariable] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWorkspaceId(value: String): Self = this.set("workspaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkspaceId: Self = this.set("workspaceId", js.undefined)
  }
  
}

