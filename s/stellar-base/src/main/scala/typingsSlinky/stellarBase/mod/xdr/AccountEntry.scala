package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.AccountId
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.AccountEntry")
@js.native
class AccountEntry protected ()
  extends typingsSlinky.stellarBase.xdrMod.default.AccountEntry {
  def this(attributes: AccountId) = this()
}

/* static members */
@JSImport("stellar-base", "xdr.AccountEntry")
@js.native
object AccountEntry extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.AccountEntry = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.AccountEntry = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.AccountEntry = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.AccountEntry = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.AccountEntry): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.AccountEntry = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.AccountEntry): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.AccountEntry, io: Buffer): Unit = js.native
}

