package typingsSlinky.electronGet.typesMod

import typingsSlinky.electronGet.downloaderMod.Downloader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElectronDownloadRequestOptions extends js.Object {
  /**
    * The directory that caches Electron artifact downloads.
    *
    * The default value is dependent upon the host platform:
    *
    * * Linux: `$XDG_CACHE_HOME` or `~/.cache/electron/`
    * * MacOS: `~/Library/Caches/electron/`
    * * Windows: `%LOCALAPPDATA%/electron/Cache` or `~/AppData/Local/electron/Cache/`
    */
  var cacheRoot: js.UndefOr[String] = js.native
  /**
    * Options passed to the downloader module.
    */
  var downloadOptions: js.UndefOr[DownloadOptions] = js.native
  /**
    * The custom [[Downloader]] class used to download artifacts. Defaults to the
    * built-in [[GotDownloader]].
    */
  var downloader: js.UndefOr[Downloader[_]] = js.native
  /**
    * Whether to download an artifact regardless of whether it's in the cache directory.
    *
    * Defaults to `false`.
    */
  var force: js.UndefOr[Boolean] = js.native
  /**
    * Options related to specifying an artifact mirror.
    */
  var mirrorOptions: js.UndefOr[MirrorOptions] = js.native
  /**
    * A temporary directory for downloads.
    * It is used before artifacts are put into cache.
    */
  var tempDirectory: js.UndefOr[String] = js.native
  /**
    * When set to `true`, disables checking that the artifact download completed successfully
    * with the correct payload.
    *
    * Defaults to `false`.
    */
  var unsafelyDisableChecksums: js.UndefOr[Boolean] = js.native
}

object ElectronDownloadRequestOptions {
  @scala.inline
  def apply(): ElectronDownloadRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElectronDownloadRequestOptions]
  }
  @scala.inline
  implicit class ElectronDownloadRequestOptionsOps[Self <: ElectronDownloadRequestOptions] (val x: Self) extends AnyVal {
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
    def setCacheRoot(value: String): Self = this.set("cacheRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheRoot: Self = this.set("cacheRoot", js.undefined)
    @scala.inline
    def setDownloadOptions(value: DownloadOptions): Self = this.set("downloadOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadOptions: Self = this.set("downloadOptions", js.undefined)
    @scala.inline
    def setDownloader(value: Downloader[_]): Self = this.set("downloader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloader: Self = this.set("downloader", js.undefined)
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    @scala.inline
    def setMirrorOptions(value: MirrorOptions): Self = this.set("mirrorOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMirrorOptions: Self = this.set("mirrorOptions", js.undefined)
    @scala.inline
    def setTempDirectory(value: String): Self = this.set("tempDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTempDirectory: Self = this.set("tempDirectory", js.undefined)
    @scala.inline
    def setUnsafelyDisableChecksums(value: Boolean): Self = this.set("unsafelyDisableChecksums", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsafelyDisableChecksums: Self = this.set("unsafelyDisableChecksums", js.undefined)
  }
  
}

