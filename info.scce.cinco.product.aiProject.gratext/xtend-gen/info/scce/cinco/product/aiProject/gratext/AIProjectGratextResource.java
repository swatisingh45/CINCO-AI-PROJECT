package info.scce.cinco.product.aiProject.gratext;

import de.jabc.cinco.meta.core.utils.registry.NonEmptyIdentityRegistry;
import de.jabc.cinco.meta.plugin.gratext.runtime.resource.GratextResource;
import de.jabc.cinco.meta.plugin.gratext.runtime.resource.Transformer;
import graphmodel.internal.InternalGraphModel;
import info.scce.cinco.product.aiProject.gratext.generator.AIProjectGratextTransformer;
import java.util.function.Function;

@SuppressWarnings("all")
public class AIProjectGratextResource extends GratextResource {
  public final static NonEmptyIdentityRegistry<InternalGraphModel, AIProjectGratextTransformer> transformers = new NonEmptyIdentityRegistry<InternalGraphModel, AIProjectGratextTransformer>(((Function<InternalGraphModel, AIProjectGratextTransformer>) (InternalGraphModel it) -> {
    return new AIProjectGratextTransformer();
  }));
  
  private final NonEmptyIdentityRegistry<InternalGraphModel, AIProjectGratextTransformer> lastTransformers = new NonEmptyIdentityRegistry<InternalGraphModel, AIProjectGratextTransformer>(((Function<InternalGraphModel, AIProjectGratextTransformer>) (InternalGraphModel it) -> {
    return new AIProjectGratextTransformer();
  }));
  
  @Override
  public Transformer getTransformer(final InternalGraphModel model) {
    return AIProjectGratextResource.transformers.get(model);
  }
  
  @Override
  public Transformer getLastTransformer(final InternalGraphModel model) {
    return this.lastTransformers.get(model);
  }
  
  @Override
  public void removeTransformer(final InternalGraphModel model) {
    this.lastTransformers.put(model, AIProjectGratextResource.transformers.remove(model));
  }
  
  @Override
  public boolean isSortGratext() {
    return false;
  }
}
