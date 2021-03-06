package typingsSlinky.mangopay2NodejsSdk.mod.models

import typingsSlinky.mangopay2NodejsSdk.anon.MakeKeysRequiredPartialUsAddress
import typingsSlinky.mangopay2NodejsSdk.mod.user.UserNaturalData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.UserNatural")
@js.native
class UserNatural protected ()
  extends EntityBase[UserNaturalData]
     with UserNaturalData {
  def this(data: MakeKeysRequiredPartialUsAddress) = this()
  /**
    * Sets the person type for the model
    * @param personType
    */
  def setPersonType(`type`: typingsSlinky.mangopay2NodejsSdk.mod.user.PersonType): Unit = js.native
}

