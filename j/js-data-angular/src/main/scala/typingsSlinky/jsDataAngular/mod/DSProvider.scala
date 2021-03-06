package typingsSlinky.jsDataAngular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DSProvider extends js.Object {
  var defaults: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DSConfiguration */ js.Any = js.native
}

object DSProvider {
  @scala.inline
  def apply(
    defaults: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DSConfiguration */ js.Any
  ): DSProvider = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSProvider]
  }
  @scala.inline
  implicit class DSProviderOps[Self <: DSProvider] (val x: Self) extends AnyVal {
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
    def setDefaults(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DSConfiguration */ js.Any
    ): Self = this.set("defaults", value.asInstanceOf[js.Any])
  }
  
}

