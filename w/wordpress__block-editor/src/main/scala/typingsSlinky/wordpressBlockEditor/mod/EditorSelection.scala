package typingsSlinky.wordpressBlockEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorSelection extends js.Object {
  /**
    * The selected block attribute key.
    */
  var attributeKey: js.UndefOr[String] = js.native
  /**
    * The selected block client ID.
    */
  var clientId: js.UndefOr[String] = js.native
  /**
    * The selected block attribute offset.
    */
  var offset: js.UndefOr[Double] = js.native
}

object EditorSelection {
  @scala.inline
  def apply(): EditorSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorSelection]
  }
  @scala.inline
  implicit class EditorSelectionOps[Self <: EditorSelection] (val x: Self) extends AnyVal {
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
    def setAttributeKey(value: String): Self = this.set("attributeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeKey: Self = this.set("attributeKey", js.undefined)
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
  
}

