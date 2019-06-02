package info.scce.cinco.product.aiProject.editor.graphiti.wizard;

public class AIProjectDiagramWizardPage extends org.eclipse.jface.wizard.WizardPage {

	private org.eclipse.core.resources.IContainer container;

	private org.eclipse.swt.widgets.Text dirText;
	private org.eclipse.swt.widgets.Text fileNameText;
	
	private org.eclipse.swt.widgets.Button browseButton;

	protected AIProjectDiagramWizardPage(java.lang.String pageName) {
		super(pageName);
		setTitle("Create new AIProject diagram");
		setMessage("Create a new diagram in an existing or new project");
	}

	public java.lang.String getDirectory() {
		return dirText.getText();
	}
	
	public java.lang.String getFileName() {
		return fileNameText.getText();
	}

	@Override
	public void createControl(org.eclipse.swt.widgets.Composite parent) {
		org.eclipse.swt.widgets.Composite composite = new org.eclipse.swt.widgets.Composite(parent, org.eclipse.swt.SWT.NONE);
		org.eclipse.swt.layout.GridLayout layout = new org.eclipse.swt.layout.GridLayout(3, false);
		composite.setLayout(layout);
		
		org.eclipse.swt.widgets.Label projectLbl = new org.eclipse.swt.widgets.Label(composite, org.eclipse.swt.SWT.NONE);
		projectLbl.setLayoutData(new org.eclipse.swt.layout.GridData(org.eclipse.swt.SWT.LEFT, org.eclipse.swt.SWT.CENTER, false, false));
		projectLbl.setText("Di&rectory: ");

		dirText = new org.eclipse.swt.widgets.Text(composite, org.eclipse.swt.SWT.BORDER);
		dirText.setLayoutData(new org.eclipse.swt.layout.GridData(org.eclipse.swt.SWT.FILL, org.eclipse.swt.SWT.CENTER, true, false));
		dirText.setEditable(false);
		dirText.setEnabled(false);
				
		browseButton = new org.eclipse.swt.widgets.Button(composite, org.eclipse.swt.SWT.PUSH);
		browseButton.setText("Brows&e...");
		browseButton.setLayoutData(new org.eclipse.swt.layout.GridData(org.eclipse.swt.SWT.CENTER, org.eclipse.swt.SWT.CENTER, false, false));

		org.eclipse.swt.widgets.Label pNameLbl = new org.eclipse.swt.widgets.Label(composite, org.eclipse.swt.SWT.NONE);
		pNameLbl.setLayoutData(new org.eclipse.swt.layout.GridData(org.eclipse.swt.SWT.LEFT, org.eclipse.swt.SWT.CENTER, false, false));
		pNameLbl.setText("Fi&le name: ");
		
		fileNameText = new org.eclipse.swt.widgets.Text(composite, org.eclipse.swt.SWT.BORDER);
		fileNameText.setLayoutData(new org.eclipse.swt.layout.GridData(org.eclipse.swt.SWT.FILL, org.eclipse.swt.SWT.CENTER, true, false));
		fileNameText.setText("");
		
		dirText.addKeyListener(textKeyListener);
		fileNameText.addKeyListener(textKeyListener);
		browseButton.addSelectionListener(buttonListener);
		
		org.eclipse.jface.viewers.IStructuredSelection selection = null; 
		if (getWizard() instanceof AIProjectDiagramWizard) 
			selection = ((AIProjectDiagramWizard) getWizard()).getSelection();
		
		if (selection != null && selection.getFirstElement() instanceof org.eclipse.core.resources.IContainer) {
			container = (org.eclipse.core.resources.IContainer) selection.getFirstElement();
			dirText.setText(container.getLocation().toOSString());
		}

		dialogChanged();
		
		setControl(composite);
	}
	
	private java.lang.String validateProjectName() {
		java.lang.String directory = dirText.getText();
		if (directory.isEmpty())
			return "Select existing project or enter new project name";
		else return null;
	}
	
	private java.lang.String validateFileName() {
		java.lang.String fileName = fileNameText.getText();
		java.lang.String fileExtension = "somegraph";
		if (fileName.isEmpty()) {
			return "Enter file name";
		} else if (fileName.contains(".") && !fileName.endsWith(fileExtension)) {
			return "Worng file extension";
		} else return null;
	}
	
	private boolean checkFileExists() {
		java.lang.String fileName = (fileNameText.getText().contains(".") ? fileNameText.getText() : fileNameText.getText().concat(".aiproject"));
		try {
			if (container == null)
				return false;
			for (org.eclipse.core.resources.IResource res : container.members()) {
				if (res.getName().equals(fileName)) 
					return true;
			}
		} catch (org.eclipse.core.runtime.CoreException e) {
			e.printStackTrace();
		}
		return false;
	}

	private void dialogChanged() {
		java.lang.String projectNameError = validateProjectName();
		java.lang.String fileNameError = validateFileName();
		boolean fileExists = checkFileExists();
		if (projectNameError != null) {
			updateStatus(projectNameError);
		} else if (fileNameError != null) {
			updateStatus(fileNameError);
		} else if (fileExists) {
			updateStatus("File already exists");
		}
		else updateStatus(null);
	}
	
	private void updateStatus(java.lang.String msg) {
		setErrorMessage(msg);
		if (getContainer().getCurrentPage() != null) {
			getWizard().getContainer().updateMessage();
			getWizard().getContainer().updateButtons();
		}
		setPageComplete(getErrorMessage() == null);
	}
	
	
	private org.eclipse.swt.events.SelectionListener buttonListener = new org.eclipse.swt.events.SelectionListener() {
		
		@Override
		public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
			org.eclipse.swt.widgets.DirectoryDialog dialog = new org.eclipse.swt.widgets.DirectoryDialog(getShell());
			dialog.setText("Select a directory");
			java.lang.String rootLocation = org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
			dialog.setFilterPath(rootLocation);
			java.lang.String dirName = dialog.open();
			if (dirName != null) {
				dirText.setText(dirName);
			}
			dialogChanged();
		}
		
		@Override
		public void widgetDefaultSelected(org.eclipse.swt.events.SelectionEvent e) {
			
		}
	};
	
	
	private org.eclipse.swt.events.KeyListener textKeyListener = new org.eclipse.swt.events.KeyListener() {
		
		@Override
		public void keyReleased(org.eclipse.swt.events.KeyEvent e) {
			dialogChanged();
		}
		
		@Override
		public void keyPressed(org.eclipse.swt.events.KeyEvent e) {
			
		}
	};
}


