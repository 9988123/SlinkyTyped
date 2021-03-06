package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specification determining how headers are added to requests or responses.
  */
@js.native
trait SchemaHttpHeaderOption extends js.Object {
  /**
    * The name of the header.
    */
  var headerName: js.UndefOr[String] = js.native
  /**
    * The value of the header to add.
    */
  var headerValue: js.UndefOr[String] = js.native
  /**
    * If false, headerValue is appended to any values that already exist for
    * the header. If true, headerValue is set for the header, discarding any
    * values that were set for that header. The default value is false.
    */
  var replace: js.UndefOr[Boolean] = js.native
}

object SchemaHttpHeaderOption {
  @scala.inline
  def apply(): SchemaHttpHeaderOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpHeaderOption]
  }
  @scala.inline
  implicit class SchemaHttpHeaderOptionOps[Self <: SchemaHttpHeaderOption] (val x: Self) extends AnyVal {
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
    def setHeaderName(value: String): Self = this.set("headerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderName: Self = this.set("headerName", js.undefined)
    @scala.inline
    def setHeaderValue(value: String): Self = this.set("headerValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderValue: Self = this.set("headerValue", js.undefined)
    @scala.inline
    def setReplace(value: Boolean): Self = this.set("replace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
  }
  
}

