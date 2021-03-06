package typingsSlinky.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleOptions extends js.Object {
  /**
    * if true, the rules will not be replaced by the same unique rule later.
    *
    * For example, `Joi.number().min(1).rule({ keep: true }).min(2)` will keep both `min()` rules instead of the later rule overriding the first.
    *
    * @default false
    */
  var keep: js.UndefOr[Boolean] = js.native
  /**
    * a single message string or a messages object where each key is an error code and corresponding message string as value.
    *
    * The object is the same as the messages used as an option in `any.validate()`.
    * The strings can be plain messages or a message template.
    */
  var message: js.UndefOr[String | LanguageMessages] = js.native
  /**
    * if true, turns any error generated by the ruleset to warnings.
    */
  var warn: js.UndefOr[Boolean] = js.native
}

object RuleOptions {
  @scala.inline
  def apply(): RuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleOptions]
  }
  @scala.inline
  implicit class RuleOptionsOps[Self <: RuleOptions] (val x: Self) extends AnyVal {
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
    def setKeep(value: Boolean): Self = this.set("keep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeep: Self = this.set("keep", js.undefined)
    @scala.inline
    def setMessage(value: String | LanguageMessages): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setWarn(value: Boolean): Self = this.set("warn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarn: Self = this.set("warn", js.undefined)
  }
  
}

