/*
 * generated by Xtext 2.12.0
 */
package uniandes.mdd.aplicacion.blockchain.serializer;

import blockchain.Aplicacion;
import blockchain.Atributo;
import blockchain.BlockchainPackage;
import blockchain.Condicional;
import blockchain.Entidad;
import blockchain.Estado;
import blockchain.ExpresionAritmetica;
import blockchain.ExpresionBoolean;
import blockchain.ExpresionLogica;
import blockchain.ExpresionNumerica;
import blockchain.ExpresionReferenciada;
import blockchain.ExpresionRelacional;
import blockchain.ExpresionTexto;
import blockchain.Mapa;
import blockchain.Operacion;
import blockchain.Parametro;
import blockchain.Primitivo;
import blockchain.SmartContract;
import blockchain.Variable;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import uniandes.mdd.aplicacion.blockchain.services.BlockchainGrammarAccess;

@SuppressWarnings("all")
public class BlockchainSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BlockchainGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BlockchainPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BlockchainPackage.APLICACION:
				sequence_Aplicacion(context, (Aplicacion) semanticObject); 
				return; 
			case BlockchainPackage.ATRIBUTO:
				sequence_Atributo(context, (Atributo) semanticObject); 
				return; 
			case BlockchainPackage.CONDICIONAL:
				if (rule == grammarAccess.getLineaRule()
						|| rule == grammarAccess.getCondicionalRule()) {
					sequence_Condicional(context, (Condicional) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getElseRule()) {
					sequence_Else(context, (Condicional) semanticObject); 
					return; 
				}
				else break;
			case BlockchainPackage.ENTIDAD:
				sequence_Entidad(context, (Entidad) semanticObject); 
				return; 
			case BlockchainPackage.ESTADO:
				sequence_Estado(context, (Estado) semanticObject); 
				return; 
			case BlockchainPackage.EXPRESION_ARITMETICA:
				sequence_ExpresionAritmetica(context, (ExpresionAritmetica) semanticObject); 
				return; 
			case BlockchainPackage.EXPRESION_BOOLEAN:
				sequence_ExpresionBoolean(context, (ExpresionBoolean) semanticObject); 
				return; 
			case BlockchainPackage.EXPRESION_LOGICA:
				sequence_ExpresionLogica(context, (ExpresionLogica) semanticObject); 
				return; 
			case BlockchainPackage.EXPRESION_NUMERICA:
				sequence_ExpresionNumerica(context, (ExpresionNumerica) semanticObject); 
				return; 
			case BlockchainPackage.EXPRESION_REFERENCIADA:
				sequence_ExpresionReferenciada(context, (ExpresionReferenciada) semanticObject); 
				return; 
			case BlockchainPackage.EXPRESION_RELACIONAL:
				sequence_ExpresionRelacional(context, (ExpresionRelacional) semanticObject); 
				return; 
			case BlockchainPackage.EXPRESION_TEXTO:
				sequence_ExpresionTexto(context, (ExpresionTexto) semanticObject); 
				return; 
			case BlockchainPackage.MAPA:
				sequence_Mapa(context, (Mapa) semanticObject); 
				return; 
			case BlockchainPackage.OPERACION:
				sequence_Operacion(context, (Operacion) semanticObject); 
				return; 
			case BlockchainPackage.PARAMETRO:
				sequence_Parametro(context, (Parametro) semanticObject); 
				return; 
			case BlockchainPackage.PRIMITIVO:
				sequence_Primitivo(context, (Primitivo) semanticObject); 
				return; 
			case BlockchainPackage.SMART_CONTRACT:
				sequence_SmartContract(context, (SmartContract) semanticObject); 
				return; 
			case BlockchainPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Aplicacion returns Aplicacion
	 *
	 * Constraint:
	 *     (name=EString (smartcontract+=SmartContract smartcontract+=SmartContract*)? tipodato+=TipoDato*)
	 */
	protected void sequence_Aplicacion(ISerializationContext context, Aplicacion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns Atributo
	 *     Atributo returns Atributo
	 *
	 * Constraint:
	 *     (tipodato=[TipoDato|EString] name=EString)
	 */
	protected void sequence_Atributo(ISerializationContext context, Atributo semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BlockchainPackage.Literals.ATRIBUTO__TIPODATO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BlockchainPackage.Literals.ATRIBUTO__TIPODATO));
			if (transientValues.isValueTransient(semanticObject, BlockchainPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BlockchainPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtributoAccess().getTipodatoTipoDatoEStringParserRuleCall_0_0_1(), semanticObject.eGet(BlockchainPackage.Literals.ATRIBUTO__TIPODATO, false));
		feeder.accept(grammarAccess.getAtributoAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Linea returns Condicional
	 *     Condicional returns Condicional
	 *
	 * Constraint:
	 *     (expresionlogica=ExpresionLogica linea+=Linea+ else=Else?)
	 */
	protected void sequence_Condicional(ISerializationContext context, Condicional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Else returns Condicional
	 *
	 * Constraint:
	 *     linea+=Linea+
	 */
	protected void sequence_Else(ISerializationContext context, Condicional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TipoDato returns Entidad
	 *     Entidad returns Entidad
	 *
	 * Constraint:
	 *     (name=EString (atributos+=Atributo atributos+=Atributo*)?)
	 */
	protected void sequence_Entidad(ISerializationContext context, Entidad semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns Estado
	 *     Estado returns Estado
	 *
	 * Constraint:
	 *     (tipodato=[TipoDato|EString] name=EString)
	 */
	protected void sequence_Estado(ISerializationContext context, Estado semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BlockchainPackage.Literals.ESTADO__TIPODATO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BlockchainPackage.Literals.ESTADO__TIPODATO));
			if (transientValues.isValueTransient(semanticObject, BlockchainPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BlockchainPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEstadoAccess().getTipodatoTipoDatoEStringParserRuleCall_1_0_1(), semanticObject.eGet(BlockchainPackage.Literals.ESTADO__TIPODATO, false));
		feeder.accept(grammarAccess.getEstadoAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Linea returns ExpresionAritmetica
	 *     Expresion returns ExpresionAritmetica
	 *     ExpresionAritmetica returns ExpresionAritmetica
	 *
	 * Constraint:
	 *     (izq=Expresion operador=Operador? der=Expresion)
	 */
	protected void sequence_ExpresionAritmetica(ISerializationContext context, ExpresionAritmetica semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Linea returns ExpresionBoolean
	 *     Expresion returns ExpresionBoolean
	 *     ExpresionBoolean returns ExpresionBoolean
	 *
	 * Constraint:
	 *     value?=EBoolean?
	 */
	protected void sequence_ExpresionBoolean(ISerializationContext context, ExpresionBoolean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Linea returns ExpresionLogica
	 *     Expresion returns ExpresionLogica
	 *     ExpresionLogica returns ExpresionLogica
	 *
	 * Constraint:
	 *     (izq=Expresion operador=OperadorLogico? der=Expresion)
	 */
	protected void sequence_ExpresionLogica(ISerializationContext context, ExpresionLogica semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Linea returns ExpresionNumerica
	 *     Expresion returns ExpresionNumerica
	 *     ExpresionNumerica returns ExpresionNumerica
	 *
	 * Constraint:
	 *     value=EDouble?
	 */
	protected void sequence_ExpresionNumerica(ISerializationContext context, ExpresionNumerica semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Linea returns ExpresionReferenciada
	 *     Expresion returns ExpresionReferenciada
	 *     ExpresionReferenciada returns ExpresionReferenciada
	 *
	 * Constraint:
	 *     referencia=[NamedElement|EString]
	 */
	protected void sequence_ExpresionReferenciada(ISerializationContext context, ExpresionReferenciada semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BlockchainPackage.Literals.EXPRESION_REFERENCIADA__REFERENCIA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BlockchainPackage.Literals.EXPRESION_REFERENCIADA__REFERENCIA));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpresionReferenciadaAccess().getReferenciaNamedElementEStringParserRuleCall_1_0_1(), semanticObject.eGet(BlockchainPackage.Literals.EXPRESION_REFERENCIADA__REFERENCIA, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Linea returns ExpresionRelacional
	 *     Expresion returns ExpresionRelacional
	 *     ExpresionRelacional returns ExpresionRelacional
	 *
	 * Constraint:
	 *     (izq=Expresion operadorRelacional=OperadorRelacion? der=Expresion)
	 */
	protected void sequence_ExpresionRelacional(ISerializationContext context, ExpresionRelacional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Linea returns ExpresionTexto
	 *     Expresion returns ExpresionTexto
	 *     ExpresionTexto returns ExpresionTexto
	 *
	 * Constraint:
	 *     value=EString?
	 */
	protected void sequence_ExpresionTexto(ISerializationContext context, ExpresionTexto semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TipoDato returns Mapa
	 *     Mapa returns Mapa
	 *
	 * Constraint:
	 *     (tipoDatoKey=[TipoDato|EString] tipoDatoValue=[TipoDato|EString] name=EString)
	 */
	protected void sequence_Mapa(ISerializationContext context, Mapa semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BlockchainPackage.Literals.MAPA__TIPO_DATO_KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BlockchainPackage.Literals.MAPA__TIPO_DATO_KEY));
			if (transientValues.isValueTransient(semanticObject, BlockchainPackage.Literals.MAPA__TIPO_DATO_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BlockchainPackage.Literals.MAPA__TIPO_DATO_VALUE));
			if (transientValues.isValueTransient(semanticObject, BlockchainPackage.Literals.TIPO_DATO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BlockchainPackage.Literals.TIPO_DATO__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMapaAccess().getTipoDatoKeyTipoDatoEStringParserRuleCall_2_0_1(), semanticObject.eGet(BlockchainPackage.Literals.MAPA__TIPO_DATO_KEY, false));
		feeder.accept(grammarAccess.getMapaAccess().getTipoDatoValueTipoDatoEStringParserRuleCall_4_0_1(), semanticObject.eGet(BlockchainPackage.Literals.MAPA__TIPO_DATO_VALUE, false));
		feeder.accept(grammarAccess.getMapaAccess().getNameEStringParserRuleCall_7_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operacion returns Operacion
	 *
	 * Constraint:
	 *     (esUserDefined?=EBoolean+ name=EString (parametros+=Parametro parametros+=Parametro*)? retorno=[TipoDato|EString]? lineas+=Linea*)
	 */
	protected void sequence_Operacion(ISerializationContext context, Operacion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns Parametro
	 *     Parametro returns Parametro
	 *
	 * Constraint:
	 *     (tipodato=[TipoDato|EString] name=EString)
	 */
	protected void sequence_Parametro(ISerializationContext context, Parametro semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BlockchainPackage.Literals.PARAMETRO__TIPODATO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BlockchainPackage.Literals.PARAMETRO__TIPODATO));
			if (transientValues.isValueTransient(semanticObject, BlockchainPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BlockchainPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParametroAccess().getTipodatoTipoDatoEStringParserRuleCall_0_0_1(), semanticObject.eGet(BlockchainPackage.Literals.PARAMETRO__TIPODATO, false));
		feeder.accept(grammarAccess.getParametroAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TipoDato returns Primitivo
	 *     Primitivo returns Primitivo
	 *
	 * Constraint:
	 *     (tipo=DatoPrimitivo? name=EString)
	 */
	protected void sequence_Primitivo(ISerializationContext context, Primitivo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SmartContract returns SmartContract
	 *
	 * Constraint:
	 *     (name=EString (entidades+=Entidad entidades+=Entidad*)? (estado+=Estado estado+=Estado*)? (operaciones+=Operacion operaciones+=Operacion*)?)
	 */
	protected void sequence_SmartContract(ISerializationContext context, SmartContract semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Linea returns Variable
	 *     NamedElement returns Variable
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     (tipodato=[TipoDato|EString] name=EString?)
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
