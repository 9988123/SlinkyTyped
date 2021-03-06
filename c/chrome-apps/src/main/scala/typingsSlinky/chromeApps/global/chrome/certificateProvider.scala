package typingsSlinky.chromeApps.global.chrome

import typingsSlinky.chromeApps.chrome.certificateProvider.CertificateInfo
import typingsSlinky.chromeApps.chrome.certificateProvider.PinResponseDetails
import typingsSlinky.chromeApps.chrome.certificateProvider.RequestPinDetails
import typingsSlinky.chromeApps.chrome.certificateProvider.SignRequest
import typingsSlinky.chromeApps.chrome.certificateProvider.StopRequestPinDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region chrome.certificateProvider
//////////////////////////
// Certificate Provider //
//////////////////////////
/**
  * @requires(CrOS) Chrome OS only.
  * @requires Permissions: 'certificateProvider'
  * @description
  * Use this API to expose certificates to the platform which
  * can use these certificates for TLS authentications.
  */
@JSGlobal("chrome.certificateProvider")
@js.native
object certificateProvider extends js.Object {
  /**
    * This event fires every time the browser requests the current list of
    * certificates provided by this app. The app must call *reportCallback*
    * exactly once with the current list of certificates.
    */
  val onCertificatesRequested: typingsSlinky.chromeApps.chrome.events.Event[
    js.Function2[
      /* certificates */ js.Array[CertificateInfo], 
      /* callback */ js.Function1[/* rejectedCertificates */ js.Array[js.typedarray.ArrayBuffer], Unit], 
      js.Any
    ]
  ] = js.native
  /**
    * This event fires every time the browser needs to sign
    * a message using a certificate provided by this app
    * in reply to an *onCertificatesRequested* event.
    *
    * The app must sign the data in *request* using the
    * appropriate algorithm and private key and return it by calling
    * *reportCallback*. *reportCallback* must be called exactly once.
    * @param request: Contains the details about the sign request.
    */
  val onSignDigestRequested: typingsSlinky.chromeApps.chrome.events.Event[
    js.Function2[
      /* signRequest */ SignRequest, 
      /* signCallback */ js.Function1[/* signature */ js.UndefOr[js.typedarray.ArrayBuffer], Unit], 
      js.Any
    ]
  ] = js.native
  /**
    * Requests the PIN from the user. Only one ongoing request at a time is
    * allowed. The requests issued while another flow is ongoing are rejected.
    * It's the apps's responsibility to try again later if another flow is
    * in progress.
    * @param details Contains the details about the requested dialog.
    * @param callback Is called when the dialog is resolved with the user input, or
    * when the dialog request finishes unsuccessfully (e.g. the dialog was
    * canceled by the user or was not allowed to be shown).
    */
  def requestPin(
    details: RequestPinDetails,
    callback: js.Function1[/* details */ js.UndefOr[PinResponseDetails], Unit]
  ): Unit = js.native
  /**
    * @description Stops the pin request started by the *requestPin* function.
    * @param details Contains the details about the reason for stopping the request flow.
    * @param callback To be used by Chrome to send to the app the status from
    * their request to close PIN dialog for user.
    */
  def stopPinRequest(details: StopRequestPinDetails, callback: js.Function0[Unit]): Unit = js.native
  /**
    * The types of errors that can be presented to the user through the requestPin function.
    * @enum
    */
  @js.native
  object PinRequestErrorType extends js.Object {
    var INVALID_PIN: typingsSlinky.chromeApps.chromeAppsStrings.INVALID_PIN = js.native
    var INVALID_PUK: typingsSlinky.chromeApps.chromeAppsStrings.INVALID_PUK = js.native
    var MAX_ATTEMPTS_EXCEEDED: typingsSlinky.chromeApps.chromeAppsStrings.MAX_ATTEMPTS_EXCEEDED = js.native
    var UNKNOWN_ERROR: typingsSlinky.chromeApps.chromeAppsStrings.UNKNOWN_ERROR = js.native
  }
  
  /**
    * The type of code being requested by the extension with requestPin function.
    * @enum
    */
  @js.native
  object PinRequestType extends js.Object {
    var PIN: typingsSlinky.chromeApps.chromeAppsStrings.PIN = js.native
    var PUK: typingsSlinky.chromeApps.chromeAppsStrings.PUK = js.native
  }
  
}

