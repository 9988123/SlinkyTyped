package typingsSlinky.reactColor.githubMod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.reactColor.anon.PartialClassesGithubPicke
import typingsSlinky.reactColor.mod.ColorPickerProps
import typingsSlinky.reactColor.mod.ColorResult
import typingsSlinky.reactColor.reactColorStrings.`top-left`
import typingsSlinky.reactColor.reactColorStrings.`top-right`
import typingsSlinky.reactColor.reactColorStrings.hide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GithubPickerProps extends ColorPickerProps[GithubPicker] {
  var colors: js.UndefOr[js.Array[String]] = js.native
  var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.native
  @JSName("styles")
  var styles_GithubPickerProps: js.UndefOr[PartialClassesGithubPicke] = js.native
  var triangle: js.UndefOr[hide | `top-left` | `top-right`] = js.native
  var width: js.UndefOr[String] = js.native
}

object GithubPickerProps {
  @scala.inline
  def apply(): GithubPickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GithubPickerProps]
  }
  @scala.inline
  implicit class GithubPickerPropsOps[Self <: GithubPickerProps] (val x: Self) extends AnyVal {
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
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setOnSwatchHover(value: (/* color */ ColorResult, /* event */ MouseEvent) => Unit): Self = this.set("onSwatchHover", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSwatchHover: Self = this.set("onSwatchHover", js.undefined)
    @scala.inline
    def setStyles(value: PartialClassesGithubPicke): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTriangle(value: hide | `top-left` | `top-right`): Self = this.set("triangle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriangle: Self = this.set("triangle", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

