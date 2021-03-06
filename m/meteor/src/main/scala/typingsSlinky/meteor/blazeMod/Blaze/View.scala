package typingsSlinky.meteor.blazeMod.Blaze

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Node
import typingsSlinky.meteor.Tracker.Computation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait View extends js.Object {
  var isCreated: Boolean = js.native
  var isDestroyed: Boolean = js.native
  var isRendered: Boolean = js.native
  var name: String = js.native
  var parentView: View = js.native
  var renderCount: Double = js.native
  var template: Template = js.native
  def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
  def firstNode(): Node = js.native
  def lastNode(): Node = js.native
  def onViewCreated(func: js.Function): Unit = js.native
  def onViewDestroyed(func: js.Function): Unit = js.native
  def onViewReady(func: js.Function): Unit = js.native
  def templateInstance(): TemplateInstance = js.native
}

@JSImport("meteor/blaze", "Blaze.View")
@js.native
object View extends TopLevel[ViewStatic]

