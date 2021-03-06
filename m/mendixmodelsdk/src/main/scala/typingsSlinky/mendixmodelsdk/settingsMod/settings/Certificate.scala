package typingsSlinky.mendixmodelsdk.settingsMod.settings

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.settingsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/settings", "settings.Certificate")
@js.native
class Certificate protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FCertificate: IModel = js.native
  def containerAsCertificateSettings: CertificateSettings = js.native
  def data: String | Null = js.native
  def data_=(newValue: String | Null): Unit = js.native
  def `type`: CertificateType = js.native
  def type_=(newValue: CertificateType): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/settings", "settings.Certificate")
@js.native
object Certificate extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Certificate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): Certificate = js.native
  /**
    * Creates and returns a new Certificate instance in the SDK and on the server.
    * The new Certificate will be automatically stored in the 'certificates' property
    * of the parent CertificateSettings element passed as argument.
    */
  def createIn(container: CertificateSettings): Certificate = js.native
}

