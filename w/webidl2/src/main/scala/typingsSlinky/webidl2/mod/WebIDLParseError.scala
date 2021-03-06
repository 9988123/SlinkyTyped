package typingsSlinky.webidl2.mod

import typingsSlinky.std.Error
import typingsSlinky.webidl2.anon.BareMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webidl2", "WebIDLParseError")
@js.native
class WebIDLParseError protected () extends Error {
  def this(options: BareMessage) = this()
  var bareMessage: String = js.native
  var context: String = js.native
  /** a short peek at the text at the point where the error happened */
  var input: String = js.native
  /** the line at which the error occurred. */
  var line: Double = js.native
  @JSName("name")
  var name_WebIDLParseError: typingsSlinky.webidl2.webidl2Strings.WebIDLParseError = js.native
  var sourceName: js.UndefOr[String] = js.native
  /** the five tokens at the point of error, as understood by the tokeniser */
  var tokens: js.Array[ValueDescription] = js.native
}

