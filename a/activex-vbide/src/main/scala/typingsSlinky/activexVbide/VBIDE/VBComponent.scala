package typingsSlinky.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VBComponent extends js.Object {
  val CodeModule: typingsSlinky.activexVbide.VBIDE.CodeModule = js.native
  @JSName("Collection")
  val Collection_Original: VBComponents = js.native
  val Designer: js.Any = js.native
  val DesignerID: String = js.native
  val HasOpenDesigner: Boolean = js.native
  var Name: String = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  val Saved: Boolean = js.native
  val Type: vbextComponentType = js.native
  val VBE: typingsSlinky.activexVbide.VBIDE.VBE = js.native
  @JSName("VBIDE.VBComponent_typekey")
  var VBIDEDotVBComponent_typekey: VBComponent = js.native
  def Activate(): Unit = js.native
  def Collection(index: js.Any): VBComponent = js.native
  def DesignerWindow(): Window = js.native
  def Export(FileName: String): Unit = js.native
  def Properties(index: js.Any): Property = js.native
}

