package typingsSlinky.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Field extends js.Object {
  /**
    * An array of values.
    */
  var arrayValue: js.UndefOr[ArrayValue] = js.native
  /**
    * A value of BLOB data type.
    */
  var blobValue: js.UndefOr[_Blob] = js.native
  /**
    * A value of Boolean data type.
    */
  var booleanValue: js.UndefOr[BoxedBoolean] = js.native
  /**
    * A value of double data type.
    */
  var doubleValue: js.UndefOr[BoxedDouble] = js.native
  /**
    * A NULL value.
    */
  var isNull: js.UndefOr[BoxedBoolean] = js.native
  /**
    * A value of long data type.
    */
  var longValue: js.UndefOr[BoxedLong] = js.native
  /**
    * A value of string data type.
    */
  var stringValue: js.UndefOr[String] = js.native
}

object Field {
  @scala.inline
  def apply(): Field = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Field]
  }
  @scala.inline
  implicit class FieldOps[Self <: Field] (val x: Self) extends AnyVal {
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
    def setArrayValue(value: ArrayValue): Self = this.set("arrayValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayValue: Self = this.set("arrayValue", js.undefined)
    @scala.inline
    def setBlobValueUint8Array(value: js.typedarray.Uint8Array): Self = this.set("blobValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlobValue(value: _Blob): Self = this.set("blobValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlobValue: Self = this.set("blobValue", js.undefined)
    @scala.inline
    def setBooleanValue(value: BoxedBoolean): Self = this.set("booleanValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBooleanValue: Self = this.set("booleanValue", js.undefined)
    @scala.inline
    def setDoubleValue(value: BoxedDouble): Self = this.set("doubleValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleValue: Self = this.set("doubleValue", js.undefined)
    @scala.inline
    def setIsNull(value: BoxedBoolean): Self = this.set("isNull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsNull: Self = this.set("isNull", js.undefined)
    @scala.inline
    def setLongValue(value: BoxedLong): Self = this.set("longValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongValue: Self = this.set("longValue", js.undefined)
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
  }
  
}

