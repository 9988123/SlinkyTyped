package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentJobHistoryResult extends ResultStatus {
  var alerts: js.Array[AgentAlertInfo] = js.native
  var histories: js.Array[AgentJobHistoryInfo] = js.native
  var schedules: js.Array[AgentJobScheduleInfo] = js.native
  var steps: js.Array[AgentJobStepInfo] = js.native
}

object AgentJobHistoryResult {
  @scala.inline
  def apply(
    alerts: js.Array[AgentAlertInfo],
    errorMessage: String,
    histories: js.Array[AgentJobHistoryInfo],
    schedules: js.Array[AgentJobScheduleInfo],
    steps: js.Array[AgentJobStepInfo],
    success: Boolean
  ): AgentJobHistoryResult = {
    val __obj = js.Dynamic.literal(alerts = alerts.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], histories = histories.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobHistoryResult]
  }
  @scala.inline
  implicit class AgentJobHistoryResultOps[Self <: AgentJobHistoryResult] (val x: Self) extends AnyVal {
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
    def setAlertsVarargs(value: AgentAlertInfo*): Self = this.set("alerts", js.Array(value :_*))
    @scala.inline
    def setAlerts(value: js.Array[AgentAlertInfo]): Self = this.set("alerts", value.asInstanceOf[js.Any])
    @scala.inline
    def setHistoriesVarargs(value: AgentJobHistoryInfo*): Self = this.set("histories", js.Array(value :_*))
    @scala.inline
    def setHistories(value: js.Array[AgentJobHistoryInfo]): Self = this.set("histories", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchedulesVarargs(value: AgentJobScheduleInfo*): Self = this.set("schedules", js.Array(value :_*))
    @scala.inline
    def setSchedules(value: js.Array[AgentJobScheduleInfo]): Self = this.set("schedules", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepsVarargs(value: AgentJobStepInfo*): Self = this.set("steps", js.Array(value :_*))
    @scala.inline
    def setSteps(value: js.Array[AgentJobStepInfo]): Self = this.set("steps", value.asInstanceOf[js.Any])
  }
  
}

