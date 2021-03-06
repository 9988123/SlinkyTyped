package typingsSlinky.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BehaviorReplaceModel extends js.Object {
  /**
    * Color
    */
  var color: String = js.native
  /**
    * Behavior Name
    */
  var name: String = js.native
}

object BehaviorReplaceModel {
  @scala.inline
  def apply(color: String, name: String): BehaviorReplaceModel = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BehaviorReplaceModel]
  }
  @scala.inline
  implicit class BehaviorReplaceModelOps[Self <: BehaviorReplaceModel] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

