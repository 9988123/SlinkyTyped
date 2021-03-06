package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LedgerCloseMetaV0 extends js.Object {
  def ledgerHeader(): LedgerHeaderHistoryEntry = js.native
  def ledgerHeader(value: LedgerHeaderHistoryEntry): LedgerHeaderHistoryEntry = js.native
  def scpInfo(): js.Array[ScpHistoryEntry] = js.native
  def scpInfo(value: js.Array[ScpHistoryEntry]): js.Array[ScpHistoryEntry] = js.native
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  def txProcessing(): js.Array[TransactionResultMeta] = js.native
  def txProcessing(value: js.Array[TransactionResultMeta]): js.Array[TransactionResultMeta] = js.native
  def txSet(): TransactionSet = js.native
  def txSet(value: TransactionSet): TransactionSet = js.native
  def upgradesProcessing(): js.Array[UpgradeEntryMeta] = js.native
  def upgradesProcessing(value: js.Array[UpgradeEntryMeta]): js.Array[UpgradeEntryMeta] = js.native
}

