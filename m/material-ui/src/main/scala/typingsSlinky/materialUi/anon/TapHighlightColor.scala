package typingsSlinky.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TapHighlightColor extends js.Object {
  var tapHighlightColor: js.UndefOr[String] = js.native
}

object TapHighlightColor {
  @scala.inline
  def apply(): TapHighlightColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TapHighlightColor]
  }
  @scala.inline
  implicit class TapHighlightColorOps[Self <: TapHighlightColor] (val x: Self) extends AnyVal {
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
    def setTapHighlightColor(value: String): Self = this.set("tapHighlightColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapHighlightColor: Self = this.set("tapHighlightColor", js.undefined)
  }
  
}

