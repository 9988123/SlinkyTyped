package typingsSlinky.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposUpdateWebhookParamsConfig extends js.Object {
  var content_type: js.UndefOr[String] = js.native
  var insecure_ssl: js.UndefOr[String] = js.native
  var secret: js.UndefOr[String] = js.native
  var url: String = js.native
}

object ReposUpdateWebhookParamsConfig {
  @scala.inline
  def apply(url: String): ReposUpdateWebhookParamsConfig = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateWebhookParamsConfig]
  }
  @scala.inline
  implicit class ReposUpdateWebhookParamsConfigOps[Self <: ReposUpdateWebhookParamsConfig] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent_type(value: String): Self = this.set("content_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent_type: Self = this.set("content_type", js.undefined)
    @scala.inline
    def setInsecure_ssl(value: String): Self = this.set("insecure_ssl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsecure_ssl: Self = this.set("insecure_ssl", js.undefined)
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
  }
  
}

