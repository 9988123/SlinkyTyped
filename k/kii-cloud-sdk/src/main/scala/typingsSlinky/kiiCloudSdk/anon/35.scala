package typingsSlinky.kiiCloudSdk.anon

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiThingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `35` extends js.Object {
  def failure(error: js.Error): js.Any = js.native
  def success(thingContext: KiiThingContext): js.Any = js.native
}

object `35` {
  @scala.inline
  def apply(failure: js.Error => js.Any, success: KiiThingContext => js.Any): `35` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`35`]
  }
  @scala.inline
  implicit class `35Ops`[Self <: `35`] (val x: Self) extends AnyVal {
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
    def setFailure(value: js.Error => js.Any): Self = this.set("failure", js.Any.fromFunction1(value))
    @scala.inline
    def setSuccess(value: KiiThingContext => js.Any): Self = this.set("success", js.Any.fromFunction1(value))
  }
  
}

