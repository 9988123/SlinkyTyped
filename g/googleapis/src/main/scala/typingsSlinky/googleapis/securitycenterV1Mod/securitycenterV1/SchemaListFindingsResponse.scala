package typingsSlinky.googleapis.securitycenterV1Mod.securitycenterV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing findings.
  */
@js.native
trait SchemaListFindingsResponse extends js.Object {
  /**
    * Findings matching the list request.
    */
  var listFindingsResults: js.UndefOr[js.Array[SchemaListFindingsResult]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Time used for executing the list request.
    */
  var readTime: js.UndefOr[String] = js.native
  /**
    * The total number of findings matching the query.
    */
  var totalSize: js.UndefOr[Double] = js.native
}

object SchemaListFindingsResponse {
  @scala.inline
  def apply(): SchemaListFindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFindingsResponse]
  }
  @scala.inline
  implicit class SchemaListFindingsResponseOps[Self <: SchemaListFindingsResponse] (val x: Self) extends AnyVal {
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
    def setListFindingsResultsVarargs(value: SchemaListFindingsResult*): Self = this.set("listFindingsResults", js.Array(value :_*))
    @scala.inline
    def setListFindingsResults(value: js.Array[SchemaListFindingsResult]): Self = this.set("listFindingsResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListFindingsResults: Self = this.set("listFindingsResults", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setReadTime(value: String): Self = this.set("readTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadTime: Self = this.set("readTime", js.undefined)
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalSize: Self = this.set("totalSize", js.undefined)
  }
  
}

