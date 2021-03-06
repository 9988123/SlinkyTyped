package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "PlaneBuilder")
@js.native
class PlaneBuilder ()
  extends typingsSlinky.babylonjs.legacyMod.PlaneBuilder

/* static members */
@JSImport("babylonjs", "PlaneBuilder")
@js.native
object PlaneBuilder extends js.Object {
  /**
    * Creates a plane mesh
    * * The parameter `size` sets the size (float) of both sides of the plane at once (default 1)
    * * You can set some different plane dimensions by using the parameters `width` and `height` (both by default have the same value of `size`)
    * * The parameter `sourcePlane` is a Plane instance. It builds a mesh plane from a Math plane
    * * You can also set the mesh side orientation with the values : BABYLON.Mesh.FRONTSIDE (default), BABYLON.Mesh.BACKSIDE or BABYLON.Mesh.DOUBLESIDE
    * * If you create a double-sided mesh, you can choose what parts of the texture image to crop and stick respectively on the front and the back sides with the parameters `frontUVs` and `backUVs` (Vector4). Detail here : https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created
    * @param name defines the name of the mesh
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns the plane mesh
    * @see https://doc.babylonjs.com/how_to/set_shapes#plane
    */
  def CreatePlane(name: String, options: typingsSlinky.babylonjs.anon.Size): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  def CreatePlane(
    name: String,
    options: typingsSlinky.babylonjs.anon.Size,
    scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
}

