package typingsSlinky.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatedBefore extends js.Object {
  var age: js.UndefOr[Double] = js.native
  var createdBefore: js.UndefOr[String] = js.native
  var isLive: js.UndefOr[Boolean] = js.native
  var numNewerVersions: js.UndefOr[Double] = js.native
}

object CreatedBefore {
  @scala.inline
  def apply(): CreatedBefore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatedBefore]
  }
  @scala.inline
  implicit class CreatedBeforeOps[Self <: CreatedBefore] (val x: Self) extends AnyVal {
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
    def setAge(value: Double): Self = this.set("age", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAge: Self = this.set("age", js.undefined)
    @scala.inline
    def setCreatedBefore(value: String): Self = this.set("createdBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedBefore: Self = this.set("createdBefore", js.undefined)
    @scala.inline
    def setIsLive(value: Boolean): Self = this.set("isLive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLive: Self = this.set("isLive", js.undefined)
    @scala.inline
    def setNumNewerVersions(value: Double): Self = this.set("numNewerVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumNewerVersions: Self = this.set("numNewerVersions", js.undefined)
  }
  
}

