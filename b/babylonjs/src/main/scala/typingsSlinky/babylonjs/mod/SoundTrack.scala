package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.soundTrackMod.ISoundTrackOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "SoundTrack")
@js.native
class SoundTrack protected ()
  extends typingsSlinky.babylonjs.legacyMod.SoundTrack {
  /**
    * Creates a new sound track.
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#using-sound-tracks
    * @param scene Define the scene the sound track belongs to
    * @param options
    */
  def this(scene: typingsSlinky.babylonjs.sceneMod.Scene) = this()
  def this(scene: typingsSlinky.babylonjs.sceneMod.Scene, options: ISoundTrackOptions) = this()
}

