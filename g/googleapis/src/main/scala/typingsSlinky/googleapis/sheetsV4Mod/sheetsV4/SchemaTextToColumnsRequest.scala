package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Splits a column of text into multiple columns, based on a delimiter in each
  * cell.
  */
@js.native
trait SchemaTextToColumnsRequest extends js.Object {
  /**
    * The delimiter to use. Used only if delimiterType is CUSTOM.
    */
  var delimiter: js.UndefOr[String] = js.native
  /**
    * The delimiter type to use.
    */
  var delimiterType: js.UndefOr[String] = js.native
  /**
    * The source data range.  This must span exactly one column.
    */
  var source: js.UndefOr[SchemaGridRange] = js.native
}

object SchemaTextToColumnsRequest {
  @scala.inline
  def apply(): SchemaTextToColumnsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextToColumnsRequest]
  }
  @scala.inline
  implicit class SchemaTextToColumnsRequestOps[Self <: SchemaTextToColumnsRequest] (val x: Self) extends AnyVal {
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
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setDelimiterType(value: String): Self = this.set("delimiterType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiterType: Self = this.set("delimiterType", js.undefined)
    @scala.inline
    def setSource(value: SchemaGridRange): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

