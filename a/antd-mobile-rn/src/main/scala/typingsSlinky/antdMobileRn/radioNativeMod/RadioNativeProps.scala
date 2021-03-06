package typingsSlinky.antdMobileRn.radioNativeMod

import typingsSlinky.antdMobileRn.radioPropsTypeMod.RadioPropsType
import typingsSlinky.antdMobileRn.radioStyleIndexNativeMod.IRadioStyle
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioNativeProps extends RadioPropsType {
  var style: js.UndefOr[StyleProp[ImageStyle]] = js.native
  var styles: js.UndefOr[IRadioStyle] = js.native
}

object RadioNativeProps {
  @scala.inline
  def apply(): RadioNativeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioNativeProps]
  }
  @scala.inline
  implicit class RadioNativePropsOps[Self <: RadioNativeProps] (val x: Self) extends AnyVal {
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
    def setStyle(value: StyleProp[ImageStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setStyles(value: IRadioStyle): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

