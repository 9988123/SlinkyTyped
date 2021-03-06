package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CreateLocationResponse")
@js.native
class CreateLocationResponse () extends js.Object {
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  /**
    * The newly created `Location`.
    */
  var location: js.UndefOr[Location] = js.native
}

