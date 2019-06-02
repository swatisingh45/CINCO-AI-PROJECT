package info.scce.cinco.product.aiProject.editor.graphiti;

import info.scce.cinco.product.aiProject.editor.graphiti.AIProjectApiResouce;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class AIProjectAPIParser implements Resource.Factory {
  public AIProjectAPIParser() {
  }
  
  @Override
  public Resource createResource(final URI uri) {
    return new AIProjectApiResouce(uri);
  }
}
