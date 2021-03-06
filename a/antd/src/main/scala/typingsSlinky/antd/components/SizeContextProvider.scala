package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.sizeContextMod.SizeContextProps
import typingsSlinky.antd.sizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SizeContextProvider {
  @JSImport("antd/lib/config-provider/SizeContext", "SizeContextProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SizeContextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SizeContextProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

