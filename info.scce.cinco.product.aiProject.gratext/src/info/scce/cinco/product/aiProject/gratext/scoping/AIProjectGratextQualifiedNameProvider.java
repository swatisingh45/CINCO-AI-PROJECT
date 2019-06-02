package info.scce.cinco.product.aiProject.gratext.scoping;

import graphmodel.ModelElement;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

public class AIProjectGratextQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	@Override
	protected QualifiedName qualifiedName(Object obj) {
		if (obj instanceof ModelElement) {
	        return QualifiedName.create(((ModelElement) obj).getId());
		}
		else return super.qualifiedName(obj);
	}
	
}
