package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Behavior
import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.Light")
@js.native
abstract class Light protected ()
  extends typingsSlinky.babylonjs.BABYLON.Light {
  /**
    * Creates a Light object in the scene.
    * Documentation : https://doc.babylonjs.com/babylon101/lights
    * @param name The firendly name of the light
    * @param scene The scene the light belongs too
    */
  def this(name: String, scene: typingsSlinky.babylonjs.BABYLON.Scene) = this()
  /**
    * Attach a behavior
    * @param behavior defines the behavior to attach
    * @returns the current host
    */
  /* CompleteClass */
  override def addBehavior(behavior: Behavior[typingsSlinky.babylonjs.BABYLON.Node]): typingsSlinky.babylonjs.BABYLON.Node = js.native
  /**
    * Gets a behavior using its name to search
    * @param name defines the name to search
    * @returns the behavior or null if not found
    */
  /* CompleteClass */
  override def getBehaviorByName(name: String): Nullable[Behavior[typingsSlinky.babylonjs.BABYLON.Node]] = js.native
  /**
    * Remove a behavior from the current object
    * @param behavior defines the behavior to detach
    * @returns the current host
    */
  /* CompleteClass */
  override def removeBehavior(behavior: Behavior[typingsSlinky.babylonjs.BABYLON.Node]): typingsSlinky.babylonjs.BABYLON.Node = js.native
}

/* static members */
@JSGlobal("BABYLON.Light")
@js.native
object Light extends js.Object {
  /**
    * Falloff Default: light is falling off following the material specification:
    * standard material is using standard falloff whereas pbr material can request special falloff per materials.
    */
  val FALLOFF_DEFAULT: Double = js.native
  /**
    * Falloff gltf: light is falling off as described in the gltf moving to PBR document
    * to enhance interoperability with other engines.
    */
  val FALLOFF_GLTF: Double = js.native
  /**
    * Falloff Physical: light is falling off following the inverse squared distance law.
    */
  val FALLOFF_PHYSICAL: Double = js.native
  /**
    * Falloff Standard: light is falling off like in the standard material
    * to enhance interoperability with other materials.
    */
  val FALLOFF_STANDARD: Double = js.native
  /**
    * Each light type uses the default quantity according to its type:
    *      point/spot lights use luminous intensity
    *      directional lights use illuminance
    */
  val INTENSITYMODE_AUTOMATIC: Double = js.native
  /**
    * lux (lm/m^2)
    */
  val INTENSITYMODE_ILLUMINANCE: Double = js.native
  /**
    * nit (cd/m^2)
    */
  val INTENSITYMODE_LUMINANCE: Double = js.native
  /**
    * candela (lm/sr)
    */
  val INTENSITYMODE_LUMINOUSINTENSITY: Double = js.native
  /**
    * lumen (lm)
    */
  val INTENSITYMODE_LUMINOUSPOWER: Double = js.native
  /**
    * If every light affecting the material is in this lightmapMode,
    * material.lightmapTexture adds or multiplies
    * (depends on material.useLightmapAsShadowmap)
    * after every other light calculations.
    */
  val LIGHTMAP_DEFAULT: Double = js.native
  /**
    * material.lightmapTexture as only lighting
    * no light calculation from this light
    * only adds dynamic shadows from this light
    */
  val LIGHTMAP_SHADOWSONLY: Double = js.native
  /**
    * material.lightmapTexture as only diffuse lighting from this light
    * adds only specular lighting from this light
    * adds dynamic shadows
    */
  val LIGHTMAP_SPECULAR: Double = js.native
  /**
    * Light type const id of the directional light.
    */
  val LIGHTTYPEID_DIRECTIONALLIGHT: Double = js.native
  /**
    * Light type const id of the hemispheric light.
    */
  val LIGHTTYPEID_HEMISPHERICLIGHT: Double = js.native
  /**
    * Light type const id of the point light.
    */
  val LIGHTTYPEID_POINTLIGHT: Double = js.native
  /**
    * Light type const id of the spot light.
    */
  val LIGHTTYPEID_SPOTLIGHT: Double = js.native
  /**
    * Sort function to order lights for rendering.
    * @param a First Light object to compare to second.
    * @param b Second Light object to compare first.
    * @return -1 to reduce's a's index relative to be, 0 for no change, 1 to increase a's index relative to b.
    */
  def CompareLightsPriority(a: typingsSlinky.babylonjs.BABYLON.Light, b: typingsSlinky.babylonjs.BABYLON.Light): Double = js.native
  /**
    * Creates a new typed light from the passed type (integer) : point light = 0, directional light = 1, spot light = 2, hemispheric light = 3.
    * This new light is named "name" and added to the passed scene.
    * @param type Type according to the types available in Light.LIGHTTYPEID_x
    * @param name The friendly name of the light
    * @param scene The scene the new light will belong to
    * @returns the constructor function
    */
  def GetConstructorFromName(`type`: Double, name: String, scene: typingsSlinky.babylonjs.BABYLON.Scene): Nullable[js.Function0[this.type]] = js.native
  /**
    * Parses the passed "parsedLight" and returns a new instanced Light from this parsing.
    * @param parsedLight The JSON representation of the light
    * @param scene The scene to create the parsed light in
    * @returns the created light after parsing
    */
  def Parse(parsedLight: js.Any, scene: typingsSlinky.babylonjs.BABYLON.Scene): Nullable[typingsSlinky.babylonjs.BABYLON.Light] = js.native
}

