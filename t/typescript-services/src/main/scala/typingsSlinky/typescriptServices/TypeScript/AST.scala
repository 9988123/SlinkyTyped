package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AST extends IASTSpan {
  var _astID: js.Any = js.native
  var _postComments: js.Any = js.native
  var _preComments: js.Any = js.native
  var _trailingTriviaWidth: Double = js.native
  var parent: AST = js.native
  def fileName(): String = js.native
  def isExpression(): Boolean = js.native
  def kind(): SyntaxKind = js.native
  def postComments(): js.Array[Comment] = js.native
  def preComments(): js.Array[Comment] = js.native
  def setPostComments(comments: js.Array[Comment]): Unit = js.native
  def setPreComments(comments: js.Array[Comment]): Unit = js.native
  def structuralEquals(ast: AST, includingPosition: Boolean): Boolean = js.native
  def syntaxID(): Double = js.native
  def trailingTriviaWidth(): Double = js.native
  def width(): Double = js.native
}

object AST {
  @scala.inline
  def apply(
    _astID: js.Any,
    _end: Double,
    _postComments: js.Any,
    _preComments: js.Any,
    _start: Double,
    _trailingTriviaWidth: Double,
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
    structuralEquals: (AST, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    width: () => Double
  ): AST = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[AST]
  }
  @scala.inline
  implicit class ASTOps[Self <: AST] (val x: Self) extends AnyVal {
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
    def set_astID(value: js.Any): Self = this.set("_astID", value.asInstanceOf[js.Any])
    @scala.inline
    def set_postComments(value: js.Any): Self = this.set("_postComments", value.asInstanceOf[js.Any])
    @scala.inline
    def set_preComments(value: js.Any): Self = this.set("_preComments", value.asInstanceOf[js.Any])
    @scala.inline
    def set_trailingTriviaWidth(value: Double): Self = this.set("_trailingTriviaWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileName(value: () => String): Self = this.set("fileName", js.Any.fromFunction0(value))
    @scala.inline
    def setIsExpression(value: () => Boolean): Self = this.set("isExpression", js.Any.fromFunction0(value))
    @scala.inline
    def setKind(value: () => SyntaxKind): Self = this.set("kind", js.Any.fromFunction0(value))
    @scala.inline
    def setParent(value: AST): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostComments(value: () => js.Array[Comment]): Self = this.set("postComments", js.Any.fromFunction0(value))
    @scala.inline
    def setPreComments(value: () => js.Array[Comment]): Self = this.set("preComments", js.Any.fromFunction0(value))
    @scala.inline
    def setSetPostComments(value: js.Array[Comment] => Unit): Self = this.set("setPostComments", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPreComments(value: js.Array[Comment] => Unit): Self = this.set("setPreComments", js.Any.fromFunction1(value))
    @scala.inline
    def setStructuralEquals(value: (AST, Boolean) => Boolean): Self = this.set("structuralEquals", js.Any.fromFunction2(value))
    @scala.inline
    def setSyntaxID(value: () => Double): Self = this.set("syntaxID", js.Any.fromFunction0(value))
    @scala.inline
    def setTrailingTriviaWidth(value: () => Double): Self = this.set("trailingTriviaWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setWidth(value: () => Double): Self = this.set("width", js.Any.fromFunction0(value))
  }
  
}

