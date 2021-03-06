package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DocListEntry...
  */
@js.native
trait IDocListEntry extends js.Object {
  /**
    * Not used.
    */
  var qConnectedUsers: Double = js.native
  /**
    * Identifier of the app.
    *
    * - In Qlik Sense Desktop, the identifier is the path and name of the app
    * - In Qlik Sense Enterprise, the identifier is the app's GUID.
    */
  var qDocId: String = js.native
  /**
    * Name of the app.
    */
  var qDocName: String = js.native
  /**
    * Size of remote app.
    * This property is used only with Qlik Sense Desktop.
    * It is set to 0 for Qlik Sense Enterprise.
    */
  var qFileSize: Double = js.native
  /**
    * Last modified time stamp of the app.
    * This property is used only with Qlik Sense Desktop.
    * It is set to 0 for Qlik Sense Enterprise.
    */
  var qFileTime: Double = js.native
  /**
    * Last reload time of the app.
    */
  var qLastReloadTime: String = js.native
  /**
    * Meta data related to the app.
    */
  var qMeta: INxMeta = js.native
  /**
    * If set to true, the app is read-only.
    */
  var qReadOnly: Boolean = js.native
  /**
    * Thumbnail of the app.
    */
  var qThumbnail: IStaticContentUrl = js.native
  /**
    * Title of the app.
    */
  var qTitle: String = js.native
}

object IDocListEntry {
  @scala.inline
  def apply(
    qConnectedUsers: Double,
    qDocId: String,
    qDocName: String,
    qFileSize: Double,
    qFileTime: Double,
    qLastReloadTime: String,
    qMeta: INxMeta,
    qReadOnly: Boolean,
    qThumbnail: IStaticContentUrl,
    qTitle: String
  ): IDocListEntry = {
    val __obj = js.Dynamic.literal(qConnectedUsers = qConnectedUsers.asInstanceOf[js.Any], qDocId = qDocId.asInstanceOf[js.Any], qDocName = qDocName.asInstanceOf[js.Any], qFileSize = qFileSize.asInstanceOf[js.Any], qFileTime = qFileTime.asInstanceOf[js.Any], qLastReloadTime = qLastReloadTime.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qReadOnly = qReadOnly.asInstanceOf[js.Any], qThumbnail = qThumbnail.asInstanceOf[js.Any], qTitle = qTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocListEntry]
  }
  @scala.inline
  implicit class IDocListEntryOps[Self <: IDocListEntry] (val x: Self) extends AnyVal {
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
    def setQConnectedUsers(value: Double): Self = this.set("qConnectedUsers", value.asInstanceOf[js.Any])
    @scala.inline
    def setQDocId(value: String): Self = this.set("qDocId", value.asInstanceOf[js.Any])
    @scala.inline
    def setQDocName(value: String): Self = this.set("qDocName", value.asInstanceOf[js.Any])
    @scala.inline
    def setQFileSize(value: Double): Self = this.set("qFileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setQFileTime(value: Double): Self = this.set("qFileTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setQLastReloadTime(value: String): Self = this.set("qLastReloadTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setQMeta(value: INxMeta): Self = this.set("qMeta", value.asInstanceOf[js.Any])
    @scala.inline
    def setQReadOnly(value: Boolean): Self = this.set("qReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setQThumbnail(value: IStaticContentUrl): Self = this.set("qThumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def setQTitle(value: String): Self = this.set("qTitle", value.asInstanceOf[js.Any])
  }
  
}

