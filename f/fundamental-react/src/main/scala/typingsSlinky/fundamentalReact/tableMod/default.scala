package typingsSlinky.fundamentalReact.tableMod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.anon.PartialTableProps
import typingsSlinky.fundamentalReact.anon.WeakValidationMapTablePro
import typingsSlinky.fundamentalReact.fundamentalReactStrings.Table
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/Table/Table", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialTableProps] = js.native
  var displayName: js.UndefOr[String | Table] = js.native
  var propTypes: js.UndefOr[WeakValidationMapTablePro] = js.native
  def apply(props: PropsWithChildren[TableProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[TableProps], context: js.Any): ReactElement | Null = js.native
}

