package info.scce.cinco.product.aiProject.gratext.ui.contentassist;

import info.scce.cinco.product.aiProject.gratext.ui.contentassist.AbstractAIProjectGratextProposalProvider;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class AIProjectGratextProposalProvider extends AbstractAIProjectGratextProposalProvider {
  @Override
  public String getDisplayString(final EObject element, final String qualifiedNameAsString, final String shortName) {
    String _name = element.eClass().getName();
    String _plus = (_name + " ");
    String _elvis = null;
    String _text = this.getLabelProvider().getText(element);
    if (_text != null) {
      _elvis = _text;
    } else {
      String _displayString = super.getDisplayString(element, qualifiedNameAsString, shortName);
      _elvis = _displayString;
    }
    return (_plus + _elvis);
  }
}
