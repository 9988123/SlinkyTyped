package typingsSlinky.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container for storing the name and url for scene files.
  * @param app - The application.
  */
@JSImport("playcanvas", "SceneRegistry")
@js.native
class SceneRegistry protected ()
  extends typingsSlinky.playcanvas.pc.SceneRegistry {
  def this(app: typingsSlinky.playcanvas.pc.Application) = this()
}

