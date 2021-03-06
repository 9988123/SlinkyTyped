package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterPatchBaselineForPatchGroupResult extends js.Object {
  /**
    * The ID of the patch baseline the patch group was deregistered from.
    */
  var BaselineId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.BaselineId] = js.native
  /**
    * The name of the patch group deregistered from the patch baseline.
    */
  var PatchGroup: js.UndefOr[typingsSlinky.awsSdk.ssmMod.PatchGroup] = js.native
}

object DeregisterPatchBaselineForPatchGroupResult {
  @scala.inline
  def apply(): DeregisterPatchBaselineForPatchGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterPatchBaselineForPatchGroupResult]
  }
  @scala.inline
  implicit class DeregisterPatchBaselineForPatchGroupResultOps[Self <: DeregisterPatchBaselineForPatchGroupResult] (val x: Self) extends AnyVal {
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
    def setBaselineId(value: BaselineId): Self = this.set("BaselineId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaselineId: Self = this.set("BaselineId", js.undefined)
    @scala.inline
    def setPatchGroup(value: PatchGroup): Self = this.set("PatchGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatchGroup: Self = this.set("PatchGroup", js.undefined)
  }
  
}

