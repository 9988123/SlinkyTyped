package typingsSlinky.atStorybookApi

import typingsSlinky.atStorybookApi.distModulesVersionsMod.SubAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiHasApiInit extends js.Object {
  var api: SubAPI
  var state: Anon_DismissedVersionNotification
  def init(hasApi: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any): js.Promise[Unit]
}

object Anon_ApiHasApiInit {
  @scala.inline
  def apply(
    api: SubAPI,
    init: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any => js.Promise[Unit],
    state: Anon_DismissedVersionNotification
  ): Anon_ApiHasApiInit = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], init = js.Any.fromFunction1(init), state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ApiHasApiInit]
  }
}

