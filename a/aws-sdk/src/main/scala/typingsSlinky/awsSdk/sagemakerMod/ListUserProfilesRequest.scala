package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUserProfilesRequest extends js.Object {
  /**
    * A parameter by which to filter the results.
    */
  var DomainIdEquals: js.UndefOr[DomainId] = js.native
  /**
    * Returns a list up to a specified limit.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MaxResults] = js.native
  /**
    * If the previous response was truncated, you will receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * The parameter by which to sort the results. The default is CreationTime.
    */
  var SortBy: js.UndefOr[UserProfileSortKey] = js.native
  /**
    * The sort order for the results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SortOrder] = js.native
  /**
    * A parameter by which to filter the results.
    */
  var UserProfileNameContains: js.UndefOr[UserProfileName] = js.native
}

object ListUserProfilesRequest {
  @scala.inline
  def apply(): ListUserProfilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserProfilesRequest]
  }
  @scala.inline
  implicit class ListUserProfilesRequestOps[Self <: ListUserProfilesRequest] (val x: Self) extends AnyVal {
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
    def setDomainIdEquals(value: DomainId): Self = this.set("DomainIdEquals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainIdEquals: Self = this.set("DomainIdEquals", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSortBy(value: UserProfileSortKey): Self = this.set("SortBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortBy: Self = this.set("SortBy", js.undefined)
    @scala.inline
    def setSortOrder(value: SortOrder): Self = this.set("SortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("SortOrder", js.undefined)
    @scala.inline
    def setUserProfileNameContains(value: UserProfileName): Self = this.set("UserProfileNameContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProfileNameContains: Self = this.set("UserProfileNameContains", js.undefined)
  }
  
}

