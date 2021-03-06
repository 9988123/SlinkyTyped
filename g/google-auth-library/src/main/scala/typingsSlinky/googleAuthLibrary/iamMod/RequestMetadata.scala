package typingsSlinky.googleAuthLibrary.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestMetadata extends js.Object {
  var `x-goog-iam-authority-selector`: String = js.native
  var `x-goog-iam-authorization-token`: String = js.native
}

object RequestMetadata {
  @scala.inline
  def apply(`x-goog-iam-authority-selector`: String, `x-goog-iam-authorization-token`: String): RequestMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x-goog-iam-authority-selector")(`x-goog-iam-authority-selector`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-goog-iam-authorization-token")(`x-goog-iam-authorization-token`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestMetadata]
  }
  @scala.inline
  implicit class RequestMetadataOps[Self <: RequestMetadata] (val x: Self) extends AnyVal {
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
    def `setX-goog-iam-authority-selector`(value: String): Self = this.set("x-goog-iam-authority-selector", value.asInstanceOf[js.Any])
    @scala.inline
    def `setX-goog-iam-authorization-token`(value: String): Self = this.set("x-goog-iam-authorization-token", value.asInstanceOf[js.Any])
  }
  
}

