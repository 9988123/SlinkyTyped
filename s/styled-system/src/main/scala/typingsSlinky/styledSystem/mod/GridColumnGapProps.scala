package typingsSlinky.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridColumnGapProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The column-gap CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * @deprecated use column-gap
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/column-gap)
    */
  var gridColumnGap: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object GridColumnGapProps {
  @scala.inline
  def apply[/* <: typingsSlinky.styledSystem.mod.Theme[typingsSlinky.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](): GridColumnGapProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnGapProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class GridColumnGapPropsOps[Self <: GridColumnGapProps[_, _], /* <: typingsSlinky.styledSystem.mod.Theme[typingsSlinky.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal] (val x: Self with (GridColumnGapProps[ThemeType, TVal])) extends AnyVal {
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
    def setGridColumnGapVarargs(value: (TVal | Null)*): Self = this.set("gridColumnGap", js.Array(value :_*))
    @scala.inline
    def setGridColumnGap(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("gridColumnGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridColumnGap: Self = this.set("gridColumnGap", js.undefined)
    @scala.inline
    def setGridColumnGapNull: Self = this.set("gridColumnGap", null)
  }
  
}

