package typingsSlinky.antd.esTimeDashPickerMod

import typingsSlinky.antd.Anon_Open
import typingsSlinky.antd.Anon_Placeholder
import typingsSlinky.moment.momentMod.Moment
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePicker
  extends Component[TimePickerProps, js.Any, js.Any] {
  var timePickerRef: js.Any = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def getAllowClear(): js.UndefOr[Boolean] = js.native
  def getDefaultFormat(): String = js.native
  def getDefaultLocale(): Anon_Placeholder = js.native
  def handleChange(value: Moment): Unit = js.native
  def handleOpenClose(hasOpen: Anon_Open): Unit = js.native
  def renderClearIcon(prefixCls: String): Element = js.native
  def renderInputIcon(prefixCls: String): Element = js.native
  def renderTimePicker(locale: TimePickerLocale): Element = js.native
  def saveTimePicker(timePickerRef: js.Any): Unit = js.native
}

