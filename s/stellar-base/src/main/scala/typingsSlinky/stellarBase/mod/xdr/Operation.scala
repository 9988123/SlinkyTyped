package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Body
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import typingsSlinky.stellarBase.xdrMod.xdrHidden.Operation2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-line:strict-export-declare-modifiers
@JSImport("stellar-base", "xdr.Operation")
@js.native
class Operation[T /* <: typingsSlinky.stellarBase.mod.Operation */] protected ()
  extends typingsSlinky.stellarBase.xdrMod.default.Operation[T] {
  def this(attributes: Body) = this()
}

/* static members */
@JSImport("stellar-base", "xdr.Operation")
@js.native
object Operation extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Operation[typingsSlinky.stellarBase.mod.Operation] = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.Operation[typingsSlinky.stellarBase.mod.Operation] = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.Operation[typingsSlinky.stellarBase.mod.Operation] = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.Operation[typingsSlinky.stellarBase.mod.Operation] = js.native
  def isValid(value: Operation2[typingsSlinky.stellarBase.mod.Operation]): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.mod.Operation = js.native
  def toXDR(value: Operation2[typingsSlinky.stellarBase.mod.Operation]): Buffer = js.native
  def write(value: Operation2[typingsSlinky.stellarBase.mod.Operation], io: Buffer): Unit = js.native
}

