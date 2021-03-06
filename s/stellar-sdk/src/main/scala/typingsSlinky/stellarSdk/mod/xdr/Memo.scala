package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.Memo")
@js.native
class Memo ()
  extends typingsSlinky.stellarBase.mod.xdr.Memo

/* static members */
@JSImport("stellar-sdk", "xdr.Memo")
@js.native
object Memo extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Memo = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.Memo = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.Memo = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.Memo = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.Memo): Boolean = js.native
  def memoHash(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Memo = js.native
  def memoId(value: typingsSlinky.stellarBase.xdrMod.xdr.Uint64): typingsSlinky.stellarBase.xdrMod.xdr.Memo = js.native
  def memoNone(): typingsSlinky.stellarBase.xdrMod.xdr.Memo = js.native
  def memoReturn(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Memo = js.native
  def memoText(value: String): typingsSlinky.stellarBase.xdrMod.xdr.Memo = js.native
  def memoText(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Memo = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Memo = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.Memo): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.Memo, io: Buffer): Unit = js.native
}

