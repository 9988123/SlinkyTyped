package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to display or hide actual data in MERGEFIELD fields.
  */
@js.native
trait ShowMergedDataCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ShowMergedDataCommand command. true if the command has been successfully executed; false if the command execution has failed.
    */
  def execute(): Boolean = js.native
  def execute(showMergedData: Boolean): Boolean = js.native
}

