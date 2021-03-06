package typingsSlinky.pulumiAws.inputMod.gamelift

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetRuntimeConfigurationServerProcess extends js.Object {
  /**
    * Number of server processes using this configuration to run concurrently on an instance.
    */
  var concurrentExecutions: Input[Double] = js.native
  /**
    * Location of the server executable in a game build. All game builds are installed on instances at the root : for Windows instances `C:\game`, and for Linux instances `/local/game`.
    */
  var launchPath: Input[String] = js.native
  /**
    * Optional list of parameters to pass to the server executable on launch.
    */
  var parameters: js.UndefOr[Input[String]] = js.native
}

object FleetRuntimeConfigurationServerProcess {
  @scala.inline
  def apply(concurrentExecutions: Input[Double], launchPath: Input[String]): FleetRuntimeConfigurationServerProcess = {
    val __obj = js.Dynamic.literal(concurrentExecutions = concurrentExecutions.asInstanceOf[js.Any], launchPath = launchPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetRuntimeConfigurationServerProcess]
  }
  @scala.inline
  implicit class FleetRuntimeConfigurationServerProcessOps[Self <: FleetRuntimeConfigurationServerProcess] (val x: Self) extends AnyVal {
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
    def setConcurrentExecutions(value: Input[Double]): Self = this.set("concurrentExecutions", value.asInstanceOf[js.Any])
    @scala.inline
    def setLaunchPath(value: Input[String]): Self = this.set("launchPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameters(value: Input[String]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
  
}

