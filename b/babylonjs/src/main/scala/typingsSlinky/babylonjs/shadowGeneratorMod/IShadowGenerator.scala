package typingsSlinky.babylonjs.shadowGeneratorMod

import typingsSlinky.babylonjs.anon.PartialuseInstancesboolea
import typingsSlinky.babylonjs.effectMod.Effect
import typingsSlinky.babylonjs.materialDefinesMod.MaterialDefines
import typingsSlinky.babylonjs.mathVectorMod.Matrix
import typingsSlinky.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typingsSlinky.babylonjs.subMeshMod.SubMesh
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShadowGenerator extends js.Object {
  /**
    * Binds the shadow related information inside of an effect (information like near, far, darkness...
    * defined in the generator but impacting the effect).
    * It implies the unifroms available on the materials are the standard BJS ones.
    * @param lightIndex Index of the light in the enabled light list of the material owning the effect
    * @param effect The effect we are binfing the information for
    */
  def bindShadowLight(lightIndex: String, effect: Effect): Unit = js.native
  /**
    * Disposes the Shadow map and related Textures and effects.
    */
  def dispose(): Unit = js.native
  /**
    * Forces all the attached effect to compile to enable rendering only once ready vs. lazyly compiling effects.
    * @param onCompiled Callback triggered at the and of the effects compilation
    * @param options Sets of optional options forcing the compilation with different modes
    */
  def forceCompilation(): Unit = js.native
  def forceCompilation(onCompiled: js.Function1[/* generator */ this.type, Unit]): Unit = js.native
  def forceCompilation(onCompiled: js.Function1[/* generator */ this.type, Unit], options: PartialuseInstancesboolea): Unit = js.native
  /**
    * Forces all the attached effect to compile to enable rendering only once ready vs. lazyly compiling effects.
    * @param options Sets of optional options forcing the compilation with different modes
    * @returns A promise that resolves when the compilation completes
    */
  def forceCompilationAsync(): js.Promise[Unit] = js.native
  def forceCompilationAsync(options: PartialuseInstancesboolea): js.Promise[Unit] = js.native
  /**
    * Gets the main RTT containing the shadow map (usually storing depth from the light point of view).
    * @returns The render target texture if present otherwise, null
    */
  def getShadowMap(): Nullable[RenderTargetTexture] = js.native
  /**
    * Gets the transformation matrix used to project the meshes into the map from the light point of view.
    * (eq to shadow prjection matrix * light transform matrix)
    * @returns The transform matrix used to create the shadow map
    */
  def getTransformMatrix(): Matrix = js.native
  /**
    * Determine wheter the shadow generator is ready or not (mainly all effects and related post processes needs to be ready).
    * @param subMesh The submesh we want to render in the shadow map
    * @param useInstances Defines wether will draw in the map using instances
    * @returns true if ready otherwise, false
    */
  def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
  /**
    * Prepare all the defines in a material relying on a shadow map at the specified light index.
    * @param defines Defines of the material we want to update
    * @param lightIndex Index of the light in the enabled light list of the material
    */
  def prepareDefines(defines: MaterialDefines, lightIndex: Double): Unit = js.native
  /**
    * Recreates the shadow map dependencies like RTT and post processes. This can be used during the switch between
    * Cube and 2D textures for instance.
    */
  def recreateShadowMap(): Unit = js.native
  /**
    * Serializes the shadow generator setup to a json object.
    * @returns The serialized JSON object
    */
  def serialize(): js.Any = js.native
}

