package typingsSlinky.prosemirrorTables.mod

import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorState.mod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "addColumn")
@js.native
object addColumn extends js.Object {
  def apply[S /* <: Schema[_, _] */](transaction: Transaction[S], rect: TableRect, row: Double): Transaction[S] = js.native
}

