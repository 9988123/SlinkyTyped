package typingsSlinky.mongodb.mod

import typingsSlinky.mongodb.anon.Coll
import typingsSlinky.mongodb.anon.RemovedFields
import typingsSlinky.mongodb.anon.`5`
import typingsSlinky.mongodb.mongodbStrings.delete
import typingsSlinky.mongodb.mongodbStrings.drop
import typingsSlinky.mongodb.mongodbStrings.dropDatabase
import typingsSlinky.mongodb.mongodbStrings.insert
import typingsSlinky.mongodb.mongodbStrings.invalidate
import typingsSlinky.mongodb.mongodbStrings.rename
import typingsSlinky.mongodb.mongodbStrings.replace
import typingsSlinky.mongodb.mongodbStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mongodb.mod.ChangeEventCR[TSchema]
  - typingsSlinky.mongodb.mod.ChangeEventUpdate[TSchema]
  - typingsSlinky.mongodb.mod.ChangeEventDelete[TSchema]
  - typingsSlinky.mongodb.mod.ChangeEventRename[TSchema]
  - typingsSlinky.mongodb.mod.ChangeEventOther[TSchema]
  - typingsSlinky.mongodb.mod.ChangeEventInvalidate[TSchema]
*/
trait ChangeEvent[TSchema /* <: js.Object */] extends js.Object

object ChangeEvent {
  @scala.inline
  def ChangeEventOther[/* <: js.Object */ TSchema](
    _id: ResumeToken,
    clusterTime: typingsSlinky.bson.mod.Timestamp,
    ns: Coll,
    operationType: drop | dropDatabase
  ): ChangeEvent[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[TSchema]]
  }
  @scala.inline
  def ChangeEventRename[/* <: js.Object */ TSchema](
    _id: ResumeToken,
    clusterTime: typingsSlinky.bson.mod.Timestamp,
    ns: Coll,
    operationType: rename,
    to: Coll
  ): ChangeEvent[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[TSchema]]
  }
  @scala.inline
  def ChangeEventCR[/* <: js.Object */ TSchema](
    _id: ResumeToken,
    clusterTime: typingsSlinky.bson.mod.Timestamp,
    documentKey: `5`[TSchema],
    ns: Coll,
    operationType: insert | replace
  ): ChangeEvent[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[TSchema]]
  }
  @scala.inline
  def ChangeEventDelete[/* <: js.Object */ TSchema](
    _id: ResumeToken,
    clusterTime: typingsSlinky.bson.mod.Timestamp,
    documentKey: `5`[TSchema],
    ns: Coll,
    operationType: delete
  ): ChangeEvent[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[TSchema]]
  }
  @scala.inline
  def ChangeEventUpdate[/* <: js.Object */ TSchema](
    _id: ResumeToken,
    clusterTime: typingsSlinky.bson.mod.Timestamp,
    documentKey: `5`[TSchema],
    ns: Coll,
    operationType: update,
    updateDescription: RemovedFields[TSchema]
  ): ChangeEvent[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], updateDescription = updateDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[TSchema]]
  }
  @scala.inline
  def ChangeEventInvalidate[/* <: js.Object */ TSchema](_id: ResumeToken, clusterTime: typingsSlinky.bson.mod.Timestamp, operationType: invalidate): ChangeEvent[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], clusterTime = clusterTime.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[TSchema]]
  }
}

