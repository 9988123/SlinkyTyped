package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumericLiteral extends IASTToken {
  var _text: js.Any = js.native
  var _value: js.Any = js.native
  var _valueText: js.Any = js.native
  def structuralEquals(ast: NumericLiteral, includingPosition: Boolean): Boolean = js.native
  def value(): js.Any = js.native
}

object NumericLiteral {
  @scala.inline
  def apply(
    _astID: js.Any,
    _end: Double,
    _postComments: js.Any,
    _preComments: js.Any,
    _start: Double,
    _text: js.Any,
    _trailingTriviaWidth: Double,
    _value: js.Any,
    _valueText: js.Any,
    end: () => Double,
    fileName: () => String,
    isExpression: () => Boolean,
    kind: () => SyntaxKind,
    parent: AST,
    postComments: () => js.Array[Comment],
    preComments: () => js.Array[Comment],
    setPostComments: js.Array[Comment] => Unit,
    setPreComments: js.Array[Comment] => Unit,
    start: () => Double,
    structuralEquals: (NumericLiteral, Boolean) => Boolean,
    syntaxID: () => Double,
    text: () => String,
    trailingTriviaWidth: () => Double,
    value: () => js.Any,
    valueText: () => String,
    width: () => Double
  ): NumericLiteral = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _text = _text.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], _value = _value.asInstanceOf[js.Any], _valueText = _valueText.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), text = js.Any.fromFunction0(text), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), value = js.Any.fromFunction0(value), valueText = js.Any.fromFunction0(valueText), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[NumericLiteral]
  }
  @scala.inline
  implicit class NumericLiteralOps[Self <: NumericLiteral] (val x: Self) extends AnyVal {
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
    def set_text(value: js.Any): Self = this.set("_text", value.asInstanceOf[js.Any])
    @scala.inline
    def set_value(value: js.Any): Self = this.set("_value", value.asInstanceOf[js.Any])
    @scala.inline
    def set_valueText(value: js.Any): Self = this.set("_valueText", value.asInstanceOf[js.Any])
    @scala.inline
    def setStructuralEquals(value: (NumericLiteral, Boolean) => Boolean): Self = this.set("structuralEquals", js.Any.fromFunction2(value))
    @scala.inline
    def setValue(value: () => js.Any): Self = this.set("value", js.Any.fromFunction0(value))
  }
  
}

