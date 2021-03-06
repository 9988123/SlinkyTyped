package typingsSlinky.wordpressComponents.anon

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<@wordpress/components.@wordpress/components/slot-fill/slot.default.Props, 'name'> */
@js.native
trait OmitPropsnameBubblesVirtually extends js.Object {
  var bubblesVirtually: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[js.Function1[/* fills */ js.Array[js.Array[ReactElement]], ReactElement | Null]] = js.native
  var fillProps: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object OmitPropsnameBubblesVirtually {
  @scala.inline
  def apply(): OmitPropsnameBubblesVirtually = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitPropsnameBubblesVirtually]
  }
  @scala.inline
  implicit class OmitPropsnameBubblesVirtuallyOps[Self <: OmitPropsnameBubblesVirtually] (val x: Self) extends AnyVal {
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
    def setBubblesVirtually(value: Boolean): Self = this.set("bubblesVirtually", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubblesVirtually: Self = this.set("bubblesVirtually", js.undefined)
    @scala.inline
    def setChildren(value: /* fills */ js.Array[js.Array[ReactElement]] => ReactElement | Null): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setFillProps(value: StringDictionary[js.Any]): Self = this.set("fillProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillProps: Self = this.set("fillProps", js.undefined)
  }
  
}

