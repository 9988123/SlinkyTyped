package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEmailTemplateRequest extends js.Object {
  /**
    * The content of the email template, composed of a subject line, an HTML part, and a text-only part.
    */
  var TemplateContent: EmailTemplateContent = js.native
  /**
    * The name of the template you want to update.
    */
  var TemplateName: EmailTemplateName = js.native
}

object UpdateEmailTemplateRequest {
  @scala.inline
  def apply(TemplateContent: EmailTemplateContent, TemplateName: EmailTemplateName): UpdateEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateContent = TemplateContent.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEmailTemplateRequest]
  }
  @scala.inline
  implicit class UpdateEmailTemplateRequestOps[Self <: UpdateEmailTemplateRequest] (val x: Self) extends AnyVal {
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
    def setTemplateContent(value: EmailTemplateContent): Self = this.set("TemplateContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateName(value: EmailTemplateName): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
  }
  
}

