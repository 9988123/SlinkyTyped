package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.DevicePose
import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.DaydreamController")
@js.native
class DaydreamController protected ()
  extends typingsSlinky.babylonjs.BABYLON.DaydreamController {
  /**
    * Creates a new DaydreamController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: js.Any) = this()
  /**
    * The rotation quaternion of the device in babylon space.
    */
  /* CompleteClass */
  override var deviceRotationQuaternion: typingsSlinky.babylonjs.BABYLON.Quaternion = js.native
  /**
    * The scale of the device to be used when translating from device space to babylon space.
    */
  /* CompleteClass */
  override var deviceScaleFactor: Double = js.native
  /**
    * The position of the object in babylon space.
    */
  /* CompleteClass */
  override var position: typingsSlinky.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The raw pose coming from the device.
    */
  /* CompleteClass */
  override var rawPose: Nullable[DevicePose] = js.native
  /**
    * The rotation quaternion of the object in babylon space.
    */
  /* CompleteClass */
  override var rotationQuaternion: typingsSlinky.babylonjs.BABYLON.Quaternion = js.native
  /**
    * Updates the poseControlled values based on the input device pose.
    * @param poseData the pose data to update the object with
    */
  /* CompleteClass */
  override def updateFromDevice(poseData: DevicePose): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.DaydreamController")
@js.native
object DaydreamController extends js.Object {
  /**
    * Gamepad Id prefix used to identify Daydream Controller.
    */
  val GAMEPAD_ID_PREFIX: String = js.native
  /**
    * Base Url for the controller model.
    */
  var MODEL_BASE_URL: String = js.native
  /**
    * File name for the controller model.
    */
  var MODEL_FILENAME: String = js.native
}

