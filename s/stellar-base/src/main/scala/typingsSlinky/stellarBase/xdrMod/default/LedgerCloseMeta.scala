package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "LedgerCloseMeta")
@js.native
class LedgerCloseMeta ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseMeta

/* static members */
@JSImport("stellar-base/types/xdr", "LedgerCloseMeta")
@js.native
object LedgerCloseMeta extends js.Object {
  def `0`(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseMetaV0): typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseMeta = js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseMeta = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseMeta = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseMeta = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseMeta = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseMeta): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseMeta = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseMeta): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseMeta, io: Buffer): Unit = js.native
}

