package typingsSlinky.antdMobileRn.noticeBarIndexNativeMod

import typingsSlinky.antdMobileRn.marqueeNativeMod.MarqueeProps
import typingsSlinky.antdMobileRn.noticeBarPropsTypeMod.NoticeBarPropsType
import typingsSlinky.antdMobileRn.noticeBarStyleIndexNativeMod.INoticeBarStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoticeNativeProps extends NoticeBarPropsType {
  var marqueeProps: js.UndefOr[MarqueeProps] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var styles: js.UndefOr[INoticeBarStyle] = js.native
}

object NoticeNativeProps {
  @scala.inline
  def apply(): NoticeNativeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoticeNativeProps]
  }
  @scala.inline
  implicit class NoticeNativePropsOps[Self <: NoticeNativeProps] (val x: Self) extends AnyVal {
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
    def setMarqueeProps(value: MarqueeProps): Self = this.set("marqueeProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarqueeProps: Self = this.set("marqueeProps", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setStyles(value: INoticeBarStyle): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

