/*
 * generated by Xtext 2.14.0
 */
package info.scce.cinco.product.aiProject.gratext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AIProjectGratextValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://cinco.scce.info/product/aiproject/gratext"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.jabc.de/cinco/gdl/graphmodel/internal"));
		return result;
	}
}