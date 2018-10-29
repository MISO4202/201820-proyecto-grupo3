/*
 * generated by Xtext 2.12.0
 */
package org.xtext.blockchain.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.blockchain.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Operacion_ReturnKeyword_9_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_Operacion_ReturnKeyword_9_q = new TokenAlias(false, true, grammarAccess.getOperacionAccess().getReturnKeyword_9());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getEBooleanRule())
			return getEBooleanToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * EBoolean returns ecore::EBoolean:
	 * 	'true' | 'false';
	 */
	protected String getEBooleanToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "true";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Operacion_ReturnKeyword_9_q.equals(syntax))
				emit_Operacion_ReturnKeyword_9_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'return'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=EString '(' ')' '{' (ambiguity) '}' (rule end)
	 *     name=EString '(' ')' '{' (ambiguity) sentencia+=Sentencia
	 *     parametros+=Parametro ')' '{' (ambiguity) '}' (rule end)
	 *     parametros+=Parametro ')' '{' (ambiguity) sentencia+=Sentencia
	 *     retorno=[TipoDato|EString] '{' (ambiguity) '}' (rule end)
	 *     retorno=[TipoDato|EString] '{' (ambiguity) sentencia+=Sentencia
	 */
	protected void emit_Operacion_ReturnKeyword_9_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
