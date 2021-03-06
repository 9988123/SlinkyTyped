package typingsSlinky.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A ParagraphElement representing a horizontal line.
  */
@js.native
trait SchemaHorizontalRule extends js.Object {
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested insertion IDs. A HorizontalRule may have multiple insertion
    * IDs if it is a nested suggested change. If empty, then this is not a
    * suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested text style changes to this HorizontalRule, keyed by
    * suggestion ID.
    */
  var suggestedTextStyleChanges: js.UndefOr[StringDictionary[SchemaSuggestedTextStyle]] = js.native
  /**
    * The text style of this HorizontalRule.  Similar to text content, like
    * text runs and footnote references, the text style of a horizontal rule
    * can affect content layout as well as the styling of text inserted
    * adjacent to it.
    */
  var textStyle: js.UndefOr[SchemaTextStyle] = js.native
}

object SchemaHorizontalRule {
  @scala.inline
  def apply(): SchemaHorizontalRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHorizontalRule]
  }
  @scala.inline
  implicit class SchemaHorizontalRuleOps[Self <: SchemaHorizontalRule] (val x: Self) extends AnyVal {
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
    def setSuggestedDeletionIdsVarargs(value: String*): Self = this.set("suggestedDeletionIds", js.Array(value :_*))
    @scala.inline
    def setSuggestedDeletionIds(value: js.Array[String]): Self = this.set("suggestedDeletionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedDeletionIds: Self = this.set("suggestedDeletionIds", js.undefined)
    @scala.inline
    def setSuggestedInsertionIdsVarargs(value: String*): Self = this.set("suggestedInsertionIds", js.Array(value :_*))
    @scala.inline
    def setSuggestedInsertionIds(value: js.Array[String]): Self = this.set("suggestedInsertionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedInsertionIds: Self = this.set("suggestedInsertionIds", js.undefined)
    @scala.inline
    def setSuggestedTextStyleChanges(value: StringDictionary[SchemaSuggestedTextStyle]): Self = this.set("suggestedTextStyleChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedTextStyleChanges: Self = this.set("suggestedTextStyleChanges", js.undefined)
    @scala.inline
    def setTextStyle(value: SchemaTextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
  }
  
}

