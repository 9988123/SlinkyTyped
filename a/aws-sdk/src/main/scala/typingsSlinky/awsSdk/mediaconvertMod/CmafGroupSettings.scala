package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CmafGroupSettings extends js.Object {
  /**
    * By default, the service creates one top-level .m3u8 HLS manifest and one top -level .mpd DASH manifest for each CMAF output group in your job. These default manifests reference every output in the output group. To create additional top-level manifests that reference a subset of the outputs in the output group, specify a list of them here. For each additional manifest that you specify, the service creates one HLS manifest and one DASH manifest.
    */
  var AdditionalManifests: js.UndefOr[listOfCmafAdditionalManifest] = js.native
  /**
    * A partial URI prefix that will be put in the manifest file at the top level BaseURL element. Can be used if streams are delivered from a different URL than the manifest file.
    */
  var BaseUrl: js.UndefOr[string] = js.native
  /**
    * When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents client from saving media segments for later replay.
    */
  var ClientCache: js.UndefOr[CmafClientCache] = js.native
  /**
    * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist generation.
    */
  var CodecSpecification: js.UndefOr[CmafCodecSpecification] = js.native
  /**
    * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the input file. If your job has multiple inputs, the service uses the filename of the first input file.
    */
  var Destination: js.UndefOr[stringPatternS3] = js.native
  /**
    * Settings associated with the destination. Will vary based on the type of destination
    */
  var DestinationSettings: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.DestinationSettings] = js.native
  /**
    * DRM settings.
    */
  var Encryption: js.UndefOr[CmafEncryptionSettings] = js.native
  /**
    * Length of fragments to generate (in seconds). Fragment length must be compatible with GOP size and Framerate. Note that fragments will end on the next keyframe after this number of seconds, so actual fragment length may be longer. When Emit Single File is checked, the fragmentation is internal to a single output file and it does not cause the creation of many output files as in other output types.
    */
  var FragmentLength: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * When set to GZIP, compresses HLS playlist.
    */
  var ManifestCompression: js.UndefOr[CmafManifestCompression] = js.native
  /**
    * Indicates whether the output manifest should use floating point values for segment duration.
    */
  var ManifestDurationFormat: js.UndefOr[CmafManifestDurationFormat] = js.native
  /**
    * Minimum time of initially buffered media that is needed to ensure smooth playout.
    */
  var MinBufferTime: js.UndefOr[integerMin0Max2147483647] = js.native
  /**
    * Keep this setting at the default value of 0, unless you are troubleshooting a problem with how devices play back the end of your video asset. If you know that player devices are hanging on the final segment of your video because the length of your final segment is too short, use this setting to specify a minimum final segment length, in seconds. Choose a value that is greater than or equal to 1 and less than your segment length. When you specify a value for this setting, the encoder will combine any final segment that is shorter than the length that you specify with the previous segment. For example, your segment length is 3 seconds and your final segment is .5 seconds without a minimum final segment length; when you set the minimum final segment length to 1, your final segment is 3.5 seconds.
    */
  var MinFinalSegmentLength: js.UndefOr[doubleMin0Max2147483647] = js.native
  /**
    * Specify whether your DASH profile is on-demand or main. When you choose Main profile (MAIN_PROFILE), the service signals  urn:mpeg:dash:profile:isoff-main:2011 in your .mpd DASH manifest. When you choose On-demand (ON_DEMAND_PROFILE), the service signals urn:mpeg:dash:profile:isoff-on-demand:2011 in your .mpd. When you choose On-demand, you must also set the output group setting Segment control (SegmentControl) to Single file (SINGLE_FILE).
    */
  var MpdProfile: js.UndefOr[CmafMpdProfile] = js.native
  /**
    * When set to SINGLE_FILE, a single output file is generated, which is internally segmented using the Fragment Length and Segment Length. When set to SEGMENTED_FILES, separate segment files will be created.
    */
  var SegmentControl: js.UndefOr[CmafSegmentControl] = js.native
  /**
    * Use this setting to specify the length, in seconds, of each individual CMAF segment. This value applies to the whole package; that is, to every output in the output group. Note that segments end on the first keyframe after this number of seconds, so the actual segment length might be slightly longer. If you set Segment control (CmafSegmentControl) to single file, the service puts the content of each output in a single file that has metadata that marks these segments. If you set it to segmented files, the service creates multiple files for each output, each with the content of one segment.
    */
  var SegmentLength: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag of variant manifest.
    */
  var StreamInfResolution: js.UndefOr[CmafStreamInfResolution] = js.native
  /**
    * When set to ENABLED, a DASH MPD manifest will be generated for this output.
    */
  var WriteDashManifest: js.UndefOr[CmafWriteDASHManifest] = js.native
  /**
    * When set to ENABLED, an Apple HLS manifest will be generated for this output.
    */
  var WriteHlsManifest: js.UndefOr[CmafWriteHLSManifest] = js.native
  /**
    * When you enable Precise segment duration in DASH manifests (writeSegmentTimelineInRepresentation), your DASH manifest shows precise segment durations. The segment duration information appears inside the SegmentTimeline element, inside SegmentTemplate at the Representation level. When this feature isn't enabled, the segment durations in your DASH manifest are approximate. The segment duration information appears in the duration attribute of the SegmentTemplate element.
    */
  var WriteSegmentTimelineInRepresentation: js.UndefOr[CmafWriteSegmentTimelineInRepresentation] = js.native
}

