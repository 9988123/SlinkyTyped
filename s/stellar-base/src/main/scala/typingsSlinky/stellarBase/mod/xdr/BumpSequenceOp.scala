package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.BumpTo
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.BumpSequenceOp")
@js.native
class BumpSequenceOp protected ()
  extends typingsSlinky.stellarBase.xdrMod.default.BumpSequenceOp {
  def this(attributes: BumpTo) = this()
}

/* static members */
@JSImport("stellar-base", "xdr.BumpSequenceOp")
@js.native
object BumpSequenceOp extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.BumpSequenceOp = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.BumpSequenceOp = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.BumpSequenceOp = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.BumpSequenceOp = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.BumpSequenceOp): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.BumpSequenceOp = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.BumpSequenceOp): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.BumpSequenceOp, io: Buffer): Unit = js.native
}

