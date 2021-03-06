package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTimePartitioning extends js.Object {
  /**
    * [Optional] Number of milliseconds for which to keep the storage for
    * partitions in the table. The storage in a partition will have an
    * expiration time of its partition time plus this value.
    */
  var expirationMs: js.UndefOr[String] = js.native
  /**
    * [Beta] [Optional] If not set, the table is partitioned by pseudo column,
    * referenced via either &#39;_PARTITIONTIME&#39; as TIMESTAMP type, or
    * &#39;_PARTITIONDATE&#39; as DATE type. If field is specified, the table
    * is instead partitioned by this field. The field must be a top-level
    * TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.
    */
  var field: js.UndefOr[String] = js.native
  var requirePartitionFilter: js.UndefOr[Boolean] = js.native
  /**
    * [Required] The only type supported is DAY, which will generate one
    * partition per day.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaTimePartitioning {
  @scala.inline
  def apply(): SchemaTimePartitioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimePartitioning]
  }
  @scala.inline
  implicit class SchemaTimePartitioningOps[Self <: SchemaTimePartitioning] (val x: Self) extends AnyVal {
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
    def setExpirationMs(value: String): Self = this.set("expirationMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationMs: Self = this.set("expirationMs", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setRequirePartitionFilter(value: Boolean): Self = this.set("requirePartitionFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequirePartitionFilter: Self = this.set("requirePartitionFilter", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

