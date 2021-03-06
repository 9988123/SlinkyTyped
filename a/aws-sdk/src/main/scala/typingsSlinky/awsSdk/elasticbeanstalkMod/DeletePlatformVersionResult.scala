package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePlatformVersionResult extends js.Object {
  /**
    * Detailed information about the version of the custom platform.
    */
  var PlatformSummary: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformSummary] = js.native
}

object DeletePlatformVersionResult {
  @scala.inline
  def apply(): DeletePlatformVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletePlatformVersionResult]
  }
  @scala.inline
  implicit class DeletePlatformVersionResultOps[Self <: DeletePlatformVersionResult] (val x: Self) extends AnyVal {
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
    def setPlatformSummary(value: PlatformSummary): Self = this.set("PlatformSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformSummary: Self = this.set("PlatformSummary", js.undefined)
  }
  
}

