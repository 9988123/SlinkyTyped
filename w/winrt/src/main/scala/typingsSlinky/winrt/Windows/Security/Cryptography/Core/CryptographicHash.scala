package typingsSlinky.winrt.Windows.Security.Cryptography.Core

import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CryptographicHash extends IHashComputation

object CryptographicHash {
  @scala.inline
  def apply(append: IBuffer => Unit, getValueAndReset: () => IBuffer): CryptographicHash = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), getValueAndReset = js.Any.fromFunction0(getValueAndReset))
    __obj.asInstanceOf[CryptographicHash]
  }
}

