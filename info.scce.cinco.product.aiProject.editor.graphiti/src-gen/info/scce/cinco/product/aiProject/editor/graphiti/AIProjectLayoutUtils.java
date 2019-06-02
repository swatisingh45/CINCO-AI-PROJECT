package info.scce.cinco.product.aiProject.editor.graphiti;

public class AIProjectLayoutUtils {
	
	private static org.eclipse.graphiti.services.IGaService gaService = org.eclipse.graphiti.services.Graphiti.getGaService();
	
	
	/**
	 * Defines the Style of the Appearance default
	 * @param ga : GraphicsAlgorithm
	 * @param diagram : Diagram
	 */	
	public static void setdefaultStyle(org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm ga, org.eclipse.graphiti.mm.pictograms.Diagram diagram){
		if (ga instanceof org.eclipse.graphiti.mm.algorithms.AbstractText) {
			((org.eclipse.graphiti.mm.algorithms.AbstractText) ga).setRotation(0.0);
			((org.eclipse.graphiti.mm.algorithms.AbstractText) ga).setFont(gaService.manageFont(diagram, "Arial", 8, false, false));
		};		
		ga.setBackground(gaService.manageColor(diagram, 229, 229, 229));
		ga.setForeground(gaService.manageColor(diagram, 0, 0, 0)); 
		ga.setLineStyle(org.eclipse.graphiti.mm.algorithms.styles.LineStyle.SOLID); 
		ga.setLineWidth(2);
		ga.setTransparency(0.0); 
		ga.setLineVisible(true); 
	}
	
	/**
	 * Defines the InlineStyle
	 * @param ga : GraphicsAlgorithm
	 * @param diagram : Diagram
	 */
	public static void set1InlineStyle(org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm ga, org.eclipse.graphiti.mm.pictograms.Diagram diagram){
		if (ga instanceof org.eclipse.graphiti.mm.algorithms.AbstractText) {
			((org.eclipse.graphiti.mm.algorithms.AbstractText) ga).setRotation(0.0);
			((org.eclipse.graphiti.mm.algorithms.AbstractText) ga).setFont(gaService.manageFont(diagram, "Arial", 8, false, false));
		};		
		ga.setBackground(gaService.manageColor(diagram, 255, 255, 255));
		ga.setForeground(gaService.manageColor(diagram, 81, 156, 88));
		ga.setLineStyle(org.eclipse.graphiti.mm.algorithms.styles.LineStyle.SOLID); 
		ga.setLineWidth(1); 
		ga.setTransparency(0.0); 
		ga.setLineVisible(true); 
		 }
		 
	/**
	 * Defines the InlineStyle
	 * @param ga : GraphicsAlgorithm
	 * @param diagram : Diagram
	 */
	public static void set2InlineStyle(org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm ga, org.eclipse.graphiti.mm.pictograms.Diagram diagram){
		if (ga instanceof org.eclipse.graphiti.mm.algorithms.AbstractText) {
			((org.eclipse.graphiti.mm.algorithms.AbstractText) ga).setRotation(0.0);
			((org.eclipse.graphiti.mm.algorithms.AbstractText) ga).setFont(gaService.manageFont(diagram, "Arial", 8, false, false));
		};		
		ga.setBackground(gaService.manageColor(diagram, 255, 255, 255));
		ga.setForeground(gaService.manageColor(diagram, 164, 29, 29));
		ga.setLineStyle(org.eclipse.graphiti.mm.algorithms.styles.LineStyle.SOLID); 
		ga.setLineWidth(1); 
		ga.setTransparency(0.0); 
		ga.setLineVisible(true); 
		 }
		 
	
	/**
	 * Defines the default appearance
	 * @param gaContainer : GraphicsAlgorithm
	 * @param diagram : Diagram
	 */
	public static void set_AIProjectDefaultAppearanceStyle(org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm ga, org.eclipse.graphiti.mm.pictograms.Diagram diagram){
		if( ga instanceof org.eclipse.graphiti.mm.algorithms.AbstractText){
			((org.eclipse.graphiti.mm.algorithms.AbstractText) ga).setRotation(0.0);
			((org.eclipse.graphiti.mm.algorithms.AbstractText) ga).setFont(gaService.manageFont(diagram, "Arial", 8, false, false));
			
			};			
		ga.setBackground(gaService.manageColor(diagram, 255, 255, 255));
		ga.setForeground(gaService.manageColor(diagram, 0, 0, 0));
		ga.setTransparency(0.0);
		ga.setLineStyle(org.eclipse.graphiti.mm.algorithms.styles.LineStyle.SOLID);
		ga.setLineWidth(1);
		ga.setLineVisible(!false);
		
		}
		
		public static void updateStyleFromAppearance(style.Appearance appearance,org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm ga, org.eclipse.graphiti.mm.pictograms.Diagram diagram) {
				if (appearance != null) {
					if (appearance.getImagePath() != null && ga instanceof org.eclipse.graphiti.mm.algorithms.Image) {
						String imageId = info.scce.cinco.product.aiProject.editor.graphiti.AIProjectGraphitiUtils.getInstance().getImageId(appearance.getImagePath());
						((org.eclipse.graphiti.mm.algorithms.Image) ga).setId(imageId);
					}			
		
					if (appearance.getAngle() != -1 && ga instanceof org.eclipse.graphiti.mm.algorithms.AbstractText) {
						((org.eclipse.graphiti.mm.algorithms.AbstractText) ga).setRotation((double) appearance.getAngle());
					}
					
					if (appearance.getBackground() != null) {
						ga.setBackground(gaService.manageColor(diagram, appearance.getBackground().getR(),
							appearance.getBackground().getG(), 
							appearance.getBackground().getB()));
					}
					
					if (appearance.getForeground() != null) {
						ga.setForeground(gaService.manageColor(diagram, appearance.getForeground().getR(),
							appearance.getForeground().getG(), 
							appearance.getForeground().getB()));
					}
					
					if (appearance.getFont() != null && ga instanceof org.eclipse.graphiti.mm.algorithms.AbstractText) {
						((org.eclipse.graphiti.mm.algorithms.AbstractText) ga).setFont(gaService.manageFont(diagram, 
							appearance.getFont().getFontName(), 
							appearance.getFont().getSize(),
							appearance.getFont().isIsItalic(), 
							appearance.getFont().isIsBold()));
					}
					
					if (appearance.getTransparency() != -1) {
						ga.setTransparency(appearance.getTransparency());
					}
					
					if (!appearance.getLineStyle().equals(style.LineStyle.UNSPECIFIED))
						ga.setLineStyle(org.eclipse.graphiti.mm.algorithms.styles.LineStyle.getByName(appearance.getLineStyle().getName()));
					
					if (appearance.getLineWidth() != -1)
						ga.setLineWidth(appearance.getLineWidth());
					
					ga.setLineVisible(!appearance.getLineInVisible());
					
				}
			}
}

