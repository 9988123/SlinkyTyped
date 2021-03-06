package typingsSlinky.googleapis.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleResults extends js.Object {
  var locale: js.UndefOr[String] = js.native
  var ruleResults: js.UndefOr[StringDictionary[Groups]] = js.native
}

object RuleResults {
  @scala.inline
  def apply(): RuleResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleResults]
  }
  @scala.inline
  implicit class RuleResultsOps[Self <: RuleResults] (val x: Self) extends AnyVal {
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
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setRuleResults(value: StringDictionary[Groups]): Self = this.set("ruleResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleResults: Self = this.set("ruleResults", js.undefined)
  }
  
}

