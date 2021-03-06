package typingsSlinky.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateChain extends js.Object {
  /** Include the entire certificate chain. */
  var certificateChain: js.UndefOr[Boolean] = js.native
  /** Include raw certificate data for processing by the extension. */
  var rawDER: js.UndefOr[Boolean] = js.native
}

object CertificateChain {
  @scala.inline
  def apply(): CertificateChain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateChain]
  }
  @scala.inline
  implicit class CertificateChainOps[Self <: CertificateChain] (val x: Self) extends AnyVal {
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
    def setCertificateChain(value: Boolean): Self = this.set("certificateChain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateChain: Self = this.set("certificateChain", js.undefined)
    @scala.inline
    def setRawDER(value: Boolean): Self = this.set("rawDER", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawDER: Self = this.set("rawDER", js.undefined)
  }
  
}

