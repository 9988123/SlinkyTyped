package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.Plussign90
import typingsSlinky.baseui.baseuiStrings.TR
import typingsSlinky.baseui.baseuiStrings.`Turkey LeftparenthesisTürkiyeRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon215 extends js.Object {
  var dialCode: Plussign90 = js.native
  var id: TR = js.native
  var label: `Turkey LeftparenthesisTürkiyeRightparenthesis` = js.native
}

object Anon215 {
  @scala.inline
  def apply(dialCode: Plussign90, id: TR, label: `Turkey LeftparenthesisTürkiyeRightparenthesis`): Anon215 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon215]
  }
  @scala.inline
  implicit class Anon215Ops[Self <: Anon215] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign90): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: TR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Turkey LeftparenthesisTürkiyeRightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

