package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The style of the document.
  */
@js.native
trait SchemaDocumentStyle extends js.Object {
  /**
    * The background of the document.
    */
  var background: js.UndefOr[SchemaBackground] = js.native
  /**
    * The ID of the default footer. If not set, there is no default footer.
    */
  var defaultFooterId: js.UndefOr[String] = js.native
  /**
    * The ID of the default header. If not set, there is no default header.
    */
  var defaultHeaderId: js.UndefOr[String] = js.native
  /**
    * The ID of the footer used only for even pages. The value of
    * use_even_page_header_footer determines whether to use the
    * default_footer_id or this value for the footer on even pages. If not set,
    * there is no even page footer.
    */
  var evenPageFooterId: js.UndefOr[String] = js.native
  /**
    * The ID of the header used only for even pages. The value of
    * use_even_page_header_footer determines whether to use the
    * default_header_id or this value for the header on even pages. If not set,
    * there is no even page header.
    */
  var evenPageHeaderId: js.UndefOr[String] = js.native
  /**
    * The ID of the footer used only for the first page. If not set then a
    * unique footer for the first page does not exist. The value of
    * use_first_page_header_footer determines whether to use the
    * default_footer_id or this value for the footer on the first page. If not
    * set, there is no first page footer.
    */
  var firstPageFooterId: js.UndefOr[String] = js.native
  /**
    * The ID of the header used only for the first page. If not set then a
    * unique header for the first page does not exist. The value of
    * use_first_page_header_footer determines whether to use the
    * default_header_id or this value for the header on the first page. If not
    * set, there is no first page header.
    */
  var firstPageHeaderId: js.UndefOr[String] = js.native
  /**
    * The bottom page margin.
    */
  var marginBottom: js.UndefOr[SchemaDimension] = js.native
  /**
    * The left page margin.
    */
  var marginLeft: js.UndefOr[SchemaDimension] = js.native
  /**
    * The right page margin.
    */
  var marginRight: js.UndefOr[SchemaDimension] = js.native
  /**
    * The top page margin.
    */
  var marginTop: js.UndefOr[SchemaDimension] = js.native
  /**
    * The page number from which to start counting the number of pages.
    */
  var pageNumberStart: js.UndefOr[Double] = js.native
  /**
    * The size of a page in the document.
    */
  var pageSize: js.UndefOr[SchemaSize] = js.native
  /**
    * Indicates whether to use the even page header / footer IDs for the even
    * pages.
    */
  var useEvenPageHeaderFooter: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to use the first page header / footer IDs for the first
    * page.
    */
  var useFirstPageHeaderFooter: js.UndefOr[Boolean] = js.native
}

object SchemaDocumentStyle {
  @scala.inline
  def apply(): SchemaDocumentStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentStyle]
  }
  @scala.inline
  implicit class SchemaDocumentStyleOps[Self <: SchemaDocumentStyle] (val x: Self) extends AnyVal {
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
    def setBackground(value: SchemaBackground): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setDefaultFooterId(value: String): Self = this.set("defaultFooterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFooterId: Self = this.set("defaultFooterId", js.undefined)
    @scala.inline
    def setDefaultHeaderId(value: String): Self = this.set("defaultHeaderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultHeaderId: Self = this.set("defaultHeaderId", js.undefined)
    @scala.inline
    def setEvenPageFooterId(value: String): Self = this.set("evenPageFooterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvenPageFooterId: Self = this.set("evenPageFooterId", js.undefined)
    @scala.inline
    def setEvenPageHeaderId(value: String): Self = this.set("evenPageHeaderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvenPageHeaderId: Self = this.set("evenPageHeaderId", js.undefined)
    @scala.inline
    def setFirstPageFooterId(value: String): Self = this.set("firstPageFooterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstPageFooterId: Self = this.set("firstPageFooterId", js.undefined)
    @scala.inline
    def setFirstPageHeaderId(value: String): Self = this.set("firstPageHeaderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstPageHeaderId: Self = this.set("firstPageHeaderId", js.undefined)
    @scala.inline
    def setMarginBottom(value: SchemaDimension): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    @scala.inline
    def setMarginLeft(value: SchemaDimension): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    @scala.inline
    def setMarginRight(value: SchemaDimension): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginRight: Self = this.set("marginRight", js.undefined)
    @scala.inline
    def setMarginTop(value: SchemaDimension): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    @scala.inline
    def setPageNumberStart(value: Double): Self = this.set("pageNumberStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageNumberStart: Self = this.set("pageNumberStart", js.undefined)
    @scala.inline
    def setPageSize(value: SchemaSize): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setUseEvenPageHeaderFooter(value: Boolean): Self = this.set("useEvenPageHeaderFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseEvenPageHeaderFooter: Self = this.set("useEvenPageHeaderFooter", js.undefined)
    @scala.inline
    def setUseFirstPageHeaderFooter(value: Boolean): Self = this.set("useFirstPageHeaderFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseFirstPageHeaderFooter: Self = this.set("useFirstPageHeaderFooter", js.undefined)
  }
  
}

