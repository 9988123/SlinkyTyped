package typingsSlinky.airbnbPropTypes.mod

import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("airbnb-prop-types", "keysOf")
@js.native
object keysOf extends js.Object {
  def apply[T, P](propType: Validator[P]): Requireable[T] = js.native
  def apply[T, P](propType: Validator[P], name: String): Requireable[T] = js.native
}

