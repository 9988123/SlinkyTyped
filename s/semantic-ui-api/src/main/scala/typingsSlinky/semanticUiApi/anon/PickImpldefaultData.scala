package typingsSlinky.semanticUiApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'defaultData'> */
@js.native
trait PickImpldefaultData extends js.Object {
  var defaultData: Boolean = js.native
}

object PickImpldefaultData {
  @scala.inline
  def apply(defaultData: Boolean): PickImpldefaultData = {
    val __obj = js.Dynamic.literal(defaultData = defaultData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldefaultData]
  }
  @scala.inline
  implicit class PickImpldefaultDataOps[Self <: PickImpldefaultData] (val x: Self) extends AnyVal {
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
    def setDefaultData(value: Boolean): Self = this.set("defaultData", value.asInstanceOf[js.Any])
  }
  
}

