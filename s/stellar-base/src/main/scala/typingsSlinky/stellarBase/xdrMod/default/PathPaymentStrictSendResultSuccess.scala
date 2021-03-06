package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Last
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "PathPaymentStrictSendResultSuccess")
@js.native
class PathPaymentStrictSendResultSuccess protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResultSuccess {
  def this(attributes: Last) = this()
}

/* static members */
@JSImport("stellar-base/types/xdr", "PathPaymentStrictSendResultSuccess")
@js.native
object PathPaymentStrictSendResultSuccess extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResultSuccess = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResultSuccess = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResultSuccess = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResultSuccess = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResultSuccess): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResultSuccess = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResultSuccess): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResultSuccess, io: Buffer): Unit = js.native
}

