package typingsSlinky.antd.esGridRowMod

import typingsSlinky.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Row
  extends Component[RowProps, RowState, js.Any] {
  var token: String = js.native
  @JSName("componentDidMount")
  def componentDidMount_MRow(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MRow(): Unit = js.native
  def getGutter(): js.Tuple2[Double, Double] = js.native
  def renderRow(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
}

