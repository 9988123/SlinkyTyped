package typingsSlinky.jweixin.mod

import typingsSlinky.jweixin.anon.NetworkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgetNetworkType extends BaseParams {
  @JSName("success")
  def success_MIgetNetworkType(res: NetworkType): Unit = js.native
}

object IgetNetworkType {
  @scala.inline
  def apply(success: NetworkType => Unit): IgetNetworkType = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[IgetNetworkType]
  }
  @scala.inline
  implicit class IgetNetworkTypeOps[Self <: IgetNetworkType] (val x: Self) extends AnyVal {
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
    def setSuccess(value: NetworkType => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
  
}

