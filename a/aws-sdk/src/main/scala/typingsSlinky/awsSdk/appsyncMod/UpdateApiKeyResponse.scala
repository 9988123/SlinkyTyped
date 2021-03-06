package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApiKeyResponse extends js.Object {
  /**
    * The API key.
    */
  var apiKey: js.UndefOr[ApiKey] = js.native
}

object UpdateApiKeyResponse {
  @scala.inline
  def apply(): UpdateApiKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateApiKeyResponse]
  }
  @scala.inline
  implicit class UpdateApiKeyResponseOps[Self <: UpdateApiKeyResponse] (val x: Self) extends AnyVal {
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
    def setApiKey(value: ApiKey): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiKey: Self = this.set("apiKey", js.undefined)
  }
  
}

