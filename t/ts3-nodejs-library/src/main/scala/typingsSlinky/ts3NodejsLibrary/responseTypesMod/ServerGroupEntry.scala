package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerGroupEntry extends ResponseEntry {
  var iconid: String = js.native
  var nMemberAddp: Double = js.native
  var nMemberRemovep: Double = js.native
  var nModifyp: Double = js.native
  var name: String = js.native
  var namemode: Double = js.native
  var savedb: Double = js.native
  var sgid: String = js.native
  var sortid: Double = js.native
  var `type`: Double = js.native
}

object ServerGroupEntry {
  @scala.inline
  def apply(
    iconid: String,
    nMemberAddp: Double,
    nMemberRemovep: Double,
    nModifyp: Double,
    name: String,
    namemode: Double,
    savedb: Double,
    sgid: String,
    sortid: Double,
    `type`: Double
  ): ServerGroupEntry = {
    val __obj = js.Dynamic.literal(iconid = iconid.asInstanceOf[js.Any], nMemberAddp = nMemberAddp.asInstanceOf[js.Any], nMemberRemovep = nMemberRemovep.asInstanceOf[js.Any], nModifyp = nModifyp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namemode = namemode.asInstanceOf[js.Any], savedb = savedb.asInstanceOf[js.Any], sgid = sgid.asInstanceOf[js.Any], sortid = sortid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerGroupEntry]
  }
  @scala.inline
  implicit class ServerGroupEntryOps[Self <: ServerGroupEntry] (val x: Self) extends AnyVal {
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
    def setIconid(value: String): Self = this.set("iconid", value.asInstanceOf[js.Any])
    @scala.inline
    def setNMemberAddp(value: Double): Self = this.set("nMemberAddp", value.asInstanceOf[js.Any])
    @scala.inline
    def setNMemberRemovep(value: Double): Self = this.set("nMemberRemovep", value.asInstanceOf[js.Any])
    @scala.inline
    def setNModifyp(value: Double): Self = this.set("nModifyp", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamemode(value: Double): Self = this.set("namemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSavedb(value: Double): Self = this.set("savedb", value.asInstanceOf[js.Any])
    @scala.inline
    def setSgid(value: String): Self = this.set("sgid", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortid(value: Double): Self = this.set("sortid", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

