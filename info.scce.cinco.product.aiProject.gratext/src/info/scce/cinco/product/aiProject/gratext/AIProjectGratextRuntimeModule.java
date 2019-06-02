package info.scce.cinco.product.aiProject.gratext;

import org.eclipse.emf.ecore.EValidator.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.linking.ILinker;
import org.eclipse.xtext.linking.ILinkingService;
import org.eclipse.xtext.linking.impl.Linker;
import org.eclipse.xtext.parser.IAstFactory;
import org.eclipse.xtext.resource.XtextResource;

import de.jabc.cinco.meta.plugin.gratext.runtime.util.GratextEValidatorRegistry;
import de.jabc.cinco.meta.plugin.gratext.runtime.util.TerminalConverters;

public class AIProjectGratextRuntimeModule extends info.scce.cinco.product.aiProject.gratext.AbstractAIProjectGratextRuntimeModule {

	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
	    return TerminalConverters.class;
	}

	@Override
	public Class<? extends IAstFactory> bindIAstFactory() {
		return AIProjectGratextAstFactory.class;
	}
    
    @Override
	public Class<? extends ILinker> bindILinker() {
		return MyLinker.class;
	}
	
	static class MyLinker extends Linker {
		
		@Override
		protected boolean isClearAllReferencesRequired(Resource resource) {
			return false;
		}
	}
	
	@Override
	public Class<? extends ILinkingService> bindILinkingService() {
		return AIProjectGratextLinkingService.class;
	}
    
    @Override
    public Class<? extends XtextResource> bindXtextResource() {
    	return AIProjectGratextResource.class;
    }
	
	@Override
	public Registry bindEValidatorRegistry() {
		return new GratextEValidatorRegistry();
	}
}
