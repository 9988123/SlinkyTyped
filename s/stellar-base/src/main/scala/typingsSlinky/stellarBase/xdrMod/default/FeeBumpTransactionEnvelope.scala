package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.SignaturesTx
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "FeeBumpTransactionEnvelope")
@js.native
class FeeBumpTransactionEnvelope protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope {
  def this(attributes: SignaturesTx) = this()
}

/* static members */
@JSImport("stellar-base/types/xdr", "FeeBumpTransactionEnvelope")
@js.native
object FeeBumpTransactionEnvelope extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope, io: Buffer): Unit = js.native
}

