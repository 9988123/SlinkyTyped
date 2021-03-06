package typingsSlinky.mangopay2NodejsSdk.mod.models

import typingsSlinky.mangopay2NodejsSdk.anon.PartialSettlementTransfer
import typingsSlinky.mangopay2NodejsSdk.mod.settlementTransfer.SettlementTransferData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.SettlementTransfer")
@js.native
class SettlementTransfer protected ()
  extends EntityBase[SettlementTransferData]
     with SettlementTransferData {
  def this(data: PartialSettlementTransfer) = this()
}

