package typingsSlinky.reactSelect.indicatorsMod

import typingsSlinky.reactSelect.selectMod.Props
import typingsSlinky.reactSelect.typesMod.ActionTypes
import typingsSlinky.reactSelect.typesMod.ClassNamesState
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.OptionsType
import typingsSlinky.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  innerProps :any,   isFocused :boolean,   isRtl :boolean,   size :number} & react-select.react-select/src/types.CommonProps<OptionType> */
@js.native
trait LoadingIconProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  var className: js.UndefOr[String] = js.native
  var hasValue: Boolean = js.native
  /** Props that will be passed on to the children. */
  var innerProps: js.Any = js.native
  /** The focused state of the select. */
  var isFocused: Boolean = js.native
  var isMulti: Boolean = js.native
  /** Whether the text is right to left */
  var isRtl: Boolean = js.native
  var options: OptionsType[OptionType] = js.native
  var selectProps: Props[OptionType] = js.native
  /** Set size of the container. */
  var size: Double = js.native
  def clearValue(): Unit = js.native
  def cx(): String = js.native
  def cx(state: js.UndefOr[ClassNamesState], className: String): String = js.native
  def cx(state: ClassNamesState): String = js.native
  /*
    Get the styles of a particular part of the select. Pass in the name of the
    property as the first argument, and the current props as the second argument.
    See the `styles` object for the properties available.
    */
  def getStyles(name: String, props: js.Any): js.Object = js.native
  def getValue(): ValueType[OptionType] = js.native
  def selectOption(option: OptionType): Unit = js.native
  def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
}

