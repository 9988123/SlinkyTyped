package typingsSlinky.awsSdkClientKmsNode.typesEncryptInputMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import typingsSlinky.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptInput extends InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.native
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[NodeHttpOptions] = js.native
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.native
  /**
    * <p>Name-value pair that specifies the encryption context to be used for authenticated encryption. If used here, the same value must be supplied to the <code>Decrypt</code> API or decryption will fail. For more information, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html">Encryption Context</a>.</p>
    */
  var EncryptionContext: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.native
  /**
    * <p>A list of grant tokens.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant Tokens</a> in the <i>AWS Key Management Service Developer Guide</i>.</p>
    */
  var GrantTokens: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
  /**
    * <p>A unique identifier for the customer master key (CMK).</p> <p>To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name, prefix it with <code>"alias/"</code>. To specify a CMK in a different AWS account, you must use the key ARN or alias ARN.</p> <p>For example:</p> <ul> <li> <p>Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code> </p> </li> <li> <p>Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code> </p> </li> <li> <p>Alias name: <code>alias/ExampleAlias</code> </p> </li> <li> <p>Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code> </p> </li> </ul> <p>To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>. To get the alias name and alias ARN, use <a>ListAliases</a>.</p>
    */
  var KeyId: String = js.native
  /**
    * <p>Data to be encrypted.</p>
    */
  var Plaintext: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String = js.native
}

object EncryptInput {
  @scala.inline
  def apply(KeyId: String, Plaintext: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): EncryptInput = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Plaintext = Plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptInput]
  }
  @scala.inline
  implicit class EncryptInputOps[Self <: EncryptInput] (val x: Self) extends AnyVal {
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
    def setKeyId(value: String): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaintextArrayBufferView(value: js.typedarray.ArrayBufferView): Self = this.set("Plaintext", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaintextArrayBuffer(value: js.typedarray.ArrayBuffer): Self = this.set("Plaintext", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaintext(value: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): Self = this.set("Plaintext", value.asInstanceOf[js.Any])
    @scala.inline
    def set$abortSignal(value: AbortSignal): Self = this.set("$abortSignal", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$abortSignal: Self = this.set("$abortSignal", js.undefined)
    @scala.inline
    def set$httpOptions(value: NodeHttpOptions): Self = this.set("$httpOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$httpOptions: Self = this.set("$httpOptions", js.undefined)
    @scala.inline
    def set$maxRetries(value: Double): Self = this.set("$maxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$maxRetries: Self = this.set("$maxRetries", js.undefined)
    @scala.inline
    def setEncryptionContextIterable(value: js.Iterable[js.Tuple2[String, String]]): Self = this.set("EncryptionContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncryptionContext(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = this.set("EncryptionContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionContext: Self = this.set("EncryptionContext", js.undefined)
    @scala.inline
    def setGrantTokensVarargs(value: String*): Self = this.set("GrantTokens", js.Array(value :_*))
    @scala.inline
    def setGrantTokensIterable(value: js.Iterable[String]): Self = this.set("GrantTokens", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrantTokens(value: js.Array[String] | js.Iterable[String]): Self = this.set("GrantTokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantTokens: Self = this.set("GrantTokens", js.undefined)
  }
  
}

