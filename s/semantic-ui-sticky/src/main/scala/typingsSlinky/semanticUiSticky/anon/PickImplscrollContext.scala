package typingsSlinky.semanticUiSticky.anon

import typingsSlinky.semanticUiSticky.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.StickySettings._Impl, 'scrollContext'> */
@js.native
trait PickImplscrollContext extends js.Object {
  var scrollContext: String | JQuery = js.native
}

object PickImplscrollContext {
  @scala.inline
  def apply(scrollContext: String | JQuery): PickImplscrollContext = {
    val __obj = js.Dynamic.literal(scrollContext = scrollContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplscrollContext]
  }
  @scala.inline
  implicit class PickImplscrollContextOps[Self <: PickImplscrollContext] (val x: Self) extends AnyVal {
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
    def setScrollContext(value: String | JQuery): Self = this.set("scrollContext", value.asInstanceOf[js.Any])
  }
  
}

