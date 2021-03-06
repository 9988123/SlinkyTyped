package typingsSlinky.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxHeightProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The max-height CSS property sets the maximum height of an element. It prevents the used value of the height
    * property from becoming larger than the value specified for max-height.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-height)
    */
  var maxHeight: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object MaxHeightProps {
  @scala.inline
  def apply[/* <: typingsSlinky.styledSystem.mod.Theme[typingsSlinky.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](): MaxHeightProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxHeightProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class MaxHeightPropsOps[Self <: MaxHeightProps[_, _], /* <: typingsSlinky.styledSystem.mod.Theme[typingsSlinky.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal] (val x: Self with (MaxHeightProps[ThemeType, TVal])) extends AnyVal {
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
    def setMaxHeightVarargs(value: (TVal | Null)*): Self = this.set("maxHeight", js.Array(value :_*))
    @scala.inline
    def setMaxHeight(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxHeightNull: Self = this.set("maxHeight", null)
  }
  
}

