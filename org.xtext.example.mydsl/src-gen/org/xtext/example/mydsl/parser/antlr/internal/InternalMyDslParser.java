package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_actions_0_0= ruleActions ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_actions_0_0= ruleActions ) )* )
            // InternalMyDsl.g:78:2: ( (lv_actions_0_0= ruleActions ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_actions_0_0= ruleActions ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_actions_0_0= ruleActions )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_actions_0_0= ruleActions )
            	    // InternalMyDsl.g:80:4: lv_actions_0_0= ruleActions
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getActionsActionsParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_actions_0_0=ruleActions();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"actions",
            	    					lv_actions_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Actions");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleActions"
    // InternalMyDsl.g:100:1: entryRuleActions returns [EObject current=null] : iv_ruleActions= ruleActions EOF ;
    public final EObject entryRuleActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActions = null;


        try {
            // InternalMyDsl.g:100:48: (iv_ruleActions= ruleActions EOF )
            // InternalMyDsl.g:101:2: iv_ruleActions= ruleActions EOF
            {
             newCompositeNode(grammarAccess.getActionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActions=ruleActions();

            state._fsp--;

             current =iv_ruleActions; 
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
    // $ANTLR end "entryRuleActions"


    // $ANTLR start "ruleActions"
    // InternalMyDsl.g:107:1: ruleActions returns [EObject current=null] : (this_Input_0= ruleInput | this_Output_1= ruleOutput ) ;
    public final EObject ruleActions() throws RecognitionException {
        EObject current = null;

        EObject this_Input_0 = null;

        EObject this_Output_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (this_Input_0= ruleInput | this_Output_1= ruleOutput ) )
            // InternalMyDsl.g:114:2: (this_Input_0= ruleInput | this_Output_1= ruleOutput )
            {
            // InternalMyDsl.g:114:2: (this_Input_0= ruleInput | this_Output_1= ruleOutput )
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
                    // InternalMyDsl.g:115:3: this_Input_0= ruleInput
                    {

                    			newCompositeNode(grammarAccess.getActionsAccess().getInputParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Input_0=ruleInput();

                    state._fsp--;


                    			current = this_Input_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:124:3: this_Output_1= ruleOutput
                    {

                    			newCompositeNode(grammarAccess.getActionsAccess().getOutputParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Output_1=ruleOutput();

                    state._fsp--;


                    			current = this_Output_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleActions"


    // $ANTLR start "entryRuleOutput"
    // InternalMyDsl.g:136:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalMyDsl.g:136:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalMyDsl.g:137:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalMyDsl.g:143:1: ruleOutput returns [EObject current=null] : (otherlv_0= 'output' ( (lv_segment_1_0= RULE_STRING ) ) otherlv_2= 'to' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_segment_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:149:2: ( (otherlv_0= 'output' ( (lv_segment_1_0= RULE_STRING ) ) otherlv_2= 'to' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:150:2: (otherlv_0= 'output' ( (lv_segment_1_0= RULE_STRING ) ) otherlv_2= 'to' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:150:2: (otherlv_0= 'output' ( (lv_segment_1_0= RULE_STRING ) ) otherlv_2= 'to' ( (lv_value_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:151:3: otherlv_0= 'output' ( (lv_segment_1_0= RULE_STRING ) ) otherlv_2= 'to' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputAccess().getOutputKeyword_0());
            		
            // InternalMyDsl.g:155:3: ( (lv_segment_1_0= RULE_STRING ) )
            // InternalMyDsl.g:156:4: (lv_segment_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:156:4: (lv_segment_1_0= RULE_STRING )
            // InternalMyDsl.g:157:5: lv_segment_1_0= RULE_STRING
            {
            lv_segment_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_segment_1_0, grammarAccess.getOutputAccess().getSegmentSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"segment",
            						lv_segment_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getOutputAccess().getToKeyword_2());
            		
            // InternalMyDsl.g:177:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalMyDsl.g:178:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:178:4: (lv_value_3_0= RULE_STRING )
            // InternalMyDsl.g:179:5: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getOutputAccess().getValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleInput"
    // InternalMyDsl.g:199:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalMyDsl.g:199:46: (iv_ruleInput= ruleInput EOF )
            // InternalMyDsl.g:200:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalMyDsl.g:206:1: ruleInput returns [EObject current=null] : (otherlv_0= 'input' ( (lv_lastName_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lastName_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:212:2: ( (otherlv_0= 'input' ( (lv_lastName_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:213:2: (otherlv_0= 'input' ( (lv_lastName_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:213:2: (otherlv_0= 'input' ( (lv_lastName_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_value_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:214:3: otherlv_0= 'input' ( (lv_lastName_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInputAccess().getInputKeyword_0());
            		
            // InternalMyDsl.g:218:3: ( (lv_lastName_1_0= RULE_STRING ) )
            // InternalMyDsl.g:219:4: (lv_lastName_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:219:4: (lv_lastName_1_0= RULE_STRING )
            // InternalMyDsl.g:220:5: lv_lastName_1_0= RULE_STRING
            {
            lv_lastName_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_lastName_1_0, grammarAccess.getInputAccess().getLastNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lastName",
            						lv_lastName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getInputAccess().getAsKeyword_2());
            		
            // InternalMyDsl.g:240:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalMyDsl.g:241:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:241:4: (lv_value_3_0= RULE_STRING )
            // InternalMyDsl.g:242:5: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getInputAccess().getValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


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
    // $ANTLR end "ruleInput"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});

}