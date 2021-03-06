package typingsSlinky.nodeSass.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context
  extends /* key */ StringDictionary[js.Any] {
  var callback: js.UndefOr[SassRenderCallback] = js.native
  var options: Options = js.native
}

object Context {
  @scala.inline
  def apply(options: Options): Context = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
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
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallback(value: (/* err */ SassError, /* result */ Result) => js.Any): Self = this.set("callback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
  }
  
}

