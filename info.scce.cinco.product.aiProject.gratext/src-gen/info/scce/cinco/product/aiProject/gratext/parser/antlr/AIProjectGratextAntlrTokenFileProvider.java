/*
 * generated by Xtext 2.14.0
 */
package info.scce.cinco.product.aiProject.gratext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AIProjectGratextAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("info/scce/cinco/product/aiProject/gratext/parser/antlr/internal/InternalAIProjectGratext.tokens");
	}
}
