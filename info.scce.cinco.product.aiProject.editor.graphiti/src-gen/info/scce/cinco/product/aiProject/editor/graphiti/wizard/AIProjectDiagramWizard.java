package info.scce.cinco.product.aiProject.editor.graphiti.wizard;

public class AIProjectDiagramWizard extends org.eclipse.jface.wizard.Wizard implements org.eclipse.ui.INewWizard {

	private org.eclipse.jface.wizard.IWizardPage page;

	private org.eclipse.jface.viewers.IStructuredSelection ssel;
	
	public AIProjectDiagramWizard() {
	}

	@Override
	public void addPages() {
		page = new AIProjectDiagramWizardPage("newAIProject");
		addPage(page);
		
		super.addPages();
	}
	
	@Override
	public void init(org.eclipse.ui.IWorkbench workbench, org.eclipse.jface.viewers.IStructuredSelection selection) {
		ssel = selection;
	}

	@Override
	public boolean performFinish() {
		if (page instanceof AIProjectDiagramWizardPage) {
			AIProjectDiagramWizardPage p = (AIProjectDiagramWizardPage) page;
			final java.lang.String dir = p.getDirectory();
			final java.lang.String fileName = p.getFileName();
			org.eclipse.jface.operation.IRunnableWithProgress operation = new org.eclipse.jface.operation.IRunnableWithProgress() {
				
				@Override
				public void run(org.eclipse.core.runtime.IProgressMonitor monitor) throws java.lang.reflect.InvocationTargetException,
						java.lang.InterruptedException {
					createDiagram(dir, fileName);
				}
			};
			
			try {
				getContainer().run(false, false, operation);
			} catch (java.lang.reflect.InvocationTargetException | java.lang.InterruptedException e) {
				e.printStackTrace();
				return false;
			}/* catch (org.eclipse.ui.WorkbenchException e) {
				e.printStackTrace();
				return false;
			}*/
		}
		return true;
	}

	
	private void createDiagram(java.lang.String dir, java.lang.String fName) {
		org.eclipse.core.resources.IWorkspaceRoot root = org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot();
		org.eclipse.core.resources.IResource containerResource = root.getContainerForLocation(new org.eclipse.core.runtime.Path(dir));
		if (containerResource instanceof org.eclipse.core.resources.IContainer) {
			info.scce.cinco.product.aiProject.editor.graphiti.AIProjectFactory eFactory = 
				(info.scce.cinco.product.aiProject.editor.graphiti.AIProjectFactory) org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://cinco.scce.info/product/aiproject");
			info.scce.cinco.product.aiProject.editor.graphiti.api.CAIProject _aIProject = (info.scce.cinco.product.aiProject.editor.graphiti.api.CAIProject) eFactory.createAIProject(containerResource.getFullPath().toString(), fName);
				new de.jabc.cinco.meta.runtime.xapi.WorkbenchExtension().openEditor(_aIProject);
		}
		
	}
	
	public org.eclipse.jface.viewers.IStructuredSelection getSelection() {
		return this.ssel;
	}

	@Override
	public void createPageControls(org.eclipse.swt.widgets.Composite pageContainer) {
		super.createPageControls(pageContainer);
	}
	
	@Override
	public boolean canFinish() {
		return page.isPageComplete(); 
	}
		
}
