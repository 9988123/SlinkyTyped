package typingsSlinky.preact.anon

import typingsSlinky.preact.mod.ComponentChild
import typingsSlinky.preact.mod.ComponentChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value[T] extends js.Object {
  var children: ComponentChildren = js.native
  var value: T = js.native
}

object Value {
  @scala.inline
  def apply[T](value: T): Value[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[T]]
  }
  @scala.inline
  implicit class ValueOps[Self <: Value[_], T] (val x: Self with Value[T]) extends AnyVal {
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
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenVarargs(value: ComponentChild*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: ComponentChildren): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setChildrenNull: Self = this.set("children", null)
  }
  
}

