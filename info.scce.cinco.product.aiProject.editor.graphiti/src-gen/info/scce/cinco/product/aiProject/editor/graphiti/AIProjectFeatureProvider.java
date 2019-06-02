package info.scce.cinco.product.aiProject.editor.graphiti;

import info.scce.cinco.product.aiProject.editor.graphiti.features.create.*;
import info.scce.cinco.product.aiProject.editor.graphiti.features.add.*;

public class AIProjectFeatureProvider extends org.eclipse.graphiti.ui.features.DefaultFeatureProvider implements de.jabc.cinco.meta.core.ge.style.generator.runtime.provider.CincoFeatureProvider{
	
	public AIProjectFeatureProvider(org.eclipse.graphiti.dt.IDiagramTypeProvider dtp) {
		super(dtp);
	}
	
	@Override
	public org.eclipse.graphiti.features.IAddFeature[] getAllLibComponentAddFeatures() {
		return new org.eclipse.graphiti.features.IAddFeature[] {
		};
	}
	
	@Override
	public org.eclipse.graphiti.features.IAddFeature getAddFeature(org.eclipse.graphiti.features.context.IAddContext context) {
		java.lang.Object o =  context.getNewObject();
		if (o instanceof org.eclipse.core.resources.IFile) {
			o = getGraphModel((org.eclipse.core.resources.IFile) o);
			if (context instanceof org.eclipse.graphiti.features.context.impl.AddContext)
				((org.eclipse.graphiti.features.context.impl.AddContext) context).setNewObject(o);
		}
		if (o instanceof org.eclipse.emf.ecore.EObject) {
			org.eclipse.emf.ecore.EObject bo = (org.eclipse.emf.ecore.EObject) o;
			org.eclipse.emf.ecore.EObject element = bo;
			if (bo instanceof graphmodel.internal.InternalIdentifiableElement)
				element = ((graphmodel.internal.InternalIdentifiableElement) bo).getElement();
							 
			boolean sameResource = bo.eResource() != null ? bo.eResource().equals(getDiagramTypeProvider().getDiagram().eResource()) : true ;
			
			
		}

		return super.getAddFeature(context);
	}

	private java.lang.Object getGraphModel(org.eclipse.core.resources.IFile file) {
		org.eclipse.emf.common.util.URI fileUri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(file.getFullPath().toString(), true);
		org.eclipse.emf.ecore.resource.Resource res = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl().getResource(fileUri, true);
		if (res != null) {
			for (org.eclipse.emf.ecore.EObject o : res.getContents()) {
				if (o instanceof graphmodel.internal.InternalGraphModel) {
					return o;
				}
			}
		}
		return null;
	}

	@Override
	public org.eclipse.graphiti.features.ICreateFeature[] getCreateFeatures() {
		return new org.eclipse.graphiti.features.ICreateFeature[] {
		};
	}

	@Override
	public org.eclipse.graphiti.features.ICreateConnectionFeature[] getCreateConnectionFeatures() {
		return new org.eclipse.graphiti.features.ICreateConnectionFeature[] {

		};
	}

	@Override
	public org.eclipse.graphiti.features.IDeleteFeature getDeleteFeature(org.eclipse.graphiti.features.context.IDeleteContext context) {
		java.lang.Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		
		
		return super.getDeleteFeature(context);
	}
	
	@Override
	public org.eclipse.graphiti.features.ILayoutFeature getLayoutFeature(org.eclipse.graphiti.features.context.ILayoutContext context) {
		java.lang.Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		
		if (bo instanceof graphmodel.internal.InternalModelElement){
			
				if (bo instanceof graphmodel.internal.InternalNode)
					return new de.jabc.cinco.meta.core.ge.style.generator.runtime.features.CincoLayoutFeature(this);
			
		}

		return super.getLayoutFeature(context);
	}
	
	@Override
	public org.eclipse.graphiti.features.IResizeShapeFeature getResizeShapeFeature(org.eclipse.graphiti.features.context.IResizeShapeContext context) {
		java.lang.Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		
		if (bo instanceof graphmodel.internal.InternalModelElement){
		}

		return super.getResizeShapeFeature(context);
	}
	
