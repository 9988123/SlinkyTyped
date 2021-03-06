package typingsSlinky.pulumiKubernetes.inputMod.storage.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CSINodeSpec holds information about the specification of all CSI drivers installed on a node
  */
@js.native
trait CSINodeSpec extends js.Object {
  /**
    * drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this can become empty.
    */
  var drivers: Input[js.Array[Input[CSINodeDriver]]] = js.native
}

object CSINodeSpec {
  @scala.inline
  def apply(drivers: Input[js.Array[Input[CSINodeDriver]]]): CSINodeSpec = {
    val __obj = js.Dynamic.literal(drivers = drivers.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSINodeSpec]
  }
  @scala.inline
  implicit class CSINodeSpecOps[Self <: CSINodeSpec] (val x: Self) extends AnyVal {
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
    def setDriversVarargs(value: Input[CSINodeDriver]*): Self = this.set("drivers", js.Array(value :_*))
    @scala.inline
    def setDrivers(value: Input[js.Array[Input[CSINodeDriver]]]): Self = this.set("drivers", value.asInstanceOf[js.Any])
  }
  
}

