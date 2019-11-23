package typingsSlinky.atStorybookApi.atStorybookApiMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumerProps[S, C] extends js.Object {
  var filter: js.UndefOr[js.Function1[/* combo */ C, S]] = js.native
  var pure: js.UndefOr[Boolean] = js.native
  def children(d: C | S): ReactElement | Null = js.native
}

