package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdexchangebuyer.anon.ConfigId
import typingsSlinky.gapiClientAdexchangebuyer.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PretargetingConfigResource extends js.Object {
  /** Deletes an existing pretargeting config. */
  def delete(request: ConfigId): Request[Unit] = js.native
  /** Gets a specific pretargeting configuration */
  def get(request: ConfigId): Request[PretargetingConfig] = js.native
  /** Inserts a new pretargeting configuration. */
  def insert(request: QuotaUser): Request[PretargetingConfig] = js.native
  /** Retrieves a list of the authenticated user's pretargeting configurations. */
  def list(request: QuotaUser): Request[PretargetingConfigList] = js.native
  /** Updates an existing pretargeting config. This method supports patch semantics. */
  def patch(request: ConfigId): Request[PretargetingConfig] = js.native
  /** Updates an existing pretargeting config. */
  def update(request: ConfigId): Request[PretargetingConfig] = js.native
}

object PretargetingConfigResource {
  @scala.inline
  def apply(
    delete: ConfigId => Request[Unit],
    get: ConfigId => Request[PretargetingConfig],
    insert: QuotaUser => Request[PretargetingConfig],
    list: QuotaUser => Request[PretargetingConfigList],
    patch: ConfigId => Request[PretargetingConfig],
    update: ConfigId => Request[PretargetingConfig]
  ): PretargetingConfigResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PretargetingConfigResource]
  }
  @scala.inline
  implicit class PretargetingConfigResourceOps[Self <: PretargetingConfigResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: ConfigId => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: ConfigId => Request[PretargetingConfig]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: QuotaUser => Request[PretargetingConfig]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: QuotaUser => Request[PretargetingConfigList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: ConfigId => Request[PretargetingConfig]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: ConfigId => Request[PretargetingConfig]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

