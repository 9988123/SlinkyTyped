package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Capabilities of the remote cache system.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2CacheCapabilities extends js.Object {
  /**
    * Capabilities for updating the action cache.
    */
  var actionCacheUpdateCapabilities: js.UndefOr[SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities] = js.native
  /**
    * Supported cache priority range for both CAS and ActionCache.
    */
  var cachePriorityCapabilities: js.UndefOr[SchemaBuildBazelRemoteExecutionV2PriorityCapabilities] = js.native
  /**
    * All the digest functions supported by the remote cache. Remote cache may
    * support multiple digest functions simultaneously.
    */
  var digestFunction: js.UndefOr[js.Array[String]] = js.native
  /**
    * Maximum total size of blobs to be uploaded/downloaded using batch
    * methods. A value of 0 means no limit is set, although in practice there
    * will always be a message size limitation of the protocol in use, e.g.
    * GRPC.
    */
  var maxBatchTotalSizeBytes: js.UndefOr[String] = js.native
  /**
    * Whether absolute symlink targets are supported.
    */
  var symlinkAbsolutePathStrategy: js.UndefOr[String] = js.native
}

object SchemaBuildBazelRemoteExecutionV2CacheCapabilities {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2CacheCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2CacheCapabilities]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2CacheCapabilitiesOps[Self <: SchemaBuildBazelRemoteExecutionV2CacheCapabilities] (val x: Self) extends AnyVal {
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
    def setActionCacheUpdateCapabilities(value: SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities): Self = this.set("actionCacheUpdateCapabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionCacheUpdateCapabilities: Self = this.set("actionCacheUpdateCapabilities", js.undefined)
    @scala.inline
    def setCachePriorityCapabilities(value: SchemaBuildBazelRemoteExecutionV2PriorityCapabilities): Self = this.set("cachePriorityCapabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCachePriorityCapabilities: Self = this.set("cachePriorityCapabilities", js.undefined)
    @scala.inline
    def setDigestFunctionVarargs(value: String*): Self = this.set("digestFunction", js.Array(value :_*))
    @scala.inline
    def setDigestFunction(value: js.Array[String]): Self = this.set("digestFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDigestFunction: Self = this.set("digestFunction", js.undefined)
    @scala.inline
    def setMaxBatchTotalSizeBytes(value: String): Self = this.set("maxBatchTotalSizeBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBatchTotalSizeBytes: Self = this.set("maxBatchTotalSizeBytes", js.undefined)
    @scala.inline
    def setSymlinkAbsolutePathStrategy(value: String): Self = this.set("symlinkAbsolutePathStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymlinkAbsolutePathStrategy: Self = this.set("symlinkAbsolutePathStrategy", js.undefined)
  }
  
}

