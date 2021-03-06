package typingsSlinky.wordpressBlockEditor.componentsMod

import slinky.core.ReactComponentClass
import typingsSlinky.wordpressBlockEditor.mod.EditorColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/block-editor/components", "createCustomColorsHOC")
@js.native
object createCustomColorsHOC extends js.Object {
  def apply[T /* <: js.Array[String] */](colorsArray: js.Array[EditorColor]): js.Function1[
    /* colorNames */ T, 
    js.Function1[/* component */ ReactComponentClass[_], ReactComponentClass[_]]
  ] = js.native
}

