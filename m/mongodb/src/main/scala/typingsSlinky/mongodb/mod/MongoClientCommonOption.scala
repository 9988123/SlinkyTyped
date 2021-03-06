package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoClientCommonOption extends js.Object {
  /** Do not make the db an event listener to the original connection. */
  var noListener: js.UndefOr[Boolean] = js.native
  /** Control if you want to return a cached instance or have a new one created */
  var returnNonCachedInstance: js.UndefOr[Boolean] = js.native
}

object MongoClientCommonOption {
  @scala.inline
  def apply(): MongoClientCommonOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoClientCommonOption]
  }
  @scala.inline
  implicit class MongoClientCommonOptionOps[Self <: MongoClientCommonOption] (val x: Self) extends AnyVal {
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
    def setNoListener(value: Boolean): Self = this.set("noListener", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoListener: Self = this.set("noListener", js.undefined)
    @scala.inline
    def setReturnNonCachedInstance(value: Boolean): Self = this.set("returnNonCachedInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnNonCachedInstance: Self = this.set("returnNonCachedInstance", js.undefined)
  }
  
}

