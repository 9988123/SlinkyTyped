package typingsSlinky.emberRouting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait As extends js.Object {
  var as: js.UndefOr[String] = js.undefined
  var engineInfo: js.UndefOr[js.Any] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var resetNamespace: js.UndefOr[Boolean] = js.undefined
}

object As {
  @scala.inline
  def apply(
    as: String = null,
    engineInfo: js.Any = null,
    path: String = null,
    resetNamespace: js.UndefOr[Boolean] = js.undefined
  ): As = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (engineInfo != null) __obj.updateDynamic("engineInfo")(engineInfo.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(resetNamespace)) __obj.updateDynamic("resetNamespace")(resetNamespace.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[As]
  }
}

