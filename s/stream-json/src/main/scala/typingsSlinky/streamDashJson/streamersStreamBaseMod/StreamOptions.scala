package typingsSlinky.streamDashJson.streamersStreamBaseMod

import typingsSlinky.node.Anon_Chunk
import typingsSlinky.node.Error
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.node.streamMod.TransformCallback
import typingsSlinky.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamOptions extends TransformOptions {
  var includeUndecided: js.UndefOr[Boolean] = js.undefined
  var objectFilter: js.UndefOr[ObjectFilterFunction] = js.undefined
}

object StreamOptions {
  @scala.inline
  def apply(
    allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
    autoDestroy: js.UndefOr[Boolean] = js.undefined,
    decodeStrings: js.UndefOr[Boolean] = js.undefined,
    defaultEncoding: String = null,
    destroy: js.ThisFunction2[
      /* this */ Transform, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ] = null,
    emitClose: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    `final`: js.ThisFunction1[
      /* this */ Transform, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null,
    flush: js.ThisFunction1[/* this */ Transform, /* callback */ TransformCallback, Unit] = null,
    highWaterMark: Int | Double = null,
    includeUndecided: js.UndefOr[Boolean] = js.undefined,
    objectFilter: /* asm */ typingsSlinky.streamDashJson.assemblerMod.^ => js.UndefOr[Boolean] = null,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    read: js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit] = null,
    readableObjectMode: js.UndefOr[Boolean] = js.undefined,
    transform: js.ThisFunction3[
      /* this */ Transform, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ TransformCallback, 
      Unit
    ] = null,
    writableObjectMode: js.UndefOr[Boolean] = js.undefined,
    write: js.ThisFunction3[
      /* this */ Transform, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null,
    writev: js.ThisFunction2[
      /* this */ Transform, 
      /* chunks */ js.Array[Anon_Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null
  ): StreamOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy.asInstanceOf[js.Any])
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings.asInstanceOf[js.Any])
    if (defaultEncoding != null) __obj.updateDynamic("defaultEncoding")(defaultEncoding.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (!js.isUndefined(emitClose)) __obj.updateDynamic("emitClose")(emitClose.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (`final` != null) __obj.updateDynamic("final")(`final`.asInstanceOf[js.Any])
    if (flush != null) __obj.updateDynamic("flush")(flush.asInstanceOf[js.Any])
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(includeUndecided)) __obj.updateDynamic("includeUndecided")(includeUndecided.asInstanceOf[js.Any])
    if (objectFilter != null) __obj.updateDynamic("objectFilter")(js.Any.fromFunction1(objectFilter))
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (!js.isUndefined(readableObjectMode)) __obj.updateDynamic("readableObjectMode")(readableObjectMode.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (!js.isUndefined(writableObjectMode)) __obj.updateDynamic("writableObjectMode")(writableObjectMode.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(write.asInstanceOf[js.Any])
    if (writev != null) __obj.updateDynamic("writev")(writev.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamOptions]
  }
}

