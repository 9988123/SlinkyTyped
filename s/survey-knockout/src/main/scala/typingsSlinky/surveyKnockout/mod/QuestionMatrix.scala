package typingsSlinky.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionMatrix")
@js.native
class QuestionMatrix protected () extends QuestionMatrixModel {
  def this(name: String) = this()
  var koVisibleColumns: js.Any = js.native
  var koVisibleRows: js.Any = js.native
  def getItemCss(row: js.Any, column: js.Any): String = js.native
}

