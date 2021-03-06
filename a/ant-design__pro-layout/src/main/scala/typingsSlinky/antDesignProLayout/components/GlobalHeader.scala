package typingsSlinky.antDesignProLayout.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignProLayout.anon.DefaultOpenAll
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.mix
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.realDark
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.side
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.top
import typingsSlinky.antDesignProLayout.defaultSettingsMod.ContentWidth
import typingsSlinky.antDesignProLayout.globalHeaderMod.GlobalHeaderProps
import typingsSlinky.antDesignProLayout.globalHeaderMod.default
import typingsSlinky.antDesignProLayout.headerMod.HeaderViewProps
import typingsSlinky.antDesignProLayout.typingsMod.MenuDataItem
import typingsSlinky.antDesignProLayout.typingsMod.WithFalse
import typingsSlinky.antd.menuContextMod.MenuTheme
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GlobalHeader {
  @JSImport("@ant-design/pro-layout/lib/GlobalHeader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def collapsed(value: Boolean): this.type = set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def collapsedButtonRenderFunction1(value: /* collapsed */ js.UndefOr[Boolean] => ReactElement): this.type = set("collapsedButtonRender", js.Any.fromFunction1(value))
    @scala.inline
    def collapsedButtonRender(value: WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], ReactElement]]): this.type = set("collapsedButtonRender", value.asInstanceOf[js.Any])
    @scala.inline
    def colorWeak(value: Boolean): this.type = set("colorWeak", value.asInstanceOf[js.Any])
    @scala.inline
    def contentWidth(value: ContentWidth): this.type = set("contentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def fixSiderbar(value: Boolean): this.type = set("fixSiderbar", value.asInstanceOf[js.Any])
    @scala.inline
    def fixedHeader(value: Boolean): this.type = set("fixedHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def headerHeight(value: Double): this.type = set("headerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def iconfontUrl(value: String): this.type = set("iconfontUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def isMobile(value: Boolean): this.type = set("isMobile", value.asInstanceOf[js.Any])
    @scala.inline
    def layout(value: side | top | mix): this.type = set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def logoReactElement(value: ReactElement): this.type = set("logo", value.asInstanceOf[js.Any])
    @scala.inline
    def logo(value: ReactElement): this.type = set("logo", value.asInstanceOf[js.Any])
    @scala.inline
    def menu(value: DefaultOpenAll): this.type = set("menu", value.asInstanceOf[js.Any])
    @scala.inline
    def menuDataVarargs(value: MenuDataItem*): this.type = set("menuData", js.Array(value :_*))
    @scala.inline
    def menuData(value: js.Array[MenuDataItem]): this.type = set("menuData", value.asInstanceOf[js.Any])
    @scala.inline
    def menuHeaderRenderFunction3(
      value: (/* logo */ ReactElement, /* title */ ReactElement, /* props */ js.UndefOr[GlobalHeaderProps]) => ReactElement
    ): this.type = set("menuHeaderRender", js.Any.fromFunction3(value))
    @scala.inline
    def menuHeaderRender(
      value: WithFalse[
          js.Function3[
            /* logo */ ReactElement, 
            /* title */ ReactElement, 
            /* props */ js.UndefOr[GlobalHeaderProps], 
            ReactElement
          ]
        ]
    ): this.type = set("menuHeaderRender", value.asInstanceOf[js.Any])
    @scala.inline
    def menuRenderFunction2(value: (/* props */ HeaderViewProps, /* defaultDom */ ReactElement) => ReactElement): this.type = set("menuRender", js.Any.fromFunction2(value))
    @scala.inline
    def menuRender(
      value: WithFalse[
          js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactElement, ReactElement]
        ]
    ): this.type = set("menuRender", value.asInstanceOf[js.Any])
    @scala.inline
    def navTheme(value: MenuTheme | realDark): this.type = set("navTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def onCollapse(value: /* collapsed */ Boolean => Unit): this.type = set("onCollapse", js.Any.fromFunction1(value))
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def primaryColor(value: String): this.type = set("primaryColor", value.asInstanceOf[js.Any])
    @scala.inline
    def rightContentRenderFunction1(value: /* props */ HeaderViewProps => ReactElement): this.type = set("rightContentRender", js.Any.fromFunction1(value))
    @scala.inline
    def rightContentRender(value: WithFalse[js.Function1[/* props */ HeaderViewProps, ReactElement]]): this.type = set("rightContentRender", value.asInstanceOf[js.Any])
    @scala.inline
    def splitMenus(value: Boolean): this.type = set("splitMenus", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GlobalHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: GlobalHeader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

