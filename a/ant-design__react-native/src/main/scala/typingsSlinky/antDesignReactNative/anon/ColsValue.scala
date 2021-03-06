package typingsSlinky.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColsValue extends js.Object {
  var cols: js.Array[_] = js.native
  var value: js.Array[_] = js.native
}

object ColsValue {
  @scala.inline
  def apply(cols: js.Array[_], value: js.Array[_]): ColsValue = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColsValue]
  }
  @scala.inline
  implicit class ColsValueOps[Self <: ColsValue] (val x: Self) extends AnyVal {
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
    def setColsVarargs(value: js.Any*): Self = this.set("cols", js.Array(value :_*))
    @scala.inline
    def setCols(value: js.Array[_]): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[_]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

