package typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateAdmChannelOutputMod

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesAdmchannelresponseMod.UnmarshalledADMChannelResponse
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAdmChannelOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * Amazon Device Messaging channel definition.
    */
  var ADMChannelResponse: UnmarshalledADMChannelResponse = js.native
}

object UpdateAdmChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ADMChannelResponse: UnmarshalledADMChannelResponse): UpdateAdmChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ADMChannelResponse = ADMChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAdmChannelOutput]
  }
  @scala.inline
  implicit class UpdateAdmChannelOutputOps[Self <: UpdateAdmChannelOutput] (val x: Self) extends AnyVal {
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
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setADMChannelResponse(value: UnmarshalledADMChannelResponse): Self = this.set("ADMChannelResponse", value.asInstanceOf[js.Any])
  }
  
}

