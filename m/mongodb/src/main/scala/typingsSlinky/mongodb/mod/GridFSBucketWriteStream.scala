package typingsSlinky.mongodb.mod

import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "GridFSBucketWriteStream")
@js.native
class GridFSBucketWriteStream protected () extends Writable {
  def this(bucket: GridFSBucket, filename: String) = this()
  def this(bucket: GridFSBucket, filename: String, options: GridFSBucketWriteStreamOptions) = this()
  var id: GridFSBucketWriteStreamId = js.native
  /**
    * Places this write stream into an aborted state (all future writes fail)
    * and deletes all chunks that have already been written.
    * @param [callback] called when chunks are successfully removed or error occurred
    * @see {@link https://mongodb.github.io/node-mongodb-native/3.6/api/GridFSBucketWriteStream.html#abort}
    */
  def abort(): Unit = js.native
  def abort(callback: GridFSBucketErrorCallback): Unit = js.native
}

