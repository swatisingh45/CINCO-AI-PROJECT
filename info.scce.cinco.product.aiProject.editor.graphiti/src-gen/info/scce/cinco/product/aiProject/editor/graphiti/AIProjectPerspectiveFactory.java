package info.scce.cinco.product.aiProject.editor.graphiti;

public class AIProjectPerspectiveFactory implements org.eclipse.ui.IPerspectiveFactory {

	public static final java.lang.String ID_PERSPECTIVE = "info.scce.cinco.product.aiProject.aiprojectperspective";

	@Override
	public void createInitialLayout(org.eclipse.ui.IPageLayout layout) {
		layout.addView(org.eclipse.ui.IPageLayout.ID_PROJECT_EXPLORER, org.eclipse.ui.IPageLayout.LEFT, 0.25f, org.eclipse.ui.IPageLayout.ID_EDITOR_AREA); 
		layout.addView(org.eclipse.graphiti.ui.internal.editor.ThumbNailView.VIEW_ID, org.eclipse.ui.IPageLayout.BOTTOM, 0.55f, org.eclipse.ui.IPageLayout.ID_PROJECT_EXPLORER);
		
		org.eclipse.ui.IFolderLayout folderLayout = layout.createFolder("info.scce.cinco.product.aiProject.aiproject.property", org.eclipse.ui.IPageLayout.BOTTOM, 0.75f, org.eclipse.ui.IPageLayout.ID_EDITOR_AREA);
		
		/** This command adds the common property view **/
		/*folderLayout.addView(org.eclipse.ui.IPageLayout.ID_PROP_SHEET);*/
		folderLayout.addView("de.jabc.cinco.meta.core.ui.propertyview");
		folderLayout.addView(org.eclipse.ui.IPageLayout.ID_PROBLEM_VIEW);
	}

}

