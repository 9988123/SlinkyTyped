package typingsSlinky.googleapis.v32Mod.dfareportingV32

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePlacementsList extends StandardParameters {
  /**
    * Select only placements that belong to these advertisers.
    */
  var advertiserIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only archived placements. Don't set this field to select both
    * archived and non-archived placements.
    */
  var archived: js.UndefOr[Boolean] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Select only placements that belong to these campaigns.
    */
  var campaignIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only placements that are associated with these compatibilities.
    * DISPLAY and DISPLAY_INTERSTITIAL refer to rendering either on desktop or
    * on mobile devices for regular or interstitial ads respectively. APP and
    * APP_INTERSTITIAL are for rendering in mobile apps. IN_STREAM_VIDEO refers
    * to rendering in in-stream video ads developed with the VAST standard.
    */
  var compatibilities: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only placements that are associated with these content categories.
    */
  var contentCategoryIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only placements that are associated with these directory sites.
    */
  var directorySiteIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only placements that belong to these placement groups.
    */
  var groupIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only placements with these IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only placements or placement groups whose end date is on or before
    * the specified maxEndDate. The date should be formatted as "yyyy-MM-dd".
    */
  var maxEndDate: js.UndefOr[String] = js.native
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Select only placements or placement groups whose start date is on or
    * before the specified maxStartDate. The date should be formatted as
    * "yyyy-MM-dd".
    */
  var maxStartDate: js.UndefOr[String] = js.native
  /**
    * Select only placements or placement groups whose end date is on or after
    * the specified minEndDate. The date should be formatted as "yyyy-MM-dd".
    */
  var minEndDate: js.UndefOr[String] = js.native
  /**
    * Select only placements or placement groups whose start date is on or
    * after the specified minStartDate. The date should be formatted as
    * "yyyy-MM-dd".
    */
  var minStartDate: js.UndefOr[String] = js.native
  /**
    * Value of the nextPageToken from the previous result page.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Select only placements with this payment source.
    */
  var paymentSource: js.UndefOr[String] = js.native
  /**
    * Select only placements that are associated with these placement
    * strategies.
    */
  var placementStrategyIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only placements with these pricing types.
    */
  var pricingTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.native
  /**
    * Allows searching for placements by name or ID. Wildcards (*) are allowed.
    * For example, "placement*2015" will return placements with names like
    * "placement June 2015", "placement May 2015", or simply "placements 2015".
    * Most of the searches also add wildcards implicitly at the start and the
    * end of the search string. For example, a search string of "placement"
    * will match placements with name "my placement", "placement 2015", or
    * simply "placement".
    */
  var searchString: js.UndefOr[String] = js.native
  /**
    * Select only placements that are associated with these sites.
    */
  var siteIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only placements that are associated with these sizes.
    */
  var sizeIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Field by which to sort the list.
    */
  var sortField: js.UndefOr[String] = js.native
  /**
    * Order of sorted results.
    */
  var sortOrder: js.UndefOr[String] = js.native
}

object ParamsResourcePlacementsList {
  @scala.inline
  def apply(): ParamsResourcePlacementsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePlacementsList]
  }
  @scala.inline
  implicit class ParamsResourcePlacementsListOps[Self <: ParamsResourcePlacementsList] (val x: Self) extends AnyVal {
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
    def setAdvertiserIdsVarargs(value: String*): Self = this.set("advertiserIds", js.Array(value :_*))
    @scala.inline
    def setAdvertiserIds(value: js.Array[String]): Self = this.set("advertiserIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserIds: Self = this.set("advertiserIds", js.undefined)
    @scala.inline
    def setArchived(value: Boolean): Self = this.set("archived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchived: Self = this.set("archived", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setCampaignIdsVarargs(value: String*): Self = this.set("campaignIds", js.Array(value :_*))
    @scala.inline
    def setCampaignIds(value: js.Array[String]): Self = this.set("campaignIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCampaignIds: Self = this.set("campaignIds", js.undefined)
    @scala.inline
    def setCompatibilitiesVarargs(value: String*): Self = this.set("compatibilities", js.Array(value :_*))
    @scala.inline
    def setCompatibilities(value: js.Array[String]): Self = this.set("compatibilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompatibilities: Self = this.set("compatibilities", js.undefined)
    @scala.inline
    def setContentCategoryIdsVarargs(value: String*): Self = this.set("contentCategoryIds", js.Array(value :_*))
    @scala.inline
    def setContentCategoryIds(value: js.Array[String]): Self = this.set("contentCategoryIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentCategoryIds: Self = this.set("contentCategoryIds", js.undefined)
    @scala.inline
    def setDirectorySiteIdsVarargs(value: String*): Self = this.set("directorySiteIds", js.Array(value :_*))
    @scala.inline
    def setDirectorySiteIds(value: js.Array[String]): Self = this.set("directorySiteIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectorySiteIds: Self = this.set("directorySiteIds", js.undefined)
    @scala.inline
    def setGroupIdsVarargs(value: String*): Self = this.set("groupIds", js.Array(value :_*))
    @scala.inline
    def setGroupIds(value: js.Array[String]): Self = this.set("groupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupIds: Self = this.set("groupIds", js.undefined)
    @scala.inline
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    @scala.inline
    def setIds(value: js.Array[String]): Self = this.set("ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    @scala.inline
    def setMaxEndDate(value: String): Self = this.set("maxEndDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxEndDate: Self = this.set("maxEndDate", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setMaxStartDate(value: String): Self = this.set("maxStartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxStartDate: Self = this.set("maxStartDate", js.undefined)
    @scala.inline
    def setMinEndDate(value: String): Self = this.set("minEndDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinEndDate: Self = this.set("minEndDate", js.undefined)
    @scala.inline
    def setMinStartDate(value: String): Self = this.set("minStartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinStartDate: Self = this.set("minStartDate", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setPaymentSource(value: String): Self = this.set("paymentSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentSource: Self = this.set("paymentSource", js.undefined)
    @scala.inline
    def setPlacementStrategyIdsVarargs(value: String*): Self = this.set("placementStrategyIds", js.Array(value :_*))
    @scala.inline
    def setPlacementStrategyIds(value: js.Array[String]): Self = this.set("placementStrategyIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementStrategyIds: Self = this.set("placementStrategyIds", js.undefined)
    @scala.inline
    def setPricingTypesVarargs(value: String*): Self = this.set("pricingTypes", js.Array(value :_*))
    @scala.inline
    def setPricingTypes(value: js.Array[String]): Self = this.set("pricingTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePricingTypes: Self = this.set("pricingTypes", js.undefined)
    @scala.inline
    def setProfileId(value: String): Self = this.set("profileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileId: Self = this.set("profileId", js.undefined)
    @scala.inline
    def setSearchString(value: String): Self = this.set("searchString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchString: Self = this.set("searchString", js.undefined)
    @scala.inline
    def setSiteIdsVarargs(value: String*): Self = this.set("siteIds", js.Array(value :_*))
    @scala.inline
    def setSiteIds(value: js.Array[String]): Self = this.set("siteIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteIds: Self = this.set("siteIds", js.undefined)
    @scala.inline
    def setSizeIdsVarargs(value: String*): Self = this.set("sizeIds", js.Array(value :_*))
    @scala.inline
    def setSizeIds(value: js.Array[String]): Self = this.set("sizeIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeIds: Self = this.set("sizeIds", js.undefined)
    @scala.inline
    def setSortField(value: String): Self = this.set("sortField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortField: Self = this.set("sortField", js.undefined)
    @scala.inline
    def setSortOrder(value: String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
  }
  
}

