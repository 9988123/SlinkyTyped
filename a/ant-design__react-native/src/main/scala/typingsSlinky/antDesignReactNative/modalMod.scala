package typingsSlinky.antDesignReactNative

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.anon.AnimateAppear
import typingsSlinky.antDesignReactNative.anon.AntLocale
import typingsSlinky.antDesignReactNative.modalPropsTypeMod.Action
import typingsSlinky.antDesignReactNative.modalPropsTypeMod.CallbackOnBackHandler
import typingsSlinky.antDesignReactNative.modalPropsTypeMod.CallbackOrActions
import typingsSlinky.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/modal", JSImport.Namespace)
@js.native
object modalMod extends js.Object {
  @js.native
  class default ()
    extends typingsSlinky.antDesignReactNative.modalModalMod.default
  
  /* static members */
  @js.native
  object default extends js.Object {
    var alert: js.Function4[
        /* title */ ReactElement, 
        /* content */ ReactElement, 
        /* actions */ js.UndefOr[js.Array[Action[TextStyle]]], 
        /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
        Double
      ] = js.native
    var contextTypes: AntLocale = js.native
    var defaultProps: AnimateAppear = js.native
    var operation: js.Function2[
        /* actions */ js.Array[_], 
        /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
        Double
      ] = js.native
    var prompt: js.Function7[
        /* title */ ReactElement, 
        /* message */ ReactElement, 
        /* callbackOrActions */ CallbackOrActions[TextStyle], 
        /* type */ js.UndefOr[String], 
        /* defaultValue */ js.UndefOr[String], 
        /* placeholders */ js.UndefOr[js.Array[String]], 
        /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
        js.UndefOr[Double]
      ] = js.native
  }
  
}

