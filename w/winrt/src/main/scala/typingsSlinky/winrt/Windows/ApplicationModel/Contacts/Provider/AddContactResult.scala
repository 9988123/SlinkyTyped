package typingsSlinky.winrt.Windows.ApplicationModel.Contacts.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AddContactResult extends js.Object

@JSGlobal("Windows.ApplicationModel.Contacts.Provider.AddContactResult")
@js.native
object AddContactResult extends js.Object {
  @js.native
  sealed trait added extends AddContactResult
  
  @js.native
  sealed trait alreadyAdded extends AddContactResult
  
  @js.native
  sealed trait unavailable extends AddContactResult
  
}

