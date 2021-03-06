package typingsSlinky.formatjsIntlUtils.anon

import typingsSlinky.formatjsIntlUtils.formatjsIntlUtilsStrings.`best fit`
import typingsSlinky.formatjsIntlUtils.formatjsIntlUtilsStrings.lookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleMatcher extends js.Object {
  var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.native
}

object LocaleMatcher {
  @scala.inline
  def apply(): LocaleMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleMatcher]
  }
  @scala.inline
  implicit class LocaleMatcherOps[Self <: LocaleMatcher] (val x: Self) extends AnyVal {
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
    def setLocaleMatcher(value: (`best fit`) | lookup): Self = this.set("localeMatcher", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocaleMatcher: Self = this.set("localeMatcher", js.undefined)
  }
  
}

