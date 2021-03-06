package typingsSlinky.grpcGrpcJs

import typingsSlinky.grpcGrpcJs.loadBalancerMod.ChannelControlHelper
import typingsSlinky.grpcGrpcJs.loadBalancerMod.LoadBalancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/load-balancer-eds", JSImport.Namespace)
@js.native
object loadBalancerEdsMod extends js.Object {
  @js.native
  class EdsLoadBalancer protected () extends LoadBalancer {
    def this(channelControlHelper: ChannelControlHelper) = this()
    val channelControlHelper: js.Any = js.native
    /**
      * The child load balancer that will handle balancing the results of the EDS
      * requests.
      */
    var childBalancer: js.Any = js.native
    var edsServiceName: js.Any = js.native
    /**
      * Indicates whether the watcher has already been passed to this.xdsClient
      * and is getting updates.
      */
    var isWatcherActive: js.Any = js.native
    var lastestConfig: js.Any = js.native
    var latestAttributes: js.Any = js.native
    var latestEdsUpdate: js.Any = js.native
    /**
      * The priority of each locality the last time we got an update.
      */
    var localityPriorities: js.Any = js.native
    var nextPriorityChildNumber: js.Any = js.native
    /**
      * The name we assigned to each priority number the last time we got an
      * update.
      */
    var priorityNames: js.Any = js.native
    /**
      * Should be called when this balancer gets a new config and when the
      * XdsClient returns a new ClusterLoadAssignment.
      */
    var updateChild: js.Any = js.native
    var watcher: js.Any = js.native
    var xdsClient: js.Any = js.native
  }
  
  def setup(): Unit = js.native
}

