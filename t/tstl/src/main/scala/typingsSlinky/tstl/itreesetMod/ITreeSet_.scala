package typingsSlinky.tstl.itreesetMod

import typingsSlinky.tstl.comparatorMod.Comparator
import typingsSlinky.tstl.itreesetMod.ITreeSet.Iterator
import typingsSlinky.tstl.itreesetMod.ITreeSet.ReverseIterator
import typingsSlinky.tstl.pairMod.Pair
import typingsSlinky.tstl.setContainerMod.SetContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.tstl.isizeMod.ISize because Already inherited
- typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer because Already inherited
- typingsSlinky.tstl.ipushMod.IPush because Already inherited
- typingsSlinky.tstl.iemptyMod.IEmpty because Already inherited
- typingsSlinky.std.Iterable because Already inherited
- typingsSlinky.tstl.ibidirectionalcontainerMod.IBidirectionalContainer because Already inherited
- typingsSlinky.tstl.icontainerMod.IContainer because Already inherited
- typingsSlinky.tstl.iassociativecontainerMod.IAssociativeContainer because Already inherited
- typingsSlinky.tstl.itreecontainerMod.ITreeContainer because var conflicts: iterator. Inlined key_comp, value_comp, lower_bound, upper_bound, equal_range */ @js.native
trait ITreeSet_[Key, Unique /* <: Boolean */, Source /* <: ITreeSet[Key, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Unique, Source, IteratorT, ReverseT] */] extends SetContainer[Key, Unique, Source, IteratorT, ReverseT] {
  /**
    * Get range of equal elements.
    *
    * @param key Key to search for.
    * @return Pair of {@link lower_bound} and {@link upper_bound}.
    */
  def equal_range(key: Key): Pair[IteratorT, IteratorT] = js.native
  /**
    * Get key comparison function.
    *
    * @return The key comparison function.
    */
  def key_comp(): Comparator[Key, Key] = js.native
  /**
    * Get iterator to lower bound.
    *
    * @param key Key to search for.
    * @return Iterator to the first element equal or after to the key.
    */
  def lower_bound(key: Key): IteratorT = js.native
  /**
    * Get iterator to upper bound.
    *
    * @param key Key to search for.
    * @return Iterator to the first element after the key.
    */
  def upper_bound(key: Key): IteratorT = js.native
  /**
    * Get value comparison function.
    *
    * @return The value comparison function.
    */
  def value_comp(): Comparator[Key, Key] = js.native
}

