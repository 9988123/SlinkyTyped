package typingsSlinky.dynogels.mod.AWS

import typingsSlinky.awsSdk.cognitoIdentityCredentialsMod.CognitoIdentityCredentials.CognitoIdentityOptions
import typingsSlinky.awsSdk.configMod.ConfigurationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynogels", "AWS.CognitoIdentityCredentials")
@js.native
/**
  * Creates a new credentials object.
  */
class CognitoIdentityCredentials ()
  extends typingsSlinky.awsSdk.mod.CognitoIdentityCredentials {
  /**
    * Creates a new credentials object with optional configuration.
    */
  def this(options: CognitoIdentityOptions) = this()
  def this(options: CognitoIdentityOptions, clientConfig: ConfigurationOptions) = this()
}

// Needed to expose interfaces on the class
@JSImport("dynogels", "AWS.CognitoIdentityCredentials")
@js.native
object CognitoIdentityCredentials extends js.Object

