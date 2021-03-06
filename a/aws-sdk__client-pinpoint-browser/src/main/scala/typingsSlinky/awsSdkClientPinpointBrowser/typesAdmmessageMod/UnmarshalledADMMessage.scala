package typingsSlinky.awsSdkClientPinpointBrowser.typesAdmmessageMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledADMMessage extends ADMMessage {
  /**
    * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody' object
    */
  @JSName("Data")
  var Data_UnmarshalledADMMessage: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  @JSName("Substitutions")
  var Substitutions_UnmarshalledADMMessage: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
}

object UnmarshalledADMMessage {
  @scala.inline
  def apply(): UnmarshalledADMMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledADMMessage]
  }
  @scala.inline
  implicit class UnmarshalledADMMessageOps[Self <: UnmarshalledADMMessage] (val x: Self) extends AnyVal {
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
    def setData(value: StringDictionary[String]): Self = this.set("Data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("Data", js.undefined)
    @scala.inline
    def setSubstitutions(value: StringDictionary[js.Array[String]]): Self = this.set("Substitutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubstitutions: Self = this.set("Substitutions", js.undefined)
  }
  
}

