package typingsSlinky.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RxNormTrait extends js.Object {
  /**
    * Provides a name or contextual description about the trait.
    */
  var Name: js.UndefOr[RxNormTraitName] = js.native
  /**
    * The level of confidence that Amazon Comprehend Medical has in the accuracy of the detected trait.
    */
  var Score: js.UndefOr[Float] = js.native
}

object RxNormTrait {
  @scala.inline
  def apply(): RxNormTrait = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RxNormTrait]
  }
  @scala.inline
  implicit class RxNormTraitOps[Self <: RxNormTrait] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: RxNormTraitName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setScore(value: Float): Self = this.set("Score", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScore: Self = this.set("Score", js.undefined)
  }
  
}

