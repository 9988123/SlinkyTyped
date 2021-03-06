package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextStyleSuggestionState extends js.Object {
  var backgroundColorSuggested: js.UndefOr[Boolean] = js.native
  var baselineOffsetSuggested: js.UndefOr[Boolean] = js.native
  var boldSuggested: js.UndefOr[Boolean] = js.native
  var fontSizeSuggested: js.UndefOr[Boolean] = js.native
  var foregroundColorSuggested: js.UndefOr[Boolean] = js.native
  var italicSuggested: js.UndefOr[Boolean] = js.native
  var linkSuggested: js.UndefOr[Boolean] = js.native
  var smallCapsSuggested: js.UndefOr[Boolean] = js.native
  var strikethroughSuggested: js.UndefOr[Boolean] = js.native
  var underlineSuggested: js.UndefOr[Boolean] = js.native
  var weightedFontFamilySuggested: js.UndefOr[Boolean] = js.native
}

object TextStyleSuggestionState {
  @scala.inline
  def apply(): TextStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyleSuggestionState]
  }
  @scala.inline
  implicit class TextStyleSuggestionStateOps[Self <: TextStyleSuggestionState] (val x: Self) extends AnyVal {
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
    def setBackgroundColorSuggested(value: Boolean): Self = this.set("backgroundColorSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColorSuggested: Self = this.set("backgroundColorSuggested", js.undefined)
    @scala.inline
    def setBaselineOffsetSuggested(value: Boolean): Self = this.set("baselineOffsetSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaselineOffsetSuggested: Self = this.set("baselineOffsetSuggested", js.undefined)
    @scala.inline
    def setBoldSuggested(value: Boolean): Self = this.set("boldSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoldSuggested: Self = this.set("boldSuggested", js.undefined)
    @scala.inline
    def setFontSizeSuggested(value: Boolean): Self = this.set("fontSizeSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSizeSuggested: Self = this.set("fontSizeSuggested", js.undefined)
    @scala.inline
    def setForegroundColorSuggested(value: Boolean): Self = this.set("foregroundColorSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForegroundColorSuggested: Self = this.set("foregroundColorSuggested", js.undefined)
    @scala.inline
    def setItalicSuggested(value: Boolean): Self = this.set("italicSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItalicSuggested: Self = this.set("italicSuggested", js.undefined)
    @scala.inline
    def setLinkSuggested(value: Boolean): Self = this.set("linkSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkSuggested: Self = this.set("linkSuggested", js.undefined)
    @scala.inline
    def setSmallCapsSuggested(value: Boolean): Self = this.set("smallCapsSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmallCapsSuggested: Self = this.set("smallCapsSuggested", js.undefined)
    @scala.inline
    def setStrikethroughSuggested(value: Boolean): Self = this.set("strikethroughSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrikethroughSuggested: Self = this.set("strikethroughSuggested", js.undefined)
    @scala.inline
    def setUnderlineSuggested(value: Boolean): Self = this.set("underlineSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlineSuggested: Self = this.set("underlineSuggested", js.undefined)
    @scala.inline
    def setWeightedFontFamilySuggested(value: Boolean): Self = this.set("weightedFontFamilySuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeightedFontFamilySuggested: Self = this.set("weightedFontFamilySuggested", js.undefined)
  }
  
}

