package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartFont extends js.Object {
  val Application: js.Any = js.native
  var Background: js.Any = js.native
  var Bold: js.Any = js.native
  var Color: js.Any = js.native
  var ColorIndex: js.Any = js.native
  val Creator: Double = js.native
  var FontStyle: js.Any = js.native
  var Italic: js.Any = js.native
  var Name: js.Any = js.native
  var OutlineFont: js.Any = js.native
  val Parent: js.Any = js.native
  var Shadow: js.Any = js.native
  var Size: js.Any = js.native
  var StrikeThrough: js.Any = js.native
  var Subscript: js.Any = js.native
  var Superscript: js.Any = js.native
  var Underline: js.Any = js.native
  @JSName("Word.ChartFont_typekey")
  var WordDotChartFont_typekey: ChartFont = js.native
}

object ChartFont {
  @scala.inline
  def apply(
    Application: js.Any,
    Background: js.Any,
    Bold: js.Any,
    Color: js.Any,
    ColorIndex: js.Any,
    Creator: Double,
    FontStyle: js.Any,
    Italic: js.Any,
    Name: js.Any,
    OutlineFont: js.Any,
    Parent: js.Any,
    Shadow: js.Any,
    Size: js.Any,
    StrikeThrough: js.Any,
    Subscript: js.Any,
    Superscript: js.Any,
    Underline: js.Any,
    WordDotChartFont_typekey: ChartFont
  ): ChartFont = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Background = Background.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FontStyle = FontStyle.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OutlineFont = OutlineFont.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], StrikeThrough = StrikeThrough.asInstanceOf[js.Any], Subscript = Subscript.asInstanceOf[js.Any], Superscript = Superscript.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ChartFont_typekey")(WordDotChartFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartFont]
  }
  @scala.inline
  implicit class ChartFontOps[Self <: ChartFont] (val x: Self) extends AnyVal {
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
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackground(value: js.Any): Self = this.set("Background", value.asInstanceOf[js.Any])
    @scala.inline
    def setBold(value: js.Any): Self = this.set("Bold", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: js.Any): Self = this.set("Color", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorIndex(value: js.Any): Self = this.set("ColorIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontStyle(value: js.Any): Self = this.set("FontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setItalic(value: js.Any): Self = this.set("Italic", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: js.Any): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlineFont(value: js.Any): Self = this.set("OutlineFont", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setShadow(value: js.Any): Self = this.set("Shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: js.Any): Self = this.set("Size", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrikeThrough(value: js.Any): Self = this.set("StrikeThrough", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscript(value: js.Any): Self = this.set("Subscript", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuperscript(value: js.Any): Self = this.set("Superscript", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnderline(value: js.Any): Self = this.set("Underline", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotChartFont_typekey(value: ChartFont): Self = this.set("Word.ChartFont_typekey", value.asInstanceOf[js.Any])
  }
  
}

