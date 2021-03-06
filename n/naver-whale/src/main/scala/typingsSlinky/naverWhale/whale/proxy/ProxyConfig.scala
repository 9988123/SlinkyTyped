package typingsSlinky.naverWhale.whale.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyConfig extends js.Object {
  /**
    * 'direct' = Never use a proxy
    * 'auto_detect' = Auto detect proxy settings
    * 'pac_script' = Use specified PAC script
    * 'fixed_servers' = Manually specify proxy servers
    * 'system' = Use system proxy settings
    */
  var mode: String = js.native
  /** Optional. The proxy auto-config (PAC) script for this configuration. Use this for 'pac_script' mode. */
  var pacScript: js.UndefOr[typingsSlinky.chrome.chrome.proxy.PacScript] = js.native
  /** Optional. The proxy rules describing this configuration. Use this for 'fixed_servers' mode. */
  var rules: js.UndefOr[typingsSlinky.chrome.chrome.proxy.ProxyRules] = js.native
}

object ProxyConfig {
  @scala.inline
  def apply(mode: String): ProxyConfig = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyConfig]
  }
  @scala.inline
  implicit class ProxyConfigOps[Self <: ProxyConfig] (val x: Self) extends AnyVal {
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
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setPacScript(value: typingsSlinky.chrome.chrome.proxy.PacScript): Self = this.set("pacScript", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePacScript: Self = this.set("pacScript", js.undefined)
    @scala.inline
    def setRules(value: typingsSlinky.chrome.chrome.proxy.ProxyRules): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
  
}

