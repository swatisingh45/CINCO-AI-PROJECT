package info.scce.cinco.product.aiProject.editor.graphiti;

public class AIProjectFileExtensions implements de.jabc.cinco.meta.core.referenceregistry.implementing.IFileExtensionSupplier {
	
	@Override
	public java.util.List<java.lang.String> getKnownFileExtensions() {
		return java.util.Arrays.asList(new java.lang.String[] { "aiprojectAINode", "AIProject"});
	}
}
