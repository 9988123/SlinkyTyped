package typingsSlinky.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.documentdb.documentdbStrings.Strong
  - typingsSlinky.documentdb.documentdbStrings.BoundedStaleness
  - typingsSlinky.documentdb.documentdbStrings.Session
  - typingsSlinky.documentdb.documentdbStrings.Eventual
*/
trait ConsistencyLevel extends js.Object

object ConsistencyLevel {
  @scala.inline
  def BoundedStaleness: typingsSlinky.documentdb.documentdbStrings.BoundedStaleness = "BoundedStaleness".asInstanceOf[typingsSlinky.documentdb.documentdbStrings.BoundedStaleness]
  @scala.inline
  def Eventual: typingsSlinky.documentdb.documentdbStrings.Eventual = "Eventual".asInstanceOf[typingsSlinky.documentdb.documentdbStrings.Eventual]
  @scala.inline
  def Session: typingsSlinky.documentdb.documentdbStrings.Session = "Session".asInstanceOf[typingsSlinky.documentdb.documentdbStrings.Session]
  @scala.inline
  def Strong: typingsSlinky.documentdb.documentdbStrings.Strong = "Strong".asInstanceOf[typingsSlinky.documentdb.documentdbStrings.Strong]
}

