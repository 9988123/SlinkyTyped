package typingsSlinky.jestWorker.baseWorkerPoolMod

import typingsSlinky.jestWorker.typesMod.WorkerPoolOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-worker/build/base/BaseWorkerPool", JSImport.Default)
@js.native
class default protected () extends BaseWorkerPool {
  def this(workerPath: String, options: WorkerPoolOptions) = this()
}

