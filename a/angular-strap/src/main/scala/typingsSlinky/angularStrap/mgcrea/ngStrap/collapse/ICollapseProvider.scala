package typingsSlinky.angularStrap.mgcrea.ngStrap.collapse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICollapseProvider extends js.Object {
  var defaults: ICollapseOptions = js.native
}

object ICollapseProvider {
  @scala.inline
  def apply(defaults: ICollapseOptions): ICollapseProvider = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollapseProvider]
  }
  @scala.inline
  implicit class ICollapseProviderOps[Self <: ICollapseProvider] (val x: Self) extends AnyVal {
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
    def setDefaults(value: ICollapseOptions): Self = this.set("defaults", value.asInstanceOf[js.Any])
  }
  
}

