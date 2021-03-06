package typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkTypes.clientMod.ConfigurationPropertyDefinition
import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import typingsSlinky.awsSdkTypes.httpMod.HttpEndpoint
import typingsSlinky.awsSdkTypes.httpMod.HttpHandler
import typingsSlinky.awsSdkTypes.httpMod.HttpOptions
import typingsSlinky.awsSdkTypes.marshallerMod.RequestSerializer
import typingsSlinky.awsSdkTypes.middlewareMod.Terminalware
import typingsSlinky.awsSdkTypes.signatureMod.RequestSigner
import typingsSlinky.awsSdkTypes.unmarshallerMod.ResponseParser
import typingsSlinky.awsSdkTypes.unmarshallerMod.StreamCollector
import typingsSlinky.awsSdkTypes.utilMod.Decoder
import typingsSlinky.awsSdkTypes.utilMod.DelayDecider
import typingsSlinky.awsSdkTypes.utilMod.Encoder
import typingsSlinky.awsSdkTypes.utilMod.Provider
import typingsSlinky.awsSdkTypes.utilMod.RetryDecider
import typingsSlinky.awsSdkTypes.utilMod.UrlParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/CognitoIdentityConfiguration", "configurationProperties")
@js.native
object configurationProperties extends js.Object {
  val _user_injected_http_handler: ConfigurationPropertyDefinition[
    _, 
    Boolean, 
    CognitoIdentityResolvableConfiguration, 
    CognitoIdentityResolvedConfiguration
  ] = js.native
  val base64Decoder: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Decoder], 
      Decoder, 
      CognitoIdentityResolvableConfiguration, 
      CognitoIdentityResolvedConfiguration
    ]
  ] = js.native
  val base64Encoder: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Encoder], 
      Encoder, 
      CognitoIdentityResolvableConfiguration, 
      CognitoIdentityResolvedConfiguration
    ]
  ] = js.native
  val bodyLengthChecker: ConfigurationPropertyDefinition[
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    js.Function1[/* body */ _, js.UndefOr[Double]], 
    CognitoIdentityResolvableConfiguration, 
    CognitoIdentityResolvedConfiguration
  ] = js.native
  val credentials: ConfigurationPropertyDefinition[
    Credentials | Provider[Credentials], 
    Provider[Credentials], 
    CognitoIdentityResolvableConfiguration, 
    CognitoIdentityResolvedConfiguration
  ] = js.native
  val delayDecider: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[DelayDecider], 
      js.UndefOr[DelayDecider], 
      CognitoIdentityResolvableConfiguration, 
      CognitoIdentityResolvedConfiguration
    ]
  ] = js.native
  val endpoint: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[String | HttpEndpoint | Provider[HttpEndpoint]], 
      Provider[HttpEndpoint], 
      CognitoIdentityResolvableConfiguration, 
      CognitoIdentityResolvedConfiguration
    ]
  ] = js.native
  val endpointProvider: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[_], 
      _, 
      CognitoIdentityResolvableConfiguration, 
      CognitoIdentityResolvedConfiguration
    ]
  ] = js.native
  val handler: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Terminalware[_, Blob]], 
      Terminalware[_, Blob], 
      CognitoIdentityResolvableConfiguration, 
      CognitoIdentityResolvedConfiguration
    ]
  ] = js.native
  val httpHandler: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[HttpHandler[Blob, HttpOptions]], 
      HttpHandler[Blob, HttpOptions], 
      CognitoIdentityResolvableConfiguration, 
      CognitoIdentityResolvedConfiguration
    ]
  ] = js.native
  val maxRedirects: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Double], 
      Double, 
      CognitoIdentityResolvableConfiguration, 
      CognitoIdentityResolvedConfiguration
    ]
  ] = js.native
  val maxRetries: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Double], 
      Double, 
      CognitoIdentityResolvableConfiguration, 
      CognitoIdentityResolvedConfiguration
    ]
  ] = js.native
  val parser: ConfigurationPropertyDefinition[
    ResponseParser[Blob], 
    ResponseParser[Blob], 
    CognitoIdentityResolvableConfiguration, 
    CognitoIdentityResolvedConfiguration
  ] = js.native
  val profile: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[String], 
      js.UndefOr[String], 
      CognitoIdentityResolvableConfiguration, 
      CognitoIdentityResolvedConfiguration
    ]
  ] = js.native
  val region: ConfigurationPropertyDefinition[
    String | Provider[String], 
    Provider[String], 
    CognitoIdentityResolvableConfiguration, 
    CognitoIdentityResolvedConfiguration
  ] = js.native
  val retryDecider: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[RetryDecider], 
      js.UndefOr[RetryDecider], 
      CognitoIdentityResolvableConfiguration, 
      CognitoIdentityResolvedConfiguration
    ]
  ] = js.native
  val serializer: ConfigurationPropertyDefinition[
    Provider[RequestSerializer[Blob]], 
    Provider[RequestSerializer[Blob]], 
    CognitoIdentityResolvableConfiguration, 
    CognitoIdentityResolvedConfiguration
  ] = js.native
  val sha256: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[HashConstructor], 
      HashConstructor, 
      CognitoIdentityResolvableConfiguration, 
      CognitoIdentityResolvedConfiguration
    ]
  ] = js.native
  val signer: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[RequestSigner], 
      RequestSigner, 
      CognitoIdentityResolvableConfiguration, 
      CognitoIdentityResolvedConfiguration
    ]
  ] = js.native
  val signingName: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[String], 
      String, 
      CognitoIdentityResolvableConfiguration, 
      CognitoIdentityResolvedConfiguration
    ]
  ] = js.native
  val sslEnabled: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Boolean], 
      Boolean, 
      CognitoIdentityResolvableConfiguration, 
      CognitoIdentityResolvedConfiguration
    ]
  ] = js.native
  val streamCollector: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[StreamCollector[Blob]], 
      StreamCollector[Blob], 
      CognitoIdentityResolvableConfiguration, 
      CognitoIdentityResolvedConfiguration
    ]
  ] = js.native
  val urlParser: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[UrlParser], 
      UrlParser, 
      CognitoIdentityResolvableConfiguration, 
      CognitoIdentityResolvedConfiguration
    ]
  ] = js.native
  val utf8Decoder: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Decoder], 
      Decoder, 
      CognitoIdentityResolvableConfiguration, 
      CognitoIdentityResolvedConfiguration
    ]
  ] = js.native
  val utf8Encoder: js.UndefOr[
    ConfigurationPropertyDefinition[
      js.UndefOr[Encoder], 
      Encoder, 
      CognitoIdentityResolvableConfiguration, 
      CognitoIdentityResolvedConfiguration
    ]
  ] = js.native
}

