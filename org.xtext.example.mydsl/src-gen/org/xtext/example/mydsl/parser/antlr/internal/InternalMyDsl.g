/*
 * generated by Xtext 2.9.0.rc2
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getActionsActionsParserRuleCall_0());
			}
			lv_actions_0_0=ruleActions
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"actions",
					lv_actions_0_0,
					"org.xtext.example.mydsl.MyDsl.Actions");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleActions
entryRuleActions returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionsRule()); }
	iv_ruleActions=ruleActions
	{ $current=$iv_ruleActions.current; }
	EOF;

// Rule Actions
ruleActions returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getActionsAccess().getInputParserRuleCall_0());
		}
		this_Input_0=ruleInput
		{
			$current = $this_Input_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionsAccess().getOutputParserRuleCall_1());
		}
		this_Output_1=ruleOutput
		{
			$current = $this_Output_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleOutput
entryRuleOutput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOutputRule()); }
	iv_ruleOutput=ruleOutput
	{ $current=$iv_ruleOutput.current; }
	EOF;

// Rule Output
ruleOutput returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='output'
		{
			newLeafNode(otherlv_0, grammarAccess.getOutputAccess().getOutputKeyword_0());
		}
		(
			(
				lv_segment_1_0=RULE_STRING
				{
					newLeafNode(lv_segment_1_0, grammarAccess.getOutputAccess().getSegmentSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOutputRule());
					}
					setWithLastConsumed(
						$current,
						"segment",
						lv_segment_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2='to'
		{
			newLeafNode(otherlv_2, grammarAccess.getOutputAccess().getToKeyword_2());
		}
		(
			(
				lv_value_3_0=RULE_STRING
				{
					newLeafNode(lv_value_3_0, grammarAccess.getOutputAccess().getValueSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOutputRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleInput
entryRuleInput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInputRule()); }
	iv_ruleInput=ruleInput
	{ $current=$iv_ruleInput.current; }
	EOF;

// Rule Input
ruleInput returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='input'
		{
			newLeafNode(otherlv_0, grammarAccess.getInputAccess().getInputKeyword_0());
		}
		(
			(
				lv_lastName_1_0=RULE_STRING
				{
					newLeafNode(lv_lastName_1_0, grammarAccess.getInputAccess().getLastNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInputRule());
					}
					setWithLastConsumed(
						$current,
						"lastName",
						lv_lastName_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2='as'
		{
			newLeafNode(otherlv_2, grammarAccess.getInputAccess().getAsKeyword_2());
		}
		(
			(
				lv_value_3_0=RULE_STRING
				{
					newLeafNode(lv_value_3_0, grammarAccess.getInputAccess().getValueSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInputRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
