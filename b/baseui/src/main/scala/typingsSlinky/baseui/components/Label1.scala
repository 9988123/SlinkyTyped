package typingsSlinky.baseui.components

import typingsSlinky.baseui.blockMod.BlockProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Label1 {
  @JSImport("baseui/typography", "Label1")
  @js.native
  object component extends js.Object
  
  def withProps(p: BlockProps): SharedBuilder_BlockProps1115621296[js.Object] = new SharedBuilder_BlockProps1115621296[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Label1.type): SharedBuilder_BlockProps1115621296[js.Object] = new SharedBuilder_BlockProps1115621296[js.Object](js.Array(this.component, js.Dictionary.empty))()
}

