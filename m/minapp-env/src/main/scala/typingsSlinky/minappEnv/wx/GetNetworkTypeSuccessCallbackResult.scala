package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.minappEnvStrings.`2g`
import typingsSlinky.minappEnv.minappEnvStrings.`3g`
import typingsSlinky.minappEnv.minappEnvStrings.`4g`
import typingsSlinky.minappEnv.minappEnvStrings.none
import typingsSlinky.minappEnv.minappEnvStrings.unknown
import typingsSlinky.minappEnv.minappEnvStrings.wifi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNetworkTypeSuccessCallbackResult extends js.Object {
  /** 网络类型
    *
    * 可选值：
    * - 'wifi': wifi 网络;
    * - '2g': 2g 网络;
    * - '3g': 3g 网络;
    * - '4g': 4g 网络;
    * - 'unknown': Android 下不常见的网络类型;
    * - 'none': 无网络; */
  var networkType: wifi | `2g` | `3g` | `4g` | unknown | none = js.native
}

object GetNetworkTypeSuccessCallbackResult {
  @scala.inline
  def apply(networkType: wifi | `2g` | `3g` | `4g` | unknown | none): GetNetworkTypeSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkTypeSuccessCallbackResult]
  }
  @scala.inline
  implicit class GetNetworkTypeSuccessCallbackResultOps[Self <: GetNetworkTypeSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setNetworkType(value: wifi | `2g` | `3g` | `4g` | unknown | none): Self = this.set("networkType", value.asInstanceOf[js.Any])
  }
  
}

