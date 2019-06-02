package info.scce.cinco.product.aiProject.gratext.formatting;

import com.google.inject.Inject;
import info.scce.cinco.product.aiProject.gratext.services.AIProjectGratextGrammarAccess;
import java.util.List;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * This class contains custom formatting declarations.
 */
@SuppressWarnings("all")
public class AIProjectGratextFormatter extends AbstractDeclarativeFormatter {
  @Inject
  @Extension
  private AIProjectGratextGrammarAccess _aIProjectGratextGrammarAccess;
  
  @Override
  protected void configureFormatting(final FormattingConfig c) {
    List<Pair<Keyword, Keyword>> _findKeywordPairs = this._aIProjectGratextGrammarAccess.findKeywordPairs("{", "}");
    for (final Pair<Keyword, Keyword> pair : _findKeywordPairs) {
      {
        c.setIndentation(pair.getFirst(), pair.getSecond());
        c.setLinewrap(1).after(pair.getFirst());
        c.setLinewrap(1).before(pair.getSecond());
        c.setLinewrap(1).after(pair.getSecond());
      }
    }
    List<Keyword> _findKeywords = this._aIProjectGratextGrammarAccess.findKeywords(",");
    for (final Keyword comma : _findKeywords) {
      {
        c.setNoLinewrap().before(comma);
        c.setNoSpace().before(comma);
        c.setLinewrap().after(comma);
      }
    }
    c.setLinewrap(0, 1, 2).before(this._aIProjectGratextGrammarAccess.get_SL_COMMENTRule());
    c.setLinewrap(0, 1, 2).before(this._aIProjectGratextGrammarAccess.get_ML_COMMENTRule());
    c.setLinewrap(0, 1, 1).after(this._aIProjectGratextGrammarAccess.get_ML_COMMENTRule());
  }
}
