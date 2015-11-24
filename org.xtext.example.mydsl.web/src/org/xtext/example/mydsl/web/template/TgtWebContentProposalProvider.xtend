package org.xtext.example.mydsl.web.template

import com.google.inject.Inject
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider
import org.xtext.example.mydsl.services.MyDslGrammarAccess
import org.eclipse.xtext.AbstractElement
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor
import org.eclipse.xtext.impl.RuleCallImpl

class TgtWebContentProposalProvider extends IdeContentProposalProvider {
	
	@Inject extension MyDslGrammarAccess
	@Inject extension TgtTemplateProposalProvider
	
	override protected createProposals(AbstractElement assignment, ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		switch (assignment){
			case inputAccess.inputKeyword_0: {
				createInputTemplateProposals(context,acceptor)
			}
			
			case outputAccess.outputKeyword_0: {
				createOutputTemplateProposals(context,acceptor)
			}
			
			default: super.createProposals(assignment, context, acceptor)
		}
		
		
	}
	
}