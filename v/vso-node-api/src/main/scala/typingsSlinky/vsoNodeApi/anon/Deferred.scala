package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deferred extends js.Object {
  var all: scala.Double = js.native
  var approved: scala.Double = js.native
  var canceled: scala.Double = js.native
  var cancelling: scala.Double = js.native
  var deferred: scala.Double = js.native
  var evaluatingGates: scala.Double = js.native
  var gateFailed: scala.Double = js.native
  var manualInterventionPending: scala.Double = js.native
  var pending: scala.Double = js.native
  var phaseCanceled: scala.Double = js.native
  var phaseFailed: scala.Double = js.native
  var phaseInProgress: scala.Double = js.native
  var phasePartiallySucceeded: scala.Double = js.native
  var phaseSucceeded: scala.Double = js.native
  var queued: scala.Double = js.native
  var queuedForAgent: scala.Double = js.native
  var queuedForPipeline: scala.Double = js.native
  var rejected: scala.Double = js.native
  var scheduled: scala.Double = js.native
  var undefined: scala.Double = js.native
}

object Deferred {
  @scala.inline
  def apply(
    all: scala.Double,
    approved: scala.Double,
    canceled: scala.Double,
    cancelling: scala.Double,
    deferred: scala.Double,
    evaluatingGates: scala.Double,
    gateFailed: scala.Double,
    manualInterventionPending: scala.Double,
    pending: scala.Double,
    phaseCanceled: scala.Double,
    phaseFailed: scala.Double,
    phaseInProgress: scala.Double,
    phasePartiallySucceeded: scala.Double,
    phaseSucceeded: scala.Double,
    queued: scala.Double,
    queuedForAgent: scala.Double,
    queuedForPipeline: scala.Double,
    rejected: scala.Double,
    scheduled: scala.Double,
    undefined: scala.Double
  ): Deferred = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], approved = approved.asInstanceOf[js.Any], canceled = canceled.asInstanceOf[js.Any], cancelling = cancelling.asInstanceOf[js.Any], deferred = deferred.asInstanceOf[js.Any], evaluatingGates = evaluatingGates.asInstanceOf[js.Any], gateFailed = gateFailed.asInstanceOf[js.Any], manualInterventionPending = manualInterventionPending.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], phaseCanceled = phaseCanceled.asInstanceOf[js.Any], phaseFailed = phaseFailed.asInstanceOf[js.Any], phaseInProgress = phaseInProgress.asInstanceOf[js.Any], phasePartiallySucceeded = phasePartiallySucceeded.asInstanceOf[js.Any], phaseSucceeded = phaseSucceeded.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], queuedForAgent = queuedForAgent.asInstanceOf[js.Any], queuedForPipeline = queuedForPipeline.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], scheduled = scheduled.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deferred]
  }
  @scala.inline
  implicit class DeferredOps[Self <: Deferred] (val x: Self) extends AnyVal {
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
    def setAll(value: scala.Double): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def setApproved(value: scala.Double): Self = this.set("approved", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanceled(value: scala.Double): Self = this.set("canceled", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelling(value: scala.Double): Self = this.set("cancelling", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeferred(value: scala.Double): Self = this.set("deferred", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvaluatingGates(value: scala.Double): Self = this.set("evaluatingGates", value.asInstanceOf[js.Any])
    @scala.inline
    def setGateFailed(value: scala.Double): Self = this.set("gateFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def setManualInterventionPending(value: scala.Double): Self = this.set("manualInterventionPending", value.asInstanceOf[js.Any])
    @scala.inline
    def setPending(value: scala.Double): Self = this.set("pending", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhaseCanceled(value: scala.Double): Self = this.set("phaseCanceled", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhaseFailed(value: scala.Double): Self = this.set("phaseFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhaseInProgress(value: scala.Double): Self = this.set("phaseInProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhasePartiallySucceeded(value: scala.Double): Self = this.set("phasePartiallySucceeded", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhaseSucceeded(value: scala.Double): Self = this.set("phaseSucceeded", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueued(value: scala.Double): Self = this.set("queued", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueuedForAgent(value: scala.Double): Self = this.set("queuedForAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueuedForPipeline(value: scala.Double): Self = this.set("queuedForPipeline", value.asInstanceOf[js.Any])
    @scala.inline
    def setRejected(value: scala.Double): Self = this.set("rejected", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheduled(value: scala.Double): Self = this.set("scheduled", value.asInstanceOf[js.Any])
    @scala.inline
    def setUndefined(value: scala.Double): Self = this.set("undefined", value.asInstanceOf[js.Any])
  }
  
}

