package typingsSlinky.googleProtobuf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf", "BinaryIterator")
@js.native
class BinaryIterator () extends js.Object {
  def this(decoder: BinaryDecoder) = this()
  def this(decoder: js.UndefOr[scala.Nothing], next: js.Function0[Double | Boolean | String | Null]) = this()
  def this(decoder: BinaryDecoder, next: js.Function0[Double | Boolean | String | Null]) = this()
  def this(
    decoder: js.UndefOr[scala.Nothing],
    next: js.UndefOr[scala.Nothing],
    elements: js.Array[Double | Boolean | String]
  ) = this()
  def this(
    decoder: js.UndefOr[scala.Nothing],
    next: js.Function0[Double | Boolean | String | Null],
    elements: js.Array[Double | Boolean | String]
  ) = this()
  def this(
    decoder: BinaryDecoder,
    next: js.UndefOr[scala.Nothing],
    elements: js.Array[Double | Boolean | String]
  ) = this()
  def this(
    decoder: BinaryDecoder,
    next: js.Function0[Double | Boolean | String | Null],
    elements: js.Array[Double | Boolean | String]
  ) = this()
  def atEnd(): Boolean = js.native
  def clear(): Unit = js.native
  def free(): Unit = js.native
  def get(): ScalarFieldType | Null = js.native
  def next(): ScalarFieldType | Null = js.native
}

/* static members */
@JSImport("google-protobuf", "BinaryIterator")
@js.native
object BinaryIterator extends js.Object {
  def alloc(): BinaryIterator = js.native
  def alloc(
    decoder: js.UndefOr[scala.Nothing],
    next: js.UndefOr[scala.Nothing],
    elements: js.Array[Double | Boolean | String]
  ): BinaryIterator = js.native
  def alloc(decoder: js.UndefOr[scala.Nothing], next: js.Function0[Double | Boolean | String | Null]): BinaryIterator = js.native
  def alloc(
    decoder: js.UndefOr[scala.Nothing],
    next: js.Function0[Double | Boolean | String | Null],
    elements: js.Array[Double | Boolean | String]
  ): BinaryIterator = js.native
  def alloc(decoder: BinaryDecoder): BinaryIterator = js.native
  def alloc(
    decoder: BinaryDecoder,
    next: js.UndefOr[scala.Nothing],
    elements: js.Array[Double | Boolean | String]
  ): BinaryIterator = js.native
  def alloc(decoder: BinaryDecoder, next: js.Function0[Double | Boolean | String | Null]): BinaryIterator = js.native
  def alloc(
    decoder: BinaryDecoder,
    next: js.Function0[Double | Boolean | String | Null],
    elements: js.Array[Double | Boolean | String]
  ): BinaryIterator = js.native
}

