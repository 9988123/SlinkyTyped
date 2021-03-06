package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartCharacters extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  var Caption: String = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Font: ChartFont = js.native
  val Parent: js.Any = js.native
  var PhoneticCharacters: String = js.native
  @JSName("PowerPoint.ChartCharacters_typekey")
  var PowerPointDotChartCharacters_typekey: ChartCharacters = js.native
  var Text: String = js.native
  def Delete(): js.Any = js.native
  def Insert(String: String): js.Any = js.native
}

object ChartCharacters {
  @scala.inline
  def apply(
    Application: Application,
    Caption: String,
    Count: Double,
    Creator: Double,
    Delete: () => js.Any,
    Font: ChartFont,
    Insert: String => js.Any,
    Parent: js.Any,
    PhoneticCharacters: String,
    PowerPointDotChartCharacters_typekey: ChartCharacters,
    Text: String
  ): ChartCharacters = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Font = Font.asInstanceOf[js.Any], Insert = js.Any.fromFunction1(Insert), Parent = Parent.asInstanceOf[js.Any], PhoneticCharacters = PhoneticCharacters.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ChartCharacters_typekey")(PowerPointDotChartCharacters_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartCharacters]
  }
  @scala.inline
  implicit class ChartCharactersOps[Self <: ChartCharacters] (val x: Self) extends AnyVal {
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaption(value: String): Self = this.set("Caption", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => js.Any): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setFont(value: ChartFont): Self = this.set("Font", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsert(value: String => js.Any): Self = this.set("Insert", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhoneticCharacters(value: String): Self = this.set("PhoneticCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotChartCharacters_typekey(value: ChartCharacters): Self = this.set("PowerPoint.ChartCharacters_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
  }
  
}

