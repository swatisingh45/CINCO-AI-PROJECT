package info.scce.cinco.product.aiProject.gratext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAIProjectGratextLexer extends Lexer {
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

    public InternalAIProjectGratextLexer() {;} 
    public InternalAIProjectGratextLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAIProjectGratextLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalAIProjectGratext.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAIProjectGratext.g:11:7: ( 'AIProject' )
            // InternalAIProjectGratext.g:11:9: 'AIProject'
            {
            match("AIProject"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAIProjectGratext.g:12:7: ( '{' )
            // InternalAIProjectGratext.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAIProjectGratext.g:13:7: ( '}' )
            // InternalAIProjectGratext.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAIProjectGratext.g:14:7: ( '(' )
            // InternalAIProjectGratext.g:14:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAIProjectGratext.g:15:7: ( ',' )
            // InternalAIProjectGratext.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAIProjectGratext.g:16:7: ( ')' )
            // InternalAIProjectGratext.g:16:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "RULE__ID"
    public final void mRULE__ID() throws RecognitionException {
        try {
            int _type = RULE__ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAIProjectGratext.g:256:10: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )* )
            // InternalAIProjectGratext.g:256:12: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            {
            // InternalAIProjectGratext.g:256:12: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAIProjectGratext.g:256:12: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAIProjectGratext.g:256:41: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='-'||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAIProjectGratext.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE__ID"

    // $ANTLR start "RULE__SIGN"
    public final void mRULE__SIGN() throws RecognitionException {
        try {
            int _type = RULE__SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAIProjectGratext.g:258:12: ( ( '+' | '-' ) )
            // InternalAIProjectGratext.g:258:14: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE__SIGN"

    // $ANTLR start "RULE__INT"
    public final void mRULE__INT() throws RecognitionException {
        try {
            int _type = RULE__INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAIProjectGratext.g:260:11: ( ( '0' .. '9' )+ )
            // InternalAIProjectGratext.g:260:13: ( '0' .. '9' )+
            {
            // InternalAIProjectGratext.g:260:13: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAIProjectGratext.g:260:14: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE__INT"

    // $ANTLR start "RULE__STRING"
    public final void mRULE__STRING() throws RecognitionException {
        try {
            int _type = RULE__STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAIProjectGratext.g:262:14: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalAIProjectGratext.g:262:16: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalAIProjectGratext.g:262:16: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAIProjectGratext.g:262:17: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalAIProjectGratext.g:262:21: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalAIProjectGratext.g:262:22: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAIProjectGratext.g:262:29: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalAIProjectGratext.g:262:49: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalAIProjectGratext.g:262:54: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalAIProjectGratext.g:262:55: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAIProjectGratext.g:262:62: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE__STRING"

    // $ANTLR start "RULE__ML_COMMENT"
    public final void mRULE__ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE__ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAIProjectGratext.g:264:18: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalAIProjectGratext.g:264:20: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalAIProjectGratext.g:264:25: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAIProjectGratext.g:264:53: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE__ML_COMMENT"

    // $ANTLR start "RULE__SL_COMMENT"
    public final void mRULE__SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE__SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAIProjectGratext.g:266:18: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalAIProjectGratext.g:266:20: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAIProjectGratext.g:266:25: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAIProjectGratext.g:266:25: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalAIProjectGratext.g:266:41: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAIProjectGratext.g:266:42: ( '\\r' )? '\\n'
                    {
                    // InternalAIProjectGratext.g:266:42: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalAIProjectGratext.g:266:42: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE__SL_COMMENT"

    // $ANTLR start "RULE__WS"
    public final void mRULE__WS() throws RecognitionException {
        try {
            int _type = RULE__WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAIProjectGratext.g:268:10: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAIProjectGratext.g:268:12: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAIProjectGratext.g:268:12: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAIProjectGratext.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE__WS"

    // $ANTLR start "RULE__ANY_OTHER"
    public final void mRULE__ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE__ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAIProjectGratext.g:270:17: ( . )
            // InternalAIProjectGratext.g:270:19: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE__ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalAIProjectGratext.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | RULE__ID | RULE__SIGN | RULE__INT | RULE__STRING | RULE__ML_COMMENT | RULE__SL_COMMENT | RULE__WS | RULE__ANY_OTHER )
        int alt12=14;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalAIProjectGratext.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalAIProjectGratext.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalAIProjectGratext.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalAIProjectGratext.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalAIProjectGratext.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalAIProjectGratext.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalAIProjectGratext.g:1:46: RULE__ID
                {
                mRULE__ID(); 

                }
                break;
            case 8 :
                // InternalAIProjectGratext.g:1:55: RULE__SIGN
                {
                mRULE__SIGN(); 

                }
                break;
            case 9 :
                // InternalAIProjectGratext.g:1:66: RULE__INT
                {
                mRULE__INT(); 

                }
                break;
            case 10 :
                // InternalAIProjectGratext.g:1:76: RULE__STRING
                {
                mRULE__STRING(); 

                }
                break;
            case 11 :
                // InternalAIProjectGratext.g:1:89: RULE__ML_COMMENT
                {
                mRULE__ML_COMMENT(); 

                }
                break;
            case 12 :
                // InternalAIProjectGratext.g:1:106: RULE__SL_COMMENT
                {
                mRULE__SL_COMMENT(); 

                }
                break;
            case 13 :
                // InternalAIProjectGratext.g:1:123: RULE__WS
                {
                mRULE__WS(); 

                }
                break;
            case 14 :
                // InternalAIProjectGratext.g:1:132: RULE__ANY_OTHER
                {
                mRULE__ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\21\5\uffff\1\17\3\uffff\3\17\2\uffff\1\21\14\uffff\6\21\1\44\1\uffff";
    static final String DFA12_eofS =
        "\45\uffff";
    static final String DFA12_minS =
        "\1\0\1\111\5\uffff\1\101\3\uffff\2\0\1\52\2\uffff\1\120\14\uffff\1\162\1\157\1\152\1\145\1\143\1\164\1\55\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\111\5\uffff\1\172\3\uffff\2\uffff\1\57\2\uffff\1\120\14\uffff\1\162\1\157\1\152\1\145\1\143\1\164\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10\1\11\3\uffff\1\15\1\16\1\uffff\1\7\1\2\1\3\1\4\1\5\1\6\1\10\1\11\1\12\1\13\1\14\1\15\7\uffff\1\1";
    static final String DFA12_specialS =
        "\1\1\12\uffff\1\0\1\2\30\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\17\2\16\2\17\1\16\22\17\1\16\1\17\1\13\4\17\1\14\1\4\1\6\1\17\1\11\1\5\1\11\1\17\1\15\12\12\7\17\1\1\31\10\3\17\1\7\1\10\1\17\32\10\1\2\1\17\1\3\uff82\17",
            "\1\20",
            "",
            "",
            "",
            "",
            "",
            "\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "",
            "",
            "\0\31",
            "\0\31",
            "\1\32\4\uffff\1\33",
            "",
            "",
            "\1\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\21\2\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | RULE__ID | RULE__SIGN | RULE__INT | RULE__STRING | RULE__ML_COMMENT | RULE__SL_COMMENT | RULE__WS | RULE__ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_11 = input.LA(1);

                        s = -1;
                        if ( ((LA12_11>='\u0000' && LA12_11<='\uFFFF')) ) {s = 25;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='A') ) {s = 1;}

                        else if ( (LA12_0=='{') ) {s = 2;}

                        else if ( (LA12_0=='}') ) {s = 3;}

                        else if ( (LA12_0=='(') ) {s = 4;}

                        else if ( (LA12_0==',') ) {s = 5;}

                        else if ( (LA12_0==')') ) {s = 6;}

                        else if ( (LA12_0=='^') ) {s = 7;}

                        else if ( ((LA12_0>='B' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {s = 8;}

                        else if ( (LA12_0=='+'||LA12_0=='-') ) {s = 9;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 10;}

                        else if ( (LA12_0=='\"') ) {s = 11;}

                        else if ( (LA12_0=='\'') ) {s = 12;}

                        else if ( (LA12_0=='/') ) {s = 13;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 14;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||LA12_0=='*'||LA12_0=='.'||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 15;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_12 = input.LA(1);

                        s = -1;
                        if ( ((LA12_12>='\u0000' && LA12_12<='\uFFFF')) ) {s = 25;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}