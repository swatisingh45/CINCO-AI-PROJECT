package info.scce.cinco.product.aiProject.editor.graphiti;


public class AIProjectImageProvider extends org.eclipse.graphiti.ui.platform.AbstractImageProvider 
	implements org.eclipse.graphiti.ui.platform.IImageProvider {

	private java.util.Hashtable<java.lang.String, java.lang.String> images;
	
	/**
	 * Sets an ImageProvider
	*/
	public AIProjectImageProvider() {
		AIProjectGraphitiUtils.getInstance().setImageProvider(this);
	}

	/**
	 * Adds an image to the editor
	 * @param id : Id of an image
	 * @param path : Path of the image
	 */
	public void addImage(java.lang.String id, java.lang.String path) {
		if (images == null) {
			images = new java.util.Hashtable<java.lang.String, java.lang.String>();
		}
		images.put(id, path);
	}
	
	/**
	 * Returns the id of an image.
	 * @param path : Path is the path of an image
	 * @return Returns the id of an image.
	*/
	public java.lang.String getImageId(java.lang.String path) {
		for (java.util.Map.Entry<java.lang.String, java.lang.String> e : images.entrySet()){
			if (e.getValue().equals(path))
				return e.getKey();
		}
		try {
			de.jabc.cinco.meta.runtime.xapi.WorkspaceExtension workspaceExtension = new de.jabc.cinco.meta.runtime.xapi.WorkspaceExtension();
			org.eclipse.core.resources.IWorkspaceRoot root = workspaceExtension.getWorkspaceRoot();
			java.util.List<org.eclipse.core.resources.IFile> files = workspaceExtension.getFiles(root, f -> f.getFullPath().toString().contains(path));
			if (files.size() == 1) {
				org.eclipse.core.resources.IFile f = files.get(0);
				java.net.URL url = f.getLocationURI().toURL();
				if (images.get(path) == null) {
					addImage(path, url.toString());
					addImageFilePath(path, url.toString());
				}
			}  else {
				java.io.File f = new java.io.File(path);
				if (f.exists()) {
					addImage(path, f.toURI().toURL().toString());
				}
			}
		} catch (java.net.MalformedURLException e) {
			e.printStackTrace();
		}
		return path;
	}
	
    /**
     * Adds available images if the 'ImageFilePath' is is null
     * If the HashTable 'images' is null a new one will be created
    */
	@Override
	protected void addAvailableImages() {
		if (images == null) {
			images = new java.util.Hashtable<java.lang.String, java.lang.String>();
		}
		for (java.util.Map.Entry<java.lang.String, java.lang.String> e : images.entrySet()) {
			if (getImageFilePath(e.getKey()) == null)
				addImageFilePath(e.getKey(), e.getValue());
		}
	}
	
	/**
	 * Each image is logged in by adding the images and creating the related path.
	*/
	public void initImages() {
		org.osgi.framework.Bundle b = org.eclipse.core.runtime.Platform.getBundle("info.scce.cinco.product.aiProject");
		java.io.File file;
			java.net.URL url = null;
			
			//Search for all used images in graphmodel and register them in the image provider
			
		
			b = org.eclipse.core.runtime.Platform.getBundle("de.jabc.cinco.meta.core.ge.style.generator.runtime");
			url =  org.eclipse.core.runtime.FileLocator.find(b, new org.eclipse.core.runtime.Path("/icons/_Connection.gif"), null);
			addImage("_Connection.gif", url.toString());
		
			addAvailableImages();
	}
}

