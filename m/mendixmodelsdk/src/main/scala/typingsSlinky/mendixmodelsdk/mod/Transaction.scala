package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.transactionManagerMod.TransactionManager
import typingsSlinky.mendixmodelsdk.transactionManagerMod.TransactionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "Transaction")
@js.native
class Transaction protected ()
  extends typingsSlinky.mendixmodelsdk.transactionManagerMod.Transaction {
  def this(transactionType: TransactionType, transactionManager: TransactionManager) = this()
}

