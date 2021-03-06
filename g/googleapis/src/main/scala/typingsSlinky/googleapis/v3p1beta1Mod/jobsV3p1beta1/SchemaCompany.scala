package typingsSlinky.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Company resource represents a company in the service. A company is the
  * entity that owns job postings, that is, the hiring entity responsible for
  * employing applicants for the job position.
  */
@js.native
trait SchemaCompany extends js.Object {
  /**
    * Optional.  The URI to employer&#39;s career site or careers page on the
    * employer&#39;s web site, for example,
    * &quot;https://careers.google.com&quot;.
    */
  var careerSiteUri: js.UndefOr[String] = js.native
  /**
    * Output only. Derived details about the company.
    */
  var derivedInfo: js.UndefOr[SchemaCompanyDerivedInfo] = js.native
  /**
    * Required.  The display name of the company, for example, &quot;Google,
    * LLC&quot;.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Optional.  Equal Employment Opportunity legal disclaimer text to be
    * associated with all jobs, and typically to be displayed in all roles. The
    * maximum number of allowed characters is 500.
    */
  var eeoText: js.UndefOr[String] = js.native
  /**
    * Required.  Client side company identifier, used to uniquely identify the
    * company.  The maximum number of allowed characters is 255.
    */
  var externalId: js.UndefOr[String] = js.native
  /**
    * Optional.  The street address of the company&#39;s main headquarters,
    * which may be different from the job location. The service attempts to
    * geolocate the provided address, and populates a more specific location
    * wherever possible in DerivedInfo.headquarters_location.
    */
  var headquartersAddress: js.UndefOr[String] = js.native
  /**
    * Optional.  Set to true if it is the hiring agency that post jobs for
    * other employers.  Defaults to false if not provided.
    */
  var hiringAgency: js.UndefOr[Boolean] = js.native
  /**
    * Optional.  A URI that hosts the employer&#39;s company logo.
    */
  var imageUri: js.UndefOr[String] = js.native
  /**
    * Optional.  A list of keys of filterable Job.custom_attributes, whose
    * corresponding `string_values` are used in keyword search. Jobs with
    * `string_values` under these specified field keys are returned if any of
    * the values matches the search keyword. Custom field values with
    * parenthesis, brackets and special symbols won&#39;t be properly
    * searchable, and those keyword queries need to be surrounded by quotes.
    */
  var keywordSearchableJobCustomAttributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required during company update.  The resource name for a company. This is
    * generated by the service when a company is created.  The format is
    * &quot;projects/{project_id}/companies/{company_id}&quot;, for example,
    * &quot;projects/api-test-project/companies/foo&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional.  The employer&#39;s company size.
    */
  var size: js.UndefOr[String] = js.native
  /**
    * Output only. Indicates whether a company is flagged to be suspended from
    * public availability by the service when job content appears suspicious,
    * abusive, or spammy.
    */
  var suspended: js.UndefOr[Boolean] = js.native
  /**
    * Optional.  The URI representing the company&#39;s primary web site or
    * home page, for example, &quot;https://www.google.com&quot;.  The maximum
    * number of allowed characters is 255.
    */
  var websiteUri: js.UndefOr[String] = js.native
}

object SchemaCompany {
  @scala.inline
  def apply(): SchemaCompany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompany]
  }
  @scala.inline
  implicit class SchemaCompanyOps[Self <: SchemaCompany] (val x: Self) extends AnyVal {
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
    def setCareerSiteUri(value: String): Self = this.set("careerSiteUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCareerSiteUri: Self = this.set("careerSiteUri", js.undefined)
    @scala.inline
    def setDerivedInfo(value: SchemaCompanyDerivedInfo): Self = this.set("derivedInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDerivedInfo: Self = this.set("derivedInfo", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setEeoText(value: String): Self = this.set("eeoText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEeoText: Self = this.set("eeoText", js.undefined)
    @scala.inline
    def setExternalId(value: String): Self = this.set("externalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalId: Self = this.set("externalId", js.undefined)
    @scala.inline
    def setHeadquartersAddress(value: String): Self = this.set("headquartersAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadquartersAddress: Self = this.set("headquartersAddress", js.undefined)
    @scala.inline
    def setHiringAgency(value: Boolean): Self = this.set("hiringAgency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHiringAgency: Self = this.set("hiringAgency", js.undefined)
    @scala.inline
    def setImageUri(value: String): Self = this.set("imageUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUri: Self = this.set("imageUri", js.undefined)
    @scala.inline
    def setKeywordSearchableJobCustomAttributesVarargs(value: String*): Self = this.set("keywordSearchableJobCustomAttributes", js.Array(value :_*))
    @scala.inline
    def setKeywordSearchableJobCustomAttributes(value: js.Array[String]): Self = this.set("keywordSearchableJobCustomAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywordSearchableJobCustomAttributes: Self = this.set("keywordSearchableJobCustomAttributes", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSuspended(value: Boolean): Self = this.set("suspended", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuspended: Self = this.set("suspended", js.undefined)
    @scala.inline
    def setWebsiteUri(value: String): Self = this.set("websiteUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsiteUri: Self = this.set("websiteUri", js.undefined)
  }
  
}

