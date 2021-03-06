package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.sliderMod.SliderOverrides
import typingsSlinky.baseui.sliderMod.State
import typingsSlinky.baseui.sliderMod.StatefulSliderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulSlider {
  @JSImport("baseui/slider", "StatefulSlider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def initialState(value: State): this.type = set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* e */ State => _): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onFinalChange(value: /* e */ State => _): this.type = set("onFinalChange", js.Any.fromFunction1(value))
    @scala.inline
    def overrides(value: SliderOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StatefulSliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: StatefulSlider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

