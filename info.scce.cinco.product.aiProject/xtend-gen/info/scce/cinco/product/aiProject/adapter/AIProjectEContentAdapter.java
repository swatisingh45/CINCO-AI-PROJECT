package info.scce.cinco.product.aiProject.adapter;

import com.google.common.base.Objects;
import de.jabc.cinco.meta.runtime.contentadapter.CincoEContentAdapter;
import info.scce.cinco.product.aiProject.aiproject.internal.InternalAIProject;
import info.scce.cinco.product.aiProject.aiproject.internal.InternalPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;

@SuppressWarnings("all")
public class AIProjectEContentAdapter extends EContentAdapter implements CincoEContentAdapter {
  @Override
  public void notifyChanged(final Notification notification) {
    super.notifyChanged(notification);
    final Object o = notification.getNotifier();
    final Object feature = notification.getFeature();
    if ((o instanceof InternalAIProject)) {
      EObject _eContainer = ((InternalAIProject)o).eContainer();
      boolean _equals = Objects.equal(_eContainer, null);
      if (_equals) {
        return;
      }
      boolean _matched = false;
      if (feature instanceof EStructuralFeature) {
        boolean _isRelevant = this.isRelevant(((EStructuralFeature)feature));
        if (_isRelevant) {
          _matched=true;
        }
      }
    }
  }
  
  private boolean isRelevant(final EStructuralFeature ftr) {
    boolean _and = false;
    boolean _eDeliver = ftr.eDeliver();
    if (!_eDeliver) {
      _and = false;
    } else {
      EList<EClassifier> _eClassifiers = InternalPackage.eINSTANCE.getEClassifiers();
      EObject _eContainer = null;
      if (ftr!=null) {
        _eContainer=ftr.eContainer();
      }
      boolean _contains = _eClassifiers.contains(_eContainer);
      _and = _contains;
    }
    return _and;
  }
}
