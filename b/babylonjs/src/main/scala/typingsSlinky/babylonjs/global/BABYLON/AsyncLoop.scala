package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.AsyncLoop")
@js.native
class AsyncLoop protected ()
  extends typingsSlinky.babylonjs.BABYLON.AsyncLoop {
  /**
    * Constructor.
    * @param iterations the number of iterations.
    * @param func the function to run each iteration
    * @param successCallback the callback that will be called upon succesful execution
    * @param offset starting offset.
    */
  def this(
    /**
    * Defines the number of iterations for the loop
    */
  iterations: Double,
    func: js.Function1[/* asyncLoop */ typingsSlinky.babylonjs.BABYLON.AsyncLoop, Unit],
    successCallback: js.Function0[Unit]
  ) = this()
  def this(
    /**
    * Defines the number of iterations for the loop
    */
  iterations: Double,
    func: js.Function1[/* asyncLoop */ typingsSlinky.babylonjs.BABYLON.AsyncLoop, Unit],
    successCallback: js.Function0[Unit],
    offset: Double
  ) = this()
  /* CompleteClass */
  override var _done: js.Any = js.native
  /* CompleteClass */
  override var _fn: js.Any = js.native
  /* CompleteClass */
  override var _successCallback: js.Any = js.native
  /**
    * Defines the current index of the loop.
    */
  /* CompleteClass */
  override var index: Double = js.native
  /**
    * Defines the number of iterations for the loop
    */
  /* CompleteClass */
  override var iterations: Double = js.native
  /**
    * Break the loop and run the success callback.
    */
  /* CompleteClass */
  override def breakLoop(): Unit = js.native
  /**
    * Execute the next iteration. Must be called after the last iteration was finished.
    */
  /* CompleteClass */
  override def executeNext(): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.AsyncLoop")
@js.native
object AsyncLoop extends js.Object {
  /**
    * Create and run an async loop.
    * @param iterations the number of iterations.
    * @param fn the function to run each iteration
    * @param successCallback the callback that will be called upon succesful execution
    * @param offset starting offset.
    * @returns the created async loop object
    */
  def Run(
    iterations: Double,
    fn: js.Function1[/* asyncLoop */ this.type, Unit],
    successCallback: js.Function0[Unit]
  ): typingsSlinky.babylonjs.BABYLON.AsyncLoop = js.native
  def Run(
    iterations: Double,
    fn: js.Function1[/* asyncLoop */ this.type, Unit],
    successCallback: js.Function0[Unit],
    offset: Double
  ): typingsSlinky.babylonjs.BABYLON.AsyncLoop = js.native
  /**
    * A for-loop that will run a given number of iterations synchronous and the rest async.
    * @param iterations total number of iterations
    * @param syncedIterations number of synchronous iterations in each async iteration.
    * @param fn the function to call each iteration.
    * @param callback a success call back that will be called when iterating stops.
    * @param breakFunction a break condition (optional)
    * @param timeout timeout settings for the setTimeout function. default - 0.
    * @returns the created async loop object
    */
  def SyncAsyncForLoop(
    iterations: Double,
    syncedIterations: Double,
    fn: js.Function1[/* iteration */ Double, Unit],
    callback: js.Function0[Unit]
  ): typingsSlinky.babylonjs.BABYLON.AsyncLoop = js.native
  def SyncAsyncForLoop(
    iterations: Double,
    syncedIterations: Double,
    fn: js.Function1[/* iteration */ Double, Unit],
    callback: js.Function0[Unit],
    breakFunction: js.Function0[Boolean]
  ): typingsSlinky.babylonjs.BABYLON.AsyncLoop = js.native
  def SyncAsyncForLoop(
    iterations: Double,
    syncedIterations: Double,
    fn: js.Function1[/* iteration */ Double, Unit],
    callback: js.Function0[Unit],
    breakFunction: js.Function0[Boolean],
    timeout: Double
  ): typingsSlinky.babylonjs.BABYLON.AsyncLoop = js.native
}

