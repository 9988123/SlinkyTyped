package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetSmsChannelInputMod.GetSmsChannelInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetSmsChannelOutputMod.GetSmsChannelOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSmsChannelCommand", JSImport.Namespace)
@js.native
object getSmsChannelCommandMod extends js.Object {
  @js.native
  class GetSmsChannelCommand protected () extends Command[
          InputTypesUnion, 
          GetSmsChannelInput, 
          OutputTypesUnion, 
          GetSmsChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetSmsChannelInput) = this()
    val middlewareStack: MiddlewareStack[GetSmsChannelInput, GetSmsChannelOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSmsChannelInput, GetSmsChannelOutput] = js.native
  }
  
}

