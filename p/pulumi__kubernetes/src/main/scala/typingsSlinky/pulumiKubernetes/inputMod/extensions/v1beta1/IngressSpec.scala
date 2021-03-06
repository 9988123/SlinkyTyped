package typingsSlinky.pulumiKubernetes.inputMod.extensions.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IngressSpec describes the Ingress the user wishes to exist.
  */
@js.native
trait IngressSpec extends js.Object {
  /**
    * A default backend capable of servicing requests that don't match any rule. At least one of 'backend' or 'rules' must be specified. This field is optional to allow the loadbalancer controller or defaulting logic to specify a global default.
    */
  var backend: js.UndefOr[Input[IngressBackend]] = js.native
  /**
    * IngressClassName is the name of the IngressClass cluster resource. The associated IngressClass defines which controller will implement the resource. This replaces the deprecated `kubernetes.io/ingress.class` annotation. For backwards compatibility, when that annotation is set, it must be given precedence over this field. The controller may emit a warning if the field and annotation have different values. Implementations of this API should ignore Ingresses without a class specified. An IngressClass resource may be marked as default, which can be used to set a default value for this field. For more information, refer to the IngressClass documentation.
    */
  var ingressClassName: js.UndefOr[Input[String]] = js.native
  /**
    * A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.
    */
  var rules: js.UndefOr[Input[js.Array[Input[IngressRule]]]] = js.native
  /**
    * TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
    */
  var tls: js.UndefOr[Input[js.Array[Input[IngressTLS]]]] = js.native
}

object IngressSpec {
  @scala.inline
  def apply(): IngressSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngressSpec]
  }
  @scala.inline
  implicit class IngressSpecOps[Self <: IngressSpec] (val x: Self) extends AnyVal {
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
    def setBackend(value: Input[IngressBackend]): Self = this.set("backend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackend: Self = this.set("backend", js.undefined)
    @scala.inline
    def setIngressClassName(value: Input[String]): Self = this.set("ingressClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIngressClassName: Self = this.set("ingressClassName", js.undefined)
    @scala.inline
    def setRulesVarargs(value: Input[IngressRule]*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: Input[js.Array[Input[IngressRule]]]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    @scala.inline
    def setTlsVarargs(value: Input[IngressTLS]*): Self = this.set("tls", js.Array(value :_*))
    @scala.inline
    def setTls(value: Input[js.Array[Input[IngressTLS]]]): Self = this.set("tls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTls: Self = this.set("tls", js.undefined)
  }
  
}

