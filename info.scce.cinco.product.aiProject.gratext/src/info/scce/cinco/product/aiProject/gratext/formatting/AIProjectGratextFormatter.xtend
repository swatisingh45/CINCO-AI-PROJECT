package info.scce.cinco.product.aiProject.gratext.formatting

import com.google.inject.Inject
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig
import info.scce.cinco.product.aiProject.gratext.services.*

/**
 * This class contains custom formatting declarations.
 */
public class AIProjectGratextFormatter extends AbstractDeclarativeFormatter {
	
	@Inject extension AIProjectGratextGrammarAccess
	
	override protected configureFormatting(FormattingConfig c) {
		for (pair : findKeywordPairs('{', '}')) {
			c.setIndentation(pair.first, pair.second)
			c.setLinewrap(1).after(pair.first)
			c.setLinewrap(1).before(pair.second)
			c.setLinewrap(1).after(pair.second)
		}
		for (comma : findKeywords(',')) {
			c.setNoLinewrap().before(comma)
			c.setNoSpace().before(comma)
			c.setLinewrap().after(comma)
		}
		c.setLinewrap(0, 1, 2).before(get_SL_COMMENTRule)
		c.setLinewrap(0, 1, 2).before(get_ML_COMMENTRule)
		c.setLinewrap(0, 1, 1).after(get_ML_COMMENTRule)
	}
}
