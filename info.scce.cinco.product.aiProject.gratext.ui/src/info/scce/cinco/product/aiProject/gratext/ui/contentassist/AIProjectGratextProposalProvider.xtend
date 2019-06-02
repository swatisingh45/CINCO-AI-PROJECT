package info.scce.cinco.product.aiProject.gratext.ui.contentassist

import org.eclipse.emf.ecore.EObject

class AIProjectGratextProposalProvider extends AbstractAIProjectGratextProposalProvider {
	
	override getDisplayString(EObject element, String qualifiedNameAsString, String shortName) {
		element.eClass.name + " " + (
			labelProvider.getText(element) ?: super.getDisplayString(element, qualifiedNameAsString, shortName)
		)
	}
	
}
