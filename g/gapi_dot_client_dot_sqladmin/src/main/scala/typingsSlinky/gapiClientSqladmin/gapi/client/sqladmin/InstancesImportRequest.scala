package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancesImportRequest extends js.Object {
  /** Contains details about the import operation. */
  var importContext: js.UndefOr[ImportContext] = js.native
}

object InstancesImportRequest {
  @scala.inline
  def apply(): InstancesImportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesImportRequest]
  }
  @scala.inline
  implicit class InstancesImportRequestOps[Self <: InstancesImportRequest] (val x: Self) extends AnyVal {
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
    def setImportContext(value: ImportContext): Self = this.set("importContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportContext: Self = this.set("importContext", js.undefined)
  }
  
}

