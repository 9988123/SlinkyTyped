package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when listing course work.
  */
@js.native
trait SchemaListCourseWorkResponse extends js.Object {
  /**
    * Course work items that match the request.
    */
  var courseWork: js.UndefOr[js.Array[SchemaCourseWork]] = js.native
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListCourseWorkResponse {
  @scala.inline
  def apply(): SchemaListCourseWorkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCourseWorkResponse]
  }
  @scala.inline
  implicit class SchemaListCourseWorkResponseOps[Self <: SchemaListCourseWorkResponse] (val x: Self) extends AnyVal {
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
    def setCourseWorkVarargs(value: SchemaCourseWork*): Self = this.set("courseWork", js.Array(value :_*))
    @scala.inline
    def setCourseWork(value: js.Array[SchemaCourseWork]): Self = this.set("courseWork", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCourseWork: Self = this.set("courseWork", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

