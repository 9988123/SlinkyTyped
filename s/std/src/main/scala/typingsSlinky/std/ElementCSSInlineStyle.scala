package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementCSSInlineStyle extends js.Object {
  val style: org.scalajs.dom.raw.CSSStyleDeclaration = js.native
}

object ElementCSSInlineStyle {
  @scala.inline
  def apply(style: org.scalajs.dom.raw.CSSStyleDeclaration): ElementCSSInlineStyle = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementCSSInlineStyle]
  }
  @scala.inline
  implicit class ElementCSSInlineStyleOps[Self <: ElementCSSInlineStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStyle(value: org.scalajs.dom.raw.CSSStyleDeclaration): Self = this.set("style", value.asInstanceOf[js.Any])
  }
  
}

