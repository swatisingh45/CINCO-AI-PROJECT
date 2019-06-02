package info.scce.cinco.product.aiProject.editor.graphiti;

public class AIProjectGraphitiUtils {

	public static final java.lang.String KEY_FORMAT_STRING = "formatString";
	private AIProjectImageProvider ip;
	private org.eclipse.graphiti.dt.IDiagramTypeProvider dtp;

	private static AIProjectGraphitiUtils instance;

	private AIProjectGraphitiUtils() {
	}
	
	public static AIProjectGraphitiUtils getInstance() {
		if (instance == null)
			instance = new AIProjectGraphitiUtils();
		return instance;
	}

	public static info.scce.cinco.product.aiProject.aiproject.AIProject addToResource(org.eclipse.graphiti.mm.pictograms.Diagram d, org.eclipse.graphiti.features.IFeatureProvider fp) {
		info.scce.cinco.product.aiProject.aiproject.AIProject somegraph = null;
		for (Object o : d.eResource().getContents()){
			if (o instanceof info.scce.cinco.product.aiProject.aiproject.AIProject) {
				somegraph = (info.scce.cinco.product.aiProject.aiproject.AIProject) o;
				break;
			}
		}
		if (somegraph == null) {
			somegraph = info.scce.cinco.product.aiProject.aiproject.AiprojectFactory.eINSTANCE.createAIProject();
			d.eResource().getContents().add(somegraph);
			fp.link(d, somegraph);
		}
		
	return somegraph;
	}

	public java.lang.String loadGraphitiImage(java.lang.String path, org.eclipse.emf.ecore.EObject bo) {
		try{
		
			java.io.File file = new java.io.File(path);
			org.osgi.framework.Bundle b = org.eclipse.core.runtime.Platform.getBundle("info.scce.cinco.product.aiProject");
			java.io.File bundleFile = org.eclipse.core.runtime.FileLocator.getBundleFile(b);
		
			if (!file.exists()) {
				java.lang.String filePath = bo.eResource().getURI().toPlatformString(true);
				org.eclipse.core.resources.IFile resFile = org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().getFile(new org.eclipse.core.runtime.Path(filePath));
				org.eclipse.core.resources.IProject p = resFile.getProject();
				org.eclipse.core.resources.IFile iFile = p.getFile(path);
				if (iFile.exists()) {
					file = iFile.getLocation().toFile();
				}
				else {
					throw new java.io.FileNotFoundException("No file with path: " + path +" found...");
				}
			}
			
			java.io.FileInputStream fis = new java.io.FileInputStream(file);
			java.io.File trgFile = bundleFile.toPath().resolve("icons/"+file.getName()).toFile();
			trgFile.createNewFile();
			java.io.FileOutputStream fos = new java.io.FileOutputStream(trgFile);
			
			copy(fis, fos);
			
			java.lang.String id = (file.getName().contains(".") ? file.getName().split("\\.")[0] : file.getName());
			java.lang.String relPath = "icons/" + file.getName();
			addImage(id, relPath);
			return id;
			
		} catch (java.io.FileNotFoundException e) {
			e.printStackTrace();
		} catch (java.io.IOException e) {
			e.printStackTrace();
		} 
		return null;
		
	}

	public void addImage(java.lang.String id, java.lang.String path) {
		ip.addImage(id, path);
	}

	public java.lang.String getImageId(java.lang.String path) {
		return ip.getImageId(path);
	}

	public void setImageProvider(AIProjectImageProvider ip) {
		this.ip = ip;
	}

	public void loadImages() {
		ip.initImages();
	}

	public void setDTP(org.eclipse.graphiti.dt.IDiagramTypeProvider dtp) {
		this.dtp = dtp;
	}
	
	public org.eclipse.graphiti.dt.IDiagramTypeProvider getDTP() {
		if (org.eclipse.ui.PlatformUI.getWorkbench().getActiveWorkbenchWindow() == null ||
				org.eclipse.ui.PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage() == null) 
			return loadByDarkFeature();
		org.eclipse.ui.IEditorPart part = org.eclipse.ui.PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (part instanceof AIProjectDiagramEditor)
			return ((AIProjectDiagramEditor) part).getDiagramTypeProvider();
		return this.dtp;
	}

	private org.eclipse.graphiti.dt.IDiagramTypeProvider loadByDarkFeature() {
		org.eclipse.graphiti.dt.IDiagramTypeProvider dtp = org.eclipse.graphiti.ui.services.GraphitiUi.getExtensionManager().createDiagramTypeProvider("info.scce.cinco.product.aiProject.editor.graphiti.AIProjectDiagramTypeProvider");
		return dtp;
	}

	private void copy(java.io.FileInputStream fis, java.io.FileOutputStream fos) {
		int b = 0;
		try {
			while ((b = fis.read()) != -1) {
				fos.write(b);
			}
			fis.close();
			fos.flush();
			fos.close();
		} catch (java.io.IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public graphmodel.ModelElementContainer getCommonContainer(graphmodel.ModelElementContainer ce, graphmodel.Edge e) {
		graphmodel.ModelElement source = e.getSourceElement();
		graphmodel.ModelElement target = e.getTargetElement();
		if (org.eclipse.emf.ecore.util.EcoreUtil.isAncestor(ce, source) && org.eclipse.emf.ecore.util.EcoreUtil.isAncestor(ce, target)) {
			for (graphmodel.Container c : ce.getAllContainers()) {
				if (org.eclipse.emf.ecore.util.EcoreUtil.isAncestor(c, source) && org.eclipse.emf.ecore.util.EcoreUtil.isAncestor(c, target)) {
					return getCommonContainer(c, e);
				}
			}
		} else if (ce instanceof graphmodel.ModelElement) {
			return getCommonContainer(((graphmodel.ModelElement) ce).getContainer(), e);
		}
		return ce;
		
	}

	public int max(int[] values) {
		java.util.OptionalInt max = java.util.Arrays.stream(values).max();
		if (max.isPresent())
			return max.getAsInt();
		else return 0;
	}

	public int min(int[] values) {
		java.util.OptionalInt min = java.util.Arrays.stream(values).min();
		if (min.isPresent())
			return min.getAsInt();
		else return 0;
	}
	
	public int[] transform(int[] values, int deltaX, int deltaY) {
		if (values.length > 0) {
			for (int i=0; i<values.length;i+=2){
				values[i] = values[i] + deltaX;
				values[i+1] = values[i+1] + deltaY;
			}
		}
		return values;
	}

}

