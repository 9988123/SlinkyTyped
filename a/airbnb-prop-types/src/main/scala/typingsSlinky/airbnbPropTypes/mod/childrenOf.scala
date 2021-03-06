package typingsSlinky.airbnbPropTypes.mod

import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("airbnb-prop-types", "childrenOf")
@js.native
object childrenOf extends js.Object {
  def apply[T, P](propType: Validator[P]): Requireable[T] = js.native
}

