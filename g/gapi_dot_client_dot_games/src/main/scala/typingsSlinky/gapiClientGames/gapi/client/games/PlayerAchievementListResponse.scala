package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerAchievementListResponse extends js.Object {
  /** The achievements. */
  var items: js.UndefOr[js.Array[PlayerAchievement]] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#playerAchievementListResponse. */
  var kind: js.UndefOr[String] = js.native
  /** Token corresponding to the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}

object PlayerAchievementListResponse {
  @scala.inline
  def apply(): PlayerAchievementListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerAchievementListResponse]
  }
  @scala.inline
  implicit class PlayerAchievementListResponseOps[Self <: PlayerAchievementListResponse] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: PlayerAchievement*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[PlayerAchievement]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

