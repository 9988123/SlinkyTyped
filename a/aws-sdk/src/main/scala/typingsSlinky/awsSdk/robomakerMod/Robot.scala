package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Robot extends js.Object {
  /**
    * The architecture of the robot.
    */
  var architecture: js.UndefOr[Architecture] = js.native
  /**
    * The Amazon Resource Name (ARN) of the robot.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The time, in milliseconds since the epoch, when the robot was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleetArn: js.UndefOr[Arn] = js.native
  /**
    * The Greengrass group associated with the robot.
    */
  var greenGrassGroupId: js.UndefOr[Id] = js.native
  /**
    * The Amazon Resource Name (ARN) of the last deployment job.
    */
  var lastDeploymentJob: js.UndefOr[Arn] = js.native
  /**
    * The time of the last deployment.
    */
  var lastDeploymentTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the robot.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The status of the robot.
    */
  var status: js.UndefOr[RobotStatus] = js.native
}

object Robot {
  @scala.inline
  def apply(): Robot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Robot]
  }
  @scala.inline
  implicit class RobotOps[Self <: Robot] (val x: Self) extends AnyVal {
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
    def setArchitecture(value: Architecture): Self = this.set("architecture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchitecture: Self = this.set("architecture", js.undefined)
    @scala.inline
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setCreatedAt(value: js.Date): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setFleetArn(value: Arn): Self = this.set("fleetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFleetArn: Self = this.set("fleetArn", js.undefined)
    @scala.inline
    def setGreenGrassGroupId(value: Id): Self = this.set("greenGrassGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGreenGrassGroupId: Self = this.set("greenGrassGroupId", js.undefined)
    @scala.inline
    def setLastDeploymentJob(value: Arn): Self = this.set("lastDeploymentJob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastDeploymentJob: Self = this.set("lastDeploymentJob", js.undefined)
    @scala.inline
    def setLastDeploymentTime(value: js.Date): Self = this.set("lastDeploymentTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastDeploymentTime: Self = this.set("lastDeploymentTime", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStatus(value: RobotStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

