package typingsSlinky.jestJasmine2.setupJestGlobalsMod

import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.jestTypes.configMod.ProjectConfig
import typingsSlinky.prettyFormat.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetupOptions extends js.Object {
  var config: ProjectConfig
  var globalConfig: GlobalConfig
  var testPath: Path
  def localRequire(moduleName: String): Plugin
}

object SetupOptions {
  @scala.inline
  def apply(config: ProjectConfig, globalConfig: GlobalConfig, localRequire: String => Plugin, testPath: Path): SetupOptions = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], globalConfig = globalConfig.asInstanceOf[js.Any], localRequire = js.Any.fromFunction1(localRequire), testPath = testPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetupOptions]
  }
}

