package typingsSlinky.rx.rxAggregatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx.aggregates", "AsyncSubject")
@js.native
/**
  * Creates a subject that can only receive one value and that value is cached for all future observations.
  * @constructor
  */
class AsyncSubjectCls[T] ()
  extends typingsSlinky.rx.Rx.Subject[T]

