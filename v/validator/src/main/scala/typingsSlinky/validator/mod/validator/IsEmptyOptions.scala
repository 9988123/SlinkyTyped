package typingsSlinky.validator.mod.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsEmptyOptions extends js.Object {
  /**
    * @default false
    */
  var ignore_whitespace: js.UndefOr[Boolean] = js.native
}

object IsEmptyOptions {
  @scala.inline
  def apply(): IsEmptyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsEmptyOptions]
  }
  @scala.inline
  implicit class IsEmptyOptionsOps[Self <: IsEmptyOptions] (val x: Self) extends AnyVal {
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
    def setIgnore_whitespace(value: Boolean): Self = this.set("ignore_whitespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore_whitespace: Self = this.set("ignore_whitespace", js.undefined)
  }
  
}

