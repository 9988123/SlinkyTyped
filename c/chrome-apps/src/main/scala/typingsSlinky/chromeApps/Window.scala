package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.anon.TypeofAppView
import typingsSlinky.chromeApps.anon.TypeofWebView
import typingsSlinky.chromeApps.anon.Typeofchrome
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////
// GLOBAL //
////////////
@js.native
trait Window extends ChromeWindow {
  var AppView: TypeofAppView = js.native
  var WebView: TypeofWebView = js.native
  var chrome: Typeofchrome = js.native
}

