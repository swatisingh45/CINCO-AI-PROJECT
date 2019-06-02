package info.scce.cinco.product.aiProject.gratext.scoping

import graphmodel.internal.InternalIdentifiableElement
import info.scce.cinco.product.aiProject.gratext.*

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

import static extension org.eclipse.xtext.EcoreUtil2.getRootContainer
import static extension org.eclipse.xtext.scoping.Scopes.scopeFor

/**
 * This class contains custom scoping description.
 */
class AIProjectGratextScopeProvider extends AbstractDeclarativeScopeProvider {
	
	override getScope(EObject context, EReference reference) {
		getScope(context, reference.name) ?: super.getScope(context, reference)
	}
	
	dispatch def IScope getScope(EObject element, String refName) {
		null
	}
	
	
	
	def scopeForContents(EObject obj, Class<?>... types) {
		obj.rootContainer.contents
			.filter(anyTypeOf(types))
			.filter(InternalIdentifiableElement)
			.toScope
	}
	
	def getContents(EObject obj) {
		val Iterable<EObject> iterable = [obj.eAllContents]
		return iterable
	}
	
	def anyTypeOf(Class<?>... types) {
		[Object obj | types.stream.anyMatch[isInstance(obj)]]
	}
	
	def IScope toScope(Iterable<InternalIdentifiableElement> elements) {
		scopeFor(elements, [QualifiedName::create(id)], IScope.NULLSCOPE)
	}
}
