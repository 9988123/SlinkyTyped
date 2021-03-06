package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ImportNamespaceSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportNamespaceSpecifier_
  extends Node
     with ModuleSpecifier {
  var local: Identifier_ = js.native
  @JSName("type")
  var type_ImportNamespaceSpecifier_ : ImportNamespaceSpecifier = js.native
}

object ImportNamespaceSpecifier_ {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    local: Identifier_,
    start: Double,
    `type`: ImportNamespaceSpecifier
  ): ImportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportNamespaceSpecifier_]
  }
  @scala.inline
  implicit class ImportNamespaceSpecifier_Ops[Self <: ImportNamespaceSpecifier_] (val x: Self) extends AnyVal {
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
    def setLocal(value: Identifier_): Self = this.set("local", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ImportNamespaceSpecifier): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

