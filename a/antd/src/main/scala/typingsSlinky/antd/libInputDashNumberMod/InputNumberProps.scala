package typingsSlinky.antd.libInputDashNumberMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
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
import typingsSlinky.antd.antdStrings.`additions text`
import typingsSlinky.antd.antdStrings.`inline`
import typingsSlinky.antd.antdStrings.additions
import typingsSlinky.antd.antdStrings.all
import typingsSlinky.antd.antdStrings.ascending
import typingsSlinky.antd.antdStrings.assertive
import typingsSlinky.antd.antdStrings.both
import typingsSlinky.antd.antdStrings.copy
import typingsSlinky.antd.antdStrings.date
import typingsSlinky.antd.antdStrings.decimal
import typingsSlinky.antd.antdStrings.descending
import typingsSlinky.antd.antdStrings.dialog
import typingsSlinky.antd.antdStrings.email
import typingsSlinky.antd.antdStrings.execute
import typingsSlinky.antd.antdStrings.grammar
import typingsSlinky.antd.antdStrings.grid
import typingsSlinky.antd.antdStrings.horizontal
import typingsSlinky.antd.antdStrings.large
import typingsSlinky.antd.antdStrings.link
import typingsSlinky.antd.antdStrings.list
import typingsSlinky.antd.antdStrings.listbox
import typingsSlinky.antd.antdStrings.location
import typingsSlinky.antd.antdStrings.menu
import typingsSlinky.antd.antdStrings.mixed
import typingsSlinky.antd.antdStrings.move
import typingsSlinky.antd.antdStrings.no
import typingsSlinky.antd.antdStrings.none
import typingsSlinky.antd.antdStrings.numeric
import typingsSlinky.antd.antdStrings.off
import typingsSlinky.antd.antdStrings.on
import typingsSlinky.antd.antdStrings.other
import typingsSlinky.antd.antdStrings.page
import typingsSlinky.antd.antdStrings.polite
import typingsSlinky.antd.antdStrings.popup
import typingsSlinky.antd.antdStrings.removals
import typingsSlinky.antd.antdStrings.search
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.antd.antdStrings.spelling
import typingsSlinky.antd.antdStrings.step
import typingsSlinky.antd.antdStrings.tel
import typingsSlinky.antd.antdStrings.text
import typingsSlinky.antd.antdStrings.time
import typingsSlinky.antd.antdStrings.tree
import typingsSlinky.antd.antdStrings.url
import typingsSlinky.antd.antdStrings.vertical
import typingsSlinky.antd.antdStrings.yes
import typingsSlinky.react.Anon_Html
import typingsSlinky.react.reactMod.AnimationEventHandler
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.ClipboardEventHandler
import typingsSlinky.react.reactMod.CompositionEventHandler
import typingsSlinky.react.reactMod.DragEvent
import typingsSlinky.react.reactMod.DragEventHandler
import typingsSlinky.react.reactMod.FocusEventHandler
import typingsSlinky.react.reactMod.FormEventHandler
import typingsSlinky.react.reactMod.KeyboardEventHandler
import typingsSlinky.react.reactMod.MouseEventHandler
import typingsSlinky.react.reactMod.PointerEventHandler
import typingsSlinky.react.reactMod.ReactEventHandler
import typingsSlinky.react.reactMod.TouchEventHandler
import typingsSlinky.react.reactMod.TransitionEventHandler
import typingsSlinky.react.reactMod.UIEventHandler
import typingsSlinky.react.reactMod.WheelEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent antd.antd/lib/_util/type.Omit<react.react.InputHTMLAttributes<std.HTMLInputElement>, antd.antd/lib/input-number.OmitAttrs> */
trait InputNumberProps extends js.Object {
  var about: js.UndefOr[String] = js.undefined
  var accept: js.UndefOr[String] = js.undefined
  var accessKey: js.UndefOr[String] = js.undefined
  var alt: js.UndefOr[String] = js.undefined
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
  var `aria-busy`: js.UndefOr[Boolean] = js.undefined
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-colcount`: js.UndefOr[Double] = js.undefined
  var `aria-colindex`: js.UndefOr[Double] = js.undefined
  var `aria-colspan`: js.UndefOr[Double] = js.undefined
  var `aria-controls`: js.UndefOr[String] = js.undefined
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  var `aria-details`: js.UndefOr[String] = js.undefined
  var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
  var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
  var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  var `aria-label`: js.UndefOr[String] = js.undefined
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  var `aria-level`: js.UndefOr[Double] = js.undefined
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  var `aria-modal`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiline`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  var `aria-owns`: js.UndefOr[String] = js.undefined
  var `aria-placeholder`: js.UndefOr[String] = js.undefined
  var `aria-posinset`: js.UndefOr[Double] = js.undefined
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.undefined
  var `aria-required`: js.UndefOr[Boolean] = js.undefined
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  var `aria-rowcount`: js.UndefOr[Double] = js.undefined
  var `aria-rowindex`: js.UndefOr[Double] = js.undefined
  var `aria-rowspan`: js.UndefOr[Double] = js.undefined
  var `aria-selected`: js.UndefOr[Boolean] = js.undefined
  var `aria-setsize`: js.UndefOr[Double] = js.undefined
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  var `aria-valuemax`: js.UndefOr[Double] = js.undefined
  var `aria-valuemin`: js.UndefOr[Double] = js.undefined
  var `aria-valuenow`: js.UndefOr[Double] = js.undefined
  var `aria-valuetext`: js.UndefOr[String] = js.undefined
  var autoCapitalize: js.UndefOr[String] = js.undefined
  var autoComplete: js.UndefOr[String] = js.undefined
  var autoCorrect: js.UndefOr[String] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var autoSave: js.UndefOr[String] = js.undefined
  var capture: js.UndefOr[Boolean | String] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var contentEditable: js.UndefOr[Boolean] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[Anon_Html] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var decimalSeparator: js.UndefOr[String] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[Double] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var form: js.UndefOr[String] = js.undefined
  var formAction: js.UndefOr[String] = js.undefined
  var formEncType: js.UndefOr[String] = js.undefined
  var formMethod: js.UndefOr[String] = js.undefined
  var formNoValidate: js.UndefOr[Boolean] = js.undefined
  var formTarget: js.UndefOr[String] = js.undefined
  var formatter: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | String], String]] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  var is: js.UndefOr[String] = js.undefined
  var itemID: js.UndefOr[String] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var itemRef: js.UndefOr[String] = js.undefined
  var itemScope: js.UndefOr[Boolean] = js.undefined
  var itemType: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var list: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onAbort: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.undefined
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.undefined
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onDrag: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
  var onDragExit: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
  var onDragOver: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
  var onDragStart: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
  var onDrop: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.undefined
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onEnded: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onError: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  var onInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
  var onInvalid: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
  var onLoad: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
  var onPause: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.undefined
  var onPressEnter: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
  var onProgress: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onReset: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
  var onScroll: js.UndefOr[UIEventHandler[HTMLInputElement]] = js.undefined
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onSelect: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onStalled: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onSubmit: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.undefined
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLInputElement]] = js.undefined
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.undefined
  var onWheel: js.UndefOr[WheelEventHandler[HTMLInputElement]] = js.undefined
  var parser: js.UndefOr[js.Function1[/* displayValue */ js.UndefOr[String], Double | String]] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var radioGroup: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var security: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[large | small | typingsSlinky.antd.antdStrings.default] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var spellCheck: js.UndefOr[Boolean] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var step: js.UndefOr[Double | String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var translate: js.UndefOr[yes | no] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var typeof: js.UndefOr[String] = js.undefined
  var unselectable: js.UndefOr[on | off] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var vocab: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object InputNumberProps {
  @scala.inline
  def apply(
    about: String = null,
    accept: String = null,
    accessKey: String = null,
    alt: String = null,
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
    autoComplete: String = null,
    autoCorrect: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autoSave: String = null,
    capture: Boolean | String = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    children: TagMod[Any] = null,
    className: String = null,
    color: String = null,
    contentEditable: js.UndefOr[Boolean] = js.undefined,
    contextMenu: String = null,
    crossOrigin: String = null,
    dangerouslySetInnerHTML: Anon_Html = null,
    datatype: String = null,
    decimalSeparator: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: Int | Double = null,
    dir: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    form: String = null,
    formAction: String = null,
    formEncType: String = null,
    formMethod: String = null,
    formNoValidate: js.UndefOr[Boolean] = js.undefined,
    formTarget: String = null,
    formatter: /* value */ js.UndefOr[Double | String] => String = null,
    height: Double | String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    lang: String = null,
    list: String = null,
    max: Int | Double = null,
    maxLength: Int | Double = null,
    min: Int | Double = null,
    minLength: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onAbort: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onAnimationEnd: SyntheticAnimationEvent[HTMLInputElement] => Unit = null,
    onAnimationIteration: SyntheticAnimationEvent[HTMLInputElement] => Unit = null,
    onAnimationStart: SyntheticAnimationEvent[HTMLInputElement] => Unit = null,
    onAuxClick: SyntheticMouseEvent[HTMLInputElement] => Unit = null,
    onBeforeInput: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit = null,
    onBlur: SyntheticFocusEvent[HTMLInputElement] => Unit = null,
    onCanPlay: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onCanPlayThrough: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onChange: /* value */ js.UndefOr[Double] => Unit = null,
    onClick: SyntheticMouseEvent[HTMLInputElement] => Unit = null,
    onCompositionEnd: SyntheticCompositionEvent[HTMLInputElement] => Unit = null,
    onCompositionStart: SyntheticCompositionEvent[HTMLInputElement] => Unit = null,
    onCompositionUpdate: SyntheticCompositionEvent[HTMLInputElement] => Unit = null,
    onContextMenu: SyntheticMouseEvent[HTMLInputElement] => Unit = null,
    onCopy: SyntheticClipboardEvent[HTMLInputElement] => Unit = null,
    onCut: SyntheticClipboardEvent[HTMLInputElement] => Unit = null,
    onDoubleClick: SyntheticMouseEvent[HTMLInputElement] => Unit = null,
    onDrag: DragEvent[HTMLInputElement] => Unit = null,
    onDragEnd: DragEvent[HTMLInputElement] => Unit = null,
    onDragEnter: DragEvent[HTMLInputElement] => Unit = null,
    onDragExit: DragEvent[HTMLInputElement] => Unit = null,
    onDragLeave: DragEvent[HTMLInputElement] => Unit = null,
    onDragOver: DragEvent[HTMLInputElement] => Unit = null,
    onDragStart: DragEvent[HTMLInputElement] => Unit = null,
    onDrop: DragEvent[HTMLInputElement] => Unit = null,
    onDurationChange: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onEmptied: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onEncrypted: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onEnded: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onError: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onFocus: SyntheticFocusEvent[HTMLInputElement] => Unit = null,
    onInput: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit = null,
    onInvalid: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit = null,
    onKeyDown: SyntheticKeyboardEvent[HTMLInputElement] => Unit = null,
    onKeyPress: SyntheticKeyboardEvent[HTMLInputElement] => Unit = null,
    onKeyUp: SyntheticKeyboardEvent[HTMLInputElement] => Unit = null,
    onLoad: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onLoadStart: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onLoadedData: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onLoadedMetadata: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onMouseDown: SyntheticMouseEvent[HTMLInputElement] => Unit = null,
    onMouseEnter: SyntheticMouseEvent[HTMLInputElement] => Unit = null,
    onMouseLeave: SyntheticMouseEvent[HTMLInputElement] => Unit = null,
    onMouseMove: SyntheticMouseEvent[HTMLInputElement] => Unit = null,
    onMouseOut: SyntheticMouseEvent[HTMLInputElement] => Unit = null,
    onMouseOver: SyntheticMouseEvent[HTMLInputElement] => Unit = null,
    onMouseUp: SyntheticMouseEvent[HTMLInputElement] => Unit = null,
    onPaste: SyntheticClipboardEvent[HTMLInputElement] => Unit = null,
    onPause: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onPlay: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onPlaying: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onPointerCancel: SyntheticPointerEvent[HTMLInputElement] => Unit = null,
    onPointerDown: SyntheticPointerEvent[HTMLInputElement] => Unit = null,
    onPointerEnter: SyntheticPointerEvent[HTMLInputElement] => Unit = null,
    onPointerLeave: SyntheticPointerEvent[HTMLInputElement] => Unit = null,
    onPointerMove: SyntheticPointerEvent[HTMLInputElement] => Unit = null,
    onPointerOut: SyntheticPointerEvent[HTMLInputElement] => Unit = null,
    onPointerOver: SyntheticPointerEvent[HTMLInputElement] => Unit = null,
    onPointerUp: SyntheticPointerEvent[HTMLInputElement] => Unit = null,
    onPressEnter: SyntheticKeyboardEvent[HTMLInputElement] => Unit = null,
    onProgress: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onRateChange: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onReset: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit = null,
    onScroll: SyntheticUIEvent[HTMLInputElement] => Unit = null,
    onSeeked: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onSeeking: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onSelect: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onStalled: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onSubmit: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit = null,
    onSuspend: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onTimeUpdate: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onTouchCancel: SyntheticTouchEvent[HTMLInputElement] => Unit = null,
    onTouchEnd: SyntheticTouchEvent[HTMLInputElement] => Unit = null,
    onTouchMove: SyntheticTouchEvent[HTMLInputElement] => Unit = null,
    onTouchStart: SyntheticTouchEvent[HTMLInputElement] => Unit = null,
    onTransitionEnd: SyntheticTransitionEvent[HTMLInputElement] => Unit = null,
    onVolumeChange: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onWaiting: SyntheticEvent[Event, HTMLInputElement] => Unit = null,
    onWheel: SyntheticWheelEvent[HTMLInputElement] => Unit = null,
    parser: /* displayValue */ js.UndefOr[String] => Double | String = null,
    pattern: String = null,
    placeholder: String = null,
    precision: Int | Double = null,
    prefix: String = null,
    prefixCls: String = null,
    property: String = null,
    radioGroup: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    security: String = null,
    size: large | small | typingsSlinky.antd.antdStrings.default = null,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    src: String = null,
    step: Double | String = null,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    title: String = null,
    translate: yes | no = null,
    `type`: String = null,
    typeof: String = null,
    unselectable: on | off = null,
    value: Int | Double = null,
    vocab: String = null,
    width: Double | String = null
  ): InputNumberProps = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
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
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(contentEditable)) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formAction != null) __obj.updateDynamic("formAction")(formAction.asInstanceOf[js.Any])
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType.asInstanceOf[js.Any])
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate.asInstanceOf[js.Any])
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onPressEnter != null) __obj.updateDynamic("onPressEnter")(js.Any.fromFunction1(onPressEnter))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (parser != null) __obj.updateDynamic("parser")(js.Any.fromFunction1(parser))
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputNumberProps]
  }
}

