package info.scce.cinco.product.aiProject.gratext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import info.scce.cinco.product.aiProject.gratext.services.AIProjectGratextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAIProjectGratextParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE__STRING", "RULE__SIGN", "RULE__INT", "RULE__ID", "RULE__ML_COMMENT", "RULE__SL_COMMENT", "RULE__WS", "RULE__ANY_OTHER", "'AIProject'", "'{'", "'}'", "'('", "','", "')'"
    };
    public static final int RULE__WS=10;
    public static final int RULE__ID=7;
    public static final int RULE__STRING=4;
    public static final int T__15=15;
    public static final int RULE__ML_COMMENT=8;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE__ANY_OTHER=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE__SIGN=5;
    public static final int RULE__INT=6;
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

    	public void setGrammarAccess(AIProjectGratextGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleAIProject"
    // InternalAIProjectGratext.g:53:1: entryRuleAIProject : ruleAIProject EOF ;
    public final void entryRuleAIProject() throws RecognitionException {
        try {
            // InternalAIProjectGratext.g:54:1: ( ruleAIProject EOF )
            // InternalAIProjectGratext.g:55:1: ruleAIProject EOF
            {
             before(grammarAccess.getAIProjectRule()); 
            pushFollow(FOLLOW_1);
            ruleAIProject();

            state._fsp--;

             after(grammarAccess.getAIProjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAIProject"


    // $ANTLR start "ruleAIProject"
    // InternalAIProjectGratext.g:62:1: ruleAIProject : ( ( rule__AIProject__Group__0 ) ) ;
    public final void ruleAIProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:66:2: ( ( ( rule__AIProject__Group__0 ) ) )
            // InternalAIProjectGratext.g:67:2: ( ( rule__AIProject__Group__0 ) )
            {
            // InternalAIProjectGratext.g:67:2: ( ( rule__AIProject__Group__0 ) )
            // InternalAIProjectGratext.g:68:3: ( rule__AIProject__Group__0 )
            {
             before(grammarAccess.getAIProjectAccess().getGroup()); 
            // InternalAIProjectGratext.g:69:3: ( rule__AIProject__Group__0 )
            // InternalAIProjectGratext.g:69:4: rule__AIProject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AIProject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAIProjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAIProject"


    // $ANTLR start "entryRule_Point"
    // InternalAIProjectGratext.g:78:1: entryRule_Point : rule_Point EOF ;
    public final void entryRule_Point() throws RecognitionException {
        try {
            // InternalAIProjectGratext.g:79:1: ( rule_Point EOF )
            // InternalAIProjectGratext.g:80:1: rule_Point EOF
            {
             before(grammarAccess.get_PointRule()); 
            pushFollow(FOLLOW_1);
            rule_Point();

            state._fsp--;

             after(grammarAccess.get_PointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRule_Point"


    // $ANTLR start "rule_Point"
    // InternalAIProjectGratext.g:87:1: rule_Point : ( ( rule___Point__Group__0 ) ) ;
    public final void rule_Point() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:91:2: ( ( ( rule___Point__Group__0 ) ) )
            // InternalAIProjectGratext.g:92:2: ( ( rule___Point__Group__0 ) )
            {
            // InternalAIProjectGratext.g:92:2: ( ( rule___Point__Group__0 ) )
            // InternalAIProjectGratext.g:93:3: ( rule___Point__Group__0 )
            {
             before(grammarAccess.get_PointAccess().getGroup()); 
            // InternalAIProjectGratext.g:94:3: ( rule___Point__Group__0 )
            // InternalAIProjectGratext.g:94:4: rule___Point__Group__0
            {
            pushFollow(FOLLOW_2);
            rule___Point__Group__0();

            state._fsp--;


            }

             after(grammarAccess.get_PointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule_Point"


    // $ANTLR start "entryRule_EString"
    // InternalAIProjectGratext.g:103:1: entryRule_EString : rule_EString EOF ;
    public final void entryRule_EString() throws RecognitionException {
        try {
            // InternalAIProjectGratext.g:104:1: ( rule_EString EOF )
            // InternalAIProjectGratext.g:105:1: rule_EString EOF
            {
             before(grammarAccess.get_EStringRule()); 
            pushFollow(FOLLOW_1);
            rule_EString();

            state._fsp--;

             after(grammarAccess.get_EStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRule_EString"


    // $ANTLR start "rule_EString"
    // InternalAIProjectGratext.g:112:1: rule_EString : ( RULE__STRING ) ;
    public final void rule_EString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:116:2: ( ( RULE__STRING ) )
            // InternalAIProjectGratext.g:117:2: ( RULE__STRING )
            {
            // InternalAIProjectGratext.g:117:2: ( RULE__STRING )
            // InternalAIProjectGratext.g:118:3: RULE__STRING
            {
             before(grammarAccess.get_EStringAccess().get_STRINGTerminalRuleCall()); 
            match(input,RULE__STRING,FOLLOW_2); 
             after(grammarAccess.get_EStringAccess().get_STRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule_EString"


    // $ANTLR start "entryRule_EInt"
    // InternalAIProjectGratext.g:128:1: entryRule_EInt : rule_EInt EOF ;
    public final void entryRule_EInt() throws RecognitionException {
        try {
            // InternalAIProjectGratext.g:129:1: ( rule_EInt EOF )
            // InternalAIProjectGratext.g:130:1: rule_EInt EOF
            {
             before(grammarAccess.get_EIntRule()); 
            pushFollow(FOLLOW_1);
            rule_EInt();

            state._fsp--;

             after(grammarAccess.get_EIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRule_EInt"


    // $ANTLR start "rule_EInt"
    // InternalAIProjectGratext.g:137:1: rule_EInt : ( ( rule___EInt__Group__0 ) ) ;
    public final void rule_EInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:141:2: ( ( ( rule___EInt__Group__0 ) ) )
            // InternalAIProjectGratext.g:142:2: ( ( rule___EInt__Group__0 ) )
            {
            // InternalAIProjectGratext.g:142:2: ( ( rule___EInt__Group__0 ) )
            // InternalAIProjectGratext.g:143:3: ( rule___EInt__Group__0 )
            {
             before(grammarAccess.get_EIntAccess().getGroup()); 
            // InternalAIProjectGratext.g:144:3: ( rule___EInt__Group__0 )
            // InternalAIProjectGratext.g:144:4: rule___EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule___EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.get_EIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule_EInt"


    // $ANTLR start "rule__AIProject__Group__0"
    // InternalAIProjectGratext.g:152:1: rule__AIProject__Group__0 : rule__AIProject__Group__0__Impl rule__AIProject__Group__1 ;
    public final void rule__AIProject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:156:1: ( rule__AIProject__Group__0__Impl rule__AIProject__Group__1 )
            // InternalAIProjectGratext.g:157:2: rule__AIProject__Group__0__Impl rule__AIProject__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AIProject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AIProject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIProject__Group__0"


    // $ANTLR start "rule__AIProject__Group__0__Impl"
    // InternalAIProjectGratext.g:164:1: rule__AIProject__Group__0__Impl : ( () ) ;
    public final void rule__AIProject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:168:1: ( ( () ) )
            // InternalAIProjectGratext.g:169:1: ( () )
            {
            // InternalAIProjectGratext.g:169:1: ( () )
            // InternalAIProjectGratext.g:170:2: ()
            {
             before(grammarAccess.getAIProjectAccess().getAIProjectAction_0()); 
            // InternalAIProjectGratext.g:171:2: ()
            // InternalAIProjectGratext.g:171:3: 
            {
            }

             after(grammarAccess.getAIProjectAccess().getAIProjectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIProject__Group__0__Impl"


    // $ANTLR start "rule__AIProject__Group__1"
    // InternalAIProjectGratext.g:179:1: rule__AIProject__Group__1 : rule__AIProject__Group__1__Impl rule__AIProject__Group__2 ;
    public final void rule__AIProject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:183:1: ( rule__AIProject__Group__1__Impl rule__AIProject__Group__2 )
            // InternalAIProjectGratext.g:184:2: rule__AIProject__Group__1__Impl rule__AIProject__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AIProject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AIProject__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIProject__Group__1"


    // $ANTLR start "rule__AIProject__Group__1__Impl"
    // InternalAIProjectGratext.g:191:1: rule__AIProject__Group__1__Impl : ( 'AIProject' ) ;
    public final void rule__AIProject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:195:1: ( ( 'AIProject' ) )
            // InternalAIProjectGratext.g:196:1: ( 'AIProject' )
            {
            // InternalAIProjectGratext.g:196:1: ( 'AIProject' )
            // InternalAIProjectGratext.g:197:2: 'AIProject'
            {
             before(grammarAccess.getAIProjectAccess().getAIProjectKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAIProjectAccess().getAIProjectKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIProject__Group__1__Impl"


    // $ANTLR start "rule__AIProject__Group__2"
    // InternalAIProjectGratext.g:206:1: rule__AIProject__Group__2 : rule__AIProject__Group__2__Impl rule__AIProject__Group__3 ;
    public final void rule__AIProject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:210:1: ( rule__AIProject__Group__2__Impl rule__AIProject__Group__3 )
            // InternalAIProjectGratext.g:211:2: rule__AIProject__Group__2__Impl rule__AIProject__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__AIProject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AIProject__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIProject__Group__2"


    // $ANTLR start "rule__AIProject__Group__2__Impl"
    // InternalAIProjectGratext.g:218:1: rule__AIProject__Group__2__Impl : ( ( rule__AIProject__IdAssignment_2 )? ) ;
    public final void rule__AIProject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:222:1: ( ( ( rule__AIProject__IdAssignment_2 )? ) )
            // InternalAIProjectGratext.g:223:1: ( ( rule__AIProject__IdAssignment_2 )? )
            {
            // InternalAIProjectGratext.g:223:1: ( ( rule__AIProject__IdAssignment_2 )? )
            // InternalAIProjectGratext.g:224:2: ( rule__AIProject__IdAssignment_2 )?
            {
             before(grammarAccess.getAIProjectAccess().getIdAssignment_2()); 
            // InternalAIProjectGratext.g:225:2: ( rule__AIProject__IdAssignment_2 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE__ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAIProjectGratext.g:225:3: rule__AIProject__IdAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__AIProject__IdAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAIProjectAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIProject__Group__2__Impl"


    // $ANTLR start "rule__AIProject__Group__3"
    // InternalAIProjectGratext.g:233:1: rule__AIProject__Group__3 : rule__AIProject__Group__3__Impl ;
    public final void rule__AIProject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:237:1: ( rule__AIProject__Group__3__Impl )
            // InternalAIProjectGratext.g:238:2: rule__AIProject__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AIProject__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIProject__Group__3"


    // $ANTLR start "rule__AIProject__Group__3__Impl"
    // InternalAIProjectGratext.g:244:1: rule__AIProject__Group__3__Impl : ( ( rule__AIProject__Group_3__0 )? ) ;
    public final void rule__AIProject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:248:1: ( ( ( rule__AIProject__Group_3__0 )? ) )
            // InternalAIProjectGratext.g:249:1: ( ( rule__AIProject__Group_3__0 )? )
            {
            // InternalAIProjectGratext.g:249:1: ( ( rule__AIProject__Group_3__0 )? )
            // InternalAIProjectGratext.g:250:2: ( rule__AIProject__Group_3__0 )?
            {
             before(grammarAccess.getAIProjectAccess().getGroup_3()); 
            // InternalAIProjectGratext.g:251:2: ( rule__AIProject__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAIProjectGratext.g:251:3: rule__AIProject__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AIProject__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAIProjectAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIProject__Group__3__Impl"


    // $ANTLR start "rule__AIProject__Group_3__0"
    // InternalAIProjectGratext.g:260:1: rule__AIProject__Group_3__0 : rule__AIProject__Group_3__0__Impl rule__AIProject__Group_3__1 ;
    public final void rule__AIProject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:264:1: ( rule__AIProject__Group_3__0__Impl rule__AIProject__Group_3__1 )
            // InternalAIProjectGratext.g:265:2: rule__AIProject__Group_3__0__Impl rule__AIProject__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__AIProject__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AIProject__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIProject__Group_3__0"


    // $ANTLR start "rule__AIProject__Group_3__0__Impl"
    // InternalAIProjectGratext.g:272:1: rule__AIProject__Group_3__0__Impl : ( '{' ) ;
    public final void rule__AIProject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:276:1: ( ( '{' ) )
            // InternalAIProjectGratext.g:277:1: ( '{' )
            {
            // InternalAIProjectGratext.g:277:1: ( '{' )
            // InternalAIProjectGratext.g:278:2: '{'
            {
             before(grammarAccess.getAIProjectAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAIProjectAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIProject__Group_3__0__Impl"


    // $ANTLR start "rule__AIProject__Group_3__1"
    // InternalAIProjectGratext.g:287:1: rule__AIProject__Group_3__1 : rule__AIProject__Group_3__1__Impl ;
    public final void rule__AIProject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:291:1: ( rule__AIProject__Group_3__1__Impl )
            // InternalAIProjectGratext.g:292:2: rule__AIProject__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AIProject__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIProject__Group_3__1"


    // $ANTLR start "rule__AIProject__Group_3__1__Impl"
    // InternalAIProjectGratext.g:298:1: rule__AIProject__Group_3__1__Impl : ( '}' ) ;
    public final void rule__AIProject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:302:1: ( ( '}' ) )
            // InternalAIProjectGratext.g:303:1: ( '}' )
            {
            // InternalAIProjectGratext.g:303:1: ( '}' )
            // InternalAIProjectGratext.g:304:2: '}'
            {
             before(grammarAccess.getAIProjectAccess().getRightCurlyBracketKeyword_3_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAIProjectAccess().getRightCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIProject__Group_3__1__Impl"


    // $ANTLR start "rule___Point__Group__0"
    // InternalAIProjectGratext.g:314:1: rule___Point__Group__0 : rule___Point__Group__0__Impl rule___Point__Group__1 ;
    public final void rule___Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:318:1: ( rule___Point__Group__0__Impl rule___Point__Group__1 )
            // InternalAIProjectGratext.g:319:2: rule___Point__Group__0__Impl rule___Point__Group__1
            {
            pushFollow(FOLLOW_6);
            rule___Point__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule___Point__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___Point__Group__0"


    // $ANTLR start "rule___Point__Group__0__Impl"
    // InternalAIProjectGratext.g:326:1: rule___Point__Group__0__Impl : ( () ) ;
    public final void rule___Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:330:1: ( ( () ) )
            // InternalAIProjectGratext.g:331:1: ( () )
            {
            // InternalAIProjectGratext.g:331:1: ( () )
            // InternalAIProjectGratext.g:332:2: ()
            {
             before(grammarAccess.get_PointAccess().get_PointAction_0()); 
            // InternalAIProjectGratext.g:333:2: ()
            // InternalAIProjectGratext.g:333:3: 
            {
            }

             after(grammarAccess.get_PointAccess().get_PointAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___Point__Group__0__Impl"


    // $ANTLR start "rule___Point__Group__1"
    // InternalAIProjectGratext.g:341:1: rule___Point__Group__1 : rule___Point__Group__1__Impl rule___Point__Group__2 ;
    public final void rule___Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:345:1: ( rule___Point__Group__1__Impl rule___Point__Group__2 )
            // InternalAIProjectGratext.g:346:2: rule___Point__Group__1__Impl rule___Point__Group__2
            {
            pushFollow(FOLLOW_7);
            rule___Point__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule___Point__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___Point__Group__1"


    // $ANTLR start "rule___Point__Group__1__Impl"
    // InternalAIProjectGratext.g:353:1: rule___Point__Group__1__Impl : ( '(' ) ;
    public final void rule___Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:357:1: ( ( '(' ) )
            // InternalAIProjectGratext.g:358:1: ( '(' )
            {
            // InternalAIProjectGratext.g:358:1: ( '(' )
            // InternalAIProjectGratext.g:359:2: '('
            {
             before(grammarAccess.get_PointAccess().getLeftParenthesisKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.get_PointAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___Point__Group__1__Impl"


    // $ANTLR start "rule___Point__Group__2"
    // InternalAIProjectGratext.g:368:1: rule___Point__Group__2 : rule___Point__Group__2__Impl rule___Point__Group__3 ;
    public final void rule___Point__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:372:1: ( rule___Point__Group__2__Impl rule___Point__Group__3 )
            // InternalAIProjectGratext.g:373:2: rule___Point__Group__2__Impl rule___Point__Group__3
            {
            pushFollow(FOLLOW_8);
            rule___Point__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule___Point__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___Point__Group__2"


    // $ANTLR start "rule___Point__Group__2__Impl"
    // InternalAIProjectGratext.g:380:1: rule___Point__Group__2__Impl : ( ( rule___Point__XAssignment_2 ) ) ;
    public final void rule___Point__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:384:1: ( ( ( rule___Point__XAssignment_2 ) ) )
            // InternalAIProjectGratext.g:385:1: ( ( rule___Point__XAssignment_2 ) )
            {
            // InternalAIProjectGratext.g:385:1: ( ( rule___Point__XAssignment_2 ) )
            // InternalAIProjectGratext.g:386:2: ( rule___Point__XAssignment_2 )
            {
             before(grammarAccess.get_PointAccess().getXAssignment_2()); 
            // InternalAIProjectGratext.g:387:2: ( rule___Point__XAssignment_2 )
            // InternalAIProjectGratext.g:387:3: rule___Point__XAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule___Point__XAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.get_PointAccess().getXAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___Point__Group__2__Impl"


    // $ANTLR start "rule___Point__Group__3"
    // InternalAIProjectGratext.g:395:1: rule___Point__Group__3 : rule___Point__Group__3__Impl rule___Point__Group__4 ;
    public final void rule___Point__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:399:1: ( rule___Point__Group__3__Impl rule___Point__Group__4 )
            // InternalAIProjectGratext.g:400:2: rule___Point__Group__3__Impl rule___Point__Group__4
            {
            pushFollow(FOLLOW_7);
            rule___Point__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule___Point__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___Point__Group__3"


    // $ANTLR start "rule___Point__Group__3__Impl"
    // InternalAIProjectGratext.g:407:1: rule___Point__Group__3__Impl : ( ',' ) ;
    public final void rule___Point__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:411:1: ( ( ',' ) )
            // InternalAIProjectGratext.g:412:1: ( ',' )
            {
            // InternalAIProjectGratext.g:412:1: ( ',' )
            // InternalAIProjectGratext.g:413:2: ','
            {
             before(grammarAccess.get_PointAccess().getCommaKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.get_PointAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___Point__Group__3__Impl"


    // $ANTLR start "rule___Point__Group__4"
    // InternalAIProjectGratext.g:422:1: rule___Point__Group__4 : rule___Point__Group__4__Impl rule___Point__Group__5 ;
    public final void rule___Point__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:426:1: ( rule___Point__Group__4__Impl rule___Point__Group__5 )
            // InternalAIProjectGratext.g:427:2: rule___Point__Group__4__Impl rule___Point__Group__5
            {
            pushFollow(FOLLOW_9);
            rule___Point__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule___Point__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___Point__Group__4"


    // $ANTLR start "rule___Point__Group__4__Impl"
    // InternalAIProjectGratext.g:434:1: rule___Point__Group__4__Impl : ( ( rule___Point__YAssignment_4 ) ) ;
    public final void rule___Point__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:438:1: ( ( ( rule___Point__YAssignment_4 ) ) )
            // InternalAIProjectGratext.g:439:1: ( ( rule___Point__YAssignment_4 ) )
            {
            // InternalAIProjectGratext.g:439:1: ( ( rule___Point__YAssignment_4 ) )
            // InternalAIProjectGratext.g:440:2: ( rule___Point__YAssignment_4 )
            {
             before(grammarAccess.get_PointAccess().getYAssignment_4()); 
            // InternalAIProjectGratext.g:441:2: ( rule___Point__YAssignment_4 )
            // InternalAIProjectGratext.g:441:3: rule___Point__YAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule___Point__YAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.get_PointAccess().getYAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___Point__Group__4__Impl"


    // $ANTLR start "rule___Point__Group__5"
    // InternalAIProjectGratext.g:449:1: rule___Point__Group__5 : rule___Point__Group__5__Impl ;
    public final void rule___Point__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:453:1: ( rule___Point__Group__5__Impl )
            // InternalAIProjectGratext.g:454:2: rule___Point__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule___Point__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___Point__Group__5"


    // $ANTLR start "rule___Point__Group__5__Impl"
    // InternalAIProjectGratext.g:460:1: rule___Point__Group__5__Impl : ( ')' ) ;
    public final void rule___Point__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:464:1: ( ( ')' ) )
            // InternalAIProjectGratext.g:465:1: ( ')' )
            {
            // InternalAIProjectGratext.g:465:1: ( ')' )
            // InternalAIProjectGratext.g:466:2: ')'
            {
             before(grammarAccess.get_PointAccess().getRightParenthesisKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.get_PointAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___Point__Group__5__Impl"


    // $ANTLR start "rule___EInt__Group__0"
    // InternalAIProjectGratext.g:476:1: rule___EInt__Group__0 : rule___EInt__Group__0__Impl rule___EInt__Group__1 ;
    public final void rule___EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:480:1: ( rule___EInt__Group__0__Impl rule___EInt__Group__1 )
            // InternalAIProjectGratext.g:481:2: rule___EInt__Group__0__Impl rule___EInt__Group__1
            {
            pushFollow(FOLLOW_7);
            rule___EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule___EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___EInt__Group__0"


    // $ANTLR start "rule___EInt__Group__0__Impl"
    // InternalAIProjectGratext.g:488:1: rule___EInt__Group__0__Impl : ( ( RULE__SIGN )? ) ;
    public final void rule___EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:492:1: ( ( ( RULE__SIGN )? ) )
            // InternalAIProjectGratext.g:493:1: ( ( RULE__SIGN )? )
            {
            // InternalAIProjectGratext.g:493:1: ( ( RULE__SIGN )? )
            // InternalAIProjectGratext.g:494:2: ( RULE__SIGN )?
            {
             before(grammarAccess.get_EIntAccess().get_SIGNTerminalRuleCall_0()); 
            // InternalAIProjectGratext.g:495:2: ( RULE__SIGN )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE__SIGN) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAIProjectGratext.g:495:3: RULE__SIGN
                    {
                    match(input,RULE__SIGN,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.get_EIntAccess().get_SIGNTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___EInt__Group__0__Impl"


    // $ANTLR start "rule___EInt__Group__1"
    // InternalAIProjectGratext.g:503:1: rule___EInt__Group__1 : rule___EInt__Group__1__Impl ;
    public final void rule___EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:507:1: ( rule___EInt__Group__1__Impl )
            // InternalAIProjectGratext.g:508:2: rule___EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule___EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___EInt__Group__1"


    // $ANTLR start "rule___EInt__Group__1__Impl"
    // InternalAIProjectGratext.g:514:1: rule___EInt__Group__1__Impl : ( RULE__INT ) ;
    public final void rule___EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:518:1: ( ( RULE__INT ) )
            // InternalAIProjectGratext.g:519:1: ( RULE__INT )
            {
            // InternalAIProjectGratext.g:519:1: ( RULE__INT )
            // InternalAIProjectGratext.g:520:2: RULE__INT
            {
             before(grammarAccess.get_EIntAccess().get_INTTerminalRuleCall_1()); 
            match(input,RULE__INT,FOLLOW_2); 
             after(grammarAccess.get_EIntAccess().get_INTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___EInt__Group__1__Impl"


    // $ANTLR start "rule__AIProject__IdAssignment_2"
    // InternalAIProjectGratext.g:530:1: rule__AIProject__IdAssignment_2 : ( RULE__ID ) ;
    public final void rule__AIProject__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:534:1: ( ( RULE__ID ) )
            // InternalAIProjectGratext.g:535:2: ( RULE__ID )
            {
            // InternalAIProjectGratext.g:535:2: ( RULE__ID )
            // InternalAIProjectGratext.g:536:3: RULE__ID
            {
             before(grammarAccess.getAIProjectAccess().getId_IDTerminalRuleCall_2_0()); 
            match(input,RULE__ID,FOLLOW_2); 
             after(grammarAccess.getAIProjectAccess().getId_IDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AIProject__IdAssignment_2"


    // $ANTLR start "rule___Point__XAssignment_2"
    // InternalAIProjectGratext.g:545:1: rule___Point__XAssignment_2 : ( rule_EInt ) ;
    public final void rule___Point__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:549:1: ( ( rule_EInt ) )
            // InternalAIProjectGratext.g:550:2: ( rule_EInt )
            {
            // InternalAIProjectGratext.g:550:2: ( rule_EInt )
            // InternalAIProjectGratext.g:551:3: rule_EInt
            {
             before(grammarAccess.get_PointAccess().getX_EIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rule_EInt();

            state._fsp--;

             after(grammarAccess.get_PointAccess().getX_EIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___Point__XAssignment_2"


    // $ANTLR start "rule___Point__YAssignment_4"
    // InternalAIProjectGratext.g:560:1: rule___Point__YAssignment_4 : ( rule_EInt ) ;
    public final void rule___Point__YAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAIProjectGratext.g:564:1: ( ( rule_EInt ) )
            // InternalAIProjectGratext.g:565:2: ( rule_EInt )
            {
            // InternalAIProjectGratext.g:565:2: ( rule_EInt )
            // InternalAIProjectGratext.g:566:3: rule_EInt
            {
             before(grammarAccess.get_PointAccess().getY_EIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rule_EInt();

            state._fsp--;

             after(grammarAccess.get_PointAccess().getY_EIntParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___Point__YAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});

}