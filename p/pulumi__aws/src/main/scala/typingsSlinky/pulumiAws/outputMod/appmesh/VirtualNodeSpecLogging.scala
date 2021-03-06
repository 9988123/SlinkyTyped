package typingsSlinky.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeSpecLogging extends js.Object {
  /**
    * The access log configuration for a virtual node.
    */
  var accessLog: js.UndefOr[VirtualNodeSpecLoggingAccessLog] = js.native
}

object VirtualNodeSpecLogging {
  @scala.inline
  def apply(): VirtualNodeSpecLogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecLogging]
  }
  @scala.inline
  implicit class VirtualNodeSpecLoggingOps[Self <: VirtualNodeSpecLogging] (val x: Self) extends AnyVal {
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
    def setAccessLog(value: VirtualNodeSpecLoggingAccessLog): Self = this.set("accessLog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessLog: Self = this.set("accessLog", js.undefined)
  }
  
}

