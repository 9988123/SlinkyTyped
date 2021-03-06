package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateCreditSpecification extends js.Object {
  /**
    * The credit option for CPU usage. Can be `"standard"` or `"unlimited"`. T3 instances are launched as unlimited by default. T2 instances are launched as standard by default.
    */
  var cpuCredits: js.UndefOr[String] = js.native
}

object LaunchTemplateCreditSpecification {
  @scala.inline
  def apply(): LaunchTemplateCreditSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateCreditSpecification]
  }
  @scala.inline
  implicit class LaunchTemplateCreditSpecificationOps[Self <: LaunchTemplateCreditSpecification] (val x: Self) extends AnyVal {
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
    def setCpuCredits(value: String): Self = this.set("cpuCredits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpuCredits: Self = this.set("cpuCredits", js.undefined)
  }
  
}

