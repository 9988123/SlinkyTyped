package typingsSlinky.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `AppointmentForm` object is used to access the currently selected appointment.
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `Restricted`
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@js.native
trait AppointmentForm extends js.Object {
  /**
    * Gets an object that provides methods for manipulating the body of an item.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var body: Body | String = js.native
  /**
    * Gets or sets the date and time that the appointment is to end.
    *
    * The `end` property is expressed as a Coordinated Universal Time (UTC) date and time value. You can use the `convertToLocalClientTime` method to 
    * convert the `end` property value to the client's local date and time.
    *
    * *Read mode*
    *
    * The `end` property returns a `Date` object.
    *
    * *Compose mode*
    *
    * The `end` property returns a `Time` object.
    *
    * When you use the `Time.setAsync` method to set the end time, you should use the `convertToUtcClientTime` method to convert the local time on 
    * the client to UTC for the server.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var end: Time | js.Date = js.native
  /**
    * Gets or sets the location of an appointment.
    *
    * *Read mode*
    *
    * The `location` property returns a string that contains the location of the appointment.
    *
    * *Compose mode*
    *
    * The `location` property returns a `Location` object that provides methods that are used to get and set the location of the appointment.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var location: Location | String = js.native
  /**
    * Provides access to the optional attendees of an event. The type of object and level of access depends on the mode of the current item.
    *
    * *Read mode*
    *
    * The `optionalAttendees` property returns an array that contains an `EmailAddressDetails` object for each optional attendee to the meeting.
    * By default, the collection is limited to a maximum of 100 members. However, on Windows and Mac, you can get 500 members maximum.
    *
    * *Compose mode*
    *
    * The `optionalAttendees` property returns a `Recipients` object that provides methods to get or update the optional attendees for a meeting.
    * By default, the collection is limited to a maximum of 100 members. However, on Windows and Mac, the following limits apply.
    * 
    * - Get 500 members maximum.
    *
    * - Set a maximum of 100 members per call, up to 500 members total.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var optionalAttendees: js.Array[EmailAddressDetails | Recipients] = js.native
  /**
    * Provides access to the required attendees of an event. The type of object and level of access depends on the mode of the current item.
    *
    * *Read mode*
    *
    * The `requiredAttendees` property returns an array that contains an `EmailAddressDetails` object for each required attendee to the meeting.
    * By default, the collection is limited to a maximum of 100 members. However, on Windows and Mac, you can get 500 members maximum.
    *
    * *Compose mode*
    *
    * The `requiredAttendees` property returns a `Recipients` object that provides methods to get or update the required attendees for a meeting.
    * By default, the collection is limited to a maximum of 100 members. However, on Windows and Mac, the following limits apply.
    *
    * - Get 500 members maximum.
    *
    * - Set a maximum of 100 members per call, up to 500 members total.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var requiredAttendees: js.Array[EmailAddressDetails | Recipients] = js.native
  /**
    * Provides access to the resources of an event. Returns an array of strings containing the resources required for the appointment.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var resources: js.Array[String] = js.native
  /**
    * Gets or sets the date and time that the appointment is to begin.
    *
    * The `start` property is expressed as a Coordinated Universal Time (UTC) date and time value. You can use the `convertToLocalClientTime` method 
    * to convert the value to the client's local date and time.
    *
    * *Read mode*
    *
    * The `start` property returns a `Date` object.
    *
    * *Compose mode*
    *
    * The `start` property returns a `Time` object.
    *
    * When you use the `Time.setAsync` method to set the start time, you should use the `convertToUtcClientTime` method to convert the local time on 
    * the client to UTC for the server.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var start: Time | js.Date = js.native
  /**
    * Gets or sets the description that appears in the subject field of an item.
    *
    * The `subject` property gets or sets the entire subject of the item, as sent by the email server.
    *
    * *Read mode*
    *
    * The `subject` property returns a string. Use the `normalizedSubject` property to get the subject minus any leading prefixes such as RE: and FW:.
    *
    * *Compose mode*
    *
    * The `subject` property returns a `Subject` object that provides methods to get and set the subject.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var subject: Subject | String = js.native
}

object AppointmentForm {
  @scala.inline
  def apply(
    body: Body | String,
    end: Time | js.Date,
    location: Location | String,
    optionalAttendees: js.Array[EmailAddressDetails | Recipients],
    requiredAttendees: js.Array[EmailAddressDetails | Recipients],
    resources: js.Array[String],
    start: Time | js.Date,
    subject: Subject | String
  ): AppointmentForm = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], optionalAttendees = optionalAttendees.asInstanceOf[js.Any], requiredAttendees = requiredAttendees.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentForm]
  }
  @scala.inline
  implicit class AppointmentFormOps[Self <: AppointmentForm] (val x: Self) extends AnyVal {
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
    def setBody(value: Body | String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndDate(value: js.Date): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Time | js.Date): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: Location | String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionalAttendeesVarargs(value: (EmailAddressDetails | Recipients)*): Self = this.set("optionalAttendees", js.Array(value :_*))
    @scala.inline
    def setOptionalAttendees(value: js.Array[EmailAddressDetails | Recipients]): Self = this.set("optionalAttendees", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequiredAttendeesVarargs(value: (EmailAddressDetails | Recipients)*): Self = this.set("requiredAttendees", js.Array(value :_*))
    @scala.inline
    def setRequiredAttendees(value: js.Array[EmailAddressDetails | Recipients]): Self = this.set("requiredAttendees", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourcesVarargs(value: String*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[String]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartDate(value: js.Date): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Time | js.Date): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: Subject | String): Self = this.set("subject", value.asInstanceOf[js.Any])
  }
  
}

