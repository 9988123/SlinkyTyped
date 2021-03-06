package typingsSlinky.reactMdTable.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.ProviderProps
import typingsSlinky.reactMdTable.anon.RequiredTableConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableConfigProvider {
  @JSImport("@react-md/table/types/config", "TableConfigProvider")
  @js.native
  object component extends js.Object
  
  def withProps(p: ProviderProps[RequiredTableConfig]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(value: RequiredTableConfig): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[RequiredTableConfig]]))
  }
}

