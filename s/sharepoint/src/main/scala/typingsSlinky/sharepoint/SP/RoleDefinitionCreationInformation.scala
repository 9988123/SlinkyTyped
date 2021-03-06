package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleDefinitionCreationInformation extends ClientValueObject {
  def get_basePermissions(): BasePermissions = js.native
  def get_description(): String = js.native
  def get_name(): String = js.native
  def get_order(): Double = js.native
  def set_basePermissions(value: BasePermissions): Unit = js.native
  def set_description(value: String): Unit = js.native
  def set_name(value: String): Unit = js.native
  def set_order(value: Double): Unit = js.native
}

object RoleDefinitionCreationInformation {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_basePermissions: () => BasePermissions,
    get_description: () => String,
    get_name: () => String,
    get_order: () => Double,
    get_typeId: () => String,
    set_basePermissions: BasePermissions => Unit,
    set_description: String => Unit,
    set_name: String => Unit,
    set_order: Double => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): RoleDefinitionCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_basePermissions = js.Any.fromFunction0(get_basePermissions), get_description = js.Any.fromFunction0(get_description), get_name = js.Any.fromFunction0(get_name), get_order = js.Any.fromFunction0(get_order), get_typeId = js.Any.fromFunction0(get_typeId), set_basePermissions = js.Any.fromFunction1(set_basePermissions), set_description = js.Any.fromFunction1(set_description), set_name = js.Any.fromFunction1(set_name), set_order = js.Any.fromFunction1(set_order), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[RoleDefinitionCreationInformation]
  }
  @scala.inline
  implicit class RoleDefinitionCreationInformationOps[Self <: RoleDefinitionCreationInformation] (val x: Self) extends AnyVal {
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
    def setGet_basePermissions(value: () => BasePermissions): Self = this.set("get_basePermissions", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_description(value: () => String): Self = this.set("get_description", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_name(value: () => String): Self = this.set("get_name", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_order(value: () => Double): Self = this.set("get_order", js.Any.fromFunction0(value))
    @scala.inline
    def setSet_basePermissions(value: BasePermissions => Unit): Self = this.set("set_basePermissions", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_description(value: String => Unit): Self = this.set("set_description", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_name(value: String => Unit): Self = this.set("set_name", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_order(value: Double => Unit): Self = this.set("set_order", js.Any.fromFunction1(value))
  }
  
}

