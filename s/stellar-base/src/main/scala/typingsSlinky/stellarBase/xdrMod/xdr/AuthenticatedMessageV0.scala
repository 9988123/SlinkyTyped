package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticatedMessageV0 extends js.Object {
  def mac(): HmacSha256Mac = js.native
  def mac(value: HmacSha256Mac): HmacSha256Mac = js.native
  def message(): StellarMessage = js.native
  def message(value: StellarMessage): StellarMessage = js.native
  def sequence(): Uint64 = js.native
  def sequence(value: Uint64): Uint64 = js.native
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}

