package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmiCopyEphemeralBlockDevice extends js.Object {
  /**
    * The path at which the device is exposed to created instances.
    */
  var deviceName: String = js.native
  /**
    * A name for the ephemeral device, of the form "ephemeralN" where
    * *N* is a volume number starting from zero.
    */
  var virtualName: String = js.native
}

object AmiCopyEphemeralBlockDevice {
  @scala.inline
  def apply(deviceName: String, virtualName: String): AmiCopyEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmiCopyEphemeralBlockDevice]
  }
  @scala.inline
  implicit class AmiCopyEphemeralBlockDeviceOps[Self <: AmiCopyEphemeralBlockDevice] (val x: Self) extends AnyVal {
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
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualName(value: String): Self = this.set("virtualName", value.asInstanceOf[js.Any])
  }
  
}

