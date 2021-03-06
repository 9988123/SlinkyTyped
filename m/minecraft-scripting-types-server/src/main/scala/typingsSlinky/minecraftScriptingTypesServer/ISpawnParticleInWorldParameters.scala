package typingsSlinky.minecraftScriptingTypesServer

import typingsSlinky.minecraftScriptingTypesShared.ParticleEffect
import typingsSlinky.minecraftScriptingTypesShared.VectorArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is used to create a static particle effect in the world. This particle effect is visible to all players. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. Once the effect is spawned you won't be able to control it further.
  */
@js.native
trait ISpawnParticleInWorldParameters extends js.Object {
  /**
    * The dimension in which you want to spawn the effect. Can be "overworld", "nether", or "the end"
    * @default overworld
    */
  var dimension: String = js.native
  /**
    * The identifier of the particle effect you want to attach to spawn. This is the same name you gave the effect in its JSON file
    */
  var effect: ParticleEffect = js.native
  /**
    * The position in the world where you want to spawn the effect
    * @default [0, 0, 0]
    */
  var position: VectorArray = js.native
}

object ISpawnParticleInWorldParameters {
  @scala.inline
  def apply(dimension: String, effect: ParticleEffect, position: VectorArray): ISpawnParticleInWorldParameters = {
    val __obj = js.Dynamic.literal(dimension = dimension.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpawnParticleInWorldParameters]
  }
  @scala.inline
  implicit class ISpawnParticleInWorldParametersOps[Self <: ISpawnParticleInWorldParameters] (val x: Self) extends AnyVal {
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
    def setDimension(value: String): Self = this.set("dimension", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffect(value: ParticleEffect): Self = this.set("effect", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: VectorArray): Self = this.set("position", value.asInstanceOf[js.Any])
  }
  
}

