package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationSettings extends js.Object {
  /**
    * Enables or disables persistent application settings for users during their streaming sessions. 
    */
  var Enabled: Boolean = js.native
  /**
    * The path prefix for the S3 bucket where users’ persistent application settings are stored. You can allow the same persistent application settings to be used across multiple stacks by specifying the same settings group for each stack. 
    */
  var SettingsGroup: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.SettingsGroup] = js.native
}

object ApplicationSettings {
  @scala.inline
  def apply(Enabled: Boolean): ApplicationSettings = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSettings]
  }
  @scala.inline
  implicit class ApplicationSettingsOps[Self <: ApplicationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettingsGroup(value: SettingsGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingsGroup")(js.undefined)
        ret
    }
  }
  
}

