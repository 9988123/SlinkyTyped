package typingsSlinky.gapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReopenMatterResponse extends js.Object {
  /** The updated matter, with state OPEN. */
  var matter: js.UndefOr[Matter] = js.native
}

object ReopenMatterResponse {
  @scala.inline
  def apply(): ReopenMatterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReopenMatterResponse]
  }
  @scala.inline
  implicit class ReopenMatterResponseOps[Self <: ReopenMatterResponse] (val x: Self) extends AnyVal {
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
    def setMatter(value: Matter): Self = this.set("matter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatter: Self = this.set("matter", js.undefined)
  }
  
}

