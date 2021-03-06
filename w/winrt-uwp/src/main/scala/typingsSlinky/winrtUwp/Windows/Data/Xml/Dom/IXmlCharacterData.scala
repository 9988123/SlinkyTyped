package typingsSlinky.winrtUwp.Windows.Data.Xml.Dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides text manipulation methods that are used by several objects. */
@js.native
trait IXmlCharacterData extends IXmlNode {
  /** Gets or sets the node data depending on the node type. */
  var data: String = js.native
  /** Gets the length of the data, in Unicode characters. */
  var length: Double = js.native
  /**
    * Appends the supplied string to the existing string data.
    * @param data The data to be appended to the existing string.
    */
  def appendData(data: String): Unit = js.native
  /**
    * Deletes specified data.
    * @param offset The offset, in characters, at which to start deleting the string data.
    * @param count The number of characters to delete.
    */
  def deleteData(offset: Double, count: Double): Unit = js.native
  /**
    * Inserts a string at the specified offset.
    * @param offset The offset, in characters, at which to insert the supplied string data.
    * @param data The data to be inserted into the existing string.
    */
  def insertData(offset: Double, data: String): Unit = js.native
  /**
    * Replaces the specified number of characters with the supplied string.
    * @param offset The offset, in characters, at which to start replacing string data.
    * @param count The number of characters to replace.
    * @param data The new data that replaces the old string data.
    */
  def replaceData(offset: Double, count: Double, data: String): Unit = js.native
  /**
    * Retrieves a substring of the full string from the specified range.
    * @param offset Specifies the offset, in characters, from the beginning of the string. An offset of zero indicates copying from the start of the data.
    * @param count Specifies the number of characters to retrieve from the specified offset.
    * @return The returned substring.
    */
  def substringData(offset: Double, count: Double): String = js.native
}

object IXmlCharacterData {
  @scala.inline
  def apply(
    appendChild: IXmlNode => IXmlNode,
    appendData: String => Unit,
    attributes: XmlNamedNodeMap,
    childNodes: XmlNodeList,
    cloneNode: Boolean => IXmlNode,
    data: String,
    deleteData: (Double, Double) => Unit,
    firstChild: IXmlNode,
    getXml: () => String,
    hasChildNodes: () => Boolean,
    innerText: String,
    insertBefore: (IXmlNode, IXmlNode) => IXmlNode,
    insertData: (Double, String) => Unit,
    lastChild: IXmlNode,
    length: Double,
    localName: js.Any,
    namespaceUri: js.Any,
    nextSibling: IXmlNode,
    nodeName: String,
    nodeType: NodeType,
    nodeValue: js.Any,
    normalize: () => Unit,
    ownerDocument: XmlDocument,
    parentNode: IXmlNode,
    prefix: js.Any,
    previousSibling: IXmlNode,
    removeChild: IXmlNode => IXmlNode,
    replaceChild: (IXmlNode, IXmlNode) => IXmlNode,
    replaceData: (Double, Double, String) => Unit,
    selectNodes: String => XmlNodeList,
    selectNodesNS: (String, js.Any) => XmlNodeList,
    selectSingleNode: String => IXmlNode,
    selectSingleNodeNS: (String, js.Any) => IXmlNode,
    substringData: (Double, Double) => String
  ): IXmlCharacterData = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), appendData = js.Any.fromFunction1(appendData), attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], cloneNode = js.Any.fromFunction1(cloneNode), data = data.asInstanceOf[js.Any], deleteData = js.Any.fromFunction2(deleteData), firstChild = firstChild.asInstanceOf[js.Any], getXml = js.Any.fromFunction0(getXml), hasChildNodes = js.Any.fromFunction0(hasChildNodes), innerText = innerText.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), insertData = js.Any.fromFunction2(insertData), lastChild = lastChild.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], namespaceUri = namespaceUri.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], normalize = js.Any.fromFunction0(normalize), ownerDocument = ownerDocument.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), replaceData = js.Any.fromFunction3(replaceData), selectNodes = js.Any.fromFunction1(selectNodes), selectNodesNS = js.Any.fromFunction2(selectNodesNS), selectSingleNode = js.Any.fromFunction1(selectSingleNode), selectSingleNodeNS = js.Any.fromFunction2(selectSingleNodeNS), substringData = js.Any.fromFunction2(substringData))
    __obj.asInstanceOf[IXmlCharacterData]
  }
  @scala.inline
  implicit class IXmlCharacterDataOps[Self <: IXmlCharacterData] (val x: Self) extends AnyVal {
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
    def setAppendData(value: String => Unit): Self = this.set("appendData", js.Any.fromFunction1(value))
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteData(value: (Double, Double) => Unit): Self = this.set("deleteData", js.Any.fromFunction2(value))
    @scala.inline
    def setInsertData(value: (Double, String) => Unit): Self = this.set("insertData", js.Any.fromFunction2(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplaceData(value: (Double, Double, String) => Unit): Self = this.set("replaceData", js.Any.fromFunction3(value))
    @scala.inline
    def setSubstringData(value: (Double, Double) => String): Self = this.set("substringData", js.Any.fromFunction2(value))
  }
  
}

