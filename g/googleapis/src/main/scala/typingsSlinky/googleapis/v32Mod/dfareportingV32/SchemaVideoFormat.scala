package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about supported video formats.
  */
@js.native
trait SchemaVideoFormat extends js.Object {
  /**
    * File type of the video format.
    */
  var fileType: js.UndefOr[String] = js.native
  /**
    * ID of the video format.
    */
  var id: js.UndefOr[Double] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#videoFormat&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The resolution of this video format.
    */
  var resolution: js.UndefOr[SchemaSize] = js.native
  /**
    * The target bit rate of this video format.
    */
  var targetBitRate: js.UndefOr[Double] = js.native
}

object SchemaVideoFormat {
  @scala.inline
  def apply(): SchemaVideoFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoFormat]
  }
  @scala.inline
  implicit class SchemaVideoFormatOps[Self <: SchemaVideoFormat] (val x: Self) extends AnyVal {
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
    def setFileType(value: String): Self = this.set("fileType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setResolution(value: SchemaSize): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
    @scala.inline
    def setTargetBitRate(value: Double): Self = this.set("targetBitRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetBitRate: Self = this.set("targetBitRate", js.undefined)
  }
  
}

