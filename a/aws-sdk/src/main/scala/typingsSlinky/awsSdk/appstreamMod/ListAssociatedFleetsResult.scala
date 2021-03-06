package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAssociatedFleetsResult extends js.Object {
  /**
    * The name of the fleet.
    */
  var Names: js.UndefOr[StringList] = js.native
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListAssociatedFleetsResult {
  @scala.inline
  def apply(): ListAssociatedFleetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssociatedFleetsResult]
  }
  @scala.inline
  implicit class ListAssociatedFleetsResultOps[Self <: ListAssociatedFleetsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("Names", js.Array(value :_*))
    @scala.inline
    def setNames(value: StringList): Self = this.set("Names", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNames: Self = this.set("Names", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

