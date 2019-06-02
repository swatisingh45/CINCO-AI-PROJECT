package info.scce.cinco.product.aiProject.editor.graphiti

import org.eclipse.emf.ecore.resource.Resource.Factory

class AIProjectAPIParser implements org.eclipse.emf.ecore.resource.Resource$Factory {
	new() {
	}

	override org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new AIProjectApiResouce(uri)
	} 
}

class AIProjectApiResouce extends org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl {
	
	new() {
		super()
	}

	new(org.eclipse.emf.common.util.URI uri) {
		super(uri)
	}


	override protected getEObjectByID(java.lang.String id) {
		val obj = super.getEObjectByID(id)
		switch (obj) {
			graphmodel.IdentifiableElement: obj.createAndUpdateGraphitiApiElement
		}
		obj
	}
	
	def createAndUpdateGraphitiApiElement(graphmodel.IdentifiableElement it) {
		val pe = getLinkedPictogramElement
		val ie = internalElement
		switch (ie) {
			info.scce.cinco.product.aiProject.aiproject.internal.InternalAIProject : {
				var cElement =	if (it instanceof info.scce.cinco.product.aiProject.editor.graphiti.api.CAIProject)
									it as info.scce.cinco.product.aiProject.editor.graphiti.api.CAIProject
								else new info.scce.cinco.product.aiProject.editor.graphiti.api.CAIProject
				cElement.pictogramElement = pe as org.eclipse.graphiti.mm.pictograms.Diagram
				ie.element = cElement
				if (!ie.eAdapters.exists[it instanceof info.scce.cinco.product.aiProject.adapter.AIProjectEContentAdapter])
					ie.eAdapters.add(new info.scce.cinco.product.aiProject.adapter.AIProjectEContentAdapter)
			}
		}
		it
	}
	
	def getLinkedPictogramElement(graphmodel.IdentifiableElement it) {
		val conts = getContents
		val d = conts.get(0) as org.eclipse.graphiti.mm.pictograms.Diagram;
		if (it instanceof graphmodel.internal.InternalGraphModel)
			return d;
		d.fetchLinkedElement(it)
	}
	
	def fetchLinkedElement(org.eclipse.graphiti.mm.pictograms.Diagram d, graphmodel.IdentifiableElement me) {
		var pe = d.pictogramLinks?.filter[businessObjects.contains(me)].head?.pictogramElement
		if (pe === null) 
			pe = d.getPes.filter[link?.businessObjects?.contains(me)].head
		if (pe === null)
			pe = d.connections.filter[link?.businessObjects?.contains(me)].head
		pe
	}
	
	private def Iterable<org.eclipse.graphiti.mm.pictograms.Shape> getPes(org.eclipse.graphiti.mm.pictograms.ContainerShape cs) {
		return cs.children + cs.children.filter(org.eclipse.graphiti.mm.pictograms.ContainerShape).map[getPes].flatten
	}
}
