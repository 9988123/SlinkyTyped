package typingsSlinky.rcPicker.rangePickerMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.rcPicker.interfaceMod.Components
import typingsSlinky.rcPicker.interfaceMod.DisabledTimes
import typingsSlinky.rcPicker.interfaceMod.EventValue
import typingsSlinky.rcPicker.interfaceMod.Locale
import typingsSlinky.rcPicker.interfaceMod.PanelMode
import typingsSlinky.rcPicker.interfaceMod.RangeValue
import typingsSlinky.rcPicker.monthBodyMod.MonthCellRender
import typingsSlinky.rcPicker.pickerMod.PickerRefConfig
import typingsSlinky.rcPicker.rcPickerNumbers.`0`
import typingsSlinky.rcPicker.rcPickerNumbers.`1`
import typingsSlinky.rcPicker.rcPickerStrings.`additions text`
import typingsSlinky.rcPicker.rcPickerStrings.`inline`
import typingsSlinky.rcPicker.rcPickerStrings.additions
import typingsSlinky.rcPicker.rcPickerStrings.all
import typingsSlinky.rcPicker.rcPickerStrings.ascending
import typingsSlinky.rcPicker.rcPickerStrings.assertive
import typingsSlinky.rcPicker.rcPickerStrings.both
import typingsSlinky.rcPicker.rcPickerStrings.copy
import typingsSlinky.rcPicker.rcPickerStrings.date
import typingsSlinky.rcPicker.rcPickerStrings.descending
import typingsSlinky.rcPicker.rcPickerStrings.dialog
import typingsSlinky.rcPicker.rcPickerStrings.execute
import typingsSlinky.rcPicker.rcPickerStrings.grammar
import typingsSlinky.rcPicker.rcPickerStrings.grid
import typingsSlinky.rcPicker.rcPickerStrings.horizontal
import typingsSlinky.rcPicker.rcPickerStrings.link
import typingsSlinky.rcPicker.rcPickerStrings.list
import typingsSlinky.rcPicker.rcPickerStrings.listbox
import typingsSlinky.rcPicker.rcPickerStrings.location
import typingsSlinky.rcPicker.rcPickerStrings.ltr
import typingsSlinky.rcPicker.rcPickerStrings.menu
import typingsSlinky.rcPicker.rcPickerStrings.mixed
import typingsSlinky.rcPicker.rcPickerStrings.move
import typingsSlinky.rcPicker.rcPickerStrings.none
import typingsSlinky.rcPicker.rcPickerStrings.off
import typingsSlinky.rcPicker.rcPickerStrings.other
import typingsSlinky.rcPicker.rcPickerStrings.page
import typingsSlinky.rcPicker.rcPickerStrings.polite
import typingsSlinky.rcPicker.rcPickerStrings.popup
import typingsSlinky.rcPicker.rcPickerStrings.removals
import typingsSlinky.rcPicker.rcPickerStrings.rtl
import typingsSlinky.rcPicker.rcPickerStrings.spelling
import typingsSlinky.rcPicker.rcPickerStrings.step
import typingsSlinky.rcPicker.rcPickerStrings.text
import typingsSlinky.rcPicker.rcPickerStrings.time
import typingsSlinky.rcPicker.rcPickerStrings.tree
import typingsSlinky.rcPicker.rcPickerStrings.vertical
import typingsSlinky.rcTrigger.interfaceMod.AlignType
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.std.Exclude
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent rc-picker.rc-picker/es/RangePicker.RangePickerSharedProps<DateType> */
/* Inlined parent rc-picker.rc-picker/es/RangePicker.OmitPickerProps<rc-picker.rc-picker/es/Picker.PickerTimeProps<DateType>> */
@js.native
trait RangePickerTimeProps[DateType] extends RangePickerProps[DateType] {
  /** @private Internal control of active picker. Do not use since it's private usage */
  var activePickerIndex: js.UndefOr[`0` | `1`] = js.native
  var allowClear: js.UndefOr[Boolean] = js.native
  var allowEmpty: js.UndefOr[js.Tuple2[Boolean, Boolean]] = js.native
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  var `aria-atomic`: js.UndefOr[Boolean] = js.native
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
  var `aria-busy`: js.UndefOr[Boolean] = js.native
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-colcount`: js.UndefOr[Double] = js.native
  var `aria-colindex`: js.UndefOr[Double] = js.native
  var `aria-colspan`: js.UndefOr[Double] = js.native
  var `aria-controls`: js.UndefOr[String] = js.native
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
  var `aria-describedby`: js.UndefOr[String] = js.native
  var `aria-details`: js.UndefOr[String] = js.native
  var `aria-disabled`: js.UndefOr[Boolean] = js.native
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
  var `aria-errormessage`: js.UndefOr[String] = js.native
  var `aria-expanded`: js.UndefOr[Boolean] = js.native
  var `aria-flowto`: js.UndefOr[String] = js.native
  var `aria-grabbed`: js.UndefOr[Boolean] = js.native
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
  var `aria-hidden`: js.UndefOr[Boolean] = js.native
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  var `aria-keyshortcuts`: js.UndefOr[String] = js.native
  var `aria-label`: js.UndefOr[String] = js.native
  var `aria-labelledby`: js.UndefOr[String] = js.native
  var `aria-level`: js.UndefOr[Double] = js.native
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  var `aria-modal`: js.UndefOr[Boolean] = js.native
  var `aria-multiline`: js.UndefOr[Boolean] = js.native
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  var `aria-owns`: js.UndefOr[String] = js.native
  var `aria-placeholder`: js.UndefOr[String] = js.native
  var `aria-posinset`: js.UndefOr[Double] = js.native
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-readonly`: js.UndefOr[Boolean] = js.native
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.native
  var `aria-required`: js.UndefOr[Boolean] = js.native
  var `aria-roledescription`: js.UndefOr[String] = js.native
  var `aria-rowcount`: js.UndefOr[Double] = js.native
  var `aria-rowindex`: js.UndefOr[Double] = js.native
  var `aria-rowspan`: js.UndefOr[Double] = js.native
  var `aria-selected`: js.UndefOr[Boolean] = js.native
  var `aria-setsize`: js.UndefOr[Double] = js.native
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  var `aria-valuemax`: js.UndefOr[Double] = js.native
  var `aria-valuemin`: js.UndefOr[Double] = js.native
  var `aria-valuenow`: js.UndefOr[Double] = js.native
  var `aria-valuetext`: js.UndefOr[String] = js.native
  var autoComplete: js.UndefOr[String] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var clearIcon: js.UndefOr[ReactElement] = js.native
  var components: js.UndefOr[Components] = js.native
  var dateRender: js.UndefOr[RangeDateRender[DateType]] = js.native
  var defaultOpen: js.UndefOr[Boolean] = js.native
  var defaultOpenValue: js.UndefOr[DateType] = js.native
  var defaultPickerValue: js.UndefOr[js.Tuple2[DateType, DateType]] = js.native
  var defaultValue: js.UndefOr[RangeValue[DateType]] = js.native
  var direction: js.UndefOr[ltr | rtl] = js.native
  var disabled: js.UndefOr[Boolean | (js.Tuple2[Boolean, Boolean])] = js.native
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
  var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.native
  var disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.native
  var disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.native
  var disabledTime: js.UndefOr[
    js.Function2[/* date */ EventValue[DateType], /* type */ RangeType, DisabledTimes]
  ] = js.native
  var dropdownAlign: js.UndefOr[AlignType] = js.native
  var dropdownClassName: js.UndefOr[String] = js.native
  var format: js.UndefOr[String | js.Array[String]] = js.native
  var generateConfig: GenerateConfig[DateType] = js.native
  var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
  var hideDisabledOptions: js.UndefOr[Boolean] = js.native
  var hourStep: js.UndefOr[Double] = js.native
  var id: js.UndefOr[String] = js.native
  var inputReadOnly: js.UndefOr[Boolean] = js.native
  var locale: Locale = js.native
  var minuteStep: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[js.Tuple2[PanelMode, PanelMode]] = js.native
  var monthCellRender: js.UndefOr[MonthCellRender[DateType]] = js.native
  var name: js.UndefOr[String] = js.native
  var nextIcon: js.UndefOr[ReactElement] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  var onCalendarChange: js.UndefOr[
    js.Function3[
      /* values */ RangeValue[DateType], 
      /* formatString */ js.Tuple2[String, String], 
      /* info */ RangeInfo, 
      Unit
    ]
  ] = js.native
  var onChange: js.UndefOr[
    js.Function2[
      /* values */ RangeValue[DateType], 
      /* formatString */ js.Tuple2[String, String], 
      Unit
    ]
  ] = js.native
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onOk: js.UndefOr[js.Function1[/* dates */ RangeValue[DateType], Unit]] = js.native
  var onOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.native
  var onPanelChange: js.UndefOr[
    js.Function2[/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode], Unit]
  ] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var order: js.UndefOr[Boolean] = js.native
  var panelRender: js.UndefOr[js.Function1[/* originPanel */ ReactElement, ReactElement]] = js.native
  var picker: time = js.native
  var pickerRef: js.UndefOr[MutableRefObject[PickerRefConfig]] = js.native
  var placeholder: js.UndefOr[js.Tuple2[String, String]] = js.native
  var popupStyle: js.UndefOr[CSSProperties] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var prevIcon: js.UndefOr[ReactElement] = js.native
  var ranges: js.UndefOr[
    Record[
      String, 
      (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
    ]
  ] = js.native
  var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ PanelMode, ReactElement]] = js.native
  var role: js.UndefOr[String] = js.native
  var secondStep: js.UndefOr[Double] = js.native
  var separator: js.UndefOr[ReactElement] = js.native
  var showHour: js.UndefOr[Boolean] = js.native
  var showMinute: js.UndefOr[Boolean] = js.native
  var showNow: js.UndefOr[Boolean] = js.native
  var showSecond: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var suffixIcon: js.UndefOr[ReactElement] = js.native
  var superNextIcon: js.UndefOr[ReactElement] = js.native
  var superPrevIcon: js.UndefOr[ReactElement] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var transitionName: js.UndefOr[String] = js.native
  var use12Hours: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[RangeValue[DateType]] = js.native
}

