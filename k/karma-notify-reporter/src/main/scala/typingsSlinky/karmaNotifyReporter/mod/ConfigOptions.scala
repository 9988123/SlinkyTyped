package typingsSlinky.karmaNotifyReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigOptions extends js.Object {
  /**
    * Report test results using OSX Notification Center, Growl or notify-send.
    * {@link https://github.com/jdcataldo/karma-notify-reporter#karma-notify-reporter}
    */
  var notifyReporter: js.UndefOr[NotifyReporterOptions] = js.native
}

object ConfigOptions {
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
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
    def setNotifyReporter(value: NotifyReporterOptions): Self = this.set("notifyReporter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotifyReporter: Self = this.set("notifyReporter", js.undefined)
  }
  
}

