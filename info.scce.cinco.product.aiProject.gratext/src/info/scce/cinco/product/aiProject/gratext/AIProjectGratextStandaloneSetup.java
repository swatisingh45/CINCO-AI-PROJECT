/*
 * generated by Xtext 2.14.0
 */
package info.scce.cinco.product.aiProject.gratext;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class AIProjectGratextStandaloneSetup extends AIProjectGratextStandaloneSetupGenerated {

	public static void doSetup() {
		new AIProjectGratextStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
