package typingsSlinky.jupyterlabDocregistry.contextMod.Context

import typingsSlinky.jupyterlabApputils.clientsessionMod.IClientSession.IKernelPreference
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModelFactory
import typingsSlinky.jupyterlabObservables.modeldbMod.ModelDB.IFactory
import typingsSlinky.jupyterlabServices.libManagerMod.ServiceManager.IManager
import typingsSlinky.phosphorDisposable.mod.IDisposable
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a context.
  */
trait IOptions[T /* <: IModel */] extends js.Object {
  /**
    * The model factory used to create the model.
    */
  var factory: IModelFactory[T]
  /**
    * The kernel preference associated with the context.
    */
  var kernelPreference: js.UndefOr[IKernelPreference] = js.undefined
  /**
    * A service manager instance.
    */
  var manager: IManager
  /**
    * An IModelDB factory method which may be used for the document.
    */
  var modelDBFactory: js.UndefOr[IFactory] = js.undefined
  /**
    * An optional callback for opening sibling widgets.
    */
  var opener: js.UndefOr[js.Function1[/* widget */ Widget, Unit]] = js.undefined
  /**
    * The initial path of the file.
    */
  var path: String
  /**
    * A function to call when the kernel is busy.
    */
  var setBusy: js.UndefOr[js.Function0[IDisposable]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply[T](
    factory: IModelFactory[T],
    manager: IManager,
    path: String,
    kernelPreference: IKernelPreference = null,
    modelDBFactory: IFactory = null,
    opener: /* widget */ Widget => Unit = null,
    setBusy: () => IDisposable = null
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (kernelPreference != null) __obj.updateDynamic("kernelPreference")(kernelPreference.asInstanceOf[js.Any])
    if (modelDBFactory != null) __obj.updateDynamic("modelDBFactory")(modelDBFactory.asInstanceOf[js.Any])
    if (opener != null) __obj.updateDynamic("opener")(js.Any.fromFunction1(opener))
    if (setBusy != null) __obj.updateDynamic("setBusy")(js.Any.fromFunction0(setBusy))
    __obj.asInstanceOf[IOptions[T]]
  }
}

