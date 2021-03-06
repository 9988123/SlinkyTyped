package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceTemplateList extends js.Object {
  /** [Output Only] Unique identifier for the resource; defined by the server. */
  var id: js.UndefOr[String] = js.native
  /** A list of InstanceTemplate resources. */
  var items: js.UndefOr[js.Array[InstanceTemplate]] = js.native
  /** [Output Only] The resource type, which is always compute#instanceTemplatesListResponse for instance template lists. */
  var kind: js.UndefOr[String] = js.native
  /**
    * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the
    * nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to
    * continue paging through the results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** [Output Only] Server-defined URL for this resource. */
  var selfLink: js.UndefOr[String] = js.native
  /** [Output Only] Informational warning message. */
  var warning: js.UndefOr[Code] = js.native
}

object InstanceTemplateList {
  @scala.inline
  def apply(): InstanceTemplateList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceTemplateList]
  }
  @scala.inline
  implicit class InstanceTemplateListOps[Self <: InstanceTemplateList] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setItemsVarargs(value: InstanceTemplate*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[InstanceTemplate]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

