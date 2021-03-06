package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Counter
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.ScpBallot")
@js.native
class ScpBallot protected ()
  extends typingsSlinky.stellarBase.mod.xdr.ScpBallot {
  def this(attributes: Counter) = this()
}

/* static members */
@JSImport("stellar-sdk", "xdr.ScpBallot")
@js.native
object ScpBallot extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ScpBallot = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.ScpBallot = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.ScpBallot = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.ScpBallot = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpBallot): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ScpBallot = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpBallot): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpBallot, io: Buffer): Unit = js.native
}

