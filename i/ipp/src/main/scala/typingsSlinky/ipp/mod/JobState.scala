package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ipp.ippStrings.pending
  - typingsSlinky.ipp.ippStrings.`pending-held`
  - typingsSlinky.ipp.ippStrings.processing
  - typingsSlinky.ipp.ippStrings.`processing-stopped`
  - typingsSlinky.ipp.ippStrings.canceled
  - typingsSlinky.ipp.ippStrings.aborted
  - typingsSlinky.ipp.ippStrings.completed
*/
trait JobState extends js.Object

object JobState {
  @scala.inline
  def aborted: typingsSlinky.ipp.ippStrings.aborted = "aborted".asInstanceOf[typingsSlinky.ipp.ippStrings.aborted]
  @scala.inline
  def canceled: typingsSlinky.ipp.ippStrings.canceled = "canceled".asInstanceOf[typingsSlinky.ipp.ippStrings.canceled]
  @scala.inline
  def completed: typingsSlinky.ipp.ippStrings.completed = "completed".asInstanceOf[typingsSlinky.ipp.ippStrings.completed]
  @scala.inline
  def pending: typingsSlinky.ipp.ippStrings.pending = "pending".asInstanceOf[typingsSlinky.ipp.ippStrings.pending]
  @scala.inline
  def `pending-held`: typingsSlinky.ipp.ippStrings.`pending-held` = "pending-held".asInstanceOf[typingsSlinky.ipp.ippStrings.`pending-held`]
  @scala.inline
  def processing: typingsSlinky.ipp.ippStrings.processing = "processing".asInstanceOf[typingsSlinky.ipp.ippStrings.processing]
  @scala.inline
  def `processing-stopped`: typingsSlinky.ipp.ippStrings.`processing-stopped` = "processing-stopped".asInstanceOf[typingsSlinky.ipp.ippStrings.`processing-stopped`]
}

