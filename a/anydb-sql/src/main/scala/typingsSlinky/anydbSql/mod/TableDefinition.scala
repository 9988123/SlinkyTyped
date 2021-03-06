package typingsSlinky.anydbSql.mod

import typingsSlinky.anydbSql.anon.From
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDefinition extends js.Object {
  var columns: Dictionary[ColumnDefinition]
  var has: js.UndefOr[Dictionary[From]] = js.undefined
  var name: String
}

object TableDefinition {
  @scala.inline
  def apply(columns: Dictionary[ColumnDefinition], name: String, has: Dictionary[From] = null): TableDefinition = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (has != null) __obj.updateDynamic("has")(has.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDefinition]
  }
}

