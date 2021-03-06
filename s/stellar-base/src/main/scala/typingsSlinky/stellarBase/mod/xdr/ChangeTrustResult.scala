package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.ChangeTrustResult")
@js.native
class ChangeTrustResult ()
  extends typingsSlinky.stellarBase.xdrMod.default.ChangeTrustResult

/* static members */
@JSImport("stellar-base", "xdr.ChangeTrustResult")
@js.native
object ChangeTrustResult extends js.Object {
  def changeTrustSuccess(): typingsSlinky.stellarBase.xdrMod.xdr.ChangeTrustResult = js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ChangeTrustResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.ChangeTrustResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.ChangeTrustResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.ChangeTrustResult = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.ChangeTrustResult): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ChangeTrustResult = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.ChangeTrustResult): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.ChangeTrustResult, io: Buffer): Unit = js.native
}

