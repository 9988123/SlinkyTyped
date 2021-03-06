package typingsSlinky.elasticElasticsearch.requestParamsMod

import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings._empty
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.g
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.k
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.m
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.p
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.t
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatThreadPool extends Generic {
  var format: js.UndefOr[String] = js.native
  var h: js.UndefOr[String | js.Array[String]] = js.native
  var help: js.UndefOr[Boolean] = js.native
  var local: js.UndefOr[Boolean] = js.native
  var master_timeout: js.UndefOr[String] = js.native
  var s: js.UndefOr[String | js.Array[String]] = js.native
  var size: js.UndefOr[_empty | k | m | g | t | p] = js.native
  var thread_pool_patterns: js.UndefOr[String | js.Array[String]] = js.native
  var v: js.UndefOr[Boolean] = js.native
}

object CatThreadPool {
  @scala.inline
  def apply(): CatThreadPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatThreadPool]
  }
  @scala.inline
  implicit class CatThreadPoolOps[Self <: CatThreadPool] (val x: Self) extends AnyVal {
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHVarargs(value: String*): Self = this.set("h", js.Array(value :_*))
    @scala.inline
    def setH(value: String | js.Array[String]): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH: Self = this.set("h", js.undefined)
    @scala.inline
    def setHelp(value: Boolean): Self = this.set("help", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    @scala.inline
    def setLocal(value: Boolean): Self = this.set("local", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocal: Self = this.set("local", js.undefined)
    @scala.inline
    def setMaster_timeout(value: String): Self = this.set("master_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaster_timeout: Self = this.set("master_timeout", js.undefined)
    @scala.inline
    def setSVarargs(value: String*): Self = this.set("s", js.Array(value :_*))
    @scala.inline
    def setS(value: String | js.Array[String]): Self = this.set("s", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS: Self = this.set("s", js.undefined)
    @scala.inline
    def setSize(value: _empty | k | m | g | t | p): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setThread_pool_patternsVarargs(value: String*): Self = this.set("thread_pool_patterns", js.Array(value :_*))
    @scala.inline
    def setThread_pool_patterns(value: String | js.Array[String]): Self = this.set("thread_pool_patterns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThread_pool_patterns: Self = this.set("thread_pool_patterns", js.undefined)
    @scala.inline
    def setV(value: Boolean): Self = this.set("v", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteV: Self = this.set("v", js.undefined)
  }
  
}

