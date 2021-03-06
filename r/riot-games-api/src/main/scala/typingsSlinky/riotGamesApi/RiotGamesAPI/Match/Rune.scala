package typingsSlinky.riotGamesApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rune extends js.Object {
  var rank: Double = js.native
  var runeId: Double = js.native
}

object Rune {
  @scala.inline
  def apply(rank: Double, runeId: Double): Rune = {
    val __obj = js.Dynamic.literal(rank = rank.asInstanceOf[js.Any], runeId = runeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rune]
  }
  @scala.inline
  implicit class RuneOps[Self <: Rune] (val x: Self) extends AnyVal {
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
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuneId(value: Double): Self = this.set("runeId", value.asInstanceOf[js.Any])
  }
  
}

