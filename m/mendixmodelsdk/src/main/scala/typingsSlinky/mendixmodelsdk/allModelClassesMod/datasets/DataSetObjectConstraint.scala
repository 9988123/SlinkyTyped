package typingsSlinky.mendixmodelsdk.allModelClassesMod.datasets

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetObjectConstraint")
@js.native
class DataSetObjectConstraint protected ()
  extends typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetObjectConstraint {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetObjectConstraint")
@js.native
object DataSetObjectConstraint extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataSetObjectConstraint instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetObjectConstraint = js.native
  /**
    * Creates and returns a new DataSetObjectConstraint instance in the SDK and on the server.
    * The new DataSetObjectConstraint will be automatically stored in the 'constraints' property
    * of the parent DataSetParameter element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetParameter): typingsSlinky.mendixmodelsdk.datasetsMod.datasets.DataSetObjectConstraint = js.native
}

