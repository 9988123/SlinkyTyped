package typingsSlinky.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cropbottom extends js.Object {
  var crop_bottom: Double
  var crop_left: Double
  var crop_right: Double
  var crop_top: Double
}

object Cropbottom {
  @scala.inline
  def apply(crop_bottom: Double, crop_left: Double, crop_right: Double, crop_top: Double): Cropbottom = {
    val __obj = js.Dynamic.literal(crop_bottom = crop_bottom.asInstanceOf[js.Any], crop_left = crop_left.asInstanceOf[js.Any], crop_right = crop_right.asInstanceOf[js.Any], crop_top = crop_top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cropbottom]
  }
}

