package typingsSlinky.awsSdkClientS3Node.typesRequestProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestProgress extends js.Object {
  /**
    * <p>Specifies whether periodic QueryProgress frames should be sent. Valid values: TRUE, FALSE. Default value: FALSE.</p>
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}

object RequestProgress {
  @scala.inline
  def apply(): RequestProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestProgress]
  }
  @scala.inline
  implicit class RequestProgressOps[Self <: RequestProgress] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
  }
  
}

