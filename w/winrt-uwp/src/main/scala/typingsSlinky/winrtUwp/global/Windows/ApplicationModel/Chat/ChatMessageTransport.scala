package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Chat

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the identity of a transport for sending and receiving messages. Physically, a chat message transport is a SIM slot on the phone. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageTransport")
@js.native
abstract class ChatMessageTransport ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageTransport {
  /** Gets the configuration of the message transport. */
  /* CompleteClass */
  override var configuration: typingsSlinky.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageTransportConfiguration = js.native
  /** Gets a Boolean value that indicates whether the messaging transport is active. */
  /* CompleteClass */
  override var isActive: Boolean = js.native
  /** Gets a Boolean value that indicates whether the current application is set as the messaging notification provider. */
  /* CompleteClass */
  override var isAppSetAsNotificationProvider: Boolean = js.native
  /** Gets a descriptive name identifying the messaging transport. */
  /* CompleteClass */
  override var transportFriendlyName: String = js.native
  /** Gets the messaging transport’s identifier. */
  /* CompleteClass */
  override var transportId: String = js.native
  /** Gets the type of the message transport. */
  /* CompleteClass */
  override var transportKind: typingsSlinky.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageTransportKind = js.native
  /**
    * Sets the current application to handle messaging notifications.
    * @return An asynchronous action.
    */
  /* CompleteClass */
  override def requestSetAsNotificationProviderAsync(): IPromiseWithIAsyncAction = js.native
}

