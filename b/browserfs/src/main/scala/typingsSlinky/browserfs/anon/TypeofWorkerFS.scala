package typingsSlinky.browserfs.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.Worker
import typingsSlinky.browserfs.fileSystemMod.BFSCallback
import typingsSlinky.browserfs.fileSystemMod.FileSystemOptions
import typingsSlinky.browserfs.workerFSMod.WorkerFS
import typingsSlinky.browserfs.workerFSMod.WorkerFSOptions
import typingsSlinky.browserfs.workerFSMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofWorkerFS
  extends Instantiable1[/* worker */ Worker, default]
     with Instantiable2[/* worker */ Worker, /* deprecateMsg */ Boolean, default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  def Create(opts: WorkerFSOptions, cb: BFSCallback[WorkerFS]): Unit = js.native
  /**
    * Attaches a listener to the remote worker for file system requests.
    */
  def attachRemoteListener(worker: Worker): Unit = js.native
  def isAvailable(): Boolean = js.native
}

