package typingsSlinky.mendixmodelsdk.allModelClassesMod.customwidgets

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetObject")
@js.native
class WidgetObject protected ()
  extends typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObject {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetObject")
@js.native
object WidgetObject extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new WidgetObject instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObject = js.native
  /**
    * Creates and returns a new WidgetObject instance in the SDK and on the server.
    * The new WidgetObject will be automatically stored in the 'object' property
    * of the parent CustomWidget element passed as argument.
    */
  def createInCustomWidgetUnderObject(container: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObject = js.native
  /**
    * Creates and returns a new WidgetObject instance in the SDK and on the server.
    * The new WidgetObject will be automatically stored in the 'objects' property
    * of the parent WidgetValue element passed as argument.
    */
  def createInWidgetValueUnderObjects(container: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObject = js.native
}

