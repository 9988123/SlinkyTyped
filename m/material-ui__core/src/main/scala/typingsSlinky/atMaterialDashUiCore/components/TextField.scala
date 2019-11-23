package typingsSlinky.atMaterialDashUiCore.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.atMaterialDashUiCore.PartialClassNameMapTextFieldClassKey
import typingsSlinky.atMaterialDashUiCore.PartialFilledInputProps
import typingsSlinky.atMaterialDashUiCore.PartialFormHelperTextProps
import typingsSlinky.atMaterialDashUiCore.PartialInputLabelProps
import typingsSlinky.atMaterialDashUiCore.PartialInputProps
import typingsSlinky.atMaterialDashUiCore.PartialOutlinedInputProps
import typingsSlinky.atMaterialDashUiCore.PartialSelectProps
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreMod.PropTypes.Margin
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`additions text`
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.`inline`
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.additions
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.all
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.ascending
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.assertive
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.both
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.copy
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.date
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.decimal
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.descending
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.dialog
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.email
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.execute
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.filled
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.grammar
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.grid
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.horizontal
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.link
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.list
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.listbox
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.location
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.menu
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.mixed
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.move
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.no
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.none
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.numeric
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.off
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.on
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.other
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.outlined
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.page
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.polite
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.popup
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.removals
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.search
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.spelling
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.standard
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.step
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.tel
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.text
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.time
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.tree
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.url
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.vertical
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.yes
import typingsSlinky.atMaterialDashUiCore.formControlFormControlMod.FormControlProps
import typingsSlinky.atMaterialDashUiCore.inputBaseInputBaseMod.InputBaseComponentProps
import typingsSlinky.atMaterialDashUiCore.textFieldMod.default
import typingsSlinky.atMaterialDashUiCore.textFieldTextFieldMod.TextFieldProps
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TextField
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.atMaterialDashUiCore.textFieldMod.default].asInstanceOf[String | js.Object]
  /* The following DOM/SVG props were specified: autoComplete, autoComplete, autoComplete, autoComplete, autoFocus, autoFocus, autoFocus, autoFocus, className, className, className, className, contentEditable, contentEditable, contentEditable, contentEditable, dangerouslySetInnerHTML, dangerouslySetInnerHTML, dangerouslySetInnerHTML, dangerouslySetInnerHTML, defaultChecked, defaultChecked, defaultChecked, defaultChecked, defaultValue, defaultValue, defaultValue, defaultValue, dir, dir, dir, dir, disabled, disabled, disabled, disabled, draggable, draggable, draggable, draggable, hidden, hidden, hidden, hidden, id, id, id, id, lang, lang, lang, lang, manifest, manifest, manifest, manifest, name, name, name, name, onAbort, onAbort, onAbort, onAbort, onAnimationEnd, onAnimationEnd, onAnimationEnd, onAnimationEnd, onAnimationIteration, onAnimationIteration, onAnimationIteration, onAnimationIteration, onAnimationStart, onAnimationStart, onAnimationStart, onAnimationStart, onBlur, onBlur, onBlur, onBlur, onCanPlay, onCanPlay, onCanPlay, onCanPlay, onCanPlayThrough, onCanPlayThrough, onCanPlayThrough, onCanPlayThrough, onChange, onChange, onChange, onChange, onClick, onClick, onClick, onClick, onCompositionEnd, onCompositionEnd, onCompositionEnd, onCompositionEnd, onCompositionStart, onCompositionStart, onCompositionStart, onCompositionStart, onCompositionUpdate, onCompositionUpdate, onCompositionUpdate, onCompositionUpdate, onContextMenu, onContextMenu, onContextMenu, onContextMenu, onCopy, onCopy, onCopy, onCopy, onCut, onCut, onCut, onCut, onDoubleClick, onDoubleClick, onDoubleClick, onDoubleClick, onDrag, onDrag, onDrag, onDrag, onDragEnd, onDragEnd, onDragEnd, onDragEnd, onDragEnter, onDragEnter, onDragEnter, onDragEnter, onDragExit, onDragExit, onDragExit, onDragExit, onDragLeave, onDragLeave, onDragLeave, onDragLeave, onDragOver, onDragOver, onDragOver, onDragOver, onDragStart, onDragStart, onDragStart, onDragStart, onDrop, onDrop, onDrop, onDrop, onDurationChange, onDurationChange, onDurationChange, onDurationChange, onEmptied, onEmptied, onEmptied, onEmptied, onEncrypted, onEncrypted, onEncrypted, onEncrypted, onEnded, onEnded, onEnded, onEnded, onError, onError, onError, onError, onFocus, onFocus, onFocus, onFocus, onInput, onInput, onInput, onInput, onInvalid, onInvalid, onInvalid, onInvalid, onKeyDown, onKeyDown, onKeyDown, onKeyDown, onKeyPress, onKeyPress, onKeyPress, onKeyPress, onKeyUp, onKeyUp, onKeyUp, onKeyUp, onLoad, onLoad, onLoad, onLoad, onLoadStart, onLoadStart, onLoadStart, onLoadStart, onLoadedData, onLoadedData, onLoadedData, onLoadedData, onLoadedMetadata, onLoadedMetadata, onLoadedMetadata, onLoadedMetadata, onMouseDown, onMouseDown, onMouseDown, onMouseDown, onMouseEnter, onMouseEnter, onMouseEnter, onMouseEnter, onMouseLeave, onMouseLeave, onMouseLeave, onMouseLeave, onMouseMove, onMouseMove, onMouseMove, onMouseMove, onMouseOut, onMouseOut, onMouseOut, onMouseOut, onMouseOver, onMouseOver, onMouseOver, onMouseOver, onMouseUp, onMouseUp, onMouseUp, onMouseUp, onPaste, onPaste, onPaste, onPaste, onPause, onPause, onPause, onPause, onPlay, onPlay, onPlay, onPlay, onPlaying, onPlaying, onPlaying, onPlaying, onPointerCancel, onPointerCancel, onPointerCancel, onPointerCancel, onPointerDown, onPointerDown, onPointerDown, onPointerDown, onPointerEnter, onPointerEnter, onPointerEnter, onPointerEnter, onPointerLeave, onPointerLeave, onPointerLeave, onPointerLeave, onPointerMove, onPointerMove, onPointerMove, onPointerMove, onPointerOut, onPointerOut, onPointerOut, onPointerOut, onPointerOver, onPointerOver, onPointerOver, onPointerOver, onPointerUp, onPointerUp, onPointerUp, onPointerUp, onProgress, onProgress, onProgress, onProgress, onRateChange, onRateChange, onRateChange, onRateChange, onScroll, onScroll, onScroll, onScroll, onSeeked, onSeeked, onSeeked, onSeeked, onSeeking, onSeeking, onSeeking, onSeeking, onSelect, onSelect, onSelect, onSelect, onStalled, onStalled, onStalled, onStalled, onSubmit, onSubmit, onSubmit, onSubmit, onSuspend, onSuspend, onSuspend, onSuspend, onTimeUpdate, onTimeUpdate, onTimeUpdate, onTimeUpdate, onTouchCancel, onTouchCancel, onTouchCancel, onTouchCancel, onTouchEnd, onTouchEnd, onTouchEnd, onTouchEnd, onTouchMove, onTouchMove, onTouchMove, onTouchMove, onTouchStart, onTouchStart, onTouchStart, onTouchStart, onTransitionEnd, onTransitionEnd, onTransitionEnd, onTransitionEnd, onVolumeChange, onVolumeChange, onVolumeChange, onVolumeChange, onWaiting, onWaiting, onWaiting, onWaiting, onWheel, onWheel, onWheel, onWheel, placeholder, placeholder, placeholder, placeholder, required, required, required, required, spellCheck, spellCheck, spellCheck, spellCheck, suppressContentEditableWarning, suppressContentEditableWarning, suppressContentEditableWarning, suppressContentEditableWarning, tabIndex, tabIndex, tabIndex, tabIndex, type, type, type, type, value, value, value, value */
  def StandardTextFieldProps(
    FormHelperTextProps: PartialFormHelperTextProps = null,
    InputLabelProps: PartialInputLabelProps = null,
    InputProps: PartialInputProps = null,
    SelectProps: PartialSelectProps = null,
    about: String = null,
    accessKey: String = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: Int | Double = null,
    `aria-colindex`: Int | Double = null,
    `aria-colspan`: Int | Double = null,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: Int | Double = null,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: Int | Double = null,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: Int | Double = null,
    `aria-rowindex`: Int | Double = null,
    `aria-rowspan`: Int | Double = null,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: Int | Double = null,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: Int | Double = null,
    `aria-valuemin`: Int | Double = null,
    `aria-valuenow`: Int | Double = null,
    `aria-valuetext`: String = null,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoSave: String = null,
    classes: PartialClassNameMapTextFieldClassKey = null,
    color: String = null,
    component: ReactComponentClass[FormControlProps] = null,
    contextMenu: String = null,
    datatype: String = null,
    error: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    helperText: TagMod[Any] = null,
    inlist: js.Any = null,
    innerRef: Ref[_] | ReactRef[_] = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    inputProps: InputBaseComponentProps = null,
    inputRef: Ref[_] | ReactRef[_] = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    label: TagMod[Any] = null,
    margin: Margin = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    onAuxClick: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onBeforeInput: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit = null,
    onReset: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    rows: String | Double = null,
    rowsMax: String | Double = null,
    security: String = null,
    select: js.UndefOr[Boolean] = js.undefined,
    slot: String = null,
    style: CSSProperties = null,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    translate: yes | no = null,
    typeof: String = null,
    unselectable: on | off = null,
    variant: standard = null,
    vocab: String = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (FormHelperTextProps != null) __obj.updateDynamic("FormHelperTextProps")(FormHelperTextProps.asInstanceOf[js.Any])
    if (InputLabelProps != null) __obj.updateDynamic("InputLabelProps")(InputLabelProps.asInstanceOf[js.Any])
    if (InputProps != null) __obj.updateDynamic("InputProps")(InputProps.asInstanceOf[js.Any])
    if (SelectProps != null) __obj.updateDynamic("SelectProps")(SelectProps.asInstanceOf[js.Any])
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (helperText != null) __obj.updateDynamic("helperText")(helperText.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowsMax != null) __obj.updateDynamic("rowsMax")(rowsMax.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (!js.isUndefined(select)) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  /* The following DOM/SVG props were specified: autoComplete, autoComplete, autoComplete, autoComplete, autoComplete, autoFocus, autoFocus, autoFocus, autoFocus, autoFocus, className, className, className, className, className, contentEditable, contentEditable, contentEditable, contentEditable, contentEditable, dangerouslySetInnerHTML, dangerouslySetInnerHTML, dangerouslySetInnerHTML, dangerouslySetInnerHTML, dangerouslySetInnerHTML, defaultChecked, defaultChecked, defaultChecked, defaultChecked, defaultChecked, defaultValue, defaultValue, defaultValue, defaultValue, defaultValue, dir, dir, dir, dir, dir, disabled, disabled, disabled, disabled, disabled, draggable, draggable, draggable, draggable, draggable, hidden, hidden, hidden, hidden, hidden, id, id, id, id, id, lang, lang, lang, lang, lang, manifest, manifest, manifest, manifest, manifest, name, name, name, name, name, onAbort, onAbort, onAbort, onAbort, onAbort, onAnimationEnd, onAnimationEnd, onAnimationEnd, onAnimationEnd, onAnimationEnd, onAnimationIteration, onAnimationIteration, onAnimationIteration, onAnimationIteration, onAnimationIteration, onAnimationStart, onAnimationStart, onAnimationStart, onAnimationStart, onAnimationStart, onBlur, onBlur, onBlur, onBlur, onBlur, onCanPlay, onCanPlay, onCanPlay, onCanPlay, onCanPlay, onCanPlayThrough, onCanPlayThrough, onCanPlayThrough, onCanPlayThrough, onCanPlayThrough, onChange, onChange, onChange, onChange, onChange, onClick, onClick, onClick, onClick, onClick, onCompositionEnd, onCompositionEnd, onCompositionEnd, onCompositionEnd, onCompositionEnd, onCompositionStart, onCompositionStart, onCompositionStart, onCompositionStart, onCompositionStart, onCompositionUpdate, onCompositionUpdate, onCompositionUpdate, onCompositionUpdate, onCompositionUpdate, onContextMenu, onContextMenu, onContextMenu, onContextMenu, onContextMenu, onCopy, onCopy, onCopy, onCopy, onCopy, onCut, onCut, onCut, onCut, onCut, onDoubleClick, onDoubleClick, onDoubleClick, onDoubleClick, onDoubleClick, onDrag, onDrag, onDrag, onDrag, onDrag, onDragEnd, onDragEnd, onDragEnd, onDragEnd, onDragEnd, onDragEnter, onDragEnter, onDragEnter, onDragEnter, onDragEnter, onDragExit, onDragExit, onDragExit, onDragExit, onDragExit, onDragLeave, onDragLeave, onDragLeave, onDragLeave, onDragLeave, onDragOver, onDragOver, onDragOver, onDragOver, onDragOver, onDragStart, onDragStart, onDragStart, onDragStart, onDragStart, onDrop, onDrop, onDrop, onDrop, onDrop, onDurationChange, onDurationChange, onDurationChange, onDurationChange, onDurationChange, onEmptied, onEmptied, onEmptied, onEmptied, onEmptied, onEncrypted, onEncrypted, onEncrypted, onEncrypted, onEncrypted, onEnded, onEnded, onEnded, onEnded, onEnded, onError, onError, onError, onError, onError, onFocus, onFocus, onFocus, onFocus, onFocus, onInput, onInput, onInput, onInput, onInput, onInvalid, onInvalid, onInvalid, onInvalid, onInvalid, onKeyDown, onKeyDown, onKeyDown, onKeyDown, onKeyDown, onKeyPress, onKeyPress, onKeyPress, onKeyPress, onKeyPress, onKeyUp, onKeyUp, onKeyUp, onKeyUp, onKeyUp, onLoad, onLoad, onLoad, onLoad, onLoad, onLoadStart, onLoadStart, onLoadStart, onLoadStart, onLoadStart, onLoadedData, onLoadedData, onLoadedData, onLoadedData, onLoadedData, onLoadedMetadata, onLoadedMetadata, onLoadedMetadata, onLoadedMetadata, onLoadedMetadata, onMouseDown, onMouseDown, onMouseDown, onMouseDown, onMouseDown, onMouseEnter, onMouseEnter, onMouseEnter, onMouseEnter, onMouseEnter, onMouseLeave, onMouseLeave, onMouseLeave, onMouseLeave, onMouseLeave, onMouseMove, onMouseMove, onMouseMove, onMouseMove, onMouseMove, onMouseOut, onMouseOut, onMouseOut, onMouseOut, onMouseOut, onMouseOver, onMouseOver, onMouseOver, onMouseOver, onMouseOver, onMouseUp, onMouseUp, onMouseUp, onMouseUp, onMouseUp, onPaste, onPaste, onPaste, onPaste, onPaste, onPause, onPause, onPause, onPause, onPause, onPlay, onPlay, onPlay, onPlay, onPlay, onPlaying, onPlaying, onPlaying, onPlaying, onPlaying, onPointerCancel, onPointerCancel, onPointerCancel, onPointerCancel, onPointerCancel, onPointerDown, onPointerDown, onPointerDown, onPointerDown, onPointerDown, onPointerEnter, onPointerEnter, onPointerEnter, onPointerEnter, onPointerEnter, onPointerLeave, onPointerLeave, onPointerLeave, onPointerLeave, onPointerLeave, onPointerMove, onPointerMove, onPointerMove, onPointerMove, onPointerMove, onPointerOut, onPointerOut, onPointerOut, onPointerOut, onPointerOut, onPointerOver, onPointerOver, onPointerOver, onPointerOver, onPointerOver, onPointerUp, onPointerUp, onPointerUp, onPointerUp, onPointerUp, onProgress, onProgress, onProgress, onProgress, onProgress, onRateChange, onRateChange, onRateChange, onRateChange, onRateChange, onScroll, onScroll, onScroll, onScroll, onScroll, onSeeked, onSeeked, onSeeked, onSeeked, onSeeked, onSeeking, onSeeking, onSeeking, onSeeking, onSeeking, onSelect, onSelect, onSelect, onSelect, onSelect, onStalled, onStalled, onStalled, onStalled, onStalled, onSubmit, onSubmit, onSubmit, onSubmit, onSubmit, onSuspend, onSuspend, onSuspend, onSuspend, onSuspend, onTimeUpdate, onTimeUpdate, onTimeUpdate, onTimeUpdate, onTimeUpdate, onTouchCancel, onTouchCancel, onTouchCancel, onTouchCancel, onTouchCancel, onTouchEnd, onTouchEnd, onTouchEnd, onTouchEnd, onTouchEnd, onTouchMove, onTouchMove, onTouchMove, onTouchMove, onTouchMove, onTouchStart, onTouchStart, onTouchStart, onTouchStart, onTouchStart, onTransitionEnd, onTransitionEnd, onTransitionEnd, onTransitionEnd, onTransitionEnd, onVolumeChange, onVolumeChange, onVolumeChange, onVolumeChange, onVolumeChange, onWaiting, onWaiting, onWaiting, onWaiting, onWaiting, onWheel, onWheel, onWheel, onWheel, onWheel, placeholder, placeholder, placeholder, placeholder, placeholder, required, required, required, required, required, spellCheck, spellCheck, spellCheck, spellCheck, spellCheck, suppressContentEditableWarning, suppressContentEditableWarning, suppressContentEditableWarning, suppressContentEditableWarning, suppressContentEditableWarning, tabIndex, tabIndex, tabIndex, tabIndex, tabIndex, type, type, type, type, type, value, value, value, value, value */
  def FilledTextFieldProps(
    variant: filled,
    FormHelperTextProps: PartialFormHelperTextProps = null,
    InputLabelProps: PartialInputLabelProps = null,
    InputProps: PartialFilledInputProps = null,
    SelectProps: PartialSelectProps = null,
    about: String = null,
    accessKey: String = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: Int | Double = null,
    `aria-colindex`: Int | Double = null,
    `aria-colspan`: Int | Double = null,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: Int | Double = null,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: Int | Double = null,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: Int | Double = null,
    `aria-rowindex`: Int | Double = null,
    `aria-rowspan`: Int | Double = null,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: Int | Double = null,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: Int | Double = null,
    `aria-valuemin`: Int | Double = null,
    `aria-valuenow`: Int | Double = null,
    `aria-valuetext`: String = null,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoSave: String = null,
    classes: PartialClassNameMapTextFieldClassKey = null,
    color: String = null,
    component: ReactComponentClass[FormControlProps] = null,
    contextMenu: String = null,
    datatype: String = null,
    error: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    helperText: TagMod[Any] = null,
    inlist: js.Any = null,
    innerRef: Ref[_] | ReactRef[_] = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    inputProps: InputBaseComponentProps = null,
    inputRef: Ref[_] | ReactRef[_] = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    label: TagMod[Any] = null,
    margin: Margin = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    onAuxClick: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onBeforeInput: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit = null,
    onReset: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    rows: String | Double = null,
    rowsMax: String | Double = null,
    security: String = null,
    select: js.UndefOr[Boolean] = js.undefined,
    slot: String = null,
    style: CSSProperties = null,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    translate: yes | no = null,
    typeof: String = null,
    unselectable: on | off = null,
    vocab: String = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(variant = variant.asInstanceOf[js.Any])
    if (FormHelperTextProps != null) __obj.updateDynamic("FormHelperTextProps")(FormHelperTextProps.asInstanceOf[js.Any])
    if (InputLabelProps != null) __obj.updateDynamic("InputLabelProps")(InputLabelProps.asInstanceOf[js.Any])
    if (InputProps != null) __obj.updateDynamic("InputProps")(InputProps.asInstanceOf[js.Any])
    if (SelectProps != null) __obj.updateDynamic("SelectProps")(SelectProps.asInstanceOf[js.Any])
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (helperText != null) __obj.updateDynamic("helperText")(helperText.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowsMax != null) __obj.updateDynamic("rowsMax")(rowsMax.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (!js.isUndefined(select)) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  /* The following DOM/SVG props were specified: autoComplete, autoComplete, autoComplete, autoComplete, autoComplete, autoComplete, autoFocus, autoFocus, autoFocus, autoFocus, autoFocus, autoFocus, className, className, className, className, className, className, contentEditable, contentEditable, contentEditable, contentEditable, contentEditable, contentEditable, dangerouslySetInnerHTML, dangerouslySetInnerHTML, dangerouslySetInnerHTML, dangerouslySetInnerHTML, dangerouslySetInnerHTML, dangerouslySetInnerHTML, defaultChecked, defaultChecked, defaultChecked, defaultChecked, defaultChecked, defaultChecked, defaultValue, defaultValue, defaultValue, defaultValue, defaultValue, defaultValue, dir, dir, dir, dir, dir, dir, disabled, disabled, disabled, disabled, disabled, disabled, draggable, draggable, draggable, draggable, draggable, draggable, hidden, hidden, hidden, hidden, hidden, hidden, id, id, id, id, id, id, lang, lang, lang, lang, lang, lang, manifest, manifest, manifest, manifest, manifest, manifest, name, name, name, name, name, name, onAbort, onAbort, onAbort, onAbort, onAbort, onAbort, onAnimationEnd, onAnimationEnd, onAnimationEnd, onAnimationEnd, onAnimationEnd, onAnimationEnd, onAnimationIteration, onAnimationIteration, onAnimationIteration, onAnimationIteration, onAnimationIteration, onAnimationIteration, onAnimationStart, onAnimationStart, onAnimationStart, onAnimationStart, onAnimationStart, onAnimationStart, onBlur, onBlur, onBlur, onBlur, onBlur, onBlur, onCanPlay, onCanPlay, onCanPlay, onCanPlay, onCanPlay, onCanPlay, onCanPlayThrough, onCanPlayThrough, onCanPlayThrough, onCanPlayThrough, onCanPlayThrough, onCanPlayThrough, onChange, onChange, onChange, onChange, onChange, onChange, onClick, onClick, onClick, onClick, onClick, onClick, onCompositionEnd, onCompositionEnd, onCompositionEnd, onCompositionEnd, onCompositionEnd, onCompositionEnd, onCompositionStart, onCompositionStart, onCompositionStart, onCompositionStart, onCompositionStart, onCompositionStart, onCompositionUpdate, onCompositionUpdate, onCompositionUpdate, onCompositionUpdate, onCompositionUpdate, onCompositionUpdate, onContextMenu, onContextMenu, onContextMenu, onContextMenu, onContextMenu, onContextMenu, onCopy, onCopy, onCopy, onCopy, onCopy, onCopy, onCut, onCut, onCut, onCut, onCut, onCut, onDoubleClick, onDoubleClick, onDoubleClick, onDoubleClick, onDoubleClick, onDoubleClick, onDrag, onDrag, onDrag, onDrag, onDrag, onDrag, onDragEnd, onDragEnd, onDragEnd, onDragEnd, onDragEnd, onDragEnd, onDragEnter, onDragEnter, onDragEnter, onDragEnter, onDragEnter, onDragEnter, onDragExit, onDragExit, onDragExit, onDragExit, onDragExit, onDragExit, onDragLeave, onDragLeave, onDragLeave, onDragLeave, onDragLeave, onDragLeave, onDragOver, onDragOver, onDragOver, onDragOver, onDragOver, onDragOver, onDragStart, onDragStart, onDragStart, onDragStart, onDragStart, onDragStart, onDrop, onDrop, onDrop, onDrop, onDrop, onDrop, onDurationChange, onDurationChange, onDurationChange, onDurationChange, onDurationChange, onDurationChange, onEmptied, onEmptied, onEmptied, onEmptied, onEmptied, onEmptied, onEncrypted, onEncrypted, onEncrypted, onEncrypted, onEncrypted, onEncrypted, onEnded, onEnded, onEnded, onEnded, onEnded, onEnded, onError, onError, onError, onError, onError, onError, onFocus, onFocus, onFocus, onFocus, onFocus, onFocus, onInput, onInput, onInput, onInput, onInput, onInput, onInvalid, onInvalid, onInvalid, onInvalid, onInvalid, onInvalid, onKeyDown, onKeyDown, onKeyDown, onKeyDown, onKeyDown, onKeyDown, onKeyPress, onKeyPress, onKeyPress, onKeyPress, onKeyPress, onKeyPress, onKeyUp, onKeyUp, onKeyUp, onKeyUp, onKeyUp, onKeyUp, onLoad, onLoad, onLoad, onLoad, onLoad, onLoad, onLoadStart, onLoadStart, onLoadStart, onLoadStart, onLoadStart, onLoadStart, onLoadedData, onLoadedData, onLoadedData, onLoadedData, onLoadedData, onLoadedData, onLoadedMetadata, onLoadedMetadata, onLoadedMetadata, onLoadedMetadata, onLoadedMetadata, onLoadedMetadata, onMouseDown, onMouseDown, onMouseDown, onMouseDown, onMouseDown, onMouseDown, onMouseEnter, onMouseEnter, onMouseEnter, onMouseEnter, onMouseEnter, onMouseEnter, onMouseLeave, onMouseLeave, onMouseLeave, onMouseLeave, onMouseLeave, onMouseLeave, onMouseMove, onMouseMove, onMouseMove, onMouseMove, onMouseMove, onMouseMove, onMouseOut, onMouseOut, onMouseOut, onMouseOut, onMouseOut, onMouseOut, onMouseOver, onMouseOver, onMouseOver, onMouseOver, onMouseOver, onMouseOver, onMouseUp, onMouseUp, onMouseUp, onMouseUp, onMouseUp, onMouseUp, onPaste, onPaste, onPaste, onPaste, onPaste, onPaste, onPause, onPause, onPause, onPause, onPause, onPause, onPlay, onPlay, onPlay, onPlay, onPlay, onPlay, onPlaying, onPlaying, onPlaying, onPlaying, onPlaying, onPlaying, onPointerCancel, onPointerCancel, onPointerCancel, onPointerCancel, onPointerCancel, onPointerCancel, onPointerDown, onPointerDown, onPointerDown, onPointerDown, onPointerDown, onPointerDown, onPointerEnter, onPointerEnter, onPointerEnter, onPointerEnter, onPointerEnter, onPointerEnter, onPointerLeave, onPointerLeave, onPointerLeave, onPointerLeave, onPointerLeave, onPointerLeave, onPointerMove, onPointerMove, onPointerMove, onPointerMove, onPointerMove, onPointerMove, onPointerOut, onPointerOut, onPointerOut, onPointerOut, onPointerOut, onPointerOut, onPointerOver, onPointerOver, onPointerOver, onPointerOver, onPointerOver, onPointerOver, onPointerUp, onPointerUp, onPointerUp, onPointerUp, onPointerUp, onPointerUp, onProgress, onProgress, onProgress, onProgress, onProgress, onProgress, onRateChange, onRateChange, onRateChange, onRateChange, onRateChange, onRateChange, onScroll, onScroll, onScroll, onScroll, onScroll, onScroll, onSeeked, onSeeked, onSeeked, onSeeked, onSeeked, onSeeked, onSeeking, onSeeking, onSeeking, onSeeking, onSeeking, onSeeking, onSelect, onSelect, onSelect, onSelect, onSelect, onSelect, onStalled, onStalled, onStalled, onStalled, onStalled, onStalled, onSubmit, onSubmit, onSubmit, onSubmit, onSubmit, onSubmit, onSuspend, onSuspend, onSuspend, onSuspend, onSuspend, onSuspend, onTimeUpdate, onTimeUpdate, onTimeUpdate, onTimeUpdate, onTimeUpdate, onTimeUpdate, onTouchCancel, onTouchCancel, onTouchCancel, onTouchCancel, onTouchCancel, onTouchCancel, onTouchEnd, onTouchEnd, onTouchEnd, onTouchEnd, onTouchEnd, onTouchEnd, onTouchMove, onTouchMove, onTouchMove, onTouchMove, onTouchMove, onTouchMove, onTouchStart, onTouchStart, onTouchStart, onTouchStart, onTouchStart, onTouchStart, onTransitionEnd, onTransitionEnd, onTransitionEnd, onTransitionEnd, onTransitionEnd, onTransitionEnd, onVolumeChange, onVolumeChange, onVolumeChange, onVolumeChange, onVolumeChange, onVolumeChange, onWaiting, onWaiting, onWaiting, onWaiting, onWaiting, onWaiting, onWheel, onWheel, onWheel, onWheel, onWheel, onWheel, placeholder, placeholder, placeholder, placeholder, placeholder, placeholder, required, required, required, required, required, required, spellCheck, spellCheck, spellCheck, spellCheck, spellCheck, spellCheck, suppressContentEditableWarning, suppressContentEditableWarning, suppressContentEditableWarning, suppressContentEditableWarning, suppressContentEditableWarning, suppressContentEditableWarning, tabIndex, tabIndex, tabIndex, tabIndex, tabIndex, tabIndex, type, type, type, type, type, type, value, value, value, value, value, value */
  def OutlinedTextFieldProps(
    variant: outlined,
    FormHelperTextProps: PartialFormHelperTextProps = null,
    InputLabelProps: PartialInputLabelProps = null,
    InputProps: PartialOutlinedInputProps = null,
    SelectProps: PartialSelectProps = null,
    about: String = null,
    accessKey: String = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: Int | Double = null,
    `aria-colindex`: Int | Double = null,
    `aria-colspan`: Int | Double = null,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: Int | Double = null,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: Int | Double = null,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: Int | Double = null,
    `aria-rowindex`: Int | Double = null,
    `aria-rowspan`: Int | Double = null,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: Int | Double = null,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: Int | Double = null,
    `aria-valuemin`: Int | Double = null,
    `aria-valuenow`: Int | Double = null,
    `aria-valuetext`: String = null,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoSave: String = null,
    classes: PartialClassNameMapTextFieldClassKey = null,
    color: String = null,
    component: ReactComponentClass[FormControlProps] = null,
    contextMenu: String = null,
    datatype: String = null,
    error: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    helperText: TagMod[Any] = null,
    inlist: js.Any = null,
    innerRef: Ref[_] | ReactRef[_] = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    inputProps: InputBaseComponentProps = null,
    inputRef: Ref[_] | ReactRef[_] = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    label: TagMod[Any] = null,
    margin: Margin = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    onAuxClick: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onBeforeInput: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit = null,
    onReset: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    rows: String | Double = null,
    rowsMax: String | Double = null,
    security: String = null,
    select: js.UndefOr[Boolean] = js.undefined,
    slot: String = null,
    style: CSSProperties = null,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    translate: yes | no = null,
    typeof: String = null,
    unselectable: on | off = null,
    vocab: String = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(variant = variant.asInstanceOf[js.Any])
    if (FormHelperTextProps != null) __obj.updateDynamic("FormHelperTextProps")(FormHelperTextProps.asInstanceOf[js.Any])
    if (InputLabelProps != null) __obj.updateDynamic("InputLabelProps")(InputLabelProps.asInstanceOf[js.Any])
    if (InputProps != null) __obj.updateDynamic("InputProps")(InputProps.asInstanceOf[js.Any])
    if (SelectProps != null) __obj.updateDynamic("SelectProps")(SelectProps.asInstanceOf[js.Any])
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (helperText != null) __obj.updateDynamic("helperText")(helperText.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowsMax != null) __obj.updateDynamic("rowsMax")(rowsMax.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (!js.isUndefined(select)) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TextFieldProps
}

