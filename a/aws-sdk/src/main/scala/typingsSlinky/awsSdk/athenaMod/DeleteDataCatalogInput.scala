package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDataCatalogInput extends js.Object {
  /**
    * The name of the data catalog to delete.
    */
  var Name: CatalogNameString = js.native
}

object DeleteDataCatalogInput {
  @scala.inline
  def apply(Name: CatalogNameString): DeleteDataCatalogInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDataCatalogInput]
  }
  @scala.inline
  implicit class DeleteDataCatalogInputOps[Self <: DeleteDataCatalogInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: CatalogNameString): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

