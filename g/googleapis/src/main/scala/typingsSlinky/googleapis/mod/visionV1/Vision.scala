package typingsSlinky.googleapis.mod.visionV1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Vision API
  *
  * Integrates Google Vision features, including image labeling, face, logo,
  * and landmark detection, optical character recognition (OCR), and detection
  * of explicit content, into applications.
  *
  * @example
  * const {google} = require('googleapis');
  * const vision = google.vision('v1');
  *
  * @namespace vision
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Vision
  */
@JSImport("googleapis", "vision_v1.Vision")
@js.native
class Vision protected ()
  extends typingsSlinky.googleapis.visionV1Mod.visionV1.Vision {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

