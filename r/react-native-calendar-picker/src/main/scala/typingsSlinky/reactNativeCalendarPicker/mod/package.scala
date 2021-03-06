package typingsSlinky.reactNativeCalendarPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomDatesStylesFunc = js.Function1[
    /* date */ typingsSlinky.moment.mod.Moment, 
    typingsSlinky.reactNativeCalendarPicker.anon.ContainerStyle
  ]
  type CustomDayHeaderStylesFunc = js.Function1[
    /* date */ typingsSlinky.reactNativeCalendarPicker.mod.CustomDayHeaderStylesFuncDateArg, 
    typingsSlinky.reactNativeCalendarPicker.anon.Style
  ]
  type DateChangedCallback = js.Function2[
    /* date */ typingsSlinky.moment.mod.Moment, 
    /* type */ js.UndefOr[
      typingsSlinky.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.START_DATE | typingsSlinky.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.END_DATE
    ], 
    scala.Unit
  ]
  type DisabledDatesFunc = js.Function1[/* date */ typingsSlinky.moment.mod.Moment, scala.Boolean]
  type MomentParsable = typingsSlinky.moment.mod.MomentInput
  type SwipeCallback = js.Function1[
    /* swipeDirection */ typingsSlinky.reactNativeCalendarPicker.mod.SwipeDirection, 
    scala.Unit
  ]
}
