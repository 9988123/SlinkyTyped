package typingsSlinky.flatpickr.instanceMod

import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLSelectElement
import org.scalajs.dom.raw.HTMLSpanElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.Node
import typingsSlinky.flatpickr.anon.Element
import typingsSlinky.flatpickr.anon.GetDaysInMonth
import typingsSlinky.flatpickr.anon.kinkeyofOptionsOptionsk
import typingsSlinky.flatpickr.formattingMod.Formats_
import typingsSlinky.flatpickr.formattingMod.RevFormat_
import typingsSlinky.flatpickr.formattingMod.TokenRegex_
import typingsSlinky.flatpickr.globalsMod.global.Date
import typingsSlinky.flatpickr.globalsMod.global.HTMLElement
import typingsSlinky.flatpickr.localeMod.Locale
import typingsSlinky.flatpickr.optionsMod.DateOption
import typingsSlinky.flatpickr.optionsMod.ParsedOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined flatpickr.flatpickr/dist/types/instance.Elements & flatpickr.flatpickr/dist/types/instance.Formatting & {  minRangeDate :flatpickr.flatpickr/dist/types/globals.<global>.Date | undefined,   maxRangeDate :flatpickr.flatpickr/dist/types/globals.<global>.Date | undefined,   now :flatpickr.flatpickr/dist/types/globals.<global>.Date,   latestSelectedDateObj :flatpickr.flatpickr/dist/types/globals.<global>.Date | undefined,   _selectedDateObj :flatpickr.flatpickr/dist/types/globals.<global>.Date | undefined,   selectedDates :std.Array<flatpickr.flatpickr/dist/types/globals.<global>.Date>,   _initialDate :flatpickr.flatpickr/dist/types/globals.<global>.Date,   config :flatpickr.flatpickr/dist/types/options.ParsedOptions,   loadedPlugins :std.Array<string>,   l10n :flatpickr.flatpickr/dist/types/locale.Locale,   currentYear :number,   currentMonth :number,   isOpen :boolean,   isMobile :boolean,   minDateHasTime :boolean,   maxDateHasTime :boolean,   showTimeInput :boolean,   _showTimeInput :boolean, changeMonth (value : number, isOffset : boolean | undefined, fromKeyboard : boolean | undefined): void, changeYear (year : number): void, clear (emitChangeEvent : boolean | undefined, toInitial : boolean | undefined): void, close (): void, destroy (): void, isEnabled (date : flatpickr.flatpickr/dist/types/options.DateOption, timeless : boolean | undefined): boolean, jumpToDate (date : flatpickr.flatpickr/dist/types/options.DateOption | undefined, triggerChange : boolean | undefined): void, open (e : std.FocusEvent | std.MouseEvent | undefined, positionElement : flatpickr.flatpickr/dist/types/globals.<global>.HTMLElement | undefined): void, redraw (): void, set (option : keyof flatpickr.flatpickr/dist/types/options.Options | {[ k in keyof flatpickr.flatpickr/dist/types/options.Options ]:? flatpickr.flatpickr/dist/types/options.Options[k]}, value : any | undefined): void, setDate (date : flatpickr.flatpickr/dist/types/options.DateOption | std.Array<flatpickr.flatpickr/dist/types/options.DateOption>, triggerChange : boolean | undefined, format : string | undefined): void, toggle (): void, pad (num : string | number): string, parseDate (date : flatpickr.flatpickr/dist/types/globals.<global>.Date | string | number, givenFormat : string | undefined, timeless : boolean | undefined): flatpickr.flatpickr/dist/types/globals.<global>.Date | undefined, formatDate (dateObj : flatpickr.flatpickr/dist/types/globals.<global>.Date, frmt : string): string,   _handlers :std.Array<{  event :string,   element :std.Element, handler (e : std.Event | undefined): void,   options :{  capture :boolean | undefined} | undefined}>, _bind <E extends std.Element>(element : E | std.Array<E>, event : string | std.Array<string>, handler : (e : any | undefined): void): void, _createElement <E extends flatpickr.flatpickr/dist/types/globals.<global>.HTMLElement>(tag : keyof std.HTMLElementTagNameMap, className : string, content : string | undefined): E, _setHoursFromDate (date : flatpickr.flatpickr/dist/types/globals.<global>.Date): void, _debouncedChange (): void,   __hideNextMonthArrow :boolean,   __hidePrevMonthArrow :boolean, _positionCalendar (customPositionElement : flatpickr.flatpickr/dist/types/globals.<global>.HTMLElement | undefined): void,   utils :{getDaysInMonth (month : number | undefined, year : number | undefined): number}} */
@js.native
trait Instance extends js.Object {
  var __hideNextMonthArrow: Boolean = js.native
  var __hidePrevMonthArrow: Boolean = js.native
  var _handlers: js.Array[Element] = js.native
  var _hideNextMonthArrow: Boolean = js.native
  var _hidePrevMonthArrow: Boolean = js.native
  var _initialDate: Date = js.native
  var _input: HTMLInputElement = js.native
  var _positionElement: HTMLElement = js.native
  var _selectedDateObj: js.UndefOr[Date] = js.native
  var _showTimeInput: Boolean = js.native
  var altInput: js.UndefOr[HTMLInputElement] = js.native
  var amPM: js.UndefOr[HTMLSpanElement] = js.native
  var calendarContainer: HTMLDivElement = js.native
  var config: ParsedOptions = js.native
  var currentMonth: Double = js.native
  var currentMonthElement: HTMLSpanElement = js.native
  var currentYear: Double = js.native
  var currentYearElement: HTMLInputElement = js.native
  var days: HTMLDivElement = js.native
  var daysContainer: js.UndefOr[HTMLDivElement] = js.native
  var element: HTMLElement = js.native
  var formats: Formats_ = js.native
  var hourElement: js.UndefOr[HTMLInputElement] = js.native
  var innerContainer: js.UndefOr[HTMLDivElement] = js.native
  var input: HTMLInputElement = js.native
  var isMobile: Boolean = js.native
  var isOpen: Boolean = js.native
  var l10n: Locale = js.native
  var latestSelectedDateObj: js.UndefOr[Date] = js.native
  var loadedPlugins: js.Array[String] = js.native
  var maxDateHasTime: Boolean = js.native
  var maxRangeDate: js.UndefOr[Date] = js.native
  var minDateHasTime: Boolean = js.native
  var minRangeDate: js.UndefOr[Date] = js.native
  var minuteElement: js.UndefOr[HTMLInputElement] = js.native
  var mobileFormatStr: js.UndefOr[String] = js.native
  var mobileInput: js.UndefOr[HTMLInputElement] = js.native
  var monthElements: js.Array[HTMLSpanElement] = js.native
  var monthNav: HTMLDivElement = js.native
  var monthsDropdownContainer: HTMLSelectElement = js.native
  var nextMonthNav: HTMLElement = js.native
  var now: Date = js.native
  var pluginElements: js.Array[Node] = js.native
  var prevMonthNav: HTMLElement = js.native
  var rContainer: js.UndefOr[HTMLDivElement] = js.native
  var revFormat: RevFormat_ = js.native
  var secondElement: js.UndefOr[HTMLInputElement] = js.native
  var selectedDateElem: js.UndefOr[DayElement] = js.native
  var selectedDates: js.Array[Date] = js.native
  var showTimeInput: Boolean = js.native
  var timeContainer: js.UndefOr[HTMLDivElement] = js.native
  var todayDateElem: js.UndefOr[DayElement] = js.native
  var tokenRegex: TokenRegex_ = js.native
  var utils: GetDaysInMonth = js.native
  var weekNumbers: js.UndefOr[HTMLDivElement] = js.native
  var weekWrapper: js.UndefOr[HTMLDivElement] = js.native
  var weekdayContainer: HTMLDivElement = js.native
  var yearElements: js.Array[HTMLInputElement] = js.native
  def _bind[E /* <: org.scalajs.dom.raw.Element */](element: E, event: String, handler: js.Function1[/* e */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def _bind[E /* <: org.scalajs.dom.raw.Element */](element: E, event: js.Array[String], handler: js.Function1[/* e */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def _bind[E /* <: org.scalajs.dom.raw.Element */](element: js.Array[E], event: String, handler: js.Function1[/* e */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def _bind[E /* <: org.scalajs.dom.raw.Element */](
    element: js.Array[E],
    event: js.Array[String],
    handler: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  def _createElement[E /* <: HTMLElement */](
    tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any,
    className: String
  ): E = js.native
  def _createElement[E /* <: HTMLElement */](
    tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any,
    className: String,
    content: String
  ): E = js.native
  def _debouncedChange(): Unit = js.native
  def _positionCalendar(): Unit = js.native
  def _positionCalendar(customPositionElement: HTMLElement): Unit = js.native
  def _setHoursFromDate(date: Date): Unit = js.native
  def changeMonth(value: Double): Unit = js.native
  def changeMonth(value: Double, isOffset: js.UndefOr[scala.Nothing], fromKeyboard: Boolean): Unit = js.native
  def changeMonth(value: Double, isOffset: Boolean): Unit = js.native
  def changeMonth(value: Double, isOffset: Boolean, fromKeyboard: Boolean): Unit = js.native
  def changeYear(year: Double): Unit = js.native
  def clear(): Unit = js.native
  def clear(emitChangeEvent: js.UndefOr[scala.Nothing], toInitial: Boolean): Unit = js.native
  def clear(emitChangeEvent: Boolean): Unit = js.native
  def clear(emitChangeEvent: Boolean, toInitial: Boolean): Unit = js.native
  def close(): Unit = js.native
  def destroy(): Unit = js.native
  def formatDate(dateObj: Date, frmt: String): String = js.native
  def isEnabled(date: DateOption): Boolean = js.native
  def isEnabled(date: DateOption, timeless: Boolean): Boolean = js.native
  def jumpToDate(): Unit = js.native
  def jumpToDate(date: js.UndefOr[DateOption], triggerChange: Boolean): Unit = js.native
  def jumpToDate(date: DateOption): Unit = js.native
  def open(): Unit = js.native
  def open(e: js.UndefOr[scala.Nothing], positionElement: HTMLElement): Unit = js.native
  def open(e: FocusEvent): Unit = js.native
  def open(e: FocusEvent, positionElement: HTMLElement): Unit = js.native
  def open(e: MouseEvent): Unit = js.native
  def open(e: MouseEvent, positionElement: HTMLElement): Unit = js.native
  def pad(num: String): String = js.native
  def pad(num: Double): String = js.native
  def parseDate(date: String): js.UndefOr[Date] = js.native
  def parseDate(date: String, givenFormat: js.UndefOr[scala.Nothing], timeless: Boolean): js.UndefOr[Date] = js.native
  def parseDate(date: String, givenFormat: String): js.UndefOr[Date] = js.native
  def parseDate(date: String, givenFormat: String, timeless: Boolean): js.UndefOr[Date] = js.native
  def parseDate(date: Double): js.UndefOr[Date] = js.native
  def parseDate(date: Double, givenFormat: js.UndefOr[scala.Nothing], timeless: Boolean): js.UndefOr[Date] = js.native
  def parseDate(date: Double, givenFormat: String): js.UndefOr[Date] = js.native
  def parseDate(date: Double, givenFormat: String, timeless: Boolean): js.UndefOr[Date] = js.native
  def parseDate(date: Date): js.UndefOr[Date] = js.native
  def parseDate(date: Date, givenFormat: js.UndefOr[scala.Nothing], timeless: Boolean): js.UndefOr[Date] = js.native
  def parseDate(date: Date, givenFormat: String): js.UndefOr[Date] = js.native
  def parseDate(date: Date, givenFormat: String, timeless: Boolean): js.UndefOr[Date] = js.native
  def redraw(): Unit = js.native
  def set(option: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 60 */ js.Any): Unit = js.native
  def set(
    option: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 60 */ js.Any,
    value: js.Any
  ): Unit = js.native
  def set(option: kinkeyofOptionsOptionsk): Unit = js.native
  def set(option: kinkeyofOptionsOptionsk, value: js.Any): Unit = js.native
  def setDate(date: js.Array[DateOption]): Unit = js.native
  def setDate(date: js.Array[DateOption], triggerChange: js.UndefOr[scala.Nothing], format: String): Unit = js.native
  def setDate(date: js.Array[DateOption], triggerChange: Boolean): Unit = js.native
  def setDate(date: js.Array[DateOption], triggerChange: Boolean, format: String): Unit = js.native
  def setDate(date: DateOption): Unit = js.native
  def setDate(date: DateOption, triggerChange: js.UndefOr[scala.Nothing], format: String): Unit = js.native
  def setDate(date: DateOption, triggerChange: Boolean): Unit = js.native
  def setDate(date: DateOption, triggerChange: Boolean, format: String): Unit = js.native
  def toggle(): Unit = js.native
}