object CmafGroupSettings {
  @scala.inline
  def apply(): CmafGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CmafGroupSettings]
  }
  @scala.inline
  implicit class CmafGroupSettingsOps[Self <: CmafGroupSettings] (val x: Self) extends AnyVal {
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
    def setAdditionalManifestsVarargs(value: CmafAdditionalManifest*): Self = this.set("AdditionalManifests", js.Array(value :_*))
    @scala.inline
    def setAdditionalManifests(value: listOfCmafAdditionalManifest): Self = this.set("AdditionalManifests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalManifests: Self = this.set("AdditionalManifests", js.undefined)
    @scala.inline
    def setBaseUrl(value: string): Self = this.set("BaseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUrl: Self = this.set("BaseUrl", js.undefined)
    @scala.inline
    def setClientCache(value: CmafClientCache): Self = this.set("ClientCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientCache: Self = this.set("ClientCache", js.undefined)
    @scala.inline
    def setCodecSpecification(value: CmafCodecSpecification): Self = this.set("CodecSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodecSpecification: Self = this.set("CodecSpecification", js.undefined)
    @scala.inline
    def setDestination(value: stringPatternS3): Self = this.set("Destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("Destination", js.undefined)
    @scala.inline
    def setDestinationSettings(value: DestinationSettings): Self = this.set("DestinationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationSettings: Self = this.set("DestinationSettings", js.undefined)
    @scala.inline
    def setEncryption(value: CmafEncryptionSettings): Self = this.set("Encryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryption: Self = this.set("Encryption", js.undefined)
    @scala.inline
    def setFragmentLength(value: integerMin1Max2147483647): Self = this.set("FragmentLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragmentLength: Self = this.set("FragmentLength", js.undefined)
    @scala.inline
    def setManifestCompression(value: CmafManifestCompression): Self = this.set("ManifestCompression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifestCompression: Self = this.set("ManifestCompression", js.undefined)
    @scala.inline
    def setManifestDurationFormat(value: CmafManifestDurationFormat): Self = this.set("ManifestDurationFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifestDurationFormat: Self = this.set("ManifestDurationFormat", js.undefined)
    @scala.inline
    def setMinBufferTime(value: integerMin0Max2147483647): Self = this.set("MinBufferTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinBufferTime: Self = this.set("MinBufferTime", js.undefined)
    @scala.inline
    def setMinFinalSegmentLength(value: doubleMin0Max2147483647): Self = this.set("MinFinalSegmentLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinFinalSegmentLength: Self = this.set("MinFinalSegmentLength", js.undefined)
    @scala.inline
    def setMpdProfile(value: CmafMpdProfile): Self = this.set("MpdProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMpdProfile: Self = this.set("MpdProfile", js.undefined)
    @scala.inline
    def setSegmentControl(value: CmafSegmentControl): Self = this.set("SegmentControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentControl: Self = this.set("SegmentControl", js.undefined)
    @scala.inline
    def setSegmentLength(value: integerMin1Max2147483647): Self = this.set("SegmentLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentLength: Self = this.set("SegmentLength", js.undefined)
    @scala.inline
    def setStreamInfResolution(value: CmafStreamInfResolution): Self = this.set("StreamInfResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamInfResolution: Self = this.set("StreamInfResolution", js.undefined)
    @scala.inline
    def setWriteDashManifest(value: CmafWriteDASHManifest): Self = this.set("WriteDashManifest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteDashManifest: Self = this.set("WriteDashManifest", js.undefined)
    @scala.inline
    def setWriteHlsManifest(value: CmafWriteHLSManifest): Self = this.set("WriteHlsManifest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteHlsManifest: Self = this.set("WriteHlsManifest", js.undefined)
    @scala.inline
    def setWriteSegmentTimelineInRepresentation(value: CmafWriteSegmentTimelineInRepresentation): Self = this.set("WriteSegmentTimelineInRepresentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteSegmentTimelineInRepresentation: Self = this.set("WriteSegmentTimelineInRepresentation", js.undefined)
  }
  
}

