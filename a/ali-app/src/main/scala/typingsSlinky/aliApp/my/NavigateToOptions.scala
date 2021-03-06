package typingsSlinky.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region 导航栏 https://docs.alipay.com/mini/api/ui-navigate
@js.native
trait NavigateToOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 需要跳转的应用内页面的路径 */
  var url: String = js.native
}

object NavigateToOptions {
  @scala.inline
  def apply(url: String): NavigateToOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToOptions]
  }
  @scala.inline
  implicit class NavigateToOptionsOps[Self <: NavigateToOptions] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

