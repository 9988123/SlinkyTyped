package typingsSlinky.enhancedResolve.concordModulesPluginMod

import typingsSlinky.enhancedResolve.concordMod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConcordModulesPlugin extends js.Object {
  var options: Dictionary[_] = js.native
  var source: String = js.native
  var target: String = js.native
  @JSName("apply")
  def apply(resolver: typingsSlinky.enhancedResolve.resolverMod.^): Unit = js.native
}

object ConcordModulesPlugin {
  @scala.inline
  def apply(
    apply: typingsSlinky.enhancedResolve.resolverMod.^ => Unit,
    options: Dictionary[_],
    source: String,
    target: String
  ): ConcordModulesPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcordModulesPlugin]
  }
  @scala.inline
  implicit class ConcordModulesPluginOps[Self <: ConcordModulesPlugin] (val x: Self) extends AnyVal {
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
    def setApply(value: typingsSlinky.enhancedResolve.resolverMod.^ => Unit): Self = this.set("apply", js.Any.fromFunction1(value))
    @scala.inline
    def setOptions(value: Dictionary[_]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

