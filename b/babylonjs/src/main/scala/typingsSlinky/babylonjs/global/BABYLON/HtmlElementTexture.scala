package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.IHtmlElementTextureOptions
import typingsSlinky.babylonjs.BABYLON.Nullable
import typingsSlinky.babylonjs.HTMLCanvasElement
import typingsSlinky.babylonjs.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.HtmlElementTexture")
@js.native
class HtmlElementTexture protected ()
  extends typingsSlinky.babylonjs.BABYLON.HtmlElementTexture {
  def this(name: String, element: HTMLCanvasElement, options: IHtmlElementTextureOptions) = this()
  /**
    * Instantiates a HtmlElementTexture from the following parameters.
    *
    * @param name Defines the name of the texture
    * @param element Defines the video or canvas the texture is filled with
    * @param options Defines the other none mandatory texture creation options
    */
  def this(name: String, element: HTMLVideoElement, options: IHtmlElementTextureOptions) = this()
  /**
    * Array of animations
    */
  /* CompleteClass */
  override var animations: Nullable[js.Array[typingsSlinky.babylonjs.BABYLON.Animation]] = js.native
}

/* static members */
@JSGlobal("BABYLON.HtmlElementTexture")
@js.native
object HtmlElementTexture extends js.Object {
  val DefaultOptions: js.Any = js.native
}

