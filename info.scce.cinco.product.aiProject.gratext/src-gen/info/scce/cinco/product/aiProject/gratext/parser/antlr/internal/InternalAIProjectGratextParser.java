package info.scce.cinco.product.aiProject.gratext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import info.scce.cinco.product.aiProject.gratext.services.AIProjectGratextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAIProjectGratextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE__ID", "RULE__STRING", "RULE__SIGN", "RULE__INT", "RULE__ML_COMMENT", "RULE__SL_COMMENT", "RULE__WS", "RULE__ANY_OTHER", "'AIProject'", "'{'", "'}'", "'('", "','", "')'"
    };
    public static final int RULE__WS=10;
    public static final int RULE__ID=4;
    public static final int RULE__STRING=5;
    public static final int T__15=15;
    public static final int RULE__ML_COMMENT=8;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE__ANY_OTHER=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE__SIGN=6;
    public static final int RULE__INT=7;
    public static final int RULE__SL_COMMENT=9;

    // delegates
    // delegators


        public InternalAIProjectGratextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAIProjectGratextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAIProjectGratextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAIProjectGratext.g"; }



     	private AIProjectGratextGrammarAccess grammarAccess;

        public InternalAIProjectGratextParser(TokenStream input, AIProjectGratextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AIProject";
       	}

       	@Override
       	protected AIProjectGratextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAIProject"
    // InternalAIProjectGratext.g:64:1: entryRuleAIProject returns [EObject current=null] : iv_ruleAIProject= ruleAIProject EOF ;
    public final EObject entryRuleAIProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAIProject = null;


        try {
            // InternalAIProjectGratext.g:64:50: (iv_ruleAIProject= ruleAIProject EOF )
            // InternalAIProjectGratext.g:65:2: iv_ruleAIProject= ruleAIProject EOF
            {
             newCompositeNode(grammarAccess.getAIProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAIProject=ruleAIProject();

            state._fsp--;

             current =iv_ruleAIProject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAIProject"


    // $ANTLR start "ruleAIProject"
    // InternalAIProjectGratext.g:71:1: ruleAIProject returns [EObject current=null] : ( () otherlv_1= 'AIProject' ( (lv_id_2_0= RULE__ID ) )? (otherlv_3= '{' otherlv_4= '}' )? ) ;
    public final EObject ruleAIProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAIProjectGratext.g:77:2: ( ( () otherlv_1= 'AIProject' ( (lv_id_2_0= RULE__ID ) )? (otherlv_3= '{' otherlv_4= '}' )? ) )
            // InternalAIProjectGratext.g:78:2: ( () otherlv_1= 'AIProject' ( (lv_id_2_0= RULE__ID ) )? (otherlv_3= '{' otherlv_4= '}' )? )
            {
            // InternalAIProjectGratext.g:78:2: ( () otherlv_1= 'AIProject' ( (lv_id_2_0= RULE__ID ) )? (otherlv_3= '{' otherlv_4= '}' )? )
            // InternalAIProjectGratext.g:79:3: () otherlv_1= 'AIProject' ( (lv_id_2_0= RULE__ID ) )? (otherlv_3= '{' otherlv_4= '}' )?
            {
            // InternalAIProjectGratext.g:79:3: ()
            // InternalAIProjectGratext.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAIProjectAccess().getAIProjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAIProjectAccess().getAIProjectKeyword_1());
            		
            // InternalAIProjectGratext.g:90:3: ( (lv_id_2_0= RULE__ID ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE__ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAIProjectGratext.g:91:4: (lv_id_2_0= RULE__ID )
                    {
                    // InternalAIProjectGratext.g:91:4: (lv_id_2_0= RULE__ID )
                    // InternalAIProjectGratext.g:92:5: lv_id_2_0= RULE__ID
                    {
                    lv_id_2_0=(Token)match(input,RULE__ID,FOLLOW_4); 

                    					newLeafNode(lv_id_2_0, grammarAccess.getAIProjectAccess().getId_IDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAIProjectRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"id",
                    						lv_id_2_0,
                    						"info.scce.cinco.product.aiProject.gratext.AIProjectGratext._ID");
                    				

                    }


                    }
                    break;

            }

            // InternalAIProjectGratext.g:108:3: (otherlv_3= '{' otherlv_4= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAIProjectGratext.g:109:4: otherlv_3= '{' otherlv_4= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getAIProjectAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getAIProjectAccess().getRightCurlyBracketKeyword_3_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAIProject"


    // $ANTLR start "entryRule_Point"
    // InternalAIProjectGratext.g:122:1: entryRule_Point returns [EObject current=null] : iv_rule_Point= rule_Point EOF ;
    public final EObject entryRule_Point() throws RecognitionException {
        EObject current = null;

        EObject iv_rule_Point = null;


        try {
            // InternalAIProjectGratext.g:122:47: (iv_rule_Point= rule_Point EOF )
            // InternalAIProjectGratext.g:123:2: iv_rule_Point= rule_Point EOF
            {
             newCompositeNode(grammarAccess.get_PointRule()); 
            pushFollow(FOLLOW_1);
            iv_rule_Point=rule_Point();

            state._fsp--;

             current =iv_rule_Point; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRule_Point"


    // $ANTLR start "rule_Point"
    // InternalAIProjectGratext.g:129:1: rule_Point returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_x_2_0= rule_EInt ) ) otherlv_3= ',' ( (lv_y_4_0= rule_EInt ) ) otherlv_5= ')' ) ;
    public final EObject rule_Point() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_x_2_0 = null;

        AntlrDatatypeRuleToken lv_y_4_0 = null;



        	enterRule();

        try {
            // InternalAIProjectGratext.g:135:2: ( ( () otherlv_1= '(' ( (lv_x_2_0= rule_EInt ) ) otherlv_3= ',' ( (lv_y_4_0= rule_EInt ) ) otherlv_5= ')' ) )
            // InternalAIProjectGratext.g:136:2: ( () otherlv_1= '(' ( (lv_x_2_0= rule_EInt ) ) otherlv_3= ',' ( (lv_y_4_0= rule_EInt ) ) otherlv_5= ')' )
            {
            // InternalAIProjectGratext.g:136:2: ( () otherlv_1= '(' ( (lv_x_2_0= rule_EInt ) ) otherlv_3= ',' ( (lv_y_4_0= rule_EInt ) ) otherlv_5= ')' )
            // InternalAIProjectGratext.g:137:3: () otherlv_1= '(' ( (lv_x_2_0= rule_EInt ) ) otherlv_3= ',' ( (lv_y_4_0= rule_EInt ) ) otherlv_5= ')'
            {
            // InternalAIProjectGratext.g:137:3: ()
            // InternalAIProjectGratext.g:138:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.get_PointAccess().get_PointAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.get_PointAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAIProjectGratext.g:148:3: ( (lv_x_2_0= rule_EInt ) )
            // InternalAIProjectGratext.g:149:4: (lv_x_2_0= rule_EInt )
            {
            // InternalAIProjectGratext.g:149:4: (lv_x_2_0= rule_EInt )
            // InternalAIProjectGratext.g:150:5: lv_x_2_0= rule_EInt
            {

            					newCompositeNode(grammarAccess.get_PointAccess().getX_EIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_x_2_0=rule_EInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.get_PointRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_2_0,
            						"info.scce.cinco.product.aiProject.gratext.AIProjectGratext._EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.get_PointAccess().getCommaKeyword_3());
            		
            // InternalAIProjectGratext.g:171:3: ( (lv_y_4_0= rule_EInt ) )
            // InternalAIProjectGratext.g:172:4: (lv_y_4_0= rule_EInt )
            {
            // InternalAIProjectGratext.g:172:4: (lv_y_4_0= rule_EInt )
            // InternalAIProjectGratext.g:173:5: lv_y_4_0= rule_EInt
            {

            					newCompositeNode(grammarAccess.get_PointAccess().getY_EIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_y_4_0=rule_EInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.get_PointRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_4_0,
            						"info.scce.cinco.product.aiProject.gratext.AIProjectGratext._EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.get_PointAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rule_Point"


    // $ANTLR start "entryRule_EString"
    // InternalAIProjectGratext.g:198:1: entryRule_EString returns [String current=null] : iv_rule_EString= rule_EString EOF ;
    public final String entryRule_EString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rule_EString = null;


        try {
            // InternalAIProjectGratext.g:198:48: (iv_rule_EString= rule_EString EOF )
            // InternalAIProjectGratext.g:199:2: iv_rule_EString= rule_EString EOF
            {
             newCompositeNode(grammarAccess.get_EStringRule()); 
            pushFollow(FOLLOW_1);
            iv_rule_EString=rule_EString();

            state._fsp--;

             current =iv_rule_EString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRule_EString"


    // $ANTLR start "rule_EString"
    // InternalAIProjectGratext.g:205:1: rule_EString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this__STRING_0= RULE__STRING ;
    public final AntlrDatatypeRuleToken rule_EString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this__STRING_0=null;


        	enterRule();

        try {
            // InternalAIProjectGratext.g:211:2: (this__STRING_0= RULE__STRING )
            // InternalAIProjectGratext.g:212:2: this__STRING_0= RULE__STRING
            {
            this__STRING_0=(Token)match(input,RULE__STRING,FOLLOW_2); 

            		current.merge(this__STRING_0);
            	

            		newLeafNode(this__STRING_0, grammarAccess.get_EStringAccess().get_STRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rule_EString"


    // $ANTLR start "entryRule_EInt"
    // InternalAIProjectGratext.g:222:1: entryRule_EInt returns [String current=null] : iv_rule_EInt= rule_EInt EOF ;
    public final String entryRule_EInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rule_EInt = null;


        try {
            // InternalAIProjectGratext.g:222:45: (iv_rule_EInt= rule_EInt EOF )
            // InternalAIProjectGratext.g:223:2: iv_rule_EInt= rule_EInt EOF
            {
             newCompositeNode(grammarAccess.get_EIntRule()); 
            pushFollow(FOLLOW_1);
            iv_rule_EInt=rule_EInt();

            state._fsp--;

             current =iv_rule_EInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRule_EInt"


    // $ANTLR start "rule_EInt"
    // InternalAIProjectGratext.g:229:1: rule_EInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this__SIGN_0= RULE__SIGN )? this__INT_1= RULE__INT ) ;
    public final AntlrDatatypeRuleToken rule_EInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this__SIGN_0=null;
        Token this__INT_1=null;


        	enterRule();

        try {
            // InternalAIProjectGratext.g:235:2: ( ( (this__SIGN_0= RULE__SIGN )? this__INT_1= RULE__INT ) )
            // InternalAIProjectGratext.g:236:2: ( (this__SIGN_0= RULE__SIGN )? this__INT_1= RULE__INT )
            {
            // InternalAIProjectGratext.g:236:2: ( (this__SIGN_0= RULE__SIGN )? this__INT_1= RULE__INT )
            // InternalAIProjectGratext.g:237:3: (this__SIGN_0= RULE__SIGN )? this__INT_1= RULE__INT
            {
            // InternalAIProjectGratext.g:237:3: (this__SIGN_0= RULE__SIGN )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE__SIGN) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAIProjectGratext.g:238:4: this__SIGN_0= RULE__SIGN
                    {
                    this__SIGN_0=(Token)match(input,RULE__SIGN,FOLLOW_9); 

                    				current.merge(this__SIGN_0);
                    			

                    				newLeafNode(this__SIGN_0, grammarAccess.get_EIntAccess().get_SIGNTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            this__INT_1=(Token)match(input,RULE__INT,FOLLOW_2); 

            			current.merge(this__INT_1);
            		

            			newLeafNode(this__INT_1, grammarAccess.get_EIntAccess().get_INTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rule_EInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});

}