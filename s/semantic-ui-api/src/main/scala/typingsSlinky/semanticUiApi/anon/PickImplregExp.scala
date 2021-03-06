package typingsSlinky.semanticUiApi.anon

import typingsSlinky.semanticUiApi.SemanticUI.Api.RegExpSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'regExp'> */
@js.native
trait PickImplregExp extends js.Object {
  var regExp: RegExpSettings = js.native
}

object PickImplregExp {
  @scala.inline
  def apply(regExp: RegExpSettings): PickImplregExp = {
    val __obj = js.Dynamic.literal(regExp = regExp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplregExp]
  }
  @scala.inline
  implicit class PickImplregExpOps[Self <: PickImplregExp] (val x: Self) extends AnyVal {
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
    def setRegExp(value: RegExpSettings): Self = this.set("regExp", value.asInstanceOf[js.Any])
  }
  
}

