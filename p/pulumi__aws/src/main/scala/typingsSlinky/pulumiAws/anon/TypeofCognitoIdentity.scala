package typingsSlinky.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofCognitoIdentity extends js.Object {
  val Types: this.type = js.native
}

object TypeofCognitoIdentity {
  @scala.inline
  def apply(Types: TypeofCognitoIdentity): TypeofCognitoIdentity = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCognitoIdentity]
  }
  @scala.inline
  implicit class TypeofCognitoIdentityOps[Self <: TypeofCognitoIdentity] (val x: Self) extends AnyVal {
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
    def setTypes(value: TypeofCognitoIdentity): Self = this.set("Types", value.asInstanceOf[js.Any])
  }
  
}

