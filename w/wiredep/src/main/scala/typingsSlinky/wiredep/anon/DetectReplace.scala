package typingsSlinky.wiredep.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectReplace extends js.Object {
  /**
    * @example:
    *  /(([ \t]*)\/\/\s*bower:*(\S*))(\n|\r|.)*?(\/\/\s*endbower)/gi
    */
  var block: js.RegExp = js.native
  var detect: Styl = js.native
  var replace: CssStyl = js.native
}

object DetectReplace {
  @scala.inline
  def apply(block: js.RegExp, detect: Styl, replace: CssStyl): DetectReplace = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], detect = detect.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectReplace]
  }
  @scala.inline
  implicit class DetectReplaceOps[Self <: DetectReplace] (val x: Self) extends AnyVal {
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
    def setBlock(value: js.RegExp): Self = this.set("block", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetect(value: Styl): Self = this.set("detect", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplace(value: CssStyl): Self = this.set("replace", value.asInstanceOf[js.Any])
  }
  
}

