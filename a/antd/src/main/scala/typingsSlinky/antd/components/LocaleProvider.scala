package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.localeProviderMod.Locale
import typingsSlinky.antd.localeProviderMod.LocaleProviderProps
import typingsSlinky.antd.localeProviderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LocaleProvider {
  @JSImport("antd/lib/locale-provider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def _ANT_MARK__(value: String): this.type = set("_ANT_MARK__", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LocaleProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(locale: Locale): Builder = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LocaleProviderProps]))
  }
}

