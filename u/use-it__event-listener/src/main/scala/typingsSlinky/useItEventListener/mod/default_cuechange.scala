package typingsSlinky.useItEventListener.mod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import typingsSlinky.useItEventListener.useItEventListenerStrings.cuechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_cuechange extends js.Object {
  def apply(eventName: cuechange, handler: Event): Unit = js.native
  def apply(eventName: cuechange, handler: Event, element: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def apply(
    eventName: cuechange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: cuechange, handler: Event, element: Document): Unit = js.native
  def apply(eventName: cuechange, handler: Event, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: cuechange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: cuechange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
  def apply(eventName: cuechange, handler: Event, element: Window): Unit = js.native
  def apply(eventName: cuechange, handler: Event, element: Window, options: Options): Unit = js.native
}

