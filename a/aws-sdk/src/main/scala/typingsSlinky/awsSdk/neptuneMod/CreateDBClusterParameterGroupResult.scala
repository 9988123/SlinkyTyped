package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBClusterParameterGroupResult extends js.Object {
  var DBClusterParameterGroup: js.UndefOr[typingsSlinky.awsSdk.neptuneMod.DBClusterParameterGroup] = js.native
}

object CreateDBClusterParameterGroupResult {
  @scala.inline
  def apply(): CreateDBClusterParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBClusterParameterGroupResult]
  }
  @scala.inline
  implicit class CreateDBClusterParameterGroupResultOps[Self <: CreateDBClusterParameterGroupResult] (val x: Self) extends AnyVal {
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
    def setDBClusterParameterGroup(value: DBClusterParameterGroup): Self = this.set("DBClusterParameterGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBClusterParameterGroup: Self = this.set("DBClusterParameterGroup", js.undefined)
  }
  
}

