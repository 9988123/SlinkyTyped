package typingsSlinky.winrtUwp.Windows.Data.Xml.Dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates the methods needed to serialize a DOM tree or subtree to a string representation. */
@js.native
trait IXmlNodeSerializer extends js.Object {
  /** Gets and sets the text from inside the XML. */
  var innerText: String = js.native
  /**
    * Returns the XML representation of the node and all its descendants.
    * @return The XML representation of the node and all its descendants.
    */
  def getXml(): String = js.native
}

object IXmlNodeSerializer {
  @scala.inline
  def apply(getXml: () => String, innerText: String): IXmlNodeSerializer = {
    val __obj = js.Dynamic.literal(getXml = js.Any.fromFunction0(getXml), innerText = innerText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlNodeSerializer]
  }
  @scala.inline
  implicit class IXmlNodeSerializerOps[Self <: IXmlNodeSerializer] (val x: Self) extends AnyVal {
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
    def setGetXml(value: () => String): Self = this.set("getXml", js.Any.fromFunction0(value))
    @scala.inline
    def setInnerText(value: String): Self = this.set("innerText", value.asInstanceOf[js.Any])
  }
  
}

