package typingsSlinky.mendixmodelsdk.allModelClassesMod.domainmodels

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/entities relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.Entity")
@js.native
class Entity protected ()
  extends typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.Entity {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.Entity")
@js.native
object Entity extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Entity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.Entity = js.native
  /**
    * Creates and returns a new Entity instance in the SDK and on the server.
    * The new Entity will be automatically stored in the 'entities' property
    * of the parent DomainModel element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.DomainModel): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.Entity = js.native
}

