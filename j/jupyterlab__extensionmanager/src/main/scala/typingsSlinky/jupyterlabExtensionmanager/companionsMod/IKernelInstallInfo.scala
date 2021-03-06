package typingsSlinky.jupyterlabExtensionmanager.companionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jupyterlabExtensionmanager.anon.Displayname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKernelInstallInfo extends IInstallInfo {
  /**
    * A specification of which kernels the current install info applies to.
    */
  var kernel_spec: Displayname
}

object IKernelInstallInfo {
  @scala.inline
  def apply(
    base: IInstallInfoEntry,
    kernel_spec: Displayname,
    managers: js.Array[String],
    overrides: StringDictionary[js.UndefOr[IInstallInfoEntry]] = null
  ): IKernelInstallInfo = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], kernel_spec = kernel_spec.asInstanceOf[js.Any], managers = managers.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKernelInstallInfo]
  }
}

