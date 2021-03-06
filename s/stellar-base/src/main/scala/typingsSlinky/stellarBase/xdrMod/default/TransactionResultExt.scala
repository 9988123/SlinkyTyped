package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "TransactionResultExt")
@js.native
class TransactionResultExt ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultExt

/* static members */
@JSImport("stellar-base/types/xdr", "TransactionResultExt")
@js.native
object TransactionResultExt extends js.Object {
  def `0`(): typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultExt = js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultExt = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultExt = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultExt = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultExt = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultExt): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultExt = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultExt): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionResultExt, io: Buffer): Unit = js.native
}

