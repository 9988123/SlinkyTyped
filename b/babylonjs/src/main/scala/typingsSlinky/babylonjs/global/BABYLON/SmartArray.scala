package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.SmartArray")
@js.native
class SmartArray[T] protected ()
  extends typingsSlinky.babylonjs.BABYLON.SmartArray[T] {
  /**
    * Instantiates a Smart Array.
    * @param capacity defines the default capacity of the array.
    */
  def this(capacity: Double) = this()
  /* CompleteClass */
  override var _id: Double = js.native
  /**
    * The data of the array.
    */
  /* CompleteClass */
  override var data: js.Array[T] = js.native
  /**
    * The active length of the array.
    */
  /* CompleteClass */
  override var length: Double = js.native
  /**
    * Concats the active data with a given array.
    * @param array defines the data to concatenate with.
    */
  /* CompleteClass */
  override def concat(array: js.Any): Unit = js.native
  /**
    * Returns whether an element is part of the active data.
    * @param value defines the value to look for
    * @returns true if found in the active data otherwise false
    */
  /* CompleteClass */
  override def contains(value: T): Boolean = js.native
  /**
    * Releases all the data from the array as well as the array.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Iterates over the active data and apply the lambda to them.
    * @param func defines the action to apply on each value.
    */
  /* CompleteClass */
  override def forEach(func: js.Function1[T, Unit]): Unit = js.native
  /**
    * Returns the position of a value in the active data.
    * @param value defines the value to find the index for
    * @returns the index if found in the active data otherwise -1
    */
  /* CompleteClass */
  override def indexOf(value: T): Double = js.native
  /**
    * Pushes a value at the end of the active data.
    * @param value defines the object to push in the array.
    */
  /* CompleteClass */
  override def push(value: T): Unit = js.native
  /**
    * Resets the active data to an empty array.
    */
  /* CompleteClass */
  override def reset(): Unit = js.native
  /**
    * Sorts the full sets of data.
    * @param compareFn defines the comparison function to apply.
    */
  /* CompleteClass */
  override def sort(compareFn: js.Function2[T, T, Double]): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.SmartArray")
@js.native
object SmartArray extends js.Object {
  var _GlobalId: js.Any = js.native
}

