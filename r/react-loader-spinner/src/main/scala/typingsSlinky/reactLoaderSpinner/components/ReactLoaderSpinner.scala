package typingsSlinky.reactLoaderSpinner.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactLoaderSpinner.mod.LoaderProps
import typingsSlinky.reactLoaderSpinner.mod.Types
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactLoaderSpinner {
  @JSImport("react-loader-spinner", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def timeout(value: Double): this.type = set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: Types): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def visible(value: Boolean | String): this.type = set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LoaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactLoaderSpinner.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

