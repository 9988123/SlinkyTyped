package typingsSlinky.utilityTypes

import typingsSlinky.std.BigInt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility-types/dist/aliases-and-guards", JSImport.Namespace)
@js.native
object aliasesAndGuardsMod extends js.Object {
  trait _Falsy extends js.Object
  
  def isFalsy(`val`: js.Any): /* is utility-types.utility-types/dist/aliases-and-guards.Falsy */ Boolean = js.native
  def isPrimitive(`val`: js.Any): /* is utility-types.utility-types/dist/aliases-and-guards.Primitive */ Boolean = js.native
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.utilityTypes.utilityTypesBooleans.`false`
    - typingsSlinky.utilityTypes.utilityTypesStrings._empty
    - typingsSlinky.utilityTypes.utilityTypesNumbers.`0`
    - scala.Null
    - js.UndefOr[scala.Nothing]
  */
  type Falsy = js.UndefOr[_Falsy | Null]
  type Primitive = js.UndefOr[String | Double | BigInt | Boolean | js.Symbol | Null]
}

