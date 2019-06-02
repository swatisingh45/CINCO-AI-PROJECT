package info.scce.cinco.product.aiProject.editor.graphiti;

public class AIProjectDiagramEditor extends de.jabc.cinco.meta.core.ge.style.generator.runtime.editor.CincoDiagramEditor {
	
	@Override
	public AIProjectDiagram createDiagram() {
		return new AIProjectDiagram();
	}
		
	@Override
	public void initializeGraphicalViewer() {
		super.initializeGraphicalViewer();
	
		org.eclipse.emf.ecore.EObject bo = getDiagramTypeProvider().getDiagram().getLink().getBusinessObjects().get(0);
		org.eclipse.emf.common.util.TreeIterator<org.eclipse.emf.ecore.EObject> eContents = bo.eAllContents();
		eContents.forEachRemaining(it ->
		{
		});
	
		de.jabc.cinco.meta.core.ge.style.generator.runtime.highlight.Highlighter.INSTANCE.get().listenToDiagramDrag(this, getGraphicalControl());
	}
	
	@Override
	public void onPaletteViewerCreated(org.eclipse.gef.ui.palette.PaletteViewer pViewer) {
		de.jabc.cinco.meta.core.ge.style.generator.runtime.highlight.Highlighter.INSTANCE.get().listenToPaletteDrag(pViewer);
	}
	
	@Override
	public void doSave(org.eclipse.core.runtime.IProgressMonitor monitor) {
		super.doSave(monitor);
	}

	@Override
	public void handleSaved() {
		super.handleSaved();
	}

	protected org.eclipse.graphiti.features.context.impl.ResizeShapeContext createContext(org.eclipse.graphiti.mm.pictograms.Shape child) {
		org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm ga = child.getGraphicsAlgorithm();
		org.eclipse.graphiti.features.context.impl.ResizeShapeContext context = new org.eclipse.graphiti.features.context.impl.ResizeShapeContext(child);
		context.setSize(ga.getWidth(), ga.getHeight());
		context.setLocation(ga.getX(), ga.getY());
		return context;
	}
}
