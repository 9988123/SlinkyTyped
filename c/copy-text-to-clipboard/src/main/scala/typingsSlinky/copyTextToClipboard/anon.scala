package typingsSlinky.copyTextToClipboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Call extends js.Object {
    /**
    	Copy text to the clipboard.
    	Must be called in response to a user gesture event, like `click` or `keyup`.
    	@param text - The text to copy to clipboard.
    	@returns Whether it succeeded to copy the text.
    	@example
    	```
    	import copy = require('copy-text-to-clipboard');
    	button.addEventListener('click', () => {
    		copy('🦄🌈');
    	});
    	```
    	*/
    def apply(text: String): Boolean = js.native
  }
  
}

