package typingsSlinky.materialUiLab.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.SyntheticTransitionEvent
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUiCore.popperPopperMod.PopperProps
import typingsSlinky.materialUiLab.anon.PartialClassNameMapAutoco
import typingsSlinky.materialUiLab.autocompleteAutocompleteMod.AutocompleteGetTagProps
import typingsSlinky.materialUiLab.autocompleteAutocompleteMod.AutocompleteProps
import typingsSlinky.materialUiLab.autocompleteAutocompleteMod.AutocompleteRenderGroupParams
import typingsSlinky.materialUiLab.autocompleteAutocompleteMod.AutocompleteRenderInputParams
import typingsSlinky.materialUiLab.autocompleteAutocompleteMod.AutocompleteRenderOptionState
import typingsSlinky.materialUiLab.materialUiLabBooleans.`false`
import typingsSlinky.materialUiLab.materialUiLabBooleans.`true`
import typingsSlinky.materialUiLab.materialUiLabStrings.`additions text`
import typingsSlinky.materialUiLab.materialUiLabStrings.`inline`
import typingsSlinky.materialUiLab.materialUiLabStrings.additions
import typingsSlinky.materialUiLab.materialUiLabStrings.all
import typingsSlinky.materialUiLab.materialUiLabStrings.ascending
import typingsSlinky.materialUiLab.materialUiLabStrings.assertive
import typingsSlinky.materialUiLab.materialUiLabStrings.auto
import typingsSlinky.materialUiLab.materialUiLabStrings.both
import typingsSlinky.materialUiLab.materialUiLabStrings.copy
import typingsSlinky.materialUiLab.materialUiLabStrings.date
import typingsSlinky.materialUiLab.materialUiLabStrings.decimal
import typingsSlinky.materialUiLab.materialUiLabStrings.descending
import typingsSlinky.materialUiLab.materialUiLabStrings.dialog
import typingsSlinky.materialUiLab.materialUiLabStrings.email
import typingsSlinky.materialUiLab.materialUiLabStrings.execute
import typingsSlinky.materialUiLab.materialUiLabStrings.grammar
import typingsSlinky.materialUiLab.materialUiLabStrings.grid
import typingsSlinky.materialUiLab.materialUiLabStrings.horizontal
import typingsSlinky.materialUiLab.materialUiLabStrings.inherit
import typingsSlinky.materialUiLab.materialUiLabStrings.link
import typingsSlinky.materialUiLab.materialUiLabStrings.list
import typingsSlinky.materialUiLab.materialUiLabStrings.listbox
import typingsSlinky.materialUiLab.materialUiLabStrings.location
import typingsSlinky.materialUiLab.materialUiLabStrings.medium
import typingsSlinky.materialUiLab.materialUiLabStrings.menu
import typingsSlinky.materialUiLab.materialUiLabStrings.mixed
import typingsSlinky.materialUiLab.materialUiLabStrings.mouse
import typingsSlinky.materialUiLab.materialUiLabStrings.move
import typingsSlinky.materialUiLab.materialUiLabStrings.no
import typingsSlinky.materialUiLab.materialUiLabStrings.none
import typingsSlinky.materialUiLab.materialUiLabStrings.numeric
import typingsSlinky.materialUiLab.materialUiLabStrings.off
import typingsSlinky.materialUiLab.materialUiLabStrings.on
import typingsSlinky.materialUiLab.materialUiLabStrings.other
import typingsSlinky.materialUiLab.materialUiLabStrings.page
import typingsSlinky.materialUiLab.materialUiLabStrings.polite
import typingsSlinky.materialUiLab.materialUiLabStrings.popup
import typingsSlinky.materialUiLab.materialUiLabStrings.removals
import typingsSlinky.materialUiLab.materialUiLabStrings.search
import typingsSlinky.materialUiLab.materialUiLabStrings.small
import typingsSlinky.materialUiLab.materialUiLabStrings.spelling
import typingsSlinky.materialUiLab.materialUiLabStrings.step
import typingsSlinky.materialUiLab.materialUiLabStrings.tel
import typingsSlinky.materialUiLab.materialUiLabStrings.text
import typingsSlinky.materialUiLab.materialUiLabStrings.time
import typingsSlinky.materialUiLab.materialUiLabStrings.touch
import typingsSlinky.materialUiLab.materialUiLabStrings.tree
import typingsSlinky.materialUiLab.materialUiLabStrings.url
import typingsSlinky.materialUiLab.materialUiLabStrings.vertical
import typingsSlinky.materialUiLab.materialUiLabStrings.yes
import typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod.AutocompleteChangeDetails
import typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod.AutocompleteChangeReason
import typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod.AutocompleteCloseReason
import typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod.AutocompleteFreeSoloValueMapping
import typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod.AutocompleteHighlightChangeReason
import typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod.AutocompleteInputChangeReason
import typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod.FilterOptionsState
import typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod.Value
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Autocomplete {
  @JSImport("@material-ui/lab", "Autocomplete")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T, /* <: js.UndefOr[scala.Boolean] */ Multiple, /* <: js.UndefOr[scala.Boolean] */ DisableClearable, /* <: js.UndefOr[scala.Boolean] */ FreeSolo] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def ChipProps(value: js.Object): this.type = set("ChipProps", value.asInstanceOf[js.Any])
    @scala.inline
    def ListboxComponentFunctionComponent(value: ReactComponentClass[HTMLAttributes[HTMLElement]]): this.type = set("ListboxComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def ListboxComponentComponentClass(value: ReactComponentClass[HTMLAttributes[HTMLElement]]): this.type = set("ListboxComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def ListboxComponent(value: ReactComponentClass[HTMLAttributes[HTMLElement]]): this.type = set("ListboxComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def ListboxProps(value: js.Object): this.type = set("ListboxProps", value.asInstanceOf[js.Any])
    @scala.inline
    def PaperComponentFunctionComponent(value: ReactComponentClass[HTMLAttributes[HTMLElement]]): this.type = set("PaperComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def PaperComponentComponentClass(value: ReactComponentClass[HTMLAttributes[HTMLElement]]): this.type = set("PaperComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def PaperComponent(value: ReactComponentClass[HTMLAttributes[HTMLElement]]): this.type = set("PaperComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def PopperComponentFunctionComponent(value: ReactComponentClass[PopperProps]): this.type = set("PopperComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def PopperComponentComponentClass(value: ReactComponentClass[PopperProps]): this.type = set("PopperComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def PopperComponent(value: ReactComponentClass[PopperProps]): this.type = set("PopperComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
    @scala.inline
    def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-atomic`(value: Boolean): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-busy`(value: Boolean): this.type = set("aria-busy", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-disabled`(value: Boolean): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-expanded`(value: Boolean): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-grabbed`(value: Boolean): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-hidden`(value: Boolean): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-modal`(value: Boolean): this.type = set("aria-modal", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-multiline`(value: Boolean): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-multiselectable`(value: Boolean): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-readonly`(value: Boolean): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-relevant`(value: additions | (`additions text`) | all | removals | text): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-required`(value: Boolean): this.type = set("aria-required", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-selected`(value: Boolean): this.type = set("aria-selected", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
    @scala.inline
    def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
    @scala.inline
    def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
    @scala.inline
    def autoComplete(value: Boolean): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
    @scala.inline
    def autoHighlight(value: Boolean): this.type = set("autoHighlight", value.asInstanceOf[js.Any])
    @scala.inline
    def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
    @scala.inline
    def autoSelect(value: Boolean): this.type = set("autoSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def blurOnSelect(value: touch | mouse | `true` | `false`): this.type = set("blurOnSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def classes(value: PartialClassNameMapAutoco): this.type = set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def clearOnBlur(value: Boolean): this.type = set("clearOnBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def clearOnEscape(value: Boolean): this.type = set("clearOnEscape", value.asInstanceOf[js.Any])
    @scala.inline
    def clearText(value: String): this.type = set("clearText", value.asInstanceOf[js.Any])
    @scala.inline
    def closeIconReactElement(value: ReactElement): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def closeIcon(value: ReactElement): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def closeText(value: String): this.type = set("closeText", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def componentName(value: String): this.type = set("componentName", value.asInstanceOf[js.Any])
    @scala.inline
    def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
    @scala.inline
    def debug(value: Boolean): this.type = set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValueVarargs(value: (T | AutocompleteFreeSoloValueMapping[FreeSolo])*): this.type = set("defaultValue", js.Array(value :_*))
    @scala.inline
    def defaultValue(value: Value[T, Multiple, DisableClearable, FreeSolo]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValueNull: this.type = set("defaultValue", null)
    @scala.inline
    def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def disableClearable(value: DisableClearable): this.type = set("disableClearable", value.asInstanceOf[js.Any])
    @scala.inline
    def disableCloseOnSelect(value: Boolean): this.type = set("disableCloseOnSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def disableListWrap(value: Boolean): this.type = set("disableListWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def disablePortal(value: Boolean): this.type = set("disablePortal", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def disabledItemsFocusable(value: Boolean): this.type = set("disabledItemsFocusable", value.asInstanceOf[js.Any])
    @scala.inline
    def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def filterOptions(value: (/* options */ js.Array[T], /* state */ FilterOptionsState[T]) => js.Array[T]): this.type = set("filterOptions", js.Any.fromFunction2(value))
    @scala.inline
    def filterSelectedOptions(value: Boolean): this.type = set("filterSelectedOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def forcePopupIcon(value: `true` | `false` | auto): this.type = set("forcePopupIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def freeSolo(value: FreeSolo): this.type = set("freeSolo", value.asInstanceOf[js.Any])
    @scala.inline
    def fullWidth(value: Boolean): this.type = set("fullWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def getLimitTagsText(value: /* more */ Double => ReactElement): this.type = set("getLimitTagsText", js.Any.fromFunction1(value))
    @scala.inline
    def getOptionDisabled(value: T => Boolean): this.type = set("getOptionDisabled", js.Any.fromFunction1(value))
    @scala.inline
    def getOptionLabel(value: T => String): this.type = set("getOptionLabel", js.Any.fromFunction1(value))
    @scala.inline
    def getOptionSelected(value: (T, T) => Boolean): this.type = set("getOptionSelected", js.Any.fromFunction2(value))
    @scala.inline
    def groupBy(value: T => String): this.type = set("groupBy", js.Any.fromFunction1(value))
    @scala.inline
    def handleHomeEndKeys(value: Boolean): this.type = set("handleHomeEndKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def includeInputInList(value: Boolean): this.type = set("includeInputInList", value.asInstanceOf[js.Any])
    @scala.inline
    def inlist(value: js.Any): this.type = set("inlist", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefRefObject(value: ReactRef[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def innerRef(value: Ref[_] | ReactRef[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefNull: this.type = set("innerRef", null)
    @scala.inline
    def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
    @scala.inline
    def inputValue(value: String): this.type = set("inputValue", value.asInstanceOf[js.Any])
    @scala.inline
    def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
    @scala.inline
    def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
    @scala.inline
    def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
    @scala.inline
    def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
    @scala.inline
    def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
    @scala.inline
    def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
    @scala.inline
    def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def limitTags(value: Double): this.type = set("limitTags", value.asInstanceOf[js.Any])
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def loadingTextReactElement(value: ReactElement): this.type = set("loadingText", value.asInstanceOf[js.Any])
    @scala.inline
    def loadingText(value: ReactElement): this.type = set("loadingText", value.asInstanceOf[js.Any])
    @scala.inline
    def multiple(value: Multiple): this.type = set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def noOptionsTextReactElement(value: ReactElement): this.type = set("noOptionsText", value.asInstanceOf[js.Any])
    @scala.inline
    def noOptionsText(value: ReactElement): this.type = set("noOptionsText", value.asInstanceOf[js.Any])
    @scala.inline
    def onAbort(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
    @scala.inline
    def onAnimationEnd(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onAnimationIteration(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
    @scala.inline
    def onAnimationStart(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
    @scala.inline
    def onAuxClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
    @scala.inline
    def onBeforeInput(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onCanPlay(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
    @scala.inline
    def onCanPlayThrough(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
    @scala.inline
    def onChange(
      value: (/* event */ ChangeEvent[js.Object], /* value */ Value[T, Multiple, DisableClearable, FreeSolo], /* reason */ AutocompleteChangeReason, /* details */ js.UndefOr[AutocompleteChangeDetails[T]]) => Unit
    ): this.type = set("onChange", js.Any.fromFunction4(value))
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onClose(value: (/* event */ ChangeEvent[js.Object], /* reason */ AutocompleteCloseReason) => Unit): this.type = set("onClose", js.Any.fromFunction2(value))
    @scala.inline
    def onCompositionEnd(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onCompositionStart(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
    @scala.inline
    def onCompositionUpdate(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def onContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
    @scala.inline
    def onCopy(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
    @scala.inline
    def onCut(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
    @scala.inline
    def onDoubleClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
    @scala.inline
    def onDrag(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
    @scala.inline
    def onDragEnd(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onDragEnter(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onDragExit(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
    @scala.inline
    def onDragLeave(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onDragOver(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
    @scala.inline
    def onDragStart(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def onDrop(value: DragEvent[HTMLDivElement] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
    @scala.inline
    def onDurationChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
    @scala.inline
    def onEmptied(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
    @scala.inline
    def onEncrypted(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
    @scala.inline
    def onEnded(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
    @scala.inline
    def onError(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onHighlightChange(
      value: (/* event */ ChangeEvent[js.Object], /* option */ T | Null, /* reason */ AutocompleteHighlightChangeReason) => Unit
    ): this.type = set("onHighlightChange", js.Any.fromFunction3(value))
    @scala.inline
    def onInput(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
    @scala.inline
    def onInputChange(
      value: (/* event */ ChangeEvent[js.Object], /* value */ String, /* reason */ AutocompleteInputChangeReason) => Unit
    ): this.type = set("onInputChange", js.Any.fromFunction3(value))
    @scala.inline
    def onInvalid(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyPress(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyUp(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def onLoad(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
    @scala.inline
    def onLoadStart(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
    @scala.inline
    def onLoadedData(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
    @scala.inline
    def onLoadedMetadata(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseMove(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseOut(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseOver(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseUp(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def onOpen(value: /* event */ ChangeEvent[js.Object] => Unit): this.type = set("onOpen", js.Any.fromFunction1(value))
    @scala.inline
    def onPaste(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
    @scala.inline
    def onPause(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
    @scala.inline
    def onPlay(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
    @scala.inline
    def onPlaying(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerCancel(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerDown(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerEnter(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerLeave(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerMove(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerOut(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerOver(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
    @scala.inline
    def onPointerUp(value: SyntheticPointerEvent[HTMLDivElement] => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
    @scala.inline
    def onProgress(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
    @scala.inline
    def onRateChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
    @scala.inline
    def onReset(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
    @scala.inline
    def onScroll(value: SyntheticUIEvent[HTMLDivElement] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def onSeeked(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
    @scala.inline
    def onSeeking(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
    @scala.inline
    def onSelect(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def onStalled(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
    @scala.inline
    def onSubmit(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
    @scala.inline
    def onSuspend(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
    @scala.inline
    def onTimeUpdate(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchCancel(value: SyntheticTouchEvent[HTMLDivElement] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchEnd(value: SyntheticTouchEvent[HTMLDivElement] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchMove(value: SyntheticTouchEvent[HTMLDivElement] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchStart(value: SyntheticTouchEvent[HTMLDivElement] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def onTransitionEnd(value: SyntheticTransitionEvent[HTMLDivElement] => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onVolumeChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
    @scala.inline
    def onWaiting(value: SyntheticEvent[Event, HTMLDivElement] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
    @scala.inline
    def onWheel(value: SyntheticWheelEvent[HTMLDivElement] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def openOnFocus(value: Boolean): this.type = set("openOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def openText(value: String): this.type = set("openText", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def popupIconReactElement(value: ReactElement): this.type = set("popupIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def popupIcon(value: ReactElement): this.type = set("popupIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def renderGroup(value: /* params */ AutocompleteRenderGroupParams => ReactElement): this.type = set("renderGroup", js.Any.fromFunction1(value))
    @scala.inline
    def renderOption(value: (T, /* state */ AutocompleteRenderOptionState) => ReactElement): this.type = set("renderOption", js.Any.fromFunction2(value))
    @scala.inline
    def renderTags(value: (/* value */ js.Array[T], /* getTagProps */ AutocompleteGetTagProps) => ReactElement): this.type = set("renderTags", js.Any.fromFunction2(value))
    @scala.inline
    def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
    @scala.inline
    def selectOnFocus(value: Boolean): this.type = set("selectOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: small | medium): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    @scala.inline
    def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
    @scala.inline
    def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
    @scala.inline
    def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def valueVarargs(value: (T | AutocompleteFreeSoloValueMapping[FreeSolo])*): this.type = set("value", js.Array(value :_*))
    @scala.inline
    def value(value: Value[T, Multiple, DisableClearable, FreeSolo]): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def valueNull: this.type = set("value", null)
    @scala.inline
    def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
  }
  
  def withProps[T, /* <: js.UndefOr[scala.Boolean] */ Multiple, /* <: js.UndefOr[scala.Boolean] */ DisableClearable, /* <: js.UndefOr[scala.Boolean] */ FreeSolo](p: AutocompleteProps[T, Multiple, DisableClearable, FreeSolo]): Builder[T, Multiple, DisableClearable, FreeSolo] = new Builder[T, Multiple, DisableClearable, FreeSolo](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T, /* <: js.UndefOr[scala.Boolean] */ Multiple, /* <: js.UndefOr[scala.Boolean] */ DisableClearable, /* <: js.UndefOr[scala.Boolean] */ FreeSolo](options: js.Array[T], renderInput: AutocompleteRenderInputParams => ReactElement): Builder[T, Multiple, DisableClearable, FreeSolo] = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any], renderInput = js.Any.fromFunction1(renderInput))
    new Builder[T, Multiple, DisableClearable, FreeSolo](js.Array(this.component, __props.asInstanceOf[AutocompleteProps[T, Multiple, DisableClearable, FreeSolo]]))
  }
}

