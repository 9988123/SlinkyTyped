package typingsSlinky.datatablesNet.DataTables

import typingsSlinky.datatablesNet.datatablesNetStrings.`type`
import typingsSlinky.datatablesNet.datatablesNetStrings.display
import typingsSlinky.datatablesNet.datatablesNetStrings.filter
import typingsSlinky.datatablesNet.datatablesNetStrings.set
import typingsSlinky.datatablesNet.datatablesNetStrings.sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionColumnData extends js.Object {
  def apply(row: js.Any, t: `type`, s: js.UndefOr[scala.Nothing], meta: CellMetaSettings): js.Any = js.native
  def apply(row: js.Any, t: display, s: js.UndefOr[scala.Nothing], meta: CellMetaSettings): js.Any = js.native
  def apply(row: js.Any, t: filter, s: js.UndefOr[scala.Nothing], meta: CellMetaSettings): js.Any = js.native
  def apply(row: js.Any, t: set, s: js.Any, meta: CellMetaSettings): Unit = js.native
  def apply(row: js.Any, t: sort, s: js.UndefOr[scala.Nothing], meta: CellMetaSettings): js.Any = js.native
}

