package typingsSlinky.angular.mod

import typingsSlinky.angular.mod.global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IControllerProvider extends IServiceProvider {
  def register(name: String, controllerConstructor: Function): Unit = js.native
  def register(name: String, dependencyAnnotatedConstructor: js.Array[_]): Unit = js.native
}

