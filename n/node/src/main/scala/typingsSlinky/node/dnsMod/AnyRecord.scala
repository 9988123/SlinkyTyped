package typingsSlinky.node.dnsMod

import typingsSlinky.node.nodeStrings.A
import typingsSlinky.node.nodeStrings.AAAA
import typingsSlinky.node.nodeStrings.CNAME
import typingsSlinky.node.nodeStrings.MX
import typingsSlinky.node.nodeStrings.NAPTR
import typingsSlinky.node.nodeStrings.NS
import typingsSlinky.node.nodeStrings.PTR
import typingsSlinky.node.nodeStrings.SOA
import typingsSlinky.node.nodeStrings.SRV
import typingsSlinky.node.nodeStrings.TXT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.node.dnsMod.AnyARecord
  - typings.node.dnsMod.AnyAaaaRecord
  - typings.node.dnsMod.AnyCnameRecord
  - typings.node.dnsMod.AnyMxRecord
  - typings.node.dnsMod.AnyNaptrRecord
  - typings.node.dnsMod.AnyNsRecord
  - typings.node.dnsMod.AnyPtrRecord
  - typings.node.dnsMod.AnySoaRecord
  - typings.node.dnsMod.AnySrvRecord
  - typings.node.dnsMod.AnyTxtRecord
*/
trait AnyRecord extends js.Object

object AnyRecord {
  @scala.inline
  def AnySrvRecord(name: java.lang.String, port: Double, priority: Double, `type`: SRV, weight: Double): AnyRecord = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyRecord]
  }
  @scala.inline
  def AnyTxtRecord(entries: js.Array[java.lang.String], `type`: TXT): AnyRecord = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyRecord]
  }
  @scala.inline
  def AnyNsRecord(`type`: NS, value: java.lang.String): AnyRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyRecord]
  }
  @scala.inline
  def AnySoaRecord(
    expire: Double,
    hostmaster: java.lang.String,
    minttl: Double,
    nsname: java.lang.String,
    refresh: Double,
    retry: Double,
    serial: Double,
    `type`: SOA
  ): AnyRecord = {
    val __obj = js.Dynamic.literal(expire = expire.asInstanceOf[js.Any], hostmaster = hostmaster.asInstanceOf[js.Any], minttl = minttl.asInstanceOf[js.Any], nsname = nsname.asInstanceOf[js.Any], refresh = refresh.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyRecord]
  }
  @scala.inline
  def AnyAaaaRecord(address: java.lang.String, ttl: Double, `type`: AAAA): AnyRecord = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyRecord]
  }
  @scala.inline
  def AnyMxRecord(exchange: java.lang.String, priority: Double, `type`: MX): AnyRecord = {
    val __obj = js.Dynamic.literal(exchange = exchange.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyRecord]
  }
  @scala.inline
  def AnyPtrRecord(`type`: PTR, value: java.lang.String): AnyRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyRecord]
  }
  @scala.inline
  def AnyARecord(address: java.lang.String, ttl: Double, `type`: A): AnyRecord = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyRecord]
  }
  @scala.inline
  def AnyCnameRecord(`type`: CNAME, value: java.lang.String): AnyRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyRecord]
  }
  @scala.inline
  def AnyNaptrRecord(
    flags: java.lang.String,
    order: Double,
    preference: Double,
    regexp: java.lang.String,
    replacement: java.lang.String,
    service: java.lang.String,
    `type`: NAPTR
  ): AnyRecord = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], preference = preference.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyRecord]
  }
}

