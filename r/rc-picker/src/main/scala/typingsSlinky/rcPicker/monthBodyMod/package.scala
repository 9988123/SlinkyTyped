package typingsSlinky.rcPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object monthBodyMod {
  type MonthCellRender[DateType] = js.Function2[
    /* currentDate */ DateType, 
    /* locale */ typingsSlinky.rcPicker.interfaceMod.Locale, 
    slinky.core.facade.ReactElement
  ]
}
