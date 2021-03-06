package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatafeedstatusesListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "content#datafeedstatusesListResponse". */
  var kind: js.UndefOr[String] = js.native
  /** The token for the retrieval of the next page of datafeed statuses. */
  var nextPageToken: js.UndefOr[String] = js.native
  var resources: js.UndefOr[js.Array[DatafeedStatus]] = js.native
}

object DatafeedstatusesListResponse {
  @scala.inline
  def apply(): DatafeedstatusesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatafeedstatusesListResponse]
  }
  @scala.inline
  implicit class DatafeedstatusesListResponseOps[Self <: DatafeedstatusesListResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setResourcesVarargs(value: DatafeedStatus*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[DatafeedStatus]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
  }
  
}

