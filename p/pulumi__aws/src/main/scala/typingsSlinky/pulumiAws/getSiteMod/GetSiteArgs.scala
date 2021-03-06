package typingsSlinky.pulumiAws.getSiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSiteArgs extends js.Object {
  /**
    * Identifier of the Site.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * Name of the Site.
    */
  val name: js.UndefOr[String] = js.native
}

object GetSiteArgs {
  @scala.inline
  def apply(): GetSiteArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSiteArgs]
  }
  @scala.inline
  implicit class GetSiteArgsOps[Self <: GetSiteArgs] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

