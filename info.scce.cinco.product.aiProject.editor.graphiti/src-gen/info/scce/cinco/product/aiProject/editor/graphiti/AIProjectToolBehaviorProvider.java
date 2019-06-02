package info.scce.cinco.product.aiProject.editor.graphiti;

public class AIProjectToolBehaviorProvider extends org.eclipse.graphiti.tb.DefaultToolBehaviorProvider {

	public AIProjectToolBehaviorProvider(org.eclipse.graphiti.dt.IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
	}

	@Override
	public org.eclipse.graphiti.tb.IContextButtonPadData getContextButtonPad(
			org.eclipse.graphiti.features.context.IPictogramElementContext context) {
		
		org.eclipse.graphiti.tb.IContextButtonPadData data = super.getContextButtonPad(context);
		org.eclipse.graphiti.mm.pictograms.PictogramElement pe = context.getPictogramElement();
		

		setGenericContextButtons(data, pe, CONTEXT_BUTTON_DELETE | CONTEXT_BUTTON_UPDATE);
		
		org.eclipse.graphiti.features.context.impl.CreateConnectionContext ccc = new org.eclipse.graphiti.features.context.impl.CreateConnectionContext();
		ccc.setSourcePictogramElement(pe);
		org.eclipse.graphiti.mm.pictograms.Anchor anchor = null;
		if (pe instanceof org.eclipse.graphiti.mm.pictograms.Anchor) {
			anchor = (org.eclipse.graphiti.mm.pictograms.Anchor) pe;
		} else if (pe instanceof org.eclipse.graphiti.mm.pictograms.AnchorContainer) {
			anchor = org.eclipse.graphiti.services.Graphiti.getPeService().getChopboxAnchor((org.eclipse.graphiti.mm.pictograms.AnchorContainer) pe);
		}
		ccc.setSourceAnchor(anchor);
		
		org.eclipse.graphiti.tb.ContextButtonEntry contextButtonEntry = new org.eclipse.graphiti.tb.ContextButtonEntry(null, context);
		contextButtonEntry.setText("Create connection");
		contextButtonEntry.setIconId("_Connection.gif");
		
		org.eclipse.graphiti.features.ICreateConnectionFeature[] ccf = getFeatureProvider().getCreateConnectionFeatures();
		for (org.eclipse.graphiti.features.ICreateConnectionFeature f : ccf) {
			if (f.isAvailable(ccc) && f.canStartConnection(ccc)) {
				contextButtonEntry.addDragAndDropFeature(f);
			}
		}
		
		if (contextButtonEntry.getDragAndDropFeatures().size() > 0) {
			data.getDomainSpecificContextButtons().add(contextButtonEntry);
		}
		
		return data;
	}

	@Override
	public org.eclipse.graphiti.palette.IPaletteCompartmentEntry[] getPalette() {
		java.util.List<org.eclipse.graphiti.palette.IPaletteCompartmentEntry> palette = new java.util.ArrayList<>();
		org.eclipse.graphiti.palette.IPaletteCompartmentEntry[] p = super.getPalette();
		/**for (org.eclipse.graphiti.palette.IPaletteCompartmentEntry compartment : p) {
			if (!compartment.getLabel().equals("Connections")) {
				palette.add(compartment);
			}
		}**/	

		org.eclipse.graphiti.features.ICreateFeature cf = null;
		org.eclipse.graphiti.features.ICreateConnectionFeature ccf = null;
		org.eclipse.graphiti.palette.impl.ObjectCreationToolEntry objectCreationToolEntry = null;
		org.eclipse.graphiti.palette.impl.ConnectionCreationToolEntry connectionCreationToolEntry = null;
		org.eclipse.graphiti.palette.impl.PaletteCompartmentEntry compartmentEntry = null;
		
	
		return palette.toArray(new org.eclipse.graphiti.palette.IPaletteCompartmentEntry[palette.size()]);
	}

	@Override
	public org.eclipse.graphiti.tb.IDecorator[] getDecorators(org.eclipse.graphiti.mm.pictograms.PictogramElement pe) {
		return de.jabc.cinco.meta.core.ge.style.generator.runtime.highlight.DecoratorRegistry.complementDecorators(pe, super.getDecorators(pe));
	}

	@Override
	public boolean equalsBusinessObjects(java.lang.Object o1, java.lang.Object o2) {
		if (o1 != null)
			return o1.equals(o2);
		else return o2 == null;
	}
	
	@Override
	public org.eclipse.graphiti.features.custom.ICustomFeature getDoubleClickFeature(org.eclipse.graphiti.features.context.IDoubleClickContext context) {
		org.eclipse.graphiti.mm.pictograms.PictogramElement[] pes = context.getPictogramElements();
		if (! (pes != null && pes.length == 1 && pes[0].getLink() != null) ) {
			return super.getDoubleClickFeature(context);
		}
		java.lang.Object bo = pes[0].getLink().getBusinessObjects().get(0);
		if (bo instanceof graphmodel.internal.InternalIdentifiableElement) {
			bo = ((graphmodel.internal.InternalIdentifiableElement)bo).getElement();
		}
		
		return super.getDoubleClickFeature(context);
	}

	@Override
	public org.eclipse.graphiti.mm.pictograms.PictogramElement getSelection(org.eclipse.graphiti.mm.pictograms.PictogramElement originalPe, org.eclipse.graphiti.mm.pictograms.PictogramElement[] oldSelection) {
		org.eclipse.emf.ecore.EObject bo = org.eclipse.graphiti.services.Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(originalPe);
		return super.getSelection(originalPe, oldSelection);
	}
	
	
	
	@Override
	public void postExecute(org.eclipse.graphiti.IExecutionInfo executionInfo) {
		org.eclipse.graphiti.features.IFeature f = executionInfo.getExecutionList()[0].getFeature();
		org.eclipse.graphiti.features.context.IContext c = executionInfo.getExecutionList()[0].getContext();
		/**
		 * This is a workaround to solve the delete problem:
		 * On one hand side, allowing the execute method for all features leads to the double undo behavior. The user has to push "Ctrl+Z" two time to undo a change.
		 * On the other hand side, omitting the execute method for the delete feature leads to the dangling business object problem: The graphical representation is
		 * deleted, but the business object stays in the graphmodel.
		 */
		if (!(f instanceof de.jabc.cinco.meta.core.ge.style.generator.runtime.features.CincoDeleteFeature))
			return;
		org.eclipse.emf.transaction.TransactionalEditingDomain _dom = getDiagramTypeProvider().getDiagramBehavior().getEditingDomain();
		_dom.getCommandStack().execute(new org.eclipse.emf.transaction.RecordingCommand(_dom) {
		
		
			@Override
			protected void doExecute() {
			}
		});
	}
}
