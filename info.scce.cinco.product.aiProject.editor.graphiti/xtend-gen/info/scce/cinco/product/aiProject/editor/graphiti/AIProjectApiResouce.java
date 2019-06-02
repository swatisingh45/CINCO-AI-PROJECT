package info.scce.cinco.product.aiProject.editor.graphiti;

import com.google.common.collect.Iterables;
import graphmodel.IdentifiableElement;
import graphmodel.internal.InternalGraphModel;
import graphmodel.internal.InternalIdentifiableElement;
import info.scce.cinco.product.aiProject.adapter.AIProjectEContentAdapter;
import info.scce.cinco.product.aiProject.aiproject.internal.InternalAIProject;
import info.scce.cinco.product.aiProject.editor.graphiti.api.CAIProject;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class AIProjectApiResouce extends XMIResourceImpl {
  public AIProjectApiResouce() {
    super();
  }
  
  public AIProjectApiResouce(final URI uri) {
    super(uri);
  }
  
  @Override
  protected EObject getEObjectByID(final String id) {
    EObject _xblockexpression = null;
    {
      final EObject obj = super.getEObjectByID(id);
      boolean _matched = false;
      if (obj instanceof IdentifiableElement) {
        _matched=true;
        this.createAndUpdateGraphitiApiElement(((IdentifiableElement)obj));
      }
      _xblockexpression = obj;
    }
    return _xblockexpression;
  }
  
  public IdentifiableElement createAndUpdateGraphitiApiElement(final IdentifiableElement it) {
    IdentifiableElement _xblockexpression = null;
    {
      final PictogramElement pe = this.getLinkedPictogramElement(it);
      final InternalIdentifiableElement ie = it.getInternalElement();
      boolean _matched = false;
      if (ie instanceof InternalAIProject) {
        _matched=true;
        CAIProject _xifexpression = null;
        if ((it instanceof CAIProject)) {
          _xifexpression = ((CAIProject) it);
        } else {
          _xifexpression = new CAIProject();
        }
        CAIProject cElement = _xifexpression;
        cElement.setPictogramElement(((Diagram) pe));
        ((InternalAIProject)ie).setElement(cElement);
        final Function1<Adapter, Boolean> _function = (Adapter it_1) -> {
          return Boolean.valueOf((it_1 instanceof AIProjectEContentAdapter));
        };
        boolean _exists = IterableExtensions.<Adapter>exists(((InternalAIProject)ie).eAdapters(), _function);
        boolean _not = (!_exists);
        if (_not) {
          EList<Adapter> _eAdapters = ((InternalAIProject)ie).eAdapters();
          AIProjectEContentAdapter _aIProjectEContentAdapter = new AIProjectEContentAdapter();
          _eAdapters.add(_aIProjectEContentAdapter);
        }
      }
      _xblockexpression = it;
    }
    return _xblockexpression;
  }
  
  public PictogramElement getLinkedPictogramElement(final IdentifiableElement it) {
    PictogramElement _xblockexpression = null;
    {
      final EList<EObject> conts = this.getContents();
      EObject _get = conts.get(0);
      final Diagram d = ((Diagram) _get);
      if ((it instanceof InternalGraphModel)) {
        return d;
      }
      _xblockexpression = this.fetchLinkedElement(d, it);
    }
    return _xblockexpression;
  }
  
  public PictogramElement fetchLinkedElement(final Diagram d, final IdentifiableElement me) {
    PictogramElement _xblockexpression = null;
    {
      EList<PictogramLink> _pictogramLinks = d.getPictogramLinks();
      Iterable<PictogramLink> _filter = null;
      if (_pictogramLinks!=null) {
        final Function1<PictogramLink, Boolean> _function = (PictogramLink it) -> {
          return Boolean.valueOf(it.getBusinessObjects().contains(me));
        };
        _filter=IterableExtensions.<PictogramLink>filter(_pictogramLinks, _function);
      }
      PictogramLink _head = IterableExtensions.<PictogramLink>head(_filter);
      PictogramElement _pictogramElement = null;
      if (_head!=null) {
        _pictogramElement=_head.getPictogramElement();
      }
      PictogramElement pe = _pictogramElement;
      if ((pe == null)) {
        final Function1<Shape, Boolean> _function_1 = (Shape it) -> {
          PictogramLink _link = it.getLink();
          EList<EObject> _businessObjects = null;
          if (_link!=null) {
            _businessObjects=_link.getBusinessObjects();
          }
          boolean _contains = false;
          if (_businessObjects!=null) {
            _contains=_businessObjects.contains(me);
          }
          return Boolean.valueOf(_contains);
        };
        pe = IterableExtensions.<Shape>head(IterableExtensions.<Shape>filter(this.getPes(d), _function_1));
      }
      if ((pe == null)) {
        final Function1<Connection, Boolean> _function_2 = (Connection it) -> {
          PictogramLink _link = it.getLink();
          EList<EObject> _businessObjects = null;
          if (_link!=null) {
            _businessObjects=_link.getBusinessObjects();
          }
          boolean _contains = false;
          if (_businessObjects!=null) {
            _contains=_businessObjects.contains(me);
          }
          return Boolean.valueOf(_contains);
        };
        pe = IterableExtensions.<Connection>head(IterableExtensions.<Connection>filter(d.getConnections(), _function_2));
      }
      _xblockexpression = pe;
    }
    return _xblockexpression;
  }
  
  private Iterable<Shape> getPes(final ContainerShape cs) {
    EList<Shape> _children = cs.getChildren();
    final Function1<ContainerShape, Iterable<Shape>> _function = (ContainerShape it) -> {
      return this.getPes(it);
    };
    Iterable<Shape> _flatten = Iterables.<Shape>concat(IterableExtensions.<ContainerShape, Iterable<Shape>>map(Iterables.<ContainerShape>filter(cs.getChildren(), ContainerShape.class), _function));
    return Iterables.<Shape>concat(_children, _flatten);
  }
}
