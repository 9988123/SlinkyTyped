package typingsSlinky.mendixmodelsdk.mod.workflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.10.0: introduced
  */
@JSImport("mendixmodelsdk", "workflows.TaskOutcomeValue")
@js.native
class TaskOutcomeValue protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.workflows.TaskOutcomeValue {
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
@JSImport("mendixmodelsdk", "workflows.TaskOutcomeValue")
@js.native
object TaskOutcomeValue extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new TaskOutcomeValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.TaskOutcomeValue = js.native
  /**
    * Creates and returns a new TaskOutcomeValue instance in the SDK and on the server.
    * The new TaskOutcomeValue will be automatically stored in the 'value' property
    * of the parent Flow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.10.0 and higher
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.workflowsMod.workflows.Flow): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.TaskOutcomeValue = js.native
}

