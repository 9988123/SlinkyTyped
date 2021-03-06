package typingsSlinky.stormReactDiagrams.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  var color: String = js.native
  var curvyness: Double = js.native
  var id: String = js.native
  var labels: js.Array[OffsetX] = js.native
  var points: js.Array[Selected] = js.native
  var selected: Boolean = js.native
  var source: String = js.native
  var sourcePort: String = js.native
  var target: String = js.native
  var targetPort: String = js.native
  var `type`: String = js.native
  var width: Double = js.native
}

object Color {
  @scala.inline
  def apply(
    color: String,
    curvyness: Double,
    id: String,
    labels: js.Array[OffsetX],
    points: js.Array[Selected],
    selected: Boolean,
    source: String,
    sourcePort: String,
    target: String,
    targetPort: String,
    `type`: String,
    width: Double
  ): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], curvyness = curvyness.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourcePort = sourcePort.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetPort = targetPort.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurvyness(value: Double): Self = this.set("curvyness", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelsVarargs(value: OffsetX*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[OffsetX]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointsVarargs(value: Selected*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[Selected]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourcePort(value: String): Self = this.set("sourcePort", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetPort(value: String): Self = this.set("targetPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

