package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.StellarValueExt")
@js.native
class StellarValueExt ()
  extends typingsSlinky.stellarBase.mod.xdr.StellarValueExt

/* static members */
@JSImport("stellar-sdk", "xdr.StellarValueExt")
@js.native
object StellarValueExt extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.StellarValueExt): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  def stellarValueBasic(): typingsSlinky.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  def stellarValueSigned(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerCloseValueSignature): typingsSlinky.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.StellarValueExt): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.StellarValueExt, io: Buffer): Unit = js.native
}

