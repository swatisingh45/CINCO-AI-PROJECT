package info.scce.cinco.product.aiProject.gratext.generator;

import de.jabc.cinco.meta.plugin.gratext.runtime.resource.Transformer;
import graphmodel.internal.InternalModelElementContainer;
import info.scce.cinco.product.aiProject.aiproject.AiprojectPackage;
import info.scce.cinco.product.aiProject.gratext._Placed;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

@SuppressWarnings("all")
public class AIProjectGratextTransformer extends Transformer {
  public AIProjectGratextTransformer() {
    super(
      EPackage.Registry.INSTANCE.getEFactory("http://cinco.scce.info/product/aiproject"), 
      EPackage.Registry.INSTANCE.getEPackage("http://cinco.scce.info/product/aiproject/internal"), 
      AiprojectPackage.eINSTANCE.getAIProject());
  }
  
  protected int _getIndex(final _Placed it) {
    int _xifexpression = (int) 0;
    int _index = it.getIndex();
    boolean _greaterEqualsThan = (_index >= 0);
    if (_greaterEqualsThan) {
      _xifexpression = it.getIndex();
    } else {
      EObject _eContainer = it.eContainer();
      _xifexpression = ((InternalModelElementContainer) _eContainer).getModelElements().indexOf(it);
    }
    return _xifexpression;
  }
  
  public int getIndex(final Object it) {
    if (it instanceof _Placed) {
      return _getIndex((_Placed)it);
    } else if (it != null) {
      return _getIndex(it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
