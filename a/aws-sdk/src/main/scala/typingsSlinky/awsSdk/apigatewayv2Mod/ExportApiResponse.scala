package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportApiResponse extends js.Object {
  var body: js.UndefOr[ExportedApi] = js.native
}

object ExportApiResponse {
  @scala.inline
  def apply(): ExportApiResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportApiResponse]
  }
  @scala.inline
  implicit class ExportApiResponseOps[Self <: ExportApiResponse] (val x: Self) extends AnyVal {
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
    def setBodyUint8Array(value: js.typedarray.Uint8Array): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: ExportedApi): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
  }
  
}

