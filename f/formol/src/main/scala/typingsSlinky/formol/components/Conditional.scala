package typingsSlinky.formol.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.formol.mod.ConditionalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Conditional {
  @JSImport("formol", "Conditional")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def context(value: js.Any): this.type = set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def readOnlyFunction1(value: js.Any => Boolean): this.type = set("readOnly", js.Any.fromFunction1(value))
    @scala.inline
    def readOnly(value: (js.Function1[js.Any, Boolean]) | Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def showFunction1(value: js.Any => Boolean): this.type = set("show", js.Any.fromFunction1(value))
    @scala.inline
    def show(value: (js.Function1[js.Any, Boolean]) | Boolean): this.type = set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: js.Any => _): this.type = set("value", js.Any.fromFunction1(value))
  }
  
  def withProps(p: ConditionalProps[js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Conditional.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

