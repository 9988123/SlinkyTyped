package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.baseSelectedItemsListTypesMod.IBaseSelectedItemsListProps
import typingsSlinky.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import typingsSlinky.officeUiFabricReact.selectedPeopleListMod.ISelectedPeopleItemProps
import typingsSlinky.officeUiFabricReact.selectedPeopleListMod.ISelectedPeopleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/SelectedItemsList", JSImport.Namespace)
@js.native
object libSelectedItemsListMod extends js.Object {
  @js.native
  class BasePeopleSelectedItemsList ()
    extends typingsSlinky.officeUiFabricReact.baseSelectedItemsListMod.BaseSelectedItemsList[IExtendedPersonaProps, ISelectedPeopleProps]
  
  @js.native
  class BaseSelectedItemsList[T, P /* <: IBaseSelectedItemsListProps[T] */] protected ()
    extends typingsSlinky.officeUiFabricReact.selectedItemsListMod.BaseSelectedItemsList[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @js.native
  class ExtendedSelectedItem protected ()
    extends typingsSlinky.officeUiFabricReact.selectedItemsListMod.ExtendedSelectedItem {
    def this(props: ISelectedPeopleItemProps) = this()
  }
  
  @js.native
  class SelectedPeopleList ()
    extends typingsSlinky.officeUiFabricReact.selectedItemsListMod.SelectedPeopleList
  
  /* static members */
  @js.native
  object SelectedPeopleList extends js.Object {
    var defaultProps: js.Any = js.native
  }
  
}

