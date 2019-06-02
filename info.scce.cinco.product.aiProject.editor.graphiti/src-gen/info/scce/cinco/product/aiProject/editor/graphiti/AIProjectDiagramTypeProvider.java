package info.scce.cinco.product.aiProject.editor.graphiti;
	
public class AIProjectDiagramTypeProvider extends org.eclipse.graphiti.dt.AbstractDiagramTypeProvider{
	
	private org.eclipse.graphiti.tb.IToolBehaviorProvider[] tbProviders;
	
	public AIProjectDiagramTypeProvider() {
		super();
		setFeatureProvider(new AIProjectFeatureProvider(this));
		AIProjectGraphitiUtils.getInstance().loadImages();
		AIProjectGraphitiUtils.getInstance().setDTP(this);
		info.scce.cinco.product.aiProject.editor.graphiti.property.view.AIProjectPropertyView.initEStructuralFeatureInformation();
	}

	@Override
	public org.eclipse.graphiti.tb.IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
		if (tbProviders == null) {
			tbProviders = 
				new org.eclipse.graphiti.tb.IToolBehaviorProvider[] {new AIProjectToolBehaviorProvider(this)};
		}
		return tbProviders;
	}
	

}
