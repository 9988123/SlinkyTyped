package typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * request interfaces
  ************************/
/** Parameters for the `getVoice` operation. */
@js.native
trait GetVoiceParams extends js.Object {
  /** The customization ID (GUID) of a custom voice model for which information is to be returned. You must make the request with service credentials created for the instance of the service that owns the custom model. Omit the parameter to see information about the specified voice with no customization. */
  var customization_id: js.UndefOr[String] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** The voice for which information is to be returned. */
  var voice: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetVoiceConstants.Voice | String = js.native
}

object GetVoiceParams {
  @scala.inline
  def apply(
    voice: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetVoiceConstants.Voice | String
  ): GetVoiceParams = {
    val __obj = js.Dynamic.literal(voice = voice.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceParams]
  }
  @scala.inline
  implicit class GetVoiceParamsOps[Self <: GetVoiceParams] (val x: Self) extends AnyVal {
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
    def setVoice(
      value: typingsSlinky.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetVoiceConstants.Voice | String
    ): Self = this.set("voice", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomization_id(value: String): Self = this.set("customization_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomization_id: Self = this.set("customization_id", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
  }
  
}

