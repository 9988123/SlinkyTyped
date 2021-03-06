package typingsSlinky.mangopay2NodejsSdk.mod.models

import typingsSlinky.mangopay2NodejsSdk.anon.PartialBankingAliasData
import typingsSlinky.mangopay2NodejsSdk.mod.bankingAlias.IBANBankingAliasData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.BankingAlias")
@js.native
class BankingAlias protected ()
  extends EntityBase[IBANBankingAliasData]
     with IBANBankingAliasData {
  def this(data: PartialBankingAliasData) = this()
}

