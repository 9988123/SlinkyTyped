package typingsSlinky.postmark.templateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models/templates/Template", "CreateTemplateRequest")
@js.native
class CreateTemplateRequest protected () extends UpdateTemplateRequest {
  def this(
    Name: String,
    Subject: js.UndefOr[String],
    HtmlBody: js.UndefOr[String],
    TextBody: js.UndefOr[String],
    Alias: js.UndefOr[String | Null],
    TemplateType: js.UndefOr[TemplateTypes],
    LayoutTemplate: js.UndefOr[String]
  ) = this()
}

