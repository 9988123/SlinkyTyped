package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TSDeclareMethod
import typingsSlinky.babelTypes.babelTypesStrings.`private`
import typingsSlinky.babelTypes.babelTypesStrings.`protected`
import typingsSlinky.babelTypes.babelTypesStrings.constructor
import typingsSlinky.babelTypes.babelTypesStrings.get
import typingsSlinky.babelTypes.babelTypesStrings.method
import typingsSlinky.babelTypes.babelTypesStrings.public
import typingsSlinky.babelTypes.babelTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSDeclareMethod_
  extends BaseNode
     with _Node {
  var `abstract`: Boolean | Null = js.native
  var access: public | `private` | `protected` | Null = js.native
  var accessibility: public | `private` | `protected` | Null = js.native
  var async: Boolean = js.native
  var computed: Boolean = js.native
  var decorators: js.Array[Decorator_] | Null = js.native
  var generator: Boolean = js.native
  var key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression = js.native
  var kind: get | set | method | constructor = js.native
  var optional: Boolean | Null = js.native
  var params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_] = js.native
  var returnType: TSTypeAnnotation_ | Noop_ | Null = js.native
  var static: Boolean = js.native
  var typeParameters: TSTypeParameterDeclaration_ | Noop_ | Null = js.native
  @JSName("type")
  var type_TSDeclareMethod_ : TSDeclareMethod = js.native
}

object TSDeclareMethod_ {
  @scala.inline
  def apply(
    async: Boolean,
    computed: Boolean,
    generator: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression,
    kind: get | set | method | constructor,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    static: Boolean,
    `type`: TSDeclareMethod
  ): TSDeclareMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSDeclareMethod_]
  }
  @scala.inline
  implicit class TSDeclareMethod_Ops[Self <: TSDeclareMethod_] (val x: Self) extends AnyVal {
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def setComputed(value: Boolean): Self = this.set("computed", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenerator(value: Boolean): Self = this.set("generator", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: get | set | method | constructor): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setParamsVarargs(value: (Identifier_ | Pattern | RestElement_ | TSParameterProperty_)*): Self = this.set("params", js.Array(value :_*))
    @scala.inline
    def setParams(value: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatic(value: Boolean): Self = this.set("static", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TSDeclareMethod): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbstract(value: Boolean): Self = this.set("abstract", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbstractNull: Self = this.set("abstract", null)
    @scala.inline
    def setAccess(value: public | `private` | `protected`): Self = this.set("access", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessNull: Self = this.set("access", null)
    @scala.inline
    def setAccessibility(value: public | `private` | `protected`): Self = this.set("accessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessibilityNull: Self = this.set("accessibility", null)
    @scala.inline
    def setDecoratorsVarargs(value: Decorator_ *): Self = this.set("decorators", js.Array(value :_*))
    @scala.inline
    def setDecorators(value: js.Array[Decorator_]): Self = this.set("decorators", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecoratorsNull: Self = this.set("decorators", null)
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionalNull: Self = this.set("optional", null)
    @scala.inline
    def setReturnType(value: TSTypeAnnotation_ | Noop_): Self = this.set("returnType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnTypeNull: Self = this.set("returnType", null)
    @scala.inline
    def setTypeParameters(value: TSTypeParameterDeclaration_ | Noop_): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeParametersNull: Self = this.set("typeParameters", null)
  }
  
}

