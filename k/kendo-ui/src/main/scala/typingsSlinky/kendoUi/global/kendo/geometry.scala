package typingsSlinky.kendoUi.global.kendo

import typingsSlinky.kendoUi.kendo.geometry.ArcOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.geometry")
@js.native
object geometry extends js.Object {
  @js.native
  class Arc protected ()
    extends typingsSlinky.kendoUi.kendo.geometry.Arc {
    def this(center: js.Any) = this()
    def this(center: typingsSlinky.kendoUi.kendo.geometry.Point) = this()
    def this(center: js.Any, options: ArcOptions) = this()
    def this(center: typingsSlinky.kendoUi.kendo.geometry.Point, options: ArcOptions) = this()
  }
  
  @js.native
  class Circle protected ()
    extends typingsSlinky.kendoUi.kendo.geometry.Circle {
    def this(center: js.Any, radius: Double) = this()
    def this(center: typingsSlinky.kendoUi.kendo.geometry.Point, radius: Double) = this()
  }
  
  @js.native
  class Matrix ()
    extends typingsSlinky.kendoUi.kendo.geometry.Matrix
  
  @js.native
  class Point protected ()
    extends typingsSlinky.kendoUi.kendo.geometry.Point {
    def this(x: Double, y: Double) = this()
  }
  
  @js.native
  class Rect protected ()
    extends typingsSlinky.kendoUi.kendo.geometry.Rect {
    def this(origin: js.Any, size: js.Any) = this()
    def this(origin: js.Any, size: typingsSlinky.kendoUi.kendo.geometry.Size) = this()
    def this(origin: typingsSlinky.kendoUi.kendo.geometry.Point, size: js.Any) = this()
    def this(
      origin: typingsSlinky.kendoUi.kendo.geometry.Point,
      size: typingsSlinky.kendoUi.kendo.geometry.Size
    ) = this()
  }
  
  @js.native
  class Size ()
    extends typingsSlinky.kendoUi.kendo.geometry.Size
  
  @js.native
  class Transformation ()
    extends typingsSlinky.kendoUi.kendo.geometry.Transformation
  
  /* static members */
  @js.native
  object Matrix extends js.Object {
    def rotate(angle: Double, x: Double, y: Double): typingsSlinky.kendoUi.kendo.geometry.Matrix = js.native
    def scale(scaleX: Double, scaleY: Double): typingsSlinky.kendoUi.kendo.geometry.Matrix = js.native
    def translate(x: Double, y: Double): typingsSlinky.kendoUi.kendo.geometry.Matrix = js.native
    def unit(): typingsSlinky.kendoUi.kendo.geometry.Matrix = js.native
  }
  
  /* static members */
  @js.native
  object Point extends js.Object {
    def create(x: js.Any, y: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
    def create(x: Double, y: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
    def create(x: typingsSlinky.kendoUi.kendo.geometry.Point, y: Double): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
    def max(): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
    def maxPoint(): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
    def min(): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
    def minPoint(): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  }
  
  /* static members */
  @js.native
  object Rect extends js.Object {
    def fromPoints(
      pointA: typingsSlinky.kendoUi.kendo.geometry.Point,
      pointB: typingsSlinky.kendoUi.kendo.geometry.Point
    ): typingsSlinky.kendoUi.kendo.geometry.Rect = js.native
    def union(rectA: typingsSlinky.kendoUi.kendo.geometry.Rect, rectB: typingsSlinky.kendoUi.kendo.geometry.Rect): typingsSlinky.kendoUi.kendo.geometry.Rect = js.native
  }
  
  /* static members */
  @js.native
  object Size extends js.Object {
    def create(width: js.Any, height: Double): typingsSlinky.kendoUi.kendo.geometry.Size = js.native
    def create(width: Double, height: Double): typingsSlinky.kendoUi.kendo.geometry.Size = js.native
    def create(width: typingsSlinky.kendoUi.kendo.geometry.Size, height: Double): typingsSlinky.kendoUi.kendo.geometry.Size = js.native
  }
  
}

