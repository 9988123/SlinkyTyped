package typingsSlinky.reactSelect.components

import typingsSlinky.reactSelect.selectMod.Props
import typingsSlinky.reactSelect.stateManagerMod.StateProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StateManager {
  @JSImport("react-select/src/stateManager", "StateManager")
  @js.native
  object component extends js.Object
  
  def withProps[/* <: typingsSlinky.reactSelect.typesMod.OptionTypeBase */ OptionType, /* <: typingsSlinky.reactSelect.selectMod.default[OptionType] */ T](
    p: StateProps[Props[OptionType]] with typingsSlinky.reactSelect.stateManagerMod.Props[OptionType] with Props[OptionType]
  ): SharedBuilder_StatePropsPropsProps40828826[typingsSlinky.reactSelect.stateManagerMod.StateManager[OptionType, T], OptionType, T] = new SharedBuilder_StatePropsPropsProps40828826[typingsSlinky.reactSelect.stateManagerMod.StateManager[OptionType, T], OptionType, T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[/* <: typingsSlinky.reactSelect.typesMod.OptionTypeBase */ OptionType, /* <: typingsSlinky.reactSelect.selectMod.default[OptionType] */ T](): SharedBuilder_StatePropsPropsProps40828826[typingsSlinky.reactSelect.stateManagerMod.StateManager[OptionType, T], OptionType, T] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_StatePropsPropsProps40828826[typingsSlinky.reactSelect.stateManagerMod.StateManager[OptionType, T], OptionType, T](js.Array(this.component, __props.asInstanceOf[StateProps[Props[OptionType]] with typingsSlinky.reactSelect.stateManagerMod.Props[OptionType] with Props[OptionType]]))
  }
  implicit def make[/* <: typingsSlinky.reactSelect.typesMod.OptionTypeBase */ OptionType, /* <: typingsSlinky.reactSelect.selectMod.default[OptionType] */ T](companion: StateManager.type): SharedBuilder_StatePropsPropsProps40828826[typingsSlinky.reactSelect.stateManagerMod.StateManager[OptionType, T], OptionType, T] = new SharedBuilder_StatePropsPropsProps40828826[typingsSlinky.reactSelect.stateManagerMod.StateManager[OptionType, T], OptionType, T](js.Array(this.component, js.Dictionary.empty))()
}

