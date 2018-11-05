/*
 * generated by Xtext 2.12.0
 */
package uniandes.mdd.aplicacion.blockchain.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import uniandes.mdd.aplicacion.blockchain.ide.contentassist.antlr.internal.InternalBlockchainParser;
import uniandes.mdd.aplicacion.blockchain.services.BlockchainGrammarAccess;

public class BlockchainParser extends AbstractContentAssistParser {

	@Inject
	private BlockchainGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalBlockchainParser createParser() {
		InternalBlockchainParser result = new InternalBlockchainParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTipoDatoAccess().getAlternatives(), "rule__TipoDato__Alternatives");
					put(grammarAccess.getLineaAccess().getAlternatives(), "rule__Linea__Alternatives");
					put(grammarAccess.getExpresionAccess().getAlternatives(), "rule__Expresion__Alternatives");
					put(grammarAccess.getNamedElementAccess().getAlternatives(), "rule__NamedElement__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
					put(grammarAccess.getOperadorLogicoAccess().getAlternatives(), "rule__OperadorLogico__Alternatives");
					put(grammarAccess.getOperadorAccess().getAlternatives(), "rule__Operador__Alternatives");
					put(grammarAccess.getDatoPrimitivoAccess().getAlternatives(), "rule__DatoPrimitivo__Alternatives");
					put(grammarAccess.getAplicacionAccess().getGroup(), "rule__Aplicacion__Group__0");
					put(grammarAccess.getAplicacionAccess().getGroup_4(), "rule__Aplicacion__Group_4__0");
					put(grammarAccess.getAplicacionAccess().getGroup_5(), "rule__Aplicacion__Group_5__0");
					put(grammarAccess.getSmartContractAccess().getGroup(), "rule__SmartContract__Group__0");
					put(grammarAccess.getSmartContractAccess().getGroup_3(), "rule__SmartContract__Group_3__0");
					put(grammarAccess.getSmartContractAccess().getGroup_4(), "rule__SmartContract__Group_4__0");
					put(grammarAccess.getSmartContractAccess().getGroup_5(), "rule__SmartContract__Group_5__0");
					put(grammarAccess.getEntidadAccess().getGroup(), "rule__Entidad__Group__0");
					put(grammarAccess.getEntidadAccess().getGroup_4(), "rule__Entidad__Group_4__0");
					put(grammarAccess.getOperacionAccess().getGroup(), "rule__Operacion__Group__0");
					put(grammarAccess.getOperacionAccess().getGroup_1(), "rule__Operacion__Group_1__0");
					put(grammarAccess.getOperacionAccess().getGroup_4(), "rule__Operacion__Group_4__0");
					put(grammarAccess.getOperacionAccess().getGroup_4_1(), "rule__Operacion__Group_4_1__0");
					put(grammarAccess.getOperacionAccess().getGroup_6(), "rule__Operacion__Group_6__0");
					put(grammarAccess.getEstadoAccess().getGroup(), "rule__Estado__Group__0");
					put(grammarAccess.getAtributoAccess().getGroup(), "rule__Atributo__Group__0");
					put(grammarAccess.getParametroAccess().getGroup(), "rule__Parametro__Group__0");
					put(grammarAccess.getExpresionLogicaAccess().getGroup(), "rule__ExpresionLogica__Group__0");
					put(grammarAccess.getExpresionAritmeticaAccess().getGroup(), "rule__ExpresionAritmetica__Group__0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getCondicionalAccess().getGroup(), "rule__Condicional__Group__0");
					put(grammarAccess.getElseAccess().getGroup(), "rule__Else__Group__0");
					put(grammarAccess.getExpresionNumericaAccess().getGroup(), "rule__ExpresionNumerica__Group__0");
					put(grammarAccess.getExpresionTextoAccess().getGroup(), "rule__ExpresionTexto__Group__0");
					put(grammarAccess.getExpresionBooleanAccess().getGroup(), "rule__ExpresionBoolean__Group__0");
					put(grammarAccess.getExpresionReferenciadaAccess().getGroup(), "rule__ExpresionReferenciada__Group__0");
					put(grammarAccess.getExpresionReferenciadaAccess().getGroup_2(), "rule__ExpresionReferenciada__Group_2__0");
					put(grammarAccess.getExpresionRelacionalAccess().getGroup(), "rule__ExpresionRelacional__Group__0");
					put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
					put(grammarAccess.getEDoubleAccess().getGroup_4(), "rule__EDouble__Group_4__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getPrimitivoAccess().getGroup(), "rule__Primitivo__Group__0");
					put(grammarAccess.getMapaAccess().getGroup(), "rule__Mapa__Group__0");
					put(grammarAccess.getAplicacionAccess().getNameAssignment_2(), "rule__Aplicacion__NameAssignment_2");
					put(grammarAccess.getAplicacionAccess().getSmartcontractAssignment_4_0(), "rule__Aplicacion__SmartcontractAssignment_4_0");
					put(grammarAccess.getAplicacionAccess().getSmartcontractAssignment_4_1(), "rule__Aplicacion__SmartcontractAssignment_4_1");
					put(grammarAccess.getAplicacionAccess().getTipodatoAssignment_5_1(), "rule__Aplicacion__TipodatoAssignment_5_1");
					put(grammarAccess.getSmartContractAccess().getNameAssignment_1(), "rule__SmartContract__NameAssignment_1");
					put(grammarAccess.getSmartContractAccess().getEntidadesAssignment_3_0(), "rule__SmartContract__EntidadesAssignment_3_0");
					put(grammarAccess.getSmartContractAccess().getEntidadesAssignment_3_1(), "rule__SmartContract__EntidadesAssignment_3_1");
					put(grammarAccess.getSmartContractAccess().getEstadoAssignment_4_0(), "rule__SmartContract__EstadoAssignment_4_0");
					put(grammarAccess.getSmartContractAccess().getEstadoAssignment_4_1(), "rule__SmartContract__EstadoAssignment_4_1");
					put(grammarAccess.getSmartContractAccess().getOperacionesAssignment_5_0(), "rule__SmartContract__OperacionesAssignment_5_0");
					put(grammarAccess.getSmartContractAccess().getOperacionesAssignment_5_1(), "rule__SmartContract__OperacionesAssignment_5_1");
					put(grammarAccess.getEntidadAccess().getNameAssignment_2(), "rule__Entidad__NameAssignment_2");
					put(grammarAccess.getEntidadAccess().getAtributosAssignment_4_0(), "rule__Entidad__AtributosAssignment_4_0");
					put(grammarAccess.getEntidadAccess().getAtributosAssignment_4_1(), "rule__Entidad__AtributosAssignment_4_1");
					put(grammarAccess.getOperacionAccess().getEsUserDefinedAssignment_1_1(), "rule__Operacion__EsUserDefinedAssignment_1_1");
					put(grammarAccess.getOperacionAccess().getNameAssignment_2(), "rule__Operacion__NameAssignment_2");
					put(grammarAccess.getOperacionAccess().getParametrosAssignment_4_0(), "rule__Operacion__ParametrosAssignment_4_0");
					put(grammarAccess.getOperacionAccess().getParametrosAssignment_4_1_1(), "rule__Operacion__ParametrosAssignment_4_1_1");
					put(grammarAccess.getOperacionAccess().getRetornoAssignment_6_1(), "rule__Operacion__RetornoAssignment_6_1");
					put(grammarAccess.getOperacionAccess().getLineasAssignment_10(), "rule__Operacion__LineasAssignment_10");
					put(grammarAccess.getEstadoAccess().getTipodatoAssignment_1(), "rule__Estado__TipodatoAssignment_1");
					put(grammarAccess.getEstadoAccess().getNameAssignment_2(), "rule__Estado__NameAssignment_2");
					put(grammarAccess.getAtributoAccess().getTipodatoAssignment_0(), "rule__Atributo__TipodatoAssignment_0");
					put(grammarAccess.getAtributoAccess().getNameAssignment_1(), "rule__Atributo__NameAssignment_1");
					put(grammarAccess.getParametroAccess().getTipodatoAssignment_0(), "rule__Parametro__TipodatoAssignment_0");
					put(grammarAccess.getParametroAccess().getNameAssignment_1(), "rule__Parametro__NameAssignment_1");
					put(grammarAccess.getExpresionLogicaAccess().getIzqAssignment_2(), "rule__ExpresionLogica__IzqAssignment_2");
					put(grammarAccess.getExpresionLogicaAccess().getOperadorAssignment_4(), "rule__ExpresionLogica__OperadorAssignment_4");
					put(grammarAccess.getExpresionLogicaAccess().getDerAssignment_6(), "rule__ExpresionLogica__DerAssignment_6");
					put(grammarAccess.getExpresionAritmeticaAccess().getIzqAssignment_3(), "rule__ExpresionAritmetica__IzqAssignment_3");
					put(grammarAccess.getExpresionAritmeticaAccess().getOperadorAssignment_5(), "rule__ExpresionAritmetica__OperadorAssignment_5");
					put(grammarAccess.getExpresionAritmeticaAccess().getDerAssignment_7(), "rule__ExpresionAritmetica__DerAssignment_7");
					put(grammarAccess.getVariableAccess().getTipodatoAssignment_1(), "rule__Variable__TipodatoAssignment_1");
					put(grammarAccess.getVariableAccess().getNameAssignment_2(), "rule__Variable__NameAssignment_2");
					put(grammarAccess.getCondicionalAccess().getExpresionlogicaAssignment_2(), "rule__Condicional__ExpresionlogicaAssignment_2");
					put(grammarAccess.getCondicionalAccess().getValidadorAssignment_4(), "rule__Condicional__ValidadorAssignment_4");
					put(grammarAccess.getElseAccess().getValidadorAssignment_2(), "rule__Else__ValidadorAssignment_2");
					put(grammarAccess.getExpresionNumericaAccess().getValueAssignment_2(), "rule__ExpresionNumerica__ValueAssignment_2");
					put(grammarAccess.getExpresionTextoAccess().getValueAssignment_2(), "rule__ExpresionTexto__ValueAssignment_2");
					put(grammarAccess.getExpresionBooleanAccess().getValueAssignment_2(), "rule__ExpresionBoolean__ValueAssignment_2");
					put(grammarAccess.getExpresionReferenciadaAccess().getIdAssignment_2_1(), "rule__ExpresionReferenciada__IdAssignment_2_1");
					put(grammarAccess.getExpresionReferenciadaAccess().getReferenciaAssignment_3(), "rule__ExpresionReferenciada__ReferenciaAssignment_3");
					put(grammarAccess.getExpresionRelacionalAccess().getIzqAssignment_1(), "rule__ExpresionRelacional__IzqAssignment_1");
					put(grammarAccess.getExpresionRelacionalAccess().getOperadorRelacionalAssignment_2(), "rule__ExpresionRelacional__OperadorRelacionalAssignment_2");
					put(grammarAccess.getExpresionRelacionalAccess().getDerAssignment_3(), "rule__ExpresionRelacional__DerAssignment_3");
					put(grammarAccess.getPrimitivoAccess().getTipoAssignment_1(), "rule__Primitivo__TipoAssignment_1");
					put(grammarAccess.getPrimitivoAccess().getNameAssignment_2(), "rule__Primitivo__NameAssignment_2");
					put(grammarAccess.getMapaAccess().getTipoDatoKeyAssignment_2(), "rule__Mapa__TipoDatoKeyAssignment_2");
					put(grammarAccess.getMapaAccess().getTipoDatoValueAssignment_4(), "rule__Mapa__TipoDatoValueAssignment_4");
					put(grammarAccess.getMapaAccess().getNameAssignment_7(), "rule__Mapa__NameAssignment_7");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public BlockchainGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BlockchainGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
