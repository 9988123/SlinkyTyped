package typingsSlinky.angularCore.mod

import typingsSlinky.angularCore.anon.FactoryProvidedIn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "InjectionToken")
@js.native
class InjectionToken[T] protected () extends js.Object {
  def this(_desc: String) = this()
  def this(_desc: String, options: FactoryProvidedIn[T]) = this()
  var _desc: String = js.native
  val ngInjectableDef: js.UndefOr[scala.Nothing] = js.native
}

