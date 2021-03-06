package typingsSlinky.yandexMaps.mod.multiRouter

import typingsSlinky.yandexMaps.mod.IEventEmitter
import typingsSlinky.yandexMaps.mod.data.Manager
import typingsSlinky.yandexMaps.mod.geometry.base.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "multiRouter.ViaPointModel")
@js.native
class ViaPointModel () extends IEventEmitter {
  var geometry: Point = js.native
  var multiRoute: MultiRouteModel = js.native
  var properties: Manager = js.native
  def destroy(): Unit = js.native
  def getReferencePoint(): js.Object = js.native
  def getReferencePointIndex(): Double = js.native
  def setReferencePoint(referencePoint: js.Object): Unit = js.native
  def update(viaPointJson: js.Object): Unit = js.native
}

