package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.CloseTime
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.StellarValue")
@js.native
class StellarValue protected ()
  extends typingsSlinky.stellarBase.mod.xdr.StellarValue {
  def this(attributes: CloseTime) = this()
}

/* static members */
@JSImport("stellar-sdk", "xdr.StellarValue")
@js.native
object StellarValue extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.StellarValue = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.StellarValue = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.StellarValue = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.StellarValue = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.StellarValue): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.StellarValue = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.StellarValue): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.StellarValue, io: Buffer): Unit = js.native
}

