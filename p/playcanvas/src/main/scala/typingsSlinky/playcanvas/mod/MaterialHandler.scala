package typingsSlinky.playcanvas.mod

import typingsSlinky.playcanvas.pc.ResourceHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource handler used for loading {@link pc.Material} resources.
  * @param app - The running {@link pc.Application}.
  */
@JSImport("playcanvas", "MaterialHandler")
@js.native
class MaterialHandler protected () extends ResourceHandler {
  def this(app: typingsSlinky.playcanvas.pc.Application) = this()
}

