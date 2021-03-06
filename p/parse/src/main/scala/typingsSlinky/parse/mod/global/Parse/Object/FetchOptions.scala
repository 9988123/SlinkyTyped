package typingsSlinky.parse.mod.global.Parse.Object

import typingsSlinky.parse.mod.global.Parse.ErrorOption
import typingsSlinky.parse.mod.global.Parse.SessionTokenOption
import typingsSlinky.parse.mod.global.Parse.SuccessOption
import typingsSlinky.parse.mod.global.Parse.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchOptions
  extends SuccessOption
     with ErrorOption
     with SessionTokenOption
     with UseMasterKeyOption

object FetchOptions {
  @scala.inline
  def apply(): FetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchOptions]
  }
}

