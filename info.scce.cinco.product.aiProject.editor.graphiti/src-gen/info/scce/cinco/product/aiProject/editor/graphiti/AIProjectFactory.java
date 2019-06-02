package info.scce.cinco.product.aiProject.editor.graphiti;

public class AIProjectFactory extends info.scce.cinco.product.aiProject.factory.AIProjectFactory {
	
	public static AIProjectFactory eINSTANCE = new AIProjectFactory();
	
	@Override
	public org.eclipse.emf.ecore.EObject create(org.eclipse.emf.ecore.EClass eClass) {
		if (eClass.getName().equals("AIProject"))
			return createAIProject();
		return super.create(eClass);
	}
	
	@Override
	public info.scce.cinco.product.aiProject.aiproject.AIProject createAIProject() {
		info.scce.cinco.product.aiProject.aiproject.internal.InternalAIProject ime = (info.scce.cinco.product.aiProject.aiproject.internal.InternalAIProject) super.createAIProject().getInternalElement();
		info.scce.cinco.product.aiProject.editor.graphiti.api.CAIProject me = new info.scce.cinco.product.aiProject.editor.graphiti.api.CAIProject();
		org.eclipse.emf.ecore.util.EcoreUtil.setID(ime, me.getId()+"_INTERNAL");
		ime.setElement(me);
		return me;
	}
	
	
	public info.scce.cinco.product.aiProject.aiproject.AIProject createAIProject(java.lang.String path, java.lang.String fileName) {
		org.eclipse.core.runtime.IPath filePath = new org.eclipse.core.runtime.Path(path).append(fileName).addFileExtension("AIProject");
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(filePath.toOSString() ,true);
		org.eclipse.emf.ecore.resource.Resource res = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl().createResource(uri);
		java.lang.String fNameWithExt = (fileName.contains(".")) ? fileName : fileName.concat(".AIProject");
		java.lang.String dName = fNameWithExt.split("\\.")[0];
		
		info.scce.cinco.product.aiProject.editor.graphiti.api.CAIProject model = (info.scce.cinco.product.aiProject.editor.graphiti.api.CAIProject) createAIProject();
		org.eclipse.graphiti.mm.pictograms.Diagram diagram = org.eclipse.graphiti.services.Graphiti.getPeService().createDiagram("AIProject", dName, true);
		
		res.getContents().add(diagram);
		res.getContents().add(model.getInternalElement());
		model.setPictogramElement(diagram);
		
		org.eclipse.graphiti.dt.IDiagramTypeProvider dtp = org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createDiagramTypeProvider(diagram, "info.scce.cinco.product.aiProject.editor.graphiti.AIProjectDiagramTypeProvider");
		model.setFeatureProvider(dtp.getFeatureProvider());
		dtp.getFeatureProvider().link(diagram, model.getInternalElement());
		
		
		try {
			res.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
		return model;
	}

	private org.eclipse.graphiti.mm.pictograms.PictogramElement addNode(graphmodel.internal.InternalModelElementContainer parent, graphmodel.internal.InternalNode node) {
		org.eclipse.graphiti.features.context.impl.AddContext ac = new org.eclipse.graphiti.features.context.impl.AddContext();
		ac.setNewObject(node);
		ac.setLocation(node.getX(), node.getY());
		ac.setSize(node.getWidth(), node.getHeight());
		ac.setTargetContainer(((de.jabc.cinco.meta.core.ge.style.generator.runtime.api.CModelElement) parent.getElement()).getPictogramElement());
		
		org.eclipse.graphiti.features.IFeatureProvider fp =
						(parent instanceof graphmodel.internal.InternalGraphModel) 
						? ((de.jabc.cinco.meta.core.ge.style.generator.runtime.api.CGraphModel) parent.getElement()).getFeatureProvider()
						: ((de.jabc.cinco.meta.core.ge.style.generator.runtime.api.CGraphModel) ((graphmodel.internal.InternalModelElement) parent).getRootElement().getElement()).getFeatureProvider();
		org.eclipse.graphiti.features.IAddFeature af = fp.getAddFeature(ac);
		if (fp instanceof de.jabc.cinco.meta.core.ge.style.generator.runtime.provider.CincoFeatureProvider) {
			if (af.canAdd(ac)) {
				return af.add(ac);
			}
		}
		return null;
	}

private org.eclipse.graphiti.mm.pictograms.PictogramElement addEdge(graphmodel.internal.InternalNode source, graphmodel.internal.InternalNode target, graphmodel.internal.InternalEdge edge) {
	org.eclipse.graphiti.mm.pictograms.PictogramElement sourcePE = ((de.jabc.cinco.meta.core.ge.style.generator.runtime.api.CNode) source.getElement()).getPictogramElement();
	org.eclipse.graphiti.mm.pictograms.PictogramElement targetPE = ((de.jabc.cinco.meta.core.ge.style.generator.runtime.api.CNode) target.getElement()).getPictogramElement();
	
	org.eclipse.graphiti.mm.pictograms.Anchor sAnchor = ((org.eclipse.graphiti.mm.pictograms.AnchorContainer) sourcePE).getAnchors().get(0);
	org.eclipse.graphiti.mm.pictograms.Anchor tAnchor = ((org.eclipse.graphiti.mm.pictograms.AnchorContainer) targetPE).getAnchors().get(0);
	
	org.eclipse.graphiti.features.context.impl.AddConnectionContext acc = new org.eclipse.graphiti.features.context.impl.AddConnectionContext(sAnchor, tAnchor);
	acc.setNewObject(edge);
	
	org.eclipse.graphiti.features.IFeatureProvider fp = ((de.jabc.cinco.meta.core.ge.style.generator.runtime.api.CGraphModel) source.getRootElement().getElement()).getFeatureProvider();
	org.eclipse.graphiti.features.IAddFeature af = fp.getAddFeature(acc);
	if (fp instanceof de.jabc.cinco.meta.core.ge.style.generator.runtime.provider.CincoFeatureProvider) {
		if (af.canAdd(acc)) {
			return af.add(acc);
		}
	}
	return null;
}

}
