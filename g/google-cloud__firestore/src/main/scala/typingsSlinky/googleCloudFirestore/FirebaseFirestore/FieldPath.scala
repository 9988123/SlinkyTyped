package typingsSlinky.googleCloudFirestore.FirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldPath extends js.Object {
  /**
    * Returns true if this `FieldPath` is equal to the provided one.
    *
    * @param other The `FieldPath` to compare against.
    * @return true if this `FieldPath` is equal to the provided one.
    */
  def isEqual(other: FieldPath): Boolean
}

object FieldPath {
  @scala.inline
  def apply(isEqual: FieldPath => Boolean): FieldPath = {
    val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[FieldPath]
  }
}

