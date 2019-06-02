package info.scce.cinco.product.aiProject.gratext

import graphmodel.internal.InternalGraphModel

import de.jabc.cinco.meta.core.utils.registry.NonEmptyIdentityRegistry
import de.jabc.cinco.meta.plugin.gratext.runtime.resource.GratextResource

import info.scce.cinco.product.aiProject.gratext.generator.AIProjectGratextTransformer

class AIProjectGratextResource extends GratextResource {
	
	public static val transformers = new NonEmptyIdentityRegistry<InternalGraphModel,AIProjectGratextTransformer> [
		new AIProjectGratextTransformer
	]
	
	val lastTransformers = new NonEmptyIdentityRegistry<InternalGraphModel,AIProjectGratextTransformer> [
		new AIProjectGratextTransformer
	]

	override getTransformer(InternalGraphModel model) {
		transformers.get(model)
	}

	override getLastTransformer(InternalGraphModel model) {
		lastTransformers.get(model)
	}

	override removeTransformer(InternalGraphModel model) {
		lastTransformers.put(model, transformers.remove(model))
	}

	override isSortGratext() {
		false
	}
}
