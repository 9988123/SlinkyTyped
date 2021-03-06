package typingsSlinky.reactMapGl.mod

import typingsSlinky.reactMapGl.anon.PartialMapState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-map-gl", "MapController")
@js.native
class MapController () extends BaseMapController {
  def getMapState(overrides: PartialMapState): MapState = js.native
  def setOptions(options: MapControllerOptions): Unit = js.native
  def setState(newState: MapState): Unit = js.native
  def updateViewport(newMapState: MapState, extraProps: js.Any, extraState: ExtraState): Unit = js.native
}

