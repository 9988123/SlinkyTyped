package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionMetaV2 extends js.Object {
  def operations(): js.Array[OperationMeta] = js.native
  def operations(value: js.Array[OperationMeta]): js.Array[OperationMeta] = js.native
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  def txChangesAfter(): js.Array[LedgerEntryChange] = js.native
  def txChangesAfter(value: js.Array[LedgerEntryChange]): js.Array[LedgerEntryChange] = js.native
  def txChangesBefore(): js.Array[LedgerEntryChange] = js.native
  def txChangesBefore(value: js.Array[LedgerEntryChange]): js.Array[LedgerEntryChange] = js.native
}

