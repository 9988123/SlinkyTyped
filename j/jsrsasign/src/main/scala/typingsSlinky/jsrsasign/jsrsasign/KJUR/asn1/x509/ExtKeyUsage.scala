package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.x509

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ObjectIdentifierParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * KeyUsage ASN.1 structure class
  * @param params associative array of parameters
  * @example
  * e1 = new KJUR.asn1.x509.ExtKeyUsage({
  *   critical: true,
  *   array: [
  *     {oid: '2.5.29.37.0'},  // anyExtendedKeyUsage
  *     {name: 'clientAuth'}
  *   ]
  * });
  * // id-ce-extKeyUsage OBJECT IDENTIFIER ::= { id-ce 37 }
  * // ExtKeyUsageSyntax ::= SEQUENCE SIZE (1..MAX) OF KeyPurposeId
  * // KeyPurposeId ::= OBJECT IDENTIFIER
  */
@js.native
trait ExtKeyUsage extends Extension {
  def getExtnValueHex(): String = js.native
  def setPurposeArray(purposeArray: js.Array[ObjectIdentifierParam | HexParam | NameParam]): Unit = js.native
}

object ExtKeyUsage {
  @scala.inline
  def apply(
    getEncodedHex: () => String,
    getExtnValueHex: () => String,
    getFreshValueHex: () => String,
    getLengthHexFromValue: () => String,
    getValueHex: () => String,
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String,
    setPurposeArray: js.Array[ObjectIdentifierParam | HexParam | NameParam] => Unit
  ): ExtKeyUsage = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getExtnValueHex = js.Any.fromFunction0(getExtnValueHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setPurposeArray = js.Any.fromFunction1(setPurposeArray))
    __obj.asInstanceOf[ExtKeyUsage]
  }
  @scala.inline
  implicit class ExtKeyUsageOps[Self <: ExtKeyUsage] (val x: Self) extends AnyVal {
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
    def setGetExtnValueHex(value: () => String): Self = this.set("getExtnValueHex", js.Any.fromFunction0(value))
    @scala.inline
    def setSetPurposeArray(value: js.Array[ObjectIdentifierParam | HexParam | NameParam] => Unit): Self = this.set("setPurposeArray", js.Any.fromFunction1(value))
  }
  
}

