package typingsSlinky.reactShare.components

import typingsSlinky.reactShare.anon.CommonShareButtonPropstitDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LivejournalShareButton {
  @JSImport("react-share", "LivejournalShareButton")
  @js.native
  object component extends js.Object
  
  def withProps(p: CommonShareButtonPropstitDescription): SharedBuilder_CommonShareButtonPropstitDescription_565732901 = new SharedBuilder_CommonShareButtonPropstitDescription_565732901(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(url: String): SharedBuilder_CommonShareButtonPropstitDescription_565732901 = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new SharedBuilder_CommonShareButtonPropstitDescription_565732901(js.Array(this.component, __props.asInstanceOf[CommonShareButtonPropstitDescription]))
  }
}

