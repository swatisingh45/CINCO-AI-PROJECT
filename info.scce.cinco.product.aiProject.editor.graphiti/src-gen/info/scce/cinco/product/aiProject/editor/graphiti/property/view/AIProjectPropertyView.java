package info.scce.cinco.product.aiProject.editor.graphiti.property.view;

import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory.Builder;

public class AIProjectPropertyView implements org.eclipse.ui.ISelectionListener, de.jabc.cinco.meta.core.ui.properties.IValuesProposalProvider {

	private org.eclipse.graphiti.mm.pictograms.PictogramElement lastSelected;
	private static org.eclipse.ui.ISelectionListener listener;

	public static void initEStructuralFeatureInformation(){

		if (listener == null) {
			listener = new AIProjectPropertyView();
			de.jabc.cinco.meta.core.ui.properties.CincoPropertyView.addSelectionListener(listener);
		}

		de.jabc.cinco.meta.core.ui.properties.CincoPropertyView.init_EStructuralFeatures(info.scce.cinco.product.aiProject.aiproject.internal.impl.InternalAIProjectImpl.class, 
			new org.eclipse.emf.ecore.EStructuralFeature[] {
			}
		);
		
		


		de.jabc.cinco.meta.core.ui.properties.CincoPropertyView.init_MultiLineAttributes(new org.eclipse.emf.ecore.EStructuralFeature[] {
		});

		de.jabc.cinco.meta.core.ui.properties.CincoPropertyView.init_ReadOnlyAttributes(new org.eclipse.emf.ecore.EStructuralFeature[] {
		});
		
		de.jabc.cinco.meta.core.ui.properties.CincoPropertyView.init_FileAttributes(new org.eclipse.emf.ecore.EStructuralFeature[] {
		});

	
	

		
	
		
		


		
		
		
	}
	
	@Override
	public void selectionChanged(org.eclipse.ui.IWorkbenchPart part, org.eclipse.jface.viewers.ISelection selection) {
		de.jabc.cinco.meta.runtime.xapi.WorkbenchExtension wb = new de.jabc.cinco.meta.runtime.xapi.WorkbenchExtension();
		if (isStructuredSelection(selection)) {
			java.lang.Object element = ((org.eclipse.jface.viewers.IStructuredSelection) selection).getFirstElement();
			org.eclipse.graphiti.mm.pictograms.PictogramElement pe = null;
			if (element instanceof org.eclipse.gef.GraphicalEditPart)
				pe = getPictogramElement(element);
			
			org.eclipse.graphiti.platform.IDiagramBehavior diagramBehavior = null;
			org.eclipse.graphiti.ui.editor.DiagramEditor editor = wb.getActiveDiagramEditor();
			if (editor != null){
				diagramBehavior = editor.getDiagramBehavior();
			}
			if (diagramBehavior instanceof org.eclipse.graphiti.ui.editor.DiagramBehavior) {
				org.eclipse.graphiti.ui.editor.DiagramBehavior db = (org.eclipse.graphiti.ui.editor.DiagramBehavior) diagramBehavior;		
				org.eclipse.emf.ecore.EObject bo = getBusinessObject(pe);
			
				

				if (pe instanceof org.eclipse.graphiti.mm.pictograms.ConnectionDecorator && !pe.equals(lastSelected)) {
					org.eclipse.graphiti.mm.pictograms.Connection connection = ((org.eclipse.graphiti.mm.pictograms.ConnectionDecorator) pe).getConnection();
				
					lastSelected = pe;
					db.getDiagramContainer().selectPictogramElements(new org.eclipse.graphiti.mm.pictograms.PictogramElement[] {
						pe, connection
					});
				}
			}
			lastSelected = pe;
		}
		
	}


	private org.eclipse.emf.ecore.EObject getBusinessObject(org.eclipse.graphiti.mm.pictograms.PictogramElement pe) {
		return org.eclipse.graphiti.services.Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
	}

	private org.eclipse.graphiti.mm.pictograms.PictogramElement getPictogramElement(java.lang.Object element) {
		if (element instanceof org.eclipse.graphiti.ui.platform.GraphitiShapeEditPart) 
			return ((org.eclipse.graphiti.ui.platform.GraphitiShapeEditPart) element).getPictogramElement();
		
		if (element instanceof org.eclipse.graphiti.ui.platform.GraphitiConnectionEditPart)
			return ((org.eclipse.graphiti.ui.platform.GraphitiConnectionEditPart) element).getPictogramElement();
		
		return null;
	}

	private boolean isStructuredSelection(org.eclipse.jface.viewers.ISelection selection) {
		return selection instanceof org.eclipse.jface.viewers.IStructuredSelection;
	}
	
	@Override
	public void refreshValues(org.eclipse.emf.ecore.EObject bo) {
	}
	
}

