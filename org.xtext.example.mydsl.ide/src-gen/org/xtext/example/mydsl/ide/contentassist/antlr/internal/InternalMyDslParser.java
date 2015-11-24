package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'output'", "'to'", "'input'", "'as'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__ActionsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__ActionsAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__ActionsAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__ActionsAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Model__ActionsAssignment )*
            {
             before(grammarAccess.getModelAccess().getActionsAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__ActionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__ActionsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ActionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getActionsAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleActions"
    // InternalMyDsl.g:78:1: entryRuleActions : ruleActions EOF ;
    public final void entryRuleActions() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleActions EOF )
            // InternalMyDsl.g:80:1: ruleActions EOF
            {
             before(grammarAccess.getActionsRule()); 
            pushFollow(FOLLOW_1);
            ruleActions();

            state._fsp--;

             after(grammarAccess.getActionsRule()); 
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
    // $ANTLR end "entryRuleActions"


    // $ANTLR start "ruleActions"
    // InternalMyDsl.g:87:1: ruleActions : ( ( rule__Actions__Alternatives ) ) ;
    public final void ruleActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Actions__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Actions__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Actions__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Actions__Alternatives )
            {
             before(grammarAccess.getActionsAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Actions__Alternatives )
            // InternalMyDsl.g:94:4: rule__Actions__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Actions__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleActions"


    // $ANTLR start "entryRuleOutput"
    // InternalMyDsl.g:103:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleOutput EOF )
            // InternalMyDsl.g:105:1: ruleOutput EOF
            {
             before(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getOutputRule()); 
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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalMyDsl.g:112:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Output__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Output__Group__0 )
            // InternalMyDsl.g:119:4: rule__Output__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getGroup()); 

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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleInput"
    // InternalMyDsl.g:128:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleInput EOF )
            // InternalMyDsl.g:130:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalMyDsl.g:137:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Input__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Input__Group__0 )
            // InternalMyDsl.g:144:4: rule__Input__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

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
    // $ANTLR end "ruleInput"


    // $ANTLR start "rule__Actions__Alternatives"
    // InternalMyDsl.g:152:1: rule__Actions__Alternatives : ( ( ruleInput ) | ( ruleOutput ) );
    public final void rule__Actions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:156:1: ( ( ruleInput ) | ( ruleOutput ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:157:2: ( ruleInput )
                    {
                    // InternalMyDsl.g:157:2: ( ruleInput )
                    // InternalMyDsl.g:158:3: ruleInput
                    {
                     before(grammarAccess.getActionsAccess().getInputParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInput();

                    state._fsp--;

                     after(grammarAccess.getActionsAccess().getInputParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:163:2: ( ruleOutput )
                    {
                    // InternalMyDsl.g:163:2: ( ruleOutput )
                    // InternalMyDsl.g:164:3: ruleOutput
                    {
                     before(grammarAccess.getActionsAccess().getOutputParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOutput();

                    state._fsp--;

                     after(grammarAccess.getActionsAccess().getOutputParserRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Actions__Alternatives"


    // $ANTLR start "rule__Output__Group__0"
    // InternalMyDsl.g:173:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:177:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalMyDsl.g:178:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Output__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__1();

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
    // $ANTLR end "rule__Output__Group__0"


    // $ANTLR start "rule__Output__Group__0__Impl"
    // InternalMyDsl.g:185:1: rule__Output__Group__0__Impl : ( 'output' ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:189:1: ( ( 'output' ) )
            // InternalMyDsl.g:190:1: ( 'output' )
            {
            // InternalMyDsl.g:190:1: ( 'output' )
            // InternalMyDsl.g:191:2: 'output'
            {
             before(grammarAccess.getOutputAccess().getOutputKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getOutputKeyword_0()); 

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
    // $ANTLR end "rule__Output__Group__0__Impl"


    // $ANTLR start "rule__Output__Group__1"
    // InternalMyDsl.g:200:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:204:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalMyDsl.g:205:2: rule__Output__Group__1__Impl rule__Output__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Output__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__2();

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
    // $ANTLR end "rule__Output__Group__1"


    // $ANTLR start "rule__Output__Group__1__Impl"
    // InternalMyDsl.g:212:1: rule__Output__Group__1__Impl : ( ( rule__Output__SegmentAssignment_1 ) ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:1: ( ( ( rule__Output__SegmentAssignment_1 ) ) )
            // InternalMyDsl.g:217:1: ( ( rule__Output__SegmentAssignment_1 ) )
            {
            // InternalMyDsl.g:217:1: ( ( rule__Output__SegmentAssignment_1 ) )
            // InternalMyDsl.g:218:2: ( rule__Output__SegmentAssignment_1 )
            {
             before(grammarAccess.getOutputAccess().getSegmentAssignment_1()); 
            // InternalMyDsl.g:219:2: ( rule__Output__SegmentAssignment_1 )
            // InternalMyDsl.g:219:3: rule__Output__SegmentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Output__SegmentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getSegmentAssignment_1()); 

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
    // $ANTLR end "rule__Output__Group__1__Impl"


    // $ANTLR start "rule__Output__Group__2"
    // InternalMyDsl.g:227:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:231:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalMyDsl.g:232:2: rule__Output__Group__2__Impl rule__Output__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Output__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__3();

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
    // $ANTLR end "rule__Output__Group__2"


    // $ANTLR start "rule__Output__Group__2__Impl"
    // InternalMyDsl.g:239:1: rule__Output__Group__2__Impl : ( 'to' ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:243:1: ( ( 'to' ) )
            // InternalMyDsl.g:244:1: ( 'to' )
            {
            // InternalMyDsl.g:244:1: ( 'to' )
            // InternalMyDsl.g:245:2: 'to'
            {
             before(grammarAccess.getOutputAccess().getToKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getToKeyword_2()); 

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
    // $ANTLR end "rule__Output__Group__2__Impl"


    // $ANTLR start "rule__Output__Group__3"
    // InternalMyDsl.g:254:1: rule__Output__Group__3 : rule__Output__Group__3__Impl ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:258:1: ( rule__Output__Group__3__Impl )
            // InternalMyDsl.g:259:2: rule__Output__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__3__Impl();

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
    // $ANTLR end "rule__Output__Group__3"


    // $ANTLR start "rule__Output__Group__3__Impl"
    // InternalMyDsl.g:265:1: rule__Output__Group__3__Impl : ( ( rule__Output__ValueAssignment_3 ) ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:269:1: ( ( ( rule__Output__ValueAssignment_3 ) ) )
            // InternalMyDsl.g:270:1: ( ( rule__Output__ValueAssignment_3 ) )
            {
            // InternalMyDsl.g:270:1: ( ( rule__Output__ValueAssignment_3 ) )
            // InternalMyDsl.g:271:2: ( rule__Output__ValueAssignment_3 )
            {
             before(grammarAccess.getOutputAccess().getValueAssignment_3()); 
            // InternalMyDsl.g:272:2: ( rule__Output__ValueAssignment_3 )
            // InternalMyDsl.g:272:3: rule__Output__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Output__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__Output__Group__3__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // InternalMyDsl.g:281:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:285:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalMyDsl.g:286:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__1();

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
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // InternalMyDsl.g:293:1: rule__Input__Group__0__Impl : ( 'input' ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:297:1: ( ( 'input' ) )
            // InternalMyDsl.g:298:1: ( 'input' )
            {
            // InternalMyDsl.g:298:1: ( 'input' )
            // InternalMyDsl.g:299:2: 'input'
            {
             before(grammarAccess.getInputAccess().getInputKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getInputKeyword_0()); 

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
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // InternalMyDsl.g:308:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:312:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalMyDsl.g:313:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__2();

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
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // InternalMyDsl.g:320:1: rule__Input__Group__1__Impl : ( ( rule__Input__LastNameAssignment_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:324:1: ( ( ( rule__Input__LastNameAssignment_1 ) ) )
            // InternalMyDsl.g:325:1: ( ( rule__Input__LastNameAssignment_1 ) )
            {
            // InternalMyDsl.g:325:1: ( ( rule__Input__LastNameAssignment_1 ) )
            // InternalMyDsl.g:326:2: ( rule__Input__LastNameAssignment_1 )
            {
             before(grammarAccess.getInputAccess().getLastNameAssignment_1()); 
            // InternalMyDsl.g:327:2: ( rule__Input__LastNameAssignment_1 )
            // InternalMyDsl.g:327:3: rule__Input__LastNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Input__LastNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getLastNameAssignment_1()); 

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
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group__2"
    // InternalMyDsl.g:335:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:339:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalMyDsl.g:340:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Input__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__3();

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
    // $ANTLR end "rule__Input__Group__2"


    // $ANTLR start "rule__Input__Group__2__Impl"
    // InternalMyDsl.g:347:1: rule__Input__Group__2__Impl : ( 'as' ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:351:1: ( ( 'as' ) )
            // InternalMyDsl.g:352:1: ( 'as' )
            {
            // InternalMyDsl.g:352:1: ( 'as' )
            // InternalMyDsl.g:353:2: 'as'
            {
             before(grammarAccess.getInputAccess().getAsKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getAsKeyword_2()); 

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
    // $ANTLR end "rule__Input__Group__2__Impl"


    // $ANTLR start "rule__Input__Group__3"
    // InternalMyDsl.g:362:1: rule__Input__Group__3 : rule__Input__Group__3__Impl ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:1: ( rule__Input__Group__3__Impl )
            // InternalMyDsl.g:367:2: rule__Input__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__3__Impl();

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
    // $ANTLR end "rule__Input__Group__3"


    // $ANTLR start "rule__Input__Group__3__Impl"
    // InternalMyDsl.g:373:1: rule__Input__Group__3__Impl : ( ( rule__Input__ValueAssignment_3 ) ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:377:1: ( ( ( rule__Input__ValueAssignment_3 ) ) )
            // InternalMyDsl.g:378:1: ( ( rule__Input__ValueAssignment_3 ) )
            {
            // InternalMyDsl.g:378:1: ( ( rule__Input__ValueAssignment_3 ) )
            // InternalMyDsl.g:379:2: ( rule__Input__ValueAssignment_3 )
            {
             before(grammarAccess.getInputAccess().getValueAssignment_3()); 
            // InternalMyDsl.g:380:2: ( rule__Input__ValueAssignment_3 )
            // InternalMyDsl.g:380:3: rule__Input__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Input__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__Input__Group__3__Impl"


    // $ANTLR start "rule__Model__ActionsAssignment"
    // InternalMyDsl.g:389:1: rule__Model__ActionsAssignment : ( ruleActions ) ;
    public final void rule__Model__ActionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:393:1: ( ( ruleActions ) )
            // InternalMyDsl.g:394:2: ( ruleActions )
            {
            // InternalMyDsl.g:394:2: ( ruleActions )
            // InternalMyDsl.g:395:3: ruleActions
            {
             before(grammarAccess.getModelAccess().getActionsActionsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleActions();

            state._fsp--;

             after(grammarAccess.getModelAccess().getActionsActionsParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__ActionsAssignment"


    // $ANTLR start "rule__Output__SegmentAssignment_1"
    // InternalMyDsl.g:404:1: rule__Output__SegmentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Output__SegmentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:408:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:409:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:409:2: ( RULE_STRING )
            // InternalMyDsl.g:410:3: RULE_STRING
            {
             before(grammarAccess.getOutputAccess().getSegmentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getSegmentSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Output__SegmentAssignment_1"


    // $ANTLR start "rule__Output__ValueAssignment_3"
    // InternalMyDsl.g:419:1: rule__Output__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Output__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:423:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:424:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:424:2: ( RULE_STRING )
            // InternalMyDsl.g:425:3: RULE_STRING
            {
             before(grammarAccess.getOutputAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getValueSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Output__ValueAssignment_3"


    // $ANTLR start "rule__Input__LastNameAssignment_1"
    // InternalMyDsl.g:434:1: rule__Input__LastNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Input__LastNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:438:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:439:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:439:2: ( RULE_STRING )
            // InternalMyDsl.g:440:3: RULE_STRING
            {
             before(grammarAccess.getInputAccess().getLastNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getLastNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Input__LastNameAssignment_1"


    // $ANTLR start "rule__Input__ValueAssignment_3"
    // InternalMyDsl.g:449:1: rule__Input__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Input__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:453:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:454:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:454:2: ( RULE_STRING )
            // InternalMyDsl.g:455:3: RULE_STRING
            {
             before(grammarAccess.getInputAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getValueSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Input__ValueAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});

}