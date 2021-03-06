package typingsSlinky.halogenium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeLoaderProps extends HalogenCommonProps {
  var size: js.UndefOr[Double | String] = js.native
}

object SizeLoaderProps {
  @scala.inline
  def apply(): SizeLoaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeLoaderProps]
  }
  @scala.inline
  implicit class SizeLoaderPropsOps[Self <: SizeLoaderProps] (val x: Self) extends AnyVal {
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
    def setSize(value: Double | String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

