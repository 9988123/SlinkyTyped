package typingsSlinky.snykNodejsLockfileParser.parsersMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Scope extends js.Object

@JSImport("snyk-nodejs-lockfile-parser/dist/parsers", "Scope")
@js.native
object Scope extends js.Object {
  @js.native
  sealed trait dev extends Scope
  
  @js.native
  sealed trait prod extends Scope
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Scope with String] = js.native
  /* "dev" */ @js.native
  object dev extends TopLevel[dev with String]
  
  /* "prod" */ @js.native
  object prod extends TopLevel[prod with String]
  
}

