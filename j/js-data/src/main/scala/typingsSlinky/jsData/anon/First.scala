package typingsSlinky.jsData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait First extends js.Object {
  var first: js.Any = js.native
  var keep: js.Any = js.native
}

object First {
  @scala.inline
  def apply(first: js.Any, keep: js.Any): First = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], keep = keep.asInstanceOf[js.Any])
    __obj.asInstanceOf[First]
  }
  @scala.inline
  implicit class FirstOps[Self <: First] (val x: Self) extends AnyVal {
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
    def setFirst(value: js.Any): Self = this.set("first", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeep(value: js.Any): Self = this.set("keep", value.asInstanceOf[js.Any])
  }
  
}

