package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddUserOptions extends CommonOptions {
  var customData: js.UndefOr[js.Object] = js.native
  var fsync: Boolean = js.native
  var roles: js.UndefOr[js.Array[js.Object]] = js.native
}

object AddUserOptions {
  @scala.inline
  def apply(fsync: Boolean): AddUserOptions = {
    val __obj = js.Dynamic.literal(fsync = fsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddUserOptions]
  }
  @scala.inline
  implicit class AddUserOptionsOps[Self <: AddUserOptions] (val x: Self) extends AnyVal {
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
    def setFsync(value: Boolean): Self = this.set("fsync", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomData(value: js.Object): Self = this.set("customData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomData: Self = this.set("customData", js.undefined)
    @scala.inline
    def setRolesVarargs(value: js.Object*): Self = this.set("roles", js.Array(value :_*))
    @scala.inline
    def setRoles(value: js.Array[js.Object]): Self = this.set("roles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoles: Self = this.set("roles", js.undefined)
  }
  
}

