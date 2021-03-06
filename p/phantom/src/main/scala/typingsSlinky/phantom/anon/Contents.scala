package typingsSlinky.phantom.anon

import typingsSlinky.phantom.mod.IPhantomCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contents extends js.Object {
  var contents: IPhantomCallback = js.native
  var height: String = js.native
}

object Contents {
  @scala.inline
  def apply(contents: IPhantomCallback, height: String): Contents = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contents]
  }
  @scala.inline
  implicit class ContentsOps[Self <: Contents] (val x: Self) extends AnyVal {
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
    def setContents(value: IPhantomCallback): Self = this.set("contents", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
  }
  
}

