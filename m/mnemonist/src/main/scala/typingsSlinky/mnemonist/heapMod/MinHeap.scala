package typingsSlinky.mnemonist.heapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/heap", "MinHeap")
@js.native
// Constructor
class MinHeap[T] () extends js.Object {
  def this(comparator: HeapComparator[T]) = this()
  // Members
  var size: Double = js.native
  // Methods
  def clear(): Unit = js.native
  def consume(): js.Array[T] = js.native
  def inspect(): js.Any = js.native
  def peek(): js.UndefOr[T] = js.native
  def pop(): js.UndefOr[T] = js.native
  def push(item: T): Double = js.native
  def pushpop(): js.UndefOr[T] = js.native
  def replace(): js.UndefOr[T] = js.native
  def toArray(): js.Array[T] = js.native
}

