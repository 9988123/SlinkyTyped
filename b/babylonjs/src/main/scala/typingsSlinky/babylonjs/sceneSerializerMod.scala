package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Misc/sceneSerializer", JSImport.Namespace)
@js.native
object sceneSerializerMod extends js.Object {
  @js.native
  class SceneSerializer () extends js.Object
  
  /* static members */
  @js.native
  object SceneSerializer extends js.Object {
    /**
      * Clear cache used by a previous serialization
      */
    def ClearCache(): Unit = js.native
    /**
      * Serialize a scene into a JSON compatible object
      * @param scene defines the scene to serialize
      * @returns a JSON compatible object
      */
    def Serialize(scene: Scene): js.Any = js.native
    /**
      * Serialize a mesh into a JSON compatible object
      * @param toSerialize defines the mesh to serialize
      * @param withParents defines if parents must be serialized as well
      * @param withChildren defines if children must be serialized as well
      * @returns a JSON compatible object
      */
    def SerializeMesh(toSerialize: js.Any): js.Any = js.native
    def SerializeMesh(toSerialize: js.Any, withParents: Boolean): js.Any = js.native
    def SerializeMesh(toSerialize: js.Any, withParents: Boolean, withChildren: Boolean): js.Any = js.native
  }
  
}

