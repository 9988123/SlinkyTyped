package typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintCustomItemDetails extends IPrintCustomItemDetails

object PrintCustomItemDetails {
  @scala.inline
  def apply(itemDisplayName: String, itemId: String): PrintCustomItemDetails = {
    val __obj = js.Dynamic.literal(itemDisplayName = itemDisplayName.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintCustomItemDetails]
  }
}

