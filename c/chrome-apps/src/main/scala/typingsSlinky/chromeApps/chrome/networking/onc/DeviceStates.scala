package typingsSlinky.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A list of devices and their state. */
@js.native
trait DeviceStates extends js.Object {
  /** The SIM lock status if Type = Cellular and SIMPresent = True. */
  var SIMLockStatus: js.UndefOr[typingsSlinky.chromeApps.chrome.networking.onc.SIMLockStatus] = js.native
  /** Set to the SIM present state if the device type is Cellular. */
  var SIMPresent: js.UndefOr[Boolean] = js.native
  /** Set if the device is enabled. True if the device is currently scanning. */
  var Scanning: js.UndefOr[Boolean] = js.native
  /**
    * The current state of the device.
    *
    * **Uninitialized**
    *  - Device is available but not initialized.
    * **Disabled**
    *  - Device is initialized but not enabled.
    * **Enabling**
    *  - Enabled state has been requested but has not completed.
    * **Enabled**
    *  - Device is enabled.
    * **Prohibited**
    *  - Device is prohibited.
    */
  var State: DeviceState = js.native
  /** The network type associated with the device (Cellular, Ethernet, WiFi, or WiMAX). */
  var Type: NetworkType = js.native
}

object DeviceStates {
  @scala.inline
  def apply(State: DeviceState, Type: NetworkType): DeviceStates = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceStates]
  }
  @scala.inline
  implicit class DeviceStatesOps[Self <: DeviceStates] (val x: Self) extends AnyVal {
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
    def setState(value: DeviceState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: NetworkType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setSIMLockStatus(value: SIMLockStatus): Self = this.set("SIMLockStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSIMLockStatus: Self = this.set("SIMLockStatus", js.undefined)
    @scala.inline
    def setSIMPresent(value: Boolean): Self = this.set("SIMPresent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSIMPresent: Self = this.set("SIMPresent", js.undefined)
    @scala.inline
    def setScanning(value: Boolean): Self = this.set("Scanning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScanning: Self = this.set("Scanning", js.undefined)
  }
  
}

