package typingsSlinky.gm.mod

import typingsSlinky.gm.gmStrings.gaussian_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gm.gmStrings.uniform
  - typingsSlinky.gm.gmStrings.gaussian_
  - typingsSlinky.gm.gmStrings.multiplicative
  - typingsSlinky.gm.gmStrings.impulse
  - typingsSlinky.gm.gmStrings.laplacian
  - typingsSlinky.gm.gmStrings.poisson
*/
trait NoiseType extends js.Object

object NoiseType {
  @scala.inline
  def gaussian: gaussian_ = "gaussian".asInstanceOf[gaussian_]
  @scala.inline
  def impulse: typingsSlinky.gm.gmStrings.impulse = "impulse".asInstanceOf[typingsSlinky.gm.gmStrings.impulse]
  @scala.inline
  def laplacian: typingsSlinky.gm.gmStrings.laplacian = "laplacian".asInstanceOf[typingsSlinky.gm.gmStrings.laplacian]
  @scala.inline
  def multiplicative: typingsSlinky.gm.gmStrings.multiplicative = "multiplicative".asInstanceOf[typingsSlinky.gm.gmStrings.multiplicative]
  @scala.inline
  def poisson: typingsSlinky.gm.gmStrings.poisson = "poisson".asInstanceOf[typingsSlinky.gm.gmStrings.poisson]
  @scala.inline
  def uniform: typingsSlinky.gm.gmStrings.uniform = "uniform".asInstanceOf[typingsSlinky.gm.gmStrings.uniform]
}

