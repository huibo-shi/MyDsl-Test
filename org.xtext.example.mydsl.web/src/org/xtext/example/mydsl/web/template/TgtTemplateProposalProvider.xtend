package org.xtext.example.mydsl.web.template

import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistEntry;
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor;
import org.eclipse.xtext.util.TextRegion;

class TgtTemplateProposalProvider {
	protected static final int TEMPLATE_PRIORITY = 100
	
	def void createInputTemplateProposals(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		if ("input".startsWith(context.getPrefix())) {
			acceptor.accept(createInputTemplate(context), TEMPLATE_PRIORITY)
		}
	}
	
	def createInputTemplate(ContentAssistContext context) {
		var ContentAssistEntry entry = new ContentAssistEntry()
		entry.setLabel("input")
		entry.setDescription("input action")
		var String template = '''input ${lastname} as ${value}'''
		createProposal(template, entry, context)
		return entry
	}
	
	def void createOutputTemplateProposals(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		if ("output".startsWith(context.getPrefix())) {
			acceptor.accept(createOutputTemplate(context), TEMPLATE_PRIORITY)
		}
	}
	
	def createOutputTemplate(ContentAssistContext context) {
		var ContentAssistEntry entry = new ContentAssistEntry()
		entry.setLabel("output")
		entry.setDescription("output action")
		var String template = '''output ${segment} to ${value}'''
		createProposal(template, entry, context)
		return entry
	}

	def void createStatementTemplateProposals(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		if ("if".startsWith(context.getPrefix())) {
			acceptor.accept(createIfBlockTemplate(context), TEMPLATE_PRIORITY)
			acceptor.accept(createIfElseBlockTemplate(context), TEMPLATE_PRIORITY)
		}
		if ("forEach".startsWith(context.getPrefix())) {
			acceptor.accept(createForEachLoopArrayTemplate(context), TEMPLATE_PRIORITY)
		}
	}

	def void createSelectorTemplateProposals(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		if (".forEach".startsWith(context.getPrefix())) {
			acceptor.accept(createForEachLoopTemplate(context), TEMPLATE_PRIORITY)
			acceptor.accept(createForEachLoopFunctionTemplate(context), TEMPLATE_PRIORITY)
		}
	}

	def void createLiteralTemplateProposals(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		acceptor.accept(createKeyValueTemplate(context), TEMPLATE_PRIORITY)
		acceptor.accept(createArrayLiteralTemplate(context), TEMPLATE_PRIORITY)
	}

	def protected ContentAssistEntry createIfBlockTemplate(ContentAssistContext context) {
		var ContentAssistEntry entry = new ContentAssistEntry()
		entry.setLabel("if")
		entry.setDescription("if-block")
		var String template = '''if (${condition}) {
	${}
}'''
		createProposal(template, entry, context)
		return entry
	}

	def protected ContentAssistEntry createIfElseBlockTemplate(ContentAssistContext context) {
		var ContentAssistEntry entry = new ContentAssistEntry()
		entry.setLabel("if")
		entry.setDescription("if-else-block with compare")
		var String template = '''if ((${expression1} == ${value1}) || (${expression2} == ${value2})) {
	${if_statements}
} else {
	${else_statements}
}'''
		createProposal(template, entry, context)
		return entry
	}

	def protected ContentAssistEntry createForEachLoopArrayTemplate(ContentAssistContext context) {
		var ContentAssistEntry entry = new ContentAssistEntry()
		entry.setLabel("forEach")
		entry.setDescription("forEach-loop over array")
		var String template = '''${array}.forEach(function(${element}, ${index}) {
	${}
});'''
		createProposal(template, entry, context)
		return entry
	}

	def protected ContentAssistEntry createForEachLoopTemplate(ContentAssistContext context) {
		var ContentAssistEntry entry = new ContentAssistEntry()
		entry.setLabel(".forEach")
		entry.setDescription("forEach-loop over array")
		var String template = '''.forEach(function(${element}, ${index}) {
	${}
});'''
		createProposal(template, entry, context)
		return entry
	}

	def protected ContentAssistEntry createForEachLoopFunctionTemplate(ContentAssistContext context) {
		var ContentAssistEntry entry = new ContentAssistEntry()
		entry.setLabel(".forEach(function(value, key) {")
		entry.setDescription("forEach-loop over JSON")
		var String template = '''.forEach(function(${value}, ${key}) {
	${}
});'''
		createProposal(template, entry, context)
		return entry
	}

	def protected ContentAssistEntry createKeyValueTemplate(ContentAssistContext context) {
		var ContentAssistEntry entry = new ContentAssistEntry()
		entry.setLabel("{key: value}")
		entry.setDescription("key-value pairs (JSON)")
		var String template = '''{
	${key1}: ${value1},
	${key2}: ${value2}
}'''
		createProposal(template, entry, context)
		return entry
	}

	def protected ContentAssistEntry createArrayLiteralTemplate(ContentAssistContext context) {
		var ContentAssistEntry entry = new ContentAssistEntry()
		entry.setLabel("[entry1, entry2]")
		entry.setDescription("list (array)")
		var String template = "[${entry1}, ${entry2}]"
		createProposal(template, entry, context)
		return entry
	}

	def protected void createProposal(String template, ContentAssistEntry entry, ContentAssistContext context) {
		// TODO fix indentation for multi-line templates
		var StringBuilder proposal = new StringBuilder()
		for (var int i = 0; i < template.length(); i++) {
			var char c = (template.charAt(i)) as char
			if (c === Character.valueOf('$').charValue && i + 1 < template.length()) {
				var char startChar = (template.charAt(i + 1)) as char
				if (startChar === Character.valueOf('$').charValue) {
					proposal.append(Character.valueOf('$').charValue)
					i++
				} else if (startChar === Character.valueOf('{').charValue) {
					var int varStart = i + 2
					for (i = varStart; i < template.length() &&
						template.charAt(i) !== Character.valueOf('}').charValue; i++) {
					}
					var String variable = template.substring(varStart, i)
					var int offset = context.getReplaceRegion().getOffset() + proposal.length()
					if (variable.length() === 0) {
						entry.setEscapePosition(offset)
					} else {
						entry.getEditPositions().add(new TextRegion(offset, variable.length()))
						proposal.append(variable)
					}
				}
			} else {
				proposal.append(c)
			}
		}
		entry.setProposal(proposal.toString())
		entry.setPrefix(context.getPrefix())
	}
}