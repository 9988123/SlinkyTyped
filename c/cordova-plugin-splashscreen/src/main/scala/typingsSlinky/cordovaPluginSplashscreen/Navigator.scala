package typingsSlinky.cordovaPluginSplashscreen

import typingsSlinky.cordovaPluginSplashscreen.anon.Hide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigator extends js.Object {
  /** This plugin displays and hides a splash screen during application launch. */
  var splashscreen: Hide = js.native
}

object Navigator {
  @scala.inline
  def apply(splashscreen: Hide): Navigator = {
    val __obj = js.Dynamic.literal(splashscreen = splashscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  @scala.inline
  implicit class NavigatorOps[Self <: Navigator] (val x: Self) extends AnyVal {
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
    def setSplashscreen(value: Hide): Self = this.set("splashscreen", value.asInstanceOf[js.Any])
  }
  
}

