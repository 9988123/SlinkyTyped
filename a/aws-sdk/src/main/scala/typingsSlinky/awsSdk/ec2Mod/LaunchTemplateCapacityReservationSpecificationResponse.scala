package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateCapacityReservationSpecificationResponse extends js.Object {
  /**
    * Indicates the instance's Capacity Reservation preferences. Possible preferences include:    open - The instance can run in any open Capacity Reservation that has matching attributes (instance type, platform, Availability Zone).    none - The instance avoids running in a Capacity Reservation even if one is available. The instance runs in On-Demand capacity.  
    */
  var CapacityReservationPreference: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.CapacityReservationPreference] = js.native
  /**
    * Information about the target Capacity Reservation or Capacity Reservation group.
    */
  var CapacityReservationTarget: js.UndefOr[CapacityReservationTargetResponse] = js.native
}

object LaunchTemplateCapacityReservationSpecificationResponse {
  @scala.inline
  def apply(): LaunchTemplateCapacityReservationSpecificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateCapacityReservationSpecificationResponse]
  }
  @scala.inline
  implicit class LaunchTemplateCapacityReservationSpecificationResponseOps[Self <: LaunchTemplateCapacityReservationSpecificationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCapacityReservationPreference(value: CapacityReservationPreference): Self = this.set("CapacityReservationPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacityReservationPreference: Self = this.set("CapacityReservationPreference", js.undefined)
    @scala.inline
    def setCapacityReservationTarget(value: CapacityReservationTargetResponse): Self = this.set("CapacityReservationTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacityReservationTarget: Self = this.set("CapacityReservationTarget", js.undefined)
  }
  
}

