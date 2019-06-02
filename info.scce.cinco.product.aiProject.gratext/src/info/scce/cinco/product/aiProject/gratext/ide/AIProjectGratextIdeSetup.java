/*
 * generated by Xtext 2.14.0
 */
package info.scce.cinco.product.aiProject.gratext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import info.scce.cinco.product.aiProject.gratext.AIProjectGratextRuntimeModule;
import info.scce.cinco.product.aiProject.gratext.AIProjectGratextStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class AIProjectGratextIdeSetup extends AIProjectGratextStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new AIProjectGratextRuntimeModule(), new AIProjectGratextIdeModule()));
	}
	
}