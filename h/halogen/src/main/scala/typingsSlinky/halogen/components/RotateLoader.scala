package typingsSlinky.halogen.components

import typingsSlinky.halogen.mod.MarginLoaderProps
import typingsSlinky.halogen.mod.RotateLoaderCls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RotateLoader {
  @JSImport("halogen", "RotateLoader")
  @js.native
  object component extends js.Object
  
  def withProps(p: MarginLoaderProps[String]): SharedBuilder_MarginLoaderProps_531447020[RotateLoaderCls] = new SharedBuilder_MarginLoaderProps_531447020[RotateLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RotateLoader.type): SharedBuilder_MarginLoaderProps_531447020[RotateLoaderCls] = new SharedBuilder_MarginLoaderProps_531447020[RotateLoaderCls](js.Array(this.component, js.Dictionary.empty))()
}

