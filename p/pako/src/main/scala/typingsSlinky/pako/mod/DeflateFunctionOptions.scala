package typingsSlinky.pako.mod

import typingsSlinky.pako.pakoNumbers.`-1`
import typingsSlinky.pako.pakoNumbers.`0`
import typingsSlinky.pako.pakoNumbers.`1`
import typingsSlinky.pako.pakoNumbers.`2`
import typingsSlinky.pako.pakoNumbers.`3`
import typingsSlinky.pako.pakoNumbers.`4`
import typingsSlinky.pako.pakoNumbers.`5`
import typingsSlinky.pako.pakoNumbers.`6`
import typingsSlinky.pako.pakoNumbers.`7`
import typingsSlinky.pako.pakoNumbers.`8`
import typingsSlinky.pako.pakoNumbers.`9`
import typingsSlinky.pako.pakoStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeflateFunctionOptions extends js.Object {
  var dictionary: js.UndefOr[js.Any] = js.native
  var level: js.UndefOr[`-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.native
  var memLevel: js.UndefOr[Double] = js.native
  var raw: js.UndefOr[Boolean] = js.native
  var strategy: js.UndefOr[StrategyValues] = js.native
  var to: js.UndefOr[string] = js.native
  var windowBits: js.UndefOr[Double] = js.native
}

object DeflateFunctionOptions {
  @scala.inline
  def apply(): DeflateFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeflateFunctionOptions]
  }
  @scala.inline
  implicit class DeflateFunctionOptionsOps[Self <: DeflateFunctionOptions] (val x: Self) extends AnyVal {
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
    def setDictionary(value: js.Any): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDictionary: Self = this.set("dictionary", js.undefined)
    @scala.inline
    def setLevel(value: `-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setMemLevel(value: Double): Self = this.set("memLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemLevel: Self = this.set("memLevel", js.undefined)
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    @scala.inline
    def setStrategy(value: StrategyValues): Self = this.set("strategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
    @scala.inline
    def setTo(value: string): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    @scala.inline
    def setWindowBits(value: Double): Self = this.set("windowBits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowBits: Self = this.set("windowBits", js.undefined)
  }
  
}

