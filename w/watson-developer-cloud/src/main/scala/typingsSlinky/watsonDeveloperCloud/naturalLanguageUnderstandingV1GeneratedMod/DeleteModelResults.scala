package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Delete model results. */
@js.native
trait DeleteModelResults extends js.Object {
  /** model_id of the deleted model. */
  var deleted: js.UndefOr[String] = js.native
}

object DeleteModelResults {
  @scala.inline
  def apply(): DeleteModelResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteModelResults]
  }
  @scala.inline
  implicit class DeleteModelResultsOps[Self <: DeleteModelResults] (val x: Self) extends AnyVal {
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
    def setDeleted(value: String): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
  }
  
}

