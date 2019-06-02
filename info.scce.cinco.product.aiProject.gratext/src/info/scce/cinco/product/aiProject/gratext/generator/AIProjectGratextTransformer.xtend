package info.scce.cinco.product.aiProject.gratext.generator

import graphmodel.internal.InternalModelElementContainer
import de.jabc.cinco.meta.plugin.gratext.runtime.resource.Transformer
import info.scce.cinco.product.aiProject.aiproject.AiprojectPackage
import info.scce.cinco.product.aiProject.gratext._Placed
import org.eclipse.emf.ecore.EPackage

class AIProjectGratextTransformer extends Transformer {

	new() { super(
		EPackage.Registry.INSTANCE.getEFactory("http://cinco.scce.info/product/aiproject"),
		EPackage.Registry.INSTANCE.getEPackage("http://cinco.scce.info/product/aiproject/internal"),
		AiprojectPackage.eINSTANCE.getAIProject
	)}

	dispatch def getIndex(_Placed it) {
		if (index >= 0) index
		else (eContainer as InternalModelElementContainer).modelElements.indexOf(it)
	}
}
