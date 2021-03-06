package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.TransactionHistoryEntryExt")
@js.native
class TransactionHistoryEntryExt ()
  extends typingsSlinky.stellarBase.xdrMod.default.TransactionHistoryEntryExt

/* static members */
@JSImport("stellar-base", "xdr.TransactionHistoryEntryExt")
@js.native
object TransactionHistoryEntryExt extends js.Object {
  def `0`(): typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt = js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt, io: Buffer): Unit = js.native
}

