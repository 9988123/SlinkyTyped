package typingsSlinky.activexAdodb.anon

import typingsSlinky.activexAdodb.ADODB.EventReasonEnum
import typingsSlinky.activexAdodb.ADODB.EventStatusEnum
import typingsSlinky.activexAdodb.ADODB.Field
import typingsSlinky.activexAdodb.ADODB.Recordset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PRecordset extends js.Object {
  val adReason: EventReasonEnum = js.native
  var adStatus: EventStatusEnum = js.native
  val cRecords: Double = js.native
  @JSName("pRecordset")
  val pRecordset_Original: Recordset = js.native
  def pRecordset(FieldIndex: String): Field = js.native
  def pRecordset(FieldIndex: Double): Field = js.native
}