object RangePickerTimeProps {
  @scala.inline
  def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: time): RangePickerTimeProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangePickerTimeProps[DateType]]
  }
  @scala.inline
  implicit class RangePickerTimePropsOps[Self <: RangePickerTimeProps[_], DateType] (val x: Self with RangePickerTimeProps[DateType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGenerateConfig(value: GenerateConfig[DateType]): Self = this.set("generateConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setPicker(value: time): Self = this.set("picker", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivePickerIndex(value: `0` | `1`): Self = this.set("activePickerIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivePickerIndex: Self = this.set("activePickerIndex", js.undefined)
    @scala.inline
    def setAllowClear(value: Boolean): Self = this.set("allowClear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowClear: Self = this.set("allowClear", js.undefined)
    @scala.inline
    def setAllowEmpty(value: js.Tuple2[Boolean, Boolean]): Self = this.set("allowEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEmpty: Self = this.set("allowEmpty", js.undefined)
    @scala.inline
    def `setAria-activedescendant`(value: String): Self = this.set("aria-activedescendant", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-activedescendant`: Self = this.set("aria-activedescendant", js.undefined)
    @scala.inline
    def `setAria-atomic`(value: Boolean): Self = this.set("aria-atomic", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-atomic`: Self = this.set("aria-atomic", js.undefined)
    @scala.inline
    def `setAria-autocomplete`(value: none | `inline` | list | both): Self = this.set("aria-autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-autocomplete`: Self = this.set("aria-autocomplete", js.undefined)
    @scala.inline
    def `setAria-busy`(value: Boolean): Self = this.set("aria-busy", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-busy`: Self = this.set("aria-busy", js.undefined)
    @scala.inline
    def `setAria-checked`(value: Boolean | mixed): Self = this.set("aria-checked", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-checked`: Self = this.set("aria-checked", js.undefined)
    @scala.inline
    def `setAria-colcount`(value: Double): Self = this.set("aria-colcount", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colcount`: Self = this.set("aria-colcount", js.undefined)
    @scala.inline
    def `setAria-colindex`(value: Double): Self = this.set("aria-colindex", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colindex`: Self = this.set("aria-colindex", js.undefined)
    @scala.inline
    def `setAria-colspan`(value: Double): Self = this.set("aria-colspan", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colspan`: Self = this.set("aria-colspan", js.undefined)
    @scala.inline
    def `setAria-controls`(value: String): Self = this.set("aria-controls", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-controls`: Self = this.set("aria-controls", js.undefined)
    @scala.inline
    def `setAria-current`(value: Boolean | page | step | location | date | time): Self = this.set("aria-current", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-current`: Self = this.set("aria-current", js.undefined)
    @scala.inline
    def `setAria-describedby`(value: String): Self = this.set("aria-describedby", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-describedby`: Self = this.set("aria-describedby", js.undefined)
    @scala.inline
    def `setAria-details`(value: String): Self = this.set("aria-details", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-details`: Self = this.set("aria-details", js.undefined)
    @scala.inline
    def `setAria-disabled`(value: Boolean): Self = this.set("aria-disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-disabled`: Self = this.set("aria-disabled", js.undefined)
    @scala.inline
    def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = this.set("aria-dropeffect", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-dropeffect`: Self = this.set("aria-dropeffect", js.undefined)
    @scala.inline
    def `setAria-errormessage`(value: String): Self = this.set("aria-errormessage", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-errormessage`: Self = this.set("aria-errormessage", js.undefined)
    @scala.inline
    def `setAria-expanded`(value: Boolean): Self = this.set("aria-expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-expanded`: Self = this.set("aria-expanded", js.undefined)
    @scala.inline
    def `setAria-flowto`(value: String): Self = this.set("aria-flowto", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-flowto`: Self = this.set("aria-flowto", js.undefined)
    @scala.inline
    def `setAria-grabbed`(value: Boolean): Self = this.set("aria-grabbed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-grabbed`: Self = this.set("aria-grabbed", js.undefined)
    @scala.inline
    def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = this.set("aria-haspopup", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-haspopup`: Self = this.set("aria-haspopup", js.undefined)
    @scala.inline
    def `setAria-hidden`(value: Boolean): Self = this.set("aria-hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-hidden`: Self = this.set("aria-hidden", js.undefined)
    @scala.inline
    def `setAria-invalid`(value: Boolean | grammar | spelling): Self = this.set("aria-invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-invalid`: Self = this.set("aria-invalid", js.undefined)
    @scala.inline
    def `setAria-keyshortcuts`(value: String): Self = this.set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-keyshortcuts`: Self = this.set("aria-keyshortcuts", js.undefined)
    @scala.inline
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    @scala.inline
    def `setAria-labelledby`(value: String): Self = this.set("aria-labelledby", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-labelledby`: Self = this.set("aria-labelledby", js.undefined)
    @scala.inline
    def `setAria-level`(value: Double): Self = this.set("aria-level", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-level`: Self = this.set("aria-level", js.undefined)
    @scala.inline
    def `setAria-live`(value: off | assertive | polite): Self = this.set("aria-live", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-live`: Self = this.set("aria-live", js.undefined)
    @scala.inline
    def `setAria-modal`(value: Boolean): Self = this.set("aria-modal", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-modal`: Self = this.set("aria-modal", js.undefined)
    @scala.inline
    def `setAria-multiline`(value: Boolean): Self = this.set("aria-multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-multiline`: Self = this.set("aria-multiline", js.undefined)
    @scala.inline
    def `setAria-multiselectable`(value: Boolean): Self = this.set("aria-multiselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-multiselectable`: Self = this.set("aria-multiselectable", js.undefined)
    @scala.inline
    def `setAria-orientation`(value: horizontal | vertical): Self = this.set("aria-orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-orientation`: Self = this.set("aria-orientation", js.undefined)
    @scala.inline
    def `setAria-owns`(value: String): Self = this.set("aria-owns", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-owns`: Self = this.set("aria-owns", js.undefined)
    @scala.inline
    def `setAria-placeholder`(value: String): Self = this.set("aria-placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-placeholder`: Self = this.set("aria-placeholder", js.undefined)
    @scala.inline
    def `setAria-posinset`(value: Double): Self = this.set("aria-posinset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-posinset`: Self = this.set("aria-posinset", js.undefined)
    @scala.inline
    def `setAria-pressed`(value: Boolean | mixed): Self = this.set("aria-pressed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-pressed`: Self = this.set("aria-pressed", js.undefined)
    @scala.inline
    def `setAria-readonly`(value: Boolean): Self = this.set("aria-readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-readonly`: Self = this.set("aria-readonly", js.undefined)
    @scala.inline
    def `setAria-relevant`(value: additions | (`additions text`) | all | removals | text): Self = this.set("aria-relevant", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-relevant`: Self = this.set("aria-relevant", js.undefined)
    @scala.inline
    def `setAria-required`(value: Boolean): Self = this.set("aria-required", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-required`: Self = this.set("aria-required", js.undefined)
    @scala.inline
    def `setAria-roledescription`(value: String): Self = this.set("aria-roledescription", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-roledescription`: Self = this.set("aria-roledescription", js.undefined)
    @scala.inline
    def `setAria-rowcount`(value: Double): Self = this.set("aria-rowcount", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowcount`: Self = this.set("aria-rowcount", js.undefined)
    @scala.inline
    def `setAria-rowindex`(value: Double): Self = this.set("aria-rowindex", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowindex`: Self = this.set("aria-rowindex", js.undefined)
    @scala.inline
    def `setAria-rowspan`(value: Double): Self = this.set("aria-rowspan", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowspan`: Self = this.set("aria-rowspan", js.undefined)
    @scala.inline
    def `setAria-selected`(value: Boolean): Self = this.set("aria-selected", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-selected`: Self = this.set("aria-selected", js.undefined)
    @scala.inline
    def `setAria-setsize`(value: Double): Self = this.set("aria-setsize", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-setsize`: Self = this.set("aria-setsize", js.undefined)
    @scala.inline
    def `setAria-sort`(value: none | ascending | descending | other): Self = this.set("aria-sort", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-sort`: Self = this.set("aria-sort", js.undefined)
    @scala.inline
    def `setAria-valuemax`(value: Double): Self = this.set("aria-valuemax", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuemax`: Self = this.set("aria-valuemax", js.undefined)
    @scala.inline
    def `setAria-valuemin`(value: Double): Self = this.set("aria-valuemin", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuemin`: Self = this.set("aria-valuemin", js.undefined)
    @scala.inline
    def `setAria-valuenow`(value: Double): Self = this.set("aria-valuenow", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuenow`: Self = this.set("aria-valuenow", js.undefined)
    @scala.inline
    def `setAria-valuetext`(value: String): Self = this.set("aria-valuetext", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuetext`: Self = this.set("aria-valuetext", js.undefined)
    @scala.inline
    def setAutoComplete(value: String): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClearIconReactElement(value: ReactElement): Self = this.set("clearIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearIcon(value: ReactElement): Self = this.set("clearIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearIcon: Self = this.set("clearIcon", js.undefined)
    @scala.inline
    def setComponents(value: Components): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    @scala.inline
    def setDateRender(value: (DateType, DateType, /* info */ RangeInfo) => ReactElement): Self = this.set("dateRender", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDateRender: Self = this.set("dateRender", js.undefined)
    @scala.inline
    def setDefaultOpen(value: Boolean): Self = this.set("defaultOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOpen: Self = this.set("defaultOpen", js.undefined)
    @scala.inline
    def setDefaultOpenValue(value: DateType): Self = this.set("defaultOpenValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOpenValue: Self = this.set("defaultOpenValue", js.undefined)
    @scala.inline
    def setDefaultPickerValue(value: js.Tuple2[DateType, DateType]): Self = this.set("defaultPickerValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPickerValue: Self = this.set("defaultPickerValue", js.undefined)
    @scala.inline
    def setDefaultValue(value: RangeValue[DateType]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDefaultValueNull: Self = this.set("defaultValue", null)
    @scala.inline
    def setDirection(value: ltr | rtl): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean | (js.Tuple2[Boolean, Boolean])): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisabledDate(value: /* date */ DateType => Boolean): Self = this.set("disabledDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDisabledDate: Self = this.set("disabledDate", js.undefined)
    @scala.inline
    def setDisabledHours(value: () => js.Array[Double]): Self = this.set("disabledHours", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDisabledHours: Self = this.set("disabledHours", js.undefined)
    @scala.inline
    def setDisabledMinutes(value: /* hour */ Double => js.Array[Double]): Self = this.set("disabledMinutes", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDisabledMinutes: Self = this.set("disabledMinutes", js.undefined)
    @scala.inline
    def setDisabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): Self = this.set("disabledSeconds", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDisabledSeconds: Self = this.set("disabledSeconds", js.undefined)
    @scala.inline
    def setDisabledTime(value: (/* date */ EventValue[DateType], /* type */ RangeType) => DisabledTimes): Self = this.set("disabledTime", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDisabledTime: Self = this.set("disabledTime", js.undefined)
    @scala.inline
    def setDropdownAlign(value: AlignType): Self = this.set("dropdownAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownAlign: Self = this.set("dropdownAlign", js.undefined)
    @scala.inline
    def setDropdownClassName(value: String): Self = this.set("dropdownClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownClassName: Self = this.set("dropdownClassName", js.undefined)
    @scala.inline
    def setFormatVarargs(value: String*): Self = this.set("format", js.Array(value :_*))
    @scala.inline
    def setFormat(value: String | js.Array[String]): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = this.set("getPopupContainer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
    @scala.inline
    def setHideDisabledOptions(value: Boolean): Self = this.set("hideDisabledOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideDisabledOptions: Self = this.set("hideDisabledOptions", js.undefined)
    @scala.inline
    def setHourStep(value: Double): Self = this.set("hourStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHourStep: Self = this.set("hourStep", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInputReadOnly(value: Boolean): Self = this.set("inputReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputReadOnly: Self = this.set("inputReadOnly", js.undefined)
    @scala.inline
    def setMinuteStep(value: Double): Self = this.set("minuteStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinuteStep: Self = this.set("minuteStep", js.undefined)
    @scala.inline
    def setMode(value: js.Tuple2[PanelMode, PanelMode]): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setMonthCellRender(value: (DateType, /* locale */ Locale) => ReactElement): Self = this.set("monthCellRender", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMonthCellRender: Self = this.set("monthCellRender", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNextIconReactElement(value: ReactElement): Self = this.set("nextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextIcon(value: ReactElement): Self = this.set("nextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextIcon: Self = this.set("nextIcon", js.undefined)
    @scala.inline
    def setOnBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnCalendarChange(
      value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String], /* info */ RangeInfo) => Unit
    ): Self = this.set("onCalendarChange", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnCalendarChange: Self = this.set("onCalendarChange", js.undefined)
    @scala.inline
    def setOnChange(value: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String]) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    @scala.inline
    def setOnFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnMouseUp(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    @scala.inline
    def setOnOk(value: /* dates */ RangeValue[DateType] => Unit): Self = this.set("onOk", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOk: Self = this.set("onOk", js.undefined)
    @scala.inline
    def setOnOpenChange(value: /* open */ Boolean => Unit): Self = this.set("onOpenChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOpenChange: Self = this.set("onOpenChange", js.undefined)
    @scala.inline
    def setOnPanelChange(value: (/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Unit): Self = this.set("onPanelChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPanelChange: Self = this.set("onPanelChange", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setOrder(value: Boolean): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setPanelRender(value: /* originPanel */ ReactElement => ReactElement): Self = this.set("panelRender", js.Any.fromFunction1(value))
    @scala.inline
    def deletePanelRender: Self = this.set("panelRender", js.undefined)
    @scala.inline
    def setPickerRef(value: MutableRefObject[PickerRefConfig]): Self = this.set("pickerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePickerRef: Self = this.set("pickerRef", js.undefined)
    @scala.inline
    def setPlaceholder(value: js.Tuple2[String, String]): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPopupStyle(value: CSSProperties): Self = this.set("popupStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupStyle: Self = this.set("popupStyle", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setPrevIconReactElement(value: ReactElement): Self = this.set("prevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevIcon(value: ReactElement): Self = this.set("prevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevIcon: Self = this.set("prevIcon", js.undefined)
    @scala.inline
    def setRanges(
      value: Record[
          String, 
          (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
        ]
    ): Self = this.set("ranges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
    @scala.inline
    def setRenderExtraFooter(value: /* mode */ PanelMode => ReactElement): Self = this.set("renderExtraFooter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderExtraFooter: Self = this.set("renderExtraFooter", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setSecondStep(value: Double): Self = this.set("secondStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondStep: Self = this.set("secondStep", js.undefined)
    @scala.inline
    def setSeparatorReactElement(value: ReactElement): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeparator(value: ReactElement): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def setShowHour(value: Boolean): Self = this.set("showHour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHour: Self = this.set("showHour", js.undefined)
    @scala.inline
    def setShowMinute(value: Boolean): Self = this.set("showMinute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMinute: Self = this.set("showMinute", js.undefined)
    @scala.inline
    def setShowNow(value: Boolean): Self = this.set("showNow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowNow: Self = this.set("showNow", js.undefined)
    @scala.inline
    def setShowSecond(value: Boolean): Self = this.set("showSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSecond: Self = this.set("showSecond", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSuffixIconReactElement(value: ReactElement): Self = this.set("suffixIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuffixIcon(value: ReactElement): Self = this.set("suffixIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffixIcon: Self = this.set("suffixIcon", js.undefined)
    @scala.inline
    def setSuperNextIconReactElement(value: ReactElement): Self = this.set("superNextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuperNextIcon(value: ReactElement): Self = this.set("superNextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuperNextIcon: Self = this.set("superNextIcon", js.undefined)
    @scala.inline
    def setSuperPrevIconReactElement(value: ReactElement): Self = this.set("superPrevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuperPrevIcon(value: ReactElement): Self = this.set("superPrevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuperPrevIcon: Self = this.set("superPrevIcon", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
    @scala.inline
    def setUse12Hours(value: Boolean): Self = this.set("use12Hours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse12Hours: Self = this.set("use12Hours", js.undefined)
    @scala.inline
    def setValue(value: RangeValue[DateType]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

