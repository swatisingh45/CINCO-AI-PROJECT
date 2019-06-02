package info.scce.cinco.product.aiProject.editor.graphiti.api;

public class CAIProject extends info.scce.cinco.product.aiProject.aiproject.impl.AIProjectImpl  implements de.jabc.cinco.meta.core.ge.style.generator.runtime.api.CGraphModel
	{
	
	private org.eclipse.graphiti.mm.pictograms.PictogramElement pe;
	private org.eclipse.graphiti.features.IFeatureProvider fp;
	
	public CAIProject() {
		setId(org.eclipse.emf.ecore.util.EcoreUtil.generateUUID());
	}
	
	public org.eclipse.graphiti.mm.pictograms.Diagram getPictogramElement() {
		if (pe == null && eResource() != null) {
			org.eclipse.emf.ecore.EObject bo = this.eResource().getContents().get(0);
			if (bo instanceof org.eclipse.graphiti.mm.pictograms.Diagram)
				pe = (org.eclipse.graphiti.mm.pictograms.Diagram) bo;
		}
		return (org.eclipse.graphiti.mm.pictograms.Diagram) this.pe;
	}
	
	public void setPictogramElement(org.eclipse.graphiti.mm.pictograms.PictogramElement pe) {
		this.pe = pe;
	}
	
	
	
	public info.scce.cinco.product.aiProject.aiproject.AIProject newAIProject(java.lang.String path, java.lang.String fileName, boolean postCreateHook) {
		info.scce.cinco.product.aiProject.aiproject.AIProject graph = super.newAIProject(path, fileName, postCreateHook);
		org.eclipse.graphiti.mm.pictograms.Diagram diagram = org.eclipse.graphiti.services.Graphiti.getPeCreateService().createDiagram("AIProject", fileName, true);
		
		org.eclipse.emf.ecore.resource.Resource res = graph.eResource();
		res.getContents().add(0,diagram);
		
		org.eclipse.graphiti.features.IFeatureProvider fp = org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(diagram);
		fp.link(diagram, graph);
		
		graph.save();
	
		return graph;
	}
	
	public void update() {
		org.eclipse.graphiti.features.IFeatureProvider fp = getFeatureProvider();
		org.eclipse.graphiti.mm.pictograms.Diagram diagram = getDiagram();
		if (fp != null && diagram != null) try {
			org.eclipse.graphiti.mm.pictograms.PictogramElement pe = getPictogramElement();
			if (pe != null) {
				org.eclipse.graphiti.features.context.impl.UpdateContext uc = new org.eclipse.graphiti.features.context.impl.UpdateContext(getPictogramElement());
				org.eclipse.graphiti.features.IUpdateFeature uf = fp.getUpdateFeature(uc);
				if (fp instanceof de.jabc.cinco.meta.core.ge.style.generator.runtime.provider.CincoFeatureProvider) {
					((de.jabc.cinco.meta.core.ge.style.generator.runtime.provider.CincoFeatureProvider) fp).executeFeature(uf, uc);
				}
			}
		} catch (java.lang.NullPointerException e) {
			e.printStackTrace();
			return;
		}
	}
	
	@Override
	public void delete() {
		throw new java.lang.UnsupportedOperationException("Deleting a Graphmodel by api is not supported at the moment.");
	}
	
	@SuppressWarnings("restriction")
	public org.eclipse.graphiti.features.IFeatureProvider getFeatureProvider() {
		if (this.fp != null) try {
			org.eclipse.graphiti.mm.pictograms.Diagram diagram = getDiagram();
			if (diagram != null) {
				org.eclipse.graphiti.dt.IDiagramTypeProvider dtp = fp.getDiagramTypeProvider();
				if (dtp.getDiagram() == null) {
					org.eclipse.emf.transaction.TransactionalEditingDomain editingDomain = org.eclipse.emf.transaction.util.TransactionUtil.getEditingDomain(diagram);
					org.eclipse.graphiti.ui.internal.editor.DiagramEditorDummy diagramEditor = new org.eclipse.graphiti.ui.internal.editor.DiagramEditorDummy(dtp, editingDomain);
					dtp.init(diagram, diagramEditor.getDiagramBehavior());
				}
			}
			return this.fp;
		} catch(NullPointerException e) {
			e.printStackTrace();
		} finally {
			return this.fp;
		}
		org.eclipse.graphiti.mm.pictograms.Diagram diagram = null;
		try {
			diagram = getDiagram();
		} catch(NullPointerException ignore) {}
		if (diagram != null) {
			this.fp = org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createFeatureProvider(diagram);
		} else {
			org.eclipse.graphiti.dt.IDiagramTypeProvider dtp = org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createDiagramTypeProvider("info.scce.cinco.product.aiProject.editor.graphiti.AIProjectDiagramTypeProvider");
			this.fp = dtp.getFeatureProvider();
		}
		return fp;
	}
	
	public void setFeatureProvider(org.eclipse.graphiti.features.IFeatureProvider provider) {
		this.fp = provider;
	}
	
	@Override
	public org.eclipse.graphiti.mm.pictograms.Diagram getDiagram() {
		org.eclipse.graphiti.mm.pictograms.PictogramElement curr = getPictogramElement();
		while (curr != null && curr.eContainer() != null)
			curr = (org.eclipse.graphiti.mm.pictograms.PictogramElement) curr.eContainer();
		if (curr instanceof org.eclipse.graphiti.mm.pictograms.Connection) {
			return ((org.eclipse.graphiti.mm.pictograms.Connection) curr).getParent();
		}
		return (org.eclipse.graphiti.mm.pictograms.Diagram) curr;
	}
	
	public org.eclipse.graphiti.mm.pictograms.PictogramElement fetchPictogramElement(graphmodel.ModelElement me) {
		
		java.util.List<org.eclipse.graphiti.mm.pictograms.PictogramElement> pes = org.eclipse.graphiti.services.Graphiti.getLinkService().getPictogramElements(getDiagram(), me);
		if (pes != null && pes.size() > 0 )
			return pes.get(0);
		return null;
	}
	
}
