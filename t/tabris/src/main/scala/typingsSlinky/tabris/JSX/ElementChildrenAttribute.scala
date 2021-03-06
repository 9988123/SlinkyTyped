package typingsSlinky.tabris.JSX

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementChildrenAttribute extends js.Object {
  var children: js.UndefOr[js.Any] = js.native
}

object ElementChildrenAttribute {
  @scala.inline
  def apply(): ElementChildrenAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementChildrenAttribute]
  }
  @scala.inline
  implicit class ElementChildrenAttributeOps[Self <: ElementChildrenAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
  }
  
}

