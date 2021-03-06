package typingsSlinky.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeFormat extends js.Object {
  def format(): String = js.native
  def format(date: Double): String = js.native
  def format(date: js.Date): String = js.native
  def formatToParts(): js.Array[DateTimeFormatPart] = js.native
  def formatToParts(date: Double): js.Array[DateTimeFormatPart] = js.native
  def formatToParts(date: js.Date): js.Array[DateTimeFormatPart] = js.native
  def resolvedOptions(): ResolvedDateTimeFormatOptions = js.native
}

