package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pod affinity is a group of inter pod affinity scheduling rules.
  */
@js.native
trait PodAffinity extends js.Object {
  /**
    * The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
    */
  var preferredDuringSchedulingIgnoredDuringExecution: js.Array[WeightedPodAffinityTerm] = js.native
  /**
    * If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.
    */
  var requiredDuringSchedulingIgnoredDuringExecution: js.Array[PodAffinityTerm] = js.native
}

object PodAffinity {
  @scala.inline
  def apply(
    preferredDuringSchedulingIgnoredDuringExecution: js.Array[WeightedPodAffinityTerm],
    requiredDuringSchedulingIgnoredDuringExecution: js.Array[PodAffinityTerm]
  ): PodAffinity = {
    val __obj = js.Dynamic.literal(preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution.asInstanceOf[js.Any], requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodAffinity]
  }
  @scala.inline
  implicit class PodAffinityOps[Self <: PodAffinity] (val x: Self) extends AnyVal {
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
    def setPreferredDuringSchedulingIgnoredDuringExecutionVarargs(value: WeightedPodAffinityTerm*): Self = this.set("preferredDuringSchedulingIgnoredDuringExecution", js.Array(value :_*))
    @scala.inline
    def setPreferredDuringSchedulingIgnoredDuringExecution(value: js.Array[WeightedPodAffinityTerm]): Self = this.set("preferredDuringSchedulingIgnoredDuringExecution", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequiredDuringSchedulingIgnoredDuringExecutionVarargs(value: PodAffinityTerm*): Self = this.set("requiredDuringSchedulingIgnoredDuringExecution", js.Array(value :_*))
    @scala.inline
    def setRequiredDuringSchedulingIgnoredDuringExecution(value: js.Array[PodAffinityTerm]): Self = this.set("requiredDuringSchedulingIgnoredDuringExecution", value.asInstanceOf[js.Any])
  }
  
}

