package typingsSlinky.intercomClient.tagMod

import typingsSlinky.intercomClient.userMod.UserIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagUsers extends TagOper {
  var name: String = js.native
  var users: js.Array[UserIdentifier] = js.native
}

object TagUsers {
  @scala.inline
  def apply(name: String, users: js.Array[UserIdentifier]): TagUsers = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagUsers]
  }
  @scala.inline
  implicit class TagUsersOps[Self <: TagUsers] (val x: Self) extends AnyVal {
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
    def setUsersVarargs(value: UserIdentifier*): Self = this.set("users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: js.Array[UserIdentifier]): Self = this.set("users", value.asInstanceOf[js.Any])
  }
  
}

