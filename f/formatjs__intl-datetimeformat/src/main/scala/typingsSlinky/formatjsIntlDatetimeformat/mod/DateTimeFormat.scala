package typingsSlinky.formatjsIntlDatetimeformat.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeFormat extends js.Object {
  def format(): String = js.native
  def format(x: Double): String = js.native
  def format(x: js.Date): String = js.native
  def formatToParts(): js.Array[DateTimeFormatPart] = js.native
  def formatToParts(x: Double): js.Array[DateTimeFormatPart] = js.native
  def formatToParts(x: js.Date): js.Array[DateTimeFormatPart] = js.native
  def resolvedOptions(): ResolvedDateTimeFormatOptions = js.native
}

@JSImport("@formatjs/intl-datetimeformat", "DateTimeFormat")
@js.native
object DateTimeFormat extends TopLevel[DateTimeFormatConstructor]

