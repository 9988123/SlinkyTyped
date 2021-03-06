package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyFpgaImageResult extends js.Object {
  /**
    * The ID of the new AFI.
    */
  var FpgaImageId: js.UndefOr[String] = js.native
}

object CopyFpgaImageResult {
  @scala.inline
  def apply(): CopyFpgaImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyFpgaImageResult]
  }
  @scala.inline
  implicit class CopyFpgaImageResultOps[Self <: CopyFpgaImageResult] (val x: Self) extends AnyVal {
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
    def setFpgaImageId(value: String): Self = this.set("FpgaImageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFpgaImageId: Self = this.set("FpgaImageId", js.undefined)
  }
  
}

