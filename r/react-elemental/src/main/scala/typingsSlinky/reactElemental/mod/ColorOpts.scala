package typingsSlinky.reactElemental.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorOpts extends js.Object {
  var primary: js.UndefOr[String] = js.native
  var primaryDark: js.UndefOr[String] = js.native
  var primaryLight: js.UndefOr[String] = js.native
}

object ColorOpts {
  @scala.inline
  def apply(): ColorOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorOpts]
  }
  @scala.inline
  implicit class ColorOptsOps[Self <: ColorOpts] (val x: Self) extends AnyVal {
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
    def setPrimary(value: String): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setPrimaryDark(value: String): Self = this.set("primaryDark", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryDark: Self = this.set("primaryDark", js.undefined)
    @scala.inline
    def setPrimaryLight(value: String): Self = this.set("primaryLight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryLight: Self = this.set("primaryLight", js.undefined)
  }
  
}

