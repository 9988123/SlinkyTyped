package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "AccountMergeResult")
@js.native
class AccountMergeResult ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.AccountMergeResult

/* static members */
@JSImport("stellar-base/types/xdr", "AccountMergeResult")
@js.native
object AccountMergeResult extends js.Object {
  def accountMergeSuccess(value: typingsSlinky.stellarBase.xdrMod.xdr.Int64): typingsSlinky.stellarBase.xdrMod.xdr.AccountMergeResult = js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.AccountMergeResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.AccountMergeResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.AccountMergeResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.AccountMergeResult = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.AccountMergeResult): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.AccountMergeResult = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.AccountMergeResult): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.AccountMergeResult, io: Buffer): Unit = js.native
}

