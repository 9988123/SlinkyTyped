package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlternativeSecurityId extends js.Object {
  // For internal use only
  var identityProvider: js.UndefOr[String] = js.native
  // For internal use only
  var key: js.UndefOr[Double] = js.native
  // For internal use only
  var `type`: js.UndefOr[Double] = js.native
}

object AlternativeSecurityId {
  @scala.inline
  def apply(): AlternativeSecurityId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlternativeSecurityId]
  }
  @scala.inline
  implicit class AlternativeSecurityIdOps[Self <: AlternativeSecurityId] (val x: Self) extends AnyVal {
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
    def setIdentityProvider(value: String): Self = this.set("identityProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityProvider: Self = this.set("identityProvider", js.undefined)
    @scala.inline
    def setKey(value: Double): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

