package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeBooleanValue extends js.Object {
  /**
    * The attribute value. The valid values are true or false.
    */
  var Value: js.UndefOr[Boolean] = js.native
}

object AttributeBooleanValue {
  @scala.inline
  def apply(): AttributeBooleanValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeBooleanValue]
  }
  @scala.inline
  implicit class AttributeBooleanValueOps[Self <: AttributeBooleanValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValue(value: Boolean): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