	@Override
	public org.eclipse.graphiti.features.IMoveShapeFeature getMoveShapeFeature(org.eclipse.graphiti.features.context.IMoveShapeContext context) {
		java.lang.Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		
		if (bo instanceof graphmodel.internal.InternalModelElement){
		}

		return super.getMoveShapeFeature(context);
	}
	
		@Override
	public org.eclipse.graphiti.features.IUpdateFeature getUpdateFeature(org.eclipse.graphiti.features.context.IUpdateContext context) {
		java.lang.Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		

		return super.getUpdateFeature(context);
	}
	


	@Override
	public org.eclipse.graphiti.features.IReconnectionFeature getReconnectionFeature(org.eclipse.graphiti.features.context.IReconnectionContext context) {
		java.lang.Object bo = getBusinessObjectForPictogramElement(context.getConnection());
			
			
		return super.getReconnectionFeature(context);
	}


	@Override
	public org.eclipse.graphiti.features.custom.ICustomFeature[] getCustomFeatures(org.eclipse.graphiti.features.context.ICustomContext context) {
		java.lang.Object bo = getBusinessObjectForPictogramElement(context.getPictogramElements()[0]);
		
		if (bo instanceof graphmodel.internal.InternalGraphModel) {
			graphmodel.internal.InternalGraphModel ime = (graphmodel.internal.InternalGraphModel) bo;
			if (ime instanceof info.scce.cinco.product.aiProject.aiproject.internal.InternalAIProject) {
				return new org.eclipse.graphiti.features.custom.ICustomFeature[] {
				};
			}
		}
		
		
		return new org.eclipse.graphiti.features.custom.ICustomFeature[] {};
	}
	
	@Override
	public org.eclipse.graphiti.features.IMoveBendpointFeature getMoveBendpointFeature(org.eclipse.graphiti.features.context.IMoveBendpointContext context) {
		return new de.jabc.cinco.meta.core.ge.style.generator.runtime.features.CincoMoveBendpointFeature(this);
	}
	
	@Override
	public org.eclipse.graphiti.features.IAddBendpointFeature getAddBendpointFeature(org.eclipse.graphiti.features.context.IAddBendpointContext context) {
		return new de.jabc.cinco.meta.core.ge.style.generator.runtime.features.CincoAddBendpointFeature(this);
	}
	
	@Override
	public org.eclipse.graphiti.features.IRemoveBendpointFeature getRemoveBendpointFeature(org.eclipse.graphiti.features.context.IRemoveBendpointContext context) {
		return new de.jabc.cinco.meta.core.ge.style.generator.runtime.features.CincoRemoveBendpointFeature(this);
	}
	
	@Override
	public org.eclipse.graphiti.features.IRemoveFeature getRemoveFeature(org.eclipse.graphiti.features.context.IRemoveContext context) {
		return new de.jabc.cinco.meta.core.ge.style.generator.runtime.features.CincoRemoveFeature(this);
	}
	
	@Override
	public org.eclipse.graphiti.features.IMoveConnectionDecoratorFeature getMoveConnectionDecoratorFeature(org.eclipse.graphiti.features.context.IMoveConnectionDecoratorContext context) {
		return new de.jabc.cinco.meta.core.ge.style.generator.runtime.features.CincoMoveConnectionDecoratorFeature(this);
	}
	
	@Override
	public org.eclipse.graphiti.features.ICopyFeature getCopyFeature(org.eclipse.graphiti.features.context.ICopyContext context) {
		return new de.jabc.cinco.meta.core.ge.style.generator.runtime.features.CincoCopyFeature(this);
	}
		
	@Override
	public org.eclipse.graphiti.features.IPasteFeature getPasteFeature(org.eclipse.graphiti.features.context.IPasteContext context) {
		return new de.jabc.cinco.meta.core.ge.style.generator.runtime.features.CincoPasteFeature(this);
	}
	
	
	@Override
	public java.lang.Object getBusinessObjectForPictogramElement(org.eclipse.graphiti.mm.pictograms.PictogramElement pictogramElement) {
		java.lang.Object bo = super.getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof graphmodel.IdentifiableElement) {
			bo = ((graphmodel.IdentifiableElement)bo).getInternalElement();
		}
		return bo;
	}
}
