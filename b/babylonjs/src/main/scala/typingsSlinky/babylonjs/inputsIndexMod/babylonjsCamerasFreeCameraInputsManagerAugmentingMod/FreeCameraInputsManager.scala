package typingsSlinky.babylonjs.inputsIndexMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod

import typingsSlinky.babylonjs.freeCameraDeviceOrientationInputMod.FreeCameraDeviceOrientationInput
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeCameraInputsManager extends js.Object {
  /**
    * @hidden
    */
  var _deviceOrientationInput: Nullable[FreeCameraDeviceOrientationInput]
  /**
    * Add orientation input support to the input manager.
    * @returns the current input manager
    */
  def addDeviceOrientation(): typingsSlinky.babylonjs.freeCameraDeviceOrientationInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
  /**
    * Add virtual joystick input support to the input manager.
    * @returns the current input manager
    */
  def addVirtualJoystick(): typingsSlinky.babylonjs.freeCameraVirtualJoystickInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
}

object FreeCameraInputsManager {
  @scala.inline
  def apply(
    addDeviceOrientation: () => typingsSlinky.babylonjs.freeCameraDeviceOrientationInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager,
    addVirtualJoystick: () => typingsSlinky.babylonjs.freeCameraVirtualJoystickInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager,
    _deviceOrientationInput: Nullable[FreeCameraDeviceOrientationInput] = null
  ): FreeCameraInputsManager = {
    val __obj = js.Dynamic.literal(addDeviceOrientation = js.Any.fromFunction0(addDeviceOrientation), addVirtualJoystick = js.Any.fromFunction0(addVirtualJoystick), _deviceOrientationInput = _deviceOrientationInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeCameraInputsManager]
  }
}

