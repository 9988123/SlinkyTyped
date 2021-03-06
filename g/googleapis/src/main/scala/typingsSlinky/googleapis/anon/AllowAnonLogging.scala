package typingsSlinky.googleapis.anon

import typingsSlinky.googleapis.booksV1Mod.booksV1.SchemaVolumeseriesinfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowAnonLogging extends js.Object {
  var allowAnonLogging: js.UndefOr[Boolean] = js.native
  var authors: js.UndefOr[js.Array[String]] = js.native
  var averageRating: js.UndefOr[Double] = js.native
  var canonicalVolumeLink: js.UndefOr[String] = js.native
  var categories: js.UndefOr[js.Array[String]] = js.native
  var comicsContent: js.UndefOr[Boolean] = js.native
  var contentVersion: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var dimensions: js.UndefOr[Thickness] = js.native
  var imageLinks: js.UndefOr[ExtraLarge] = js.native
  var industryIdentifiers: js.UndefOr[js.Array[Identifier]] = js.native
  var infoLink: js.UndefOr[String] = js.native
  var language: js.UndefOr[String] = js.native
  var mainCategory: js.UndefOr[String] = js.native
  var maturityRating: js.UndefOr[String] = js.native
  var pageCount: js.UndefOr[Double] = js.native
  var panelizationSummary: js.UndefOr[ContainsEpubBubbles] = js.native
  var previewLink: js.UndefOr[String] = js.native
  var printType: js.UndefOr[String] = js.native
  var printedPageCount: js.UndefOr[Double] = js.native
  var publishedDate: js.UndefOr[String] = js.native
  var publisher: js.UndefOr[String] = js.native
  var ratingsCount: js.UndefOr[Double] = js.native
  var readingModes: js.UndefOr[js.Any] = js.native
  var samplePageCount: js.UndefOr[Double] = js.native
  var seriesInfo: js.UndefOr[SchemaVolumeseriesinfo] = js.native
  var subtitle: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object AllowAnonLogging {
  @scala.inline
  def apply(): AllowAnonLogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowAnonLogging]
  }
  @scala.inline
  implicit class AllowAnonLoggingOps[Self <: AllowAnonLogging] (val x: Self) extends AnyVal {
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
    def setAllowAnonLogging(value: Boolean): Self = this.set("allowAnonLogging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowAnonLogging: Self = this.set("allowAnonLogging", js.undefined)
    @scala.inline
    def setAuthorsVarargs(value: String*): Self = this.set("authors", js.Array(value :_*))
    @scala.inline
    def setAuthors(value: js.Array[String]): Self = this.set("authors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthors: Self = this.set("authors", js.undefined)
    @scala.inline
    def setAverageRating(value: Double): Self = this.set("averageRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAverageRating: Self = this.set("averageRating", js.undefined)
    @scala.inline
    def setCanonicalVolumeLink(value: String): Self = this.set("canonicalVolumeLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanonicalVolumeLink: Self = this.set("canonicalVolumeLink", js.undefined)
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setComicsContent(value: Boolean): Self = this.set("comicsContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComicsContent: Self = this.set("comicsContent", js.undefined)
    @scala.inline
    def setContentVersion(value: String): Self = this.set("contentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentVersion: Self = this.set("contentVersion", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDimensions(value: Thickness): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    @scala.inline
    def setImageLinks(value: ExtraLarge): Self = this.set("imageLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageLinks: Self = this.set("imageLinks", js.undefined)
    @scala.inline
    def setIndustryIdentifiersVarargs(value: Identifier*): Self = this.set("industryIdentifiers", js.Array(value :_*))
    @scala.inline
    def setIndustryIdentifiers(value: js.Array[Identifier]): Self = this.set("industryIdentifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndustryIdentifiers: Self = this.set("industryIdentifiers", js.undefined)
    @scala.inline
    def setInfoLink(value: String): Self = this.set("infoLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoLink: Self = this.set("infoLink", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setMainCategory(value: String): Self = this.set("mainCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMainCategory: Self = this.set("mainCategory", js.undefined)
    @scala.inline
    def setMaturityRating(value: String): Self = this.set("maturityRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaturityRating: Self = this.set("maturityRating", js.undefined)
    @scala.inline
    def setPageCount(value: Double): Self = this.set("pageCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageCount: Self = this.set("pageCount", js.undefined)
    @scala.inline
    def setPanelizationSummary(value: ContainsEpubBubbles): Self = this.set("panelizationSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanelizationSummary: Self = this.set("panelizationSummary", js.undefined)
    @scala.inline
    def setPreviewLink(value: String): Self = this.set("previewLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewLink: Self = this.set("previewLink", js.undefined)
    @scala.inline
    def setPrintType(value: String): Self = this.set("printType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintType: Self = this.set("printType", js.undefined)
    @scala.inline
    def setPrintedPageCount(value: Double): Self = this.set("printedPageCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintedPageCount: Self = this.set("printedPageCount", js.undefined)
    @scala.inline
    def setPublishedDate(value: String): Self = this.set("publishedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublishedDate: Self = this.set("publishedDate", js.undefined)
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    @scala.inline
    def setRatingsCount(value: Double): Self = this.set("ratingsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatingsCount: Self = this.set("ratingsCount", js.undefined)
    @scala.inline
    def setReadingModes(value: js.Any): Self = this.set("readingModes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadingModes: Self = this.set("readingModes", js.undefined)
    @scala.inline
    def setSamplePageCount(value: Double): Self = this.set("samplePageCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamplePageCount: Self = this.set("samplePageCount", js.undefined)
    @scala.inline
    def setSeriesInfo(value: SchemaVolumeseriesinfo): Self = this.set("seriesInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriesInfo: Self = this.set("seriesInfo", js.undefined)
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

