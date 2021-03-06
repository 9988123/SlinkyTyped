package typingsSlinky.baseui.mod

import slinky.core.ReactComponentClass
import typingsSlinky.baseui.anon.ClassName
import typingsSlinky.baseui.anon.Theme
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import typingsSlinky.styletronReact.mod.StyletronComponent
import typingsSlinky.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui", "styled")
@js.native
object styled extends js.Object {
  def apply[P /* <: js.Object */, C /* <: ReactComponentClass[_] */, T](component: C, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[C], 
      Exclude[/* keyof react.react.ComponentProps<C> */ String, ClassName]
    ]) with P
  ] = js.native
  def apply[P /* <: js.Object */, C /* <: ReactComponentClass[_] */, T](component: C, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[C], 
      Exclude[/* keyof react.react.ComponentProps<C> */ String, ClassName]
    ]) with P
  ] = js.native
}

