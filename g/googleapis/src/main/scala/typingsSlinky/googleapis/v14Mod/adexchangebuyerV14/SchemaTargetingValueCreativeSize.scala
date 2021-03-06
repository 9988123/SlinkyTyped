package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Next Id: 7
  */
@js.native
trait SchemaTargetingValueCreativeSize extends js.Object {
  /**
    * The formats allowed by the publisher.
    */
  var allowedFormats: js.UndefOr[js.Array[String]] = js.native
  /**
    * For video size type, the list of companion sizes.
    */
  var companionSizes: js.UndefOr[js.Array[SchemaTargetingValueSize]] = js.native
  /**
    * The Creative size type.
    */
  var creativeSizeType: js.UndefOr[String] = js.native
  /**
    * The native template for native ad.
    */
  var nativeTemplate: js.UndefOr[String] = js.native
  /**
    * For regular or video creative size type, specifies the size of the
    * creative.
    */
  var size: js.UndefOr[SchemaTargetingValueSize] = js.native
  /**
    * The skippable ad type for video size.
    */
  var skippableAdType: js.UndefOr[String] = js.native
}

object SchemaTargetingValueCreativeSize {
  @scala.inline
  def apply(): SchemaTargetingValueCreativeSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingValueCreativeSize]
  }
  @scala.inline
  implicit class SchemaTargetingValueCreativeSizeOps[Self <: SchemaTargetingValueCreativeSize] (val x: Self) extends AnyVal {
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
    def setAllowedFormatsVarargs(value: String*): Self = this.set("allowedFormats", js.Array(value :_*))
    @scala.inline
    def setAllowedFormats(value: js.Array[String]): Self = this.set("allowedFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedFormats: Self = this.set("allowedFormats", js.undefined)
    @scala.inline
    def setCompanionSizesVarargs(value: SchemaTargetingValueSize*): Self = this.set("companionSizes", js.Array(value :_*))
    @scala.inline
    def setCompanionSizes(value: js.Array[SchemaTargetingValueSize]): Self = this.set("companionSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompanionSizes: Self = this.set("companionSizes", js.undefined)
    @scala.inline
    def setCreativeSizeType(value: String): Self = this.set("creativeSizeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeSizeType: Self = this.set("creativeSizeType", js.undefined)
    @scala.inline
    def setNativeTemplate(value: String): Self = this.set("nativeTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNativeTemplate: Self = this.set("nativeTemplate", js.undefined)
    @scala.inline
    def setSize(value: SchemaTargetingValueSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSkippableAdType(value: String): Self = this.set("skippableAdType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkippableAdType: Self = this.set("skippableAdType", js.undefined)
  }
  
}

