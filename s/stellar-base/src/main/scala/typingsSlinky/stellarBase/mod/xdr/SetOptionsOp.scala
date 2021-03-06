package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.ClearFlags
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.SetOptionsOp")
@js.native
class SetOptionsOp protected ()
  extends typingsSlinky.stellarBase.xdrMod.default.SetOptionsOp {
  def this(attributes: ClearFlags) = this()
}

/* static members */
@JSImport("stellar-base", "xdr.SetOptionsOp")
@js.native
object SetOptionsOp extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.SetOptionsOp = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.SetOptionsOp = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.SetOptionsOp = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.SetOptionsOp = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.SetOptionsOp): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.SetOptionsOp = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.SetOptionsOp): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.SetOptionsOp, io: Buffer): Unit = js.native
}

