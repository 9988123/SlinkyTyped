package typingsSlinky.mendixmodelsdk.allModelClassesMod.customwidgets

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.pages.EntityWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.5.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetXPathSource")
@js.native
class CustomWidgetXPathSource protected ()
  extends typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetXPathSource {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetXPathSource")
@js.native
object CustomWidgetXPathSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetXPathSource = js.native
  /**
    * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
    * The new CustomWidgetXPathSource will be automatically stored in the 'dataSource' property
    * of the parent pages.EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInEntityWidgetUnderDataSource(container: EntityWidget): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetXPathSource = js.native
  /**
    * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
    * The new CustomWidgetXPathSource will be automatically stored in the 'dataSource' property
    * of the parent WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInWidgetValueUnderDataSource(container: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetXPathSource = js.native
}

