package typingsSlinky.mocha.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.mocha.Mocha.HookFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Execute before running tests.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#before
  */
@JSImport("mocha", "before")
@js.native
object before extends TopLevel[HookFunction]

