package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of creating an image.
  */
@js.native
trait SchemaCreateImageResponse extends js.Object {
  /**
    * The object ID of the created image.
    */
  var objectId: js.UndefOr[String] = js.native
}

object SchemaCreateImageResponse {
  @scala.inline
  def apply(): SchemaCreateImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateImageResponse]
  }
  @scala.inline
  implicit class SchemaCreateImageResponseOps[Self <: SchemaCreateImageResponse] (val x: Self) extends AnyVal {
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
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
  }
  
}

