package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildBadge extends js.Object {
  /**
    * The ID of the build represented by this badge.
    */
  var buildId: Double = js.native
  /**
    * A link to the SVG resource.
    */
  var imageUrl: String = js.native
}

object BuildBadge {
  @scala.inline
  def apply(buildId: Double, imageUrl: String): BuildBadge = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildBadge]
  }
  @scala.inline
  implicit class BuildBadgeOps[Self <: BuildBadge] (val x: Self) extends AnyVal {
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
    def setBuildId(value: Double): Self = this.set("buildId", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
  }
  
}

