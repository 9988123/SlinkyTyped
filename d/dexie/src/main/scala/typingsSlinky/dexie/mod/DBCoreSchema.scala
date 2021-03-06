package typingsSlinky.dexie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBCoreSchema extends js.Object {
  var name: String = js.native
  var tables: js.Array[DBCoreTableSchema] = js.native
}

object DBCoreSchema {
  @scala.inline
  def apply(name: String, tables: js.Array[DBCoreTableSchema]): DBCoreSchema = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreSchema]
  }
  @scala.inline
  implicit class DBCoreSchemaOps[Self <: DBCoreSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTablesVarargs(value: DBCoreTableSchema*): Self = this.set("tables", js.Array(value :_*))
    @scala.inline
    def setTables(value: js.Array[DBCoreTableSchema]): Self = this.set("tables", value.asInstanceOf[js.Any])
  }
  
}

