package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** QueryRelationsEntity. */
@js.native
trait QueryRelationsEntity extends js.Object {
  /** If false, implicit querying is performed. The default is `false`. */
  var exact: js.UndefOr[Boolean] = js.native
  /** Entity text content. */
  var text: js.UndefOr[String] = js.native
  /** The type of the specified entity. */
  var `type`: js.UndefOr[String] = js.native
}

object QueryRelationsEntity {
  @scala.inline
  def apply(): QueryRelationsEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRelationsEntity]
  }
  @scala.inline
  implicit class QueryRelationsEntityOps[Self <: QueryRelationsEntity] (val x: Self) extends AnyVal {
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
    def setExact(value: Boolean): Self = this.set("exact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExact: Self = this.set("exact", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

