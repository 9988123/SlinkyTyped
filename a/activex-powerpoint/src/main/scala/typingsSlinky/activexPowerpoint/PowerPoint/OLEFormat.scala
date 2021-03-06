package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OLEFormat extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  var FollowColors: PpFollowColors = js.native
  val Object: js.Any = js.native
  val ObjectVerbs: typingsSlinky.activexPowerpoint.PowerPoint.ObjectVerbs = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.OLEFormat_typekey")
  var PowerPointDotOLEFormat_typekey: OLEFormat = js.native
  val ProgID: String = js.native
  def Activate(): Unit = js.native
  /** @param number [Index=0] */
  def DoVerb(): Unit = js.native
  def DoVerb(Index: Double): Unit = js.native
}

