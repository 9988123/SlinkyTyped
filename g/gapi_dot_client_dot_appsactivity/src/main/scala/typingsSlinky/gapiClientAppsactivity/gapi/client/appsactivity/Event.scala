package typingsSlinky.gapiClientAppsactivity.gapi.client.appsactivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  /**
    * Additional event types. Some events may have multiple types when multiple actions are part of a single event. For example, creating a document,
    * renaming it, and sharing it may be part of a single file-creation event.
    */
  var additionalEventTypes: js.UndefOr[js.Array[String]] = js.native
  /** The time at which the event occurred formatted as Unix time in milliseconds. */
  var eventTimeMillis: js.UndefOr[String] = js.native
  /** Whether this event is caused by a user being deleted. */
  var fromUserDeletion: js.UndefOr[Boolean] = js.native
  /** Extra information for move type events, such as changes in an object's parents. */
  var move: js.UndefOr[Move] = js.native
  /** Extra information for permissionChange type events, such as the user or group the new permission applies to. */
  var permissionChanges: js.UndefOr[js.Array[PermissionChange]] = js.native
  /** The main type of event that occurred. */
  var primaryEventType: js.UndefOr[String] = js.native
  /** Extra information for rename type events, such as the old and new names. */
  var rename: js.UndefOr[Rename] = js.native
  /** Information specific to the Target object modified by the event. */
  var target: js.UndefOr[Target] = js.native
  /** Represents the user responsible for the event. */
  var user: js.UndefOr[User] = js.native
}

object Event {
  @scala.inline
  def apply(): Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
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
    def setAdditionalEventTypesVarargs(value: String*): Self = this.set("additionalEventTypes", js.Array(value :_*))
    @scala.inline
    def setAdditionalEventTypes(value: js.Array[String]): Self = this.set("additionalEventTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalEventTypes: Self = this.set("additionalEventTypes", js.undefined)
    @scala.inline
    def setEventTimeMillis(value: String): Self = this.set("eventTimeMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTimeMillis: Self = this.set("eventTimeMillis", js.undefined)
    @scala.inline
    def setFromUserDeletion(value: Boolean): Self = this.set("fromUserDeletion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromUserDeletion: Self = this.set("fromUserDeletion", js.undefined)
    @scala.inline
    def setMove(value: Move): Self = this.set("move", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMove: Self = this.set("move", js.undefined)
    @scala.inline
    def setPermissionChangesVarargs(value: PermissionChange*): Self = this.set("permissionChanges", js.Array(value :_*))
    @scala.inline
    def setPermissionChanges(value: js.Array[PermissionChange]): Self = this.set("permissionChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissionChanges: Self = this.set("permissionChanges", js.undefined)
    @scala.inline
    def setPrimaryEventType(value: String): Self = this.set("primaryEventType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryEventType: Self = this.set("primaryEventType", js.undefined)
    @scala.inline
    def setRename(value: Rename): Self = this.set("rename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRename: Self = this.set("rename", js.undefined)
    @scala.inline
    def setTarget(value: Target): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

