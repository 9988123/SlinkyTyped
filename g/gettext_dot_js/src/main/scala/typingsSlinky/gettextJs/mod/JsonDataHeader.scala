package typingsSlinky.gettextJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonDataHeader extends js.Object {
  var language: String = js.native
  var `plural-forms`: String = js.native
}

object JsonDataHeader {
  @scala.inline
  def apply(language: String, `plural-forms`: String): JsonDataHeader = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("plural-forms")(`plural-forms`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonDataHeader]
  }
  @scala.inline
  implicit class JsonDataHeaderOps[Self <: JsonDataHeader] (val x: Self) extends AnyVal {
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
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def `setPlural-forms`(value: String): Self = this.set("plural-forms", value.asInstanceOf[js.Any])
  }
  
}

