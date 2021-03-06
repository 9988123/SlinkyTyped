package typingsSlinky.useItEventListener.mod

import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import typingsSlinky.useItEventListener.useItEventListenerStrings.animationend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_animationend extends js.Object {
  def apply(eventName: animationend, handler: AnimationEvent): Unit = js.native
  def apply(
    eventName: animationend,
    handler: AnimationEvent,
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(
    eventName: animationend,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: animationend, handler: AnimationEvent, element: Document): Unit = js.native
  def apply(eventName: animationend, handler: AnimationEvent, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: animationend,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: animationend,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
  def apply(eventName: animationend, handler: AnimationEvent, element: Window): Unit = js.native
  def apply(eventName: animationend, handler: AnimationEvent, element: Window, options: Options): Unit = js.native
}

