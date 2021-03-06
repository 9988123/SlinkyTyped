package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.FeeBumpTransactionExt")
@js.native
class FeeBumpTransactionExt ()
  extends typingsSlinky.stellarBase.xdrMod.default.FeeBumpTransactionExt

/* static members */
@JSImport("stellar-base", "xdr.FeeBumpTransactionExt")
@js.native
object FeeBumpTransactionExt extends js.Object {
  def `0`(): typingsSlinky.stellarBase.xdrMod.xdr.FeeBumpTransactionExt = js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.FeeBumpTransactionExt = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.FeeBumpTransactionExt = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.FeeBumpTransactionExt = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.FeeBumpTransactionExt = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.FeeBumpTransactionExt): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.FeeBumpTransactionExt = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.FeeBumpTransactionExt): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.FeeBumpTransactionExt, io: Buffer): Unit = js.native
}

