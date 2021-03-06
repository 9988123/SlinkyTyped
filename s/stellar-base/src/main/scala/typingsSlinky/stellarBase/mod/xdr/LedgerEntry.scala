package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Data
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.LedgerEntry")
@js.native
class LedgerEntry protected ()
  extends typingsSlinky.stellarBase.xdrMod.default.LedgerEntry {
  def this(attributes: Data) = this()
}

/* static members */
@JSImport("stellar-base", "xdr.LedgerEntry")
@js.native
object LedgerEntry extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntry = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntry = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntry = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntry = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntry): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntry = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntry): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntry, io: Buffer): Unit = js.native
}

