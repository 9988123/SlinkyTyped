package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UndoRecord extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val CustomRecordLevel: Double = js.native
  val CustomRecordName: String = js.native
  val IsRecordingCustomRecord: Boolean = js.native
  val Parent: js.Any = js.native
  @JSName("Word.UndoRecord_typekey")
  var WordDotUndoRecord_typekey: UndoRecord = js.native
  def EndCustomRecord(): Unit = js.native
  /** @param string [Name=''] */
  def StartCustomRecord(): Unit = js.native
  def StartCustomRecord(Name: String): Unit = js.native
}

