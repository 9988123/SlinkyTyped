package typingsSlinky.babylonjs.audioIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Audio/index", "WeightedSound")
@js.native
class WeightedSound protected ()
  extends typingsSlinky.babylonjs.weightedsoundMod.WeightedSound {
  /**
    * Creates a new WeightedSound from the list of sounds given.
    * @param loop When true a Sound will be selected and played when the current playing Sound completes.
    * @param sounds Array of Sounds that will be selected from.
    * @param weights Array of number values for selection weights; length must equal sounds, values will be normalized to 1
    */
  def this(loop: Boolean, sounds: js.Array[typingsSlinky.babylonjs.soundMod.Sound], weights: js.Array[Double]) = this()
}

