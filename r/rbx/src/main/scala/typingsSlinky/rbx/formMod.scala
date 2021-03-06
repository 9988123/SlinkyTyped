package typingsSlinky.rbx

import slinky.core.facade.ReactElement
import typingsSlinky.rbx.anon.AsElementType
import typingsSlinky.rbx.anon.PickBadgeHelpersPropsFloa
import typingsSlinky.rbx.anon.PreferHelpersPropsOverrid
import typingsSlinky.rbx.anon.PreferHelpersPropsOverridBackgroundColor
import typingsSlinky.rbx.anon.`6`
import typingsSlinky.rbx.controlMod.ControlProps
import typingsSlinky.rbx.exoticMod.ForwardRefAsExoticComponent
import typingsSlinky.rbx.exoticMod.FromReactType
import typingsSlinky.rbx.fieldLabelMod.FieldLabelProps
import typingsSlinky.rbx.fieldMod.FieldModifierProps
import typingsSlinky.rbx.fieldsetMod.FieldsetProps
import typingsSlinky.rbx.fileMod.FileModifierProps
import typingsSlinky.rbx.helpMod.HelpProps
import typingsSlinky.rbx.helpersMod.HelpersPropsOverrides
import typingsSlinky.rbx.inputMod.InputProps
import typingsSlinky.rbx.labelMod.LabelProps
import typingsSlinky.rbx.rbxStrings.align
import typingsSlinky.rbx.rbxStrings.as
import typingsSlinky.rbx.rbxStrings.backgroundColor
import typingsSlinky.rbx.rbxStrings.badge
import typingsSlinky.rbx.rbxStrings.badgeColor
import typingsSlinky.rbx.rbxStrings.badgeOutlined
import typingsSlinky.rbx.rbxStrings.badgeRounded
import typingsSlinky.rbx.rbxStrings.badgeSize
import typingsSlinky.rbx.rbxStrings.boxed
import typingsSlinky.rbx.rbxStrings.className
import typingsSlinky.rbx.rbxStrings.clearfix
import typingsSlinky.rbx.rbxStrings.clipped
import typingsSlinky.rbx.rbxStrings.color
import typingsSlinky.rbx.rbxStrings.expanded
import typingsSlinky.rbx.rbxStrings.fullwidth
import typingsSlinky.rbx.rbxStrings.hasName
import typingsSlinky.rbx.rbxStrings.hidden
import typingsSlinky.rbx.rbxStrings.horizontal
import typingsSlinky.rbx.rbxStrings.invisible
import typingsSlinky.rbx.rbxStrings.italic
import typingsSlinky.rbx.rbxStrings.kind
import typingsSlinky.rbx.rbxStrings.marginless
import typingsSlinky.rbx.rbxStrings.multiline
import typingsSlinky.rbx.rbxStrings.narrow
import typingsSlinky.rbx.rbxStrings.overlay
import typingsSlinky.rbx.rbxStrings.paddingless
import typingsSlinky.rbx.rbxStrings.pull
import typingsSlinky.rbx.rbxStrings.radiusless
import typingsSlinky.rbx.rbxStrings.relative
import typingsSlinky.rbx.rbxStrings.responsive
import typingsSlinky.rbx.rbxStrings.shadowless
import typingsSlinky.rbx.rbxStrings.size
import typingsSlinky.rbx.rbxStrings.srOnly
import typingsSlinky.rbx.rbxStrings.textAlign
import typingsSlinky.rbx.rbxStrings.textColor
import typingsSlinky.rbx.rbxStrings.textSize
import typingsSlinky.rbx.rbxStrings.textTransform
import typingsSlinky.rbx.rbxStrings.textWeight
import typingsSlinky.rbx.rbxStrings.tooltip
import typingsSlinky.rbx.rbxStrings.tooltipActive
import typingsSlinky.rbx.rbxStrings.tooltipColor
import typingsSlinky.rbx.rbxStrings.tooltipMultiline
import typingsSlinky.rbx.rbxStrings.tooltipPosition
import typingsSlinky.rbx.rbxStrings.tooltipResponsive
import typingsSlinky.rbx.rbxStrings.unselectable
import typingsSlinky.rbx.selectMod.SelectContainerProps
import typingsSlinky.rbx.textareaMod.TextareaProps
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.std.Exclude
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rbx/elements/form", JSImport.Namespace)
@js.native
object formMod extends js.Object {
  val Checkbox: ForwardRefAsExoticComponent[PreferHelpersPropsOverrid, ReactElement] = js.native
  val Control: ForwardRefAsExoticComponent[ControlProps, ReactElement] = js.native
  val Fieldset: ForwardRefAsExoticComponent[FieldsetProps, ReactElement] = js.native
  val Help: ForwardRefAsExoticComponent[HelpProps, ReactElement] = js.native
  val Input: ForwardRefAsExoticComponent[InputProps, ReactElement] = js.native
  val Label: ForwardRefAsExoticComponent[LabelProps, ReactElement] = js.native
  val Radio: ForwardRefAsExoticComponent[PreferHelpersPropsOverrid, ReactElement] = js.native
  val Textarea: ForwardRefAsExoticComponent[TextareaProps, ReactElement] = js.native
  @js.native
  object Field extends js.Object {
    var Body: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var Label: ForwardRefAsExoticComponent[FieldLabelProps, ReactElement] = js.native
    var defaultProps: AsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with FieldModifierProps with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    var displayName: js.UndefOr[String] = js.native
    def apply[TAsComponent /* <: ReactElement */](
      props: `6`[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with FieldModifierProps with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | overlay | expanded | italic | relative | horizontal | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | align | kind | multiline | narrow
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): ReactElement | Null = js.native
  }
  
  @js.native
  object File extends js.Object {
    var CTA: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var Icon: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    var Input: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    var Label: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    var Name: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    var defaultProps: AsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with FileModifierProps with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    var displayName: js.UndefOr[String] = js.native
    def apply[TAsComponent /* <: ReactElement */](
      props: `6`[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with FileModifierProps with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | color | overlay | size | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | align | fullwidth | boxed | hasName
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): ReactElement | Null = js.native
  }
  
  @js.native
  object Select extends js.Object {
    var Container: ForwardRefAsExoticComponent[SelectContainerProps, ReactElement] = js.native
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var Option: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    var defaultProps: AsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    var displayName: js.UndefOr[String] = js.native
    def apply[TAsComponent /* <: ReactElement */](
      props: `6`[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | overlay | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): ReactElement | Null = js.native
  }
  
}

