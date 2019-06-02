package info.scce.cinco.product.aiProject.factory;

import com.google.common.base.Objects;
import de.jabc.cinco.meta.runtime.xapi.WorkbenchExtension;
import graphmodel.GraphModel;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.Type;
import graphmodel.internal.InternalGraphModel;
import graphmodel.internal.InternalIdentifiableElement;
import graphmodel.internal.InternalModelElement;
import graphmodel.internal.InternalModelElementContainer;
import graphmodel.internal.InternalType;
import info.scce.cinco.product.aiProject.adapter.AIProjectEContentAdapter;
import info.scce.cinco.product.aiProject.aiproject.AIProject;
import info.scce.cinco.product.aiProject.aiproject.AiprojectPackage;
import info.scce.cinco.product.aiProject.aiproject.impl.AiprojectFactoryImpl;
import info.scce.cinco.product.aiProject.aiproject.internal.InternalAIProject;
import info.scce.cinco.product.aiProject.aiproject.internal.InternalFactory;
import java.io.IOException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class AIProjectFactory extends AiprojectFactoryImpl {
  @Extension
  private final InternalFactory _internalFactory = InternalFactory.eINSTANCE;
  
  public static AIProjectFactory eINSTANCE = AIProjectFactory.init();
  
  @Extension
  private WorkbenchExtension _workbenchExtension = new WorkbenchExtension();
  
  public static AIProjectFactory init() {
    AIProjectFactory _xblockexpression = null;
    {
      try {
        EFactory _eFactory = EPackage.Registry.INSTANCE.getEFactory(AiprojectPackage.eNS_URI);
        final AIProjectFactory fct = ((AIProjectFactory) _eFactory);
        boolean _notEquals = (!Objects.equal(fct, null));
        if (_notEquals) {
          return ((AIProjectFactory) fct);
        }
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception exception = (Exception)_t;
          EcorePlugin.INSTANCE.log(exception);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = new AIProjectFactory();
    }
    return _xblockexpression;
  }
  
  /**
   * This method creates an AIProject with the given id. Post create hook won't be triggered.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param ID: Indicates, if the post create hook should be executed
   */
  public AIProject createAIProject(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    AIProject _createAIProject = super.createAIProject();
    final Procedure1<AIProject> _function = (AIProject it) -> {
      EcoreUtil.setID(it, ID);
      InternalIdentifiableElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalAIProject _createInternalAIProject = this._internalFactory.createInternalAIProject();
        _elvis = _createInternalAIProject;
      }
      final Procedure1<InternalIdentifiableElement> _function_1 = (InternalIdentifiableElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        AIProjectEContentAdapter _aIProjectEContentAdapter = new AIProjectEContentAdapter();
        _eAdapters.add(_aIProjectEContentAdapter);
      };
      InternalIdentifiableElement _doubleArrow = ObjectExtensions.<InternalIdentifiableElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<AIProject>operator_doubleArrow(_createAIProject, _function);
  }
  
  /**
   * This method creates an AIProject with the given id. Post create hook won't be triggered.
   */
  public AIProject createAIProject(final String ID) {
    return this.createAIProject(ID, null, null, false);
  }
  
  /**
   * This method creates an AIProject with the given id. Post create hook will be triggered.
   */
  public AIProject createAIProject(final InternalModelElementContainer parent) {
    return this.createAIProject(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an AIProject with the given id. Post create hook will be triggered.
   */
  public AIProject createAIProject(final String ID, final InternalModelElementContainer parent) {
    return this.createAIProject(ID, null, parent, true);
  }
  
  public AIProject createAIProject(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createAIProject(ID, ime, parent, true);
  }
  
  /**
   * This method creates an AIProject with the given id. Post create hook won't be triggered.
   */
  public AIProject createAIProject(final InternalModelElement ime) {
    return this.createAIProject(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public AIProject createAIProject() {
    return this.createAIProject(EcoreUtil.generateUUID());
  }
  
  private <T extends IdentifiableElement> T setInternal(final T elm, final InternalIdentifiableElement internal) {
    final Procedure1<T> _function = (T it) -> {
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(it.getId());
      if (_isNullOrEmpty) {
        EcoreUtil.setID(it, EcoreUtil.generateUUID());
      }
      boolean _matched = false;
      if (elm instanceof GraphModel) {
        _matched=true;
        ((GraphModel)elm).setInternalElement(((InternalGraphModel) internal));
      }
      if (!_matched) {
        if (elm instanceof ModelElement) {
          _matched=true;
          ((ModelElement)elm).setInternalElement(((InternalModelElement) internal));
        }
      }
      if (!_matched) {
        if (elm instanceof Type) {
          _matched=true;
          ((Type)elm).setInternalElement(((InternalType) internal));
        }
      }
    };
    return ObjectExtensions.<T>operator_doubleArrow(elm, _function);
  }
  
  /**
   * This method creates a new AIProject object with an underlying org.eclipse.emf.ecore.resource.Resource. Thus you can
   * simply call the AIProject's save method to save your changes.
   */
  public AIProject createAIProject(final String path, final String fileName) {
    IPath filePath = new Path(path).append(fileName).addFileExtension("aiproject");
    URI uri = URI.createPlatformResourceURI(filePath.toOSString(), true);
    Resource res = new ResourceSetImpl().createResource(uri);
    AIProject graph = AIProjectFactory.eINSTANCE.createAIProject();
    EcoreUtil.setID(graph, EcoreUtil.generateUUID());
    res.getContents().add(graph.getInternalElement());
    try {
      res.save(null);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return graph;
  }
}
