package typingsSlinky.dateFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/isBefore", JSImport.Namespace)
@js.native
object dateFnsIsBeforeMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double, dateToCompare: Double): Boolean = js.native
    def apply(date: Double, dateToCompare: js.Date): Boolean = js.native
    def apply(date: js.Date, dateToCompare: Double): Boolean = js.native
    def apply(date: js.Date, dateToCompare: js.Date): Boolean = js.native
  }
  
}

