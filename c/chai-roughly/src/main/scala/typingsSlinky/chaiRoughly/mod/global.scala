package typingsSlinky.chaiRoughly.mod

import typingsSlinky.chai.Chai.LanguageChains
import typingsSlinky.chai.Chai.NumericComparison
import typingsSlinky.chai.Chai.TypeComparison
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object Chai extends js.Object {
    // For Assert APIs
    @js.native
    trait Assert extends js.Object {
      @JSName("roughly")
      var roughly_Original: Roughly = js.native
      def roughly(): Assertion = js.native
      def roughly(tolerance: Double): Assertion = js.native
      def roughly(`type`: String): typingsSlinky.chai.Chai.Assertion = js.native
      def roughly(`type`: String, message: String): typingsSlinky.chai.Chai.Assertion = js.native
    }
    
    @js.native
    trait Assertion
      extends LanguageChains
         with NumericComparison
         with TypeComparison {
      @JSName("roughly")
      var roughly_Original: Roughly = js.native
      def roughly(): Assertion = js.native
      def roughly(tolerance: Double): Assertion = js.native
      def roughly(`type`: String): typingsSlinky.chai.Chai.Assertion = js.native
      def roughly(`type`: String, message: String): typingsSlinky.chai.Chai.Assertion = js.native
    }
    
    // For BDD APIs
    @js.native
    trait Roughly extends Assertion {
      def apply(): Assertion = js.native
      def apply(tolerance: Double): Assertion = js.native
    }
    
  }
  
}

