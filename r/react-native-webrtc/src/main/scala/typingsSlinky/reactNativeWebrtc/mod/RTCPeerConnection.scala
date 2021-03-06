package typingsSlinky.reactNativeWebrtc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-webrtc", "RTCPeerConnection")
@js.native
class RTCPeerConnection protected () extends js.Object {
  def this(configuration: RTCPeerConnectionConfiguration) = this()
  var _dataChannelIds: js.Any = js.native
  var _localStreams: js.Array[MediaStream] = js.native
  var _peerConnectionId: Double = js.native
  var _remoteStreams: js.Array[MediaStream] = js.native
  var _subscriptions: js.Array[_] = js.native
  var localDescription: RTCSessionDescriptionType = js.native
  var privateiceConnectionState: RTCIceConnectionState = js.native
  var privateiceGatheringState: RTCIceGatheringState = js.native
  var remoteDescription: RTCSessionDescriptionType = js.native
  var signalingState: RTCSignalingState = js.native
  /* private */ def _getTrack(streamReactTag: String, trackId: String): MediaStreamTrack = js.native
  /* private */ def _registerEvents(): Unit = js.native
  /* private */ def _unregisterEvents(): Unit = js.native
  def addIceCandidate(candidate: RTCIceCandidateType): js.Promise[Unit] = js.native
  def addStream(stream: MediaStream): Unit = js.native
  def close(): Unit = js.native
  def createAnswer(): js.Promise[RTCSessionDescriptionType] = js.native
  def createDataChannel(label: String): Unit = js.native
  def createDataChannel(label: String, dataChannelDict: js.Any): Unit = js.native
  def createOffer(): js.Promise[RTCSessionDescriptionType] = js.native
  def getLocalStreams(): js.Array[MediaStream] = js.native
  def getRemoteStreams(): js.Array[MediaStream] = js.native
  def getStats(): js.Promise[_] = js.native
  def getStats(selector: MediaStreamTrack): js.Promise[_] = js.native
  def onaddstream(event: EventOnAddStream): js.UndefOr[Unit] = js.native
  def onconnectionstatechange(): js.UndefOr[Unit] = js.native
  def onicecandidate(event: EventOnCandidate): js.UndefOr[Unit] = js.native
  def onicecandidateerror(error: js.Error): js.UndefOr[Unit] = js.native
  def oniceconnectionstatechange(event: EventOnConnectionStateChange): js.UndefOr[Unit] = js.native
  def onicegatheringstatechange(): js.UndefOr[Unit] = js.native
  def onnegotiationneeded(): js.UndefOr[Unit] = js.native
  def onremovestream(): js.UndefOr[Unit] = js.native
  def onsignalingstatechange(): js.UndefOr[Unit] = js.native
  def removeStream(stream: MediaStream): Unit = js.native
  def setConfiguration(configuration: RTCPeerConnectionConfiguration): Unit = js.native
  def setLocalDescription(sessionDescription: RTCSessionDescriptionType): js.Promise[Unit] = js.native
  def setRemoteDescription(sessionDescription: RTCSessionDescriptionType): js.Promise[Unit] = js.native
}

