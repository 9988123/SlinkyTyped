package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDiskResult extends js.Object {
  /**
    * An object containing information about the disk.
    */
  var disk: js.UndefOr[Disk] = js.native
}

object GetDiskResult {
  @scala.inline
  def apply(): GetDiskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDiskResult]
  }
  @scala.inline
  implicit class GetDiskResultOps[Self <: GetDiskResult] (val x: Self) extends AnyVal {
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
    def setDisk(value: Disk): Self = this.set("disk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisk: Self = this.set("disk", js.undefined)
  }
  
}

