package typingsSlinky.jestCore.updateGlobalConfigMod

import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.jestWatcher.typesMod.AllowedConfigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/lib/update_global_config", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(globalConfig: GlobalConfig): GlobalConfig = js.native
  def apply(globalConfig: GlobalConfig, options: AllowedConfigOptions with ExtraConfigOptions): GlobalConfig = js.native
}

