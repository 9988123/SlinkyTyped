package typingsSlinky.awsSdkClientS3Browser.typesCloudFunctionConfigurationMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectCreatedColonAsterisk
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectCreatedColonCompleteMultipartUpload
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectCreatedColonCopy
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectCreatedColonPost
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectCreatedColonPut
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectRemovedColonAsterisk
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectRemovedColonDelete
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectRemovedColonDeleteMarkerCreated
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonReducedRedundancyLostObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledCloudFunctionConfiguration extends CloudFunctionConfiguration {
  /**
    * _EventList shape
    */
  @JSName("Events")
  var Events_UnmarshalledCloudFunctionConfiguration: js.UndefOr[
    js.Array[
      s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
    ]
  ] = js.native
}

object UnmarshalledCloudFunctionConfiguration {
  @scala.inline
  def apply(): UnmarshalledCloudFunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledCloudFunctionConfiguration]
  }
  @scala.inline
  implicit class UnmarshalledCloudFunctionConfigurationOps[Self <: UnmarshalledCloudFunctionConfiguration] (val x: Self) extends AnyVal {
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
    def setEventsVarargs(
      value: (s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String)*
    ): Self = this.set("Events", js.Array(value :_*))
    @scala.inline
    def setEvents(
      value: js.Array[
          s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
        ]
    ): Self = this.set("Events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("Events", js.undefined)
  }
  
}

