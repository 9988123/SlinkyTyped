package typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry

import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.ITextSelection
import typingsSlinky.jupyterlabObservables.modeldbMod.IModelDB
import typingsSlinky.jupyterlabObservables.observablemapMod.IObservableMap
import typingsSlinky.jupyterlabObservables.observablestringMod.IObservableString
import typingsSlinky.phosphorCoreutils.jsonMod.JSONValue
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for a document model that represents code.
  */
trait ICodeModel
  extends IModel
     with typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IModel {
  /**
    * The underlying `IModelDB` instance in which model
    * data is stored.
    */
  /* InferMemberOverrides */
  override val modelDB: IModelDB
}

object ICodeModel {
  @scala.inline
  def apply(
    contentChanged: ISignal[ICodeModel, Unit],
    defaultKernelLanguage: String,
    defaultKernelName: String,
    dirty: Boolean,
    dispose: () => Unit,
    fromJSON: js.Any => Unit,
    fromString: String => Unit,
    initialize: () => Unit,
    isDisposed: Boolean,
    mimeType: String,
    mimeTypeChanged: ISignal[
      typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IModel, 
      typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs[String, String]
    ],
    modelDB: IModelDB,
    readOnly: Boolean,
    selections: IObservableMap[js.Array[ITextSelection]],
    stateChanged: ISignal[
      ICodeModel, 
      typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs[_, String]
    ],
    toJSON: () => JSONValue,
    value: IObservableString
  ): ICodeModel = {
    val __obj = js.Dynamic.literal(contentChanged = contentChanged.asInstanceOf[js.Any], defaultKernelLanguage = defaultKernelLanguage.asInstanceOf[js.Any], defaultKernelName = defaultKernelName.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), fromJSON = js.Any.fromFunction1(fromJSON), fromString = js.Any.fromFunction1(fromString), initialize = js.Any.fromFunction0(initialize), isDisposed = isDisposed.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodeModel]
  }
}

