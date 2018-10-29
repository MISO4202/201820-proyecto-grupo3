/*
 * generated by Xtext 2.12.0
 */
package org.xtext.blockchain.serializer;

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
import org.xtext.blockchain.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
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
				sequence_Condicional(context, (Condicional) semanticObject); 
				return; 
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
	 *     (name=EString (smartcontract+=SmartContract smartcontract+=SmartContract*)? (tipodato+=TipoDato tipodato+=TipoDato*)*)
	 */
	protected void sequence_Aplicacion(ISerializationContext context, Aplicacion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Atributo returns Atributo
	 *
	 * Constraint:
	 *     (tipodato=[TipoDato|EString] name=EString)
	 */
	protected void sequence_Atributo(ISerializationContext context, Atributo semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BlockchainPackage.Literals.ATRIBUTO__TIPODATO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BlockchainPackage.Literals.ATRIBUTO__TIPODATO));
			if (transientValues.isValueTransient(semanticObject, BlockchainPackage.Literals.ATRIBUTO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BlockchainPackage.Literals.ATRIBUTO__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtributoAccess().getTipodatoTipoDatoEStringParserRuleCall_0_0_1(), semanticObject.eGet(BlockchainPackage.Literals.ATRIBUTO__TIPODATO, false));
		feeder.accept(grammarAccess.getAtributoAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Sentencia returns Condicional
	 *     Condicional returns Condicional
	 *
	 * Constraint:
	 *     (
	 *         tipoCondicional=TipoCondicion? 
	 *         expresionlogica=ExpresionLogica 
	 *         sentencias+=Sentencia 
	 *         sentencias+=Sentencia* 
	 *         (else+=Condicional else+=Condicional*)?
	 *     )
	 */
	protected void sequence_Condicional(ISerializationContext context, Condicional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TipoDato returns Entidad
	 *     Entidad returns Entidad
	 *
	 * Constraint:
	 *     (name=EString (atributos+=Atributo atributos+=Atributo*)*)
	 */
	protected void sequence_Entidad(ISerializationContext context, Entidad semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sentencia returns Estado
	 *     Estado returns Estado
	 *
	 * Constraint:
	 *     (name=EString tipodato=[TipoDato|ID])
	 */
	protected void sequence_Estado(ISerializationContext context, Estado semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BlockchainPackage.Literals.ESTADO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BlockchainPackage.Literals.ESTADO__NAME));
			if (transientValues.isValueTransient(semanticObject, BlockchainPackage.Literals.ESTADO__TIPODATO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BlockchainPackage.Literals.ESTADO__TIPODATO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEstadoAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEstadoAccess().getTipodatoTipoDatoIDTerminalRuleCall_2_0_1(), semanticObject.eGet(BlockchainPackage.Literals.ESTADO__TIPODATO, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Sentencia returns ExpresionAritmetica
	 *     ExpresionAritmetica returns ExpresionAritmetica
	 *
	 * Constraint:
	 *     (ladoIzq=[Sentencia|EString] operador=Operador+ ladoDer=[Sentencia|EString])
	 */
	protected void sequence_ExpresionAritmetica(ISerializationContext context, ExpresionAritmetica semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sentencia returns ExpresionBoolean
	 *     ExpresionBoolean returns ExpresionBoolean
	 *
	 * Constraint:
	 *     value?='value'?
	 */
	protected void sequence_ExpresionBoolean(ISerializationContext context, ExpresionBoolean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sentencia returns ExpresionLogica
	 *     ExpresionLogica returns ExpresionLogica
	 *
	 * Constraint:
	 *     (id=EInt? operador=OperadorLogico? ladoIzq=[Sentencia|EString] ladoDer=[Sentencia|EString])
	 */
	protected void sequence_ExpresionLogica(ISerializationContext context, ExpresionLogica semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sentencia returns ExpresionNumerica
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
	 *     Sentencia returns ExpresionReferenciada
	 *     ExpresionReferenciada returns ExpresionReferenciada
	 *
	 * Constraint:
	 *     (id=EInt? entReferenciada=[Entidad|EString]? atrReferenciado=[Atributo|EString]?)
	 */
	protected void sequence_ExpresionReferenciada(ISerializationContext context, ExpresionReferenciada semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sentencia returns ExpresionRelacional
	 *     ExpresionRelacional returns ExpresionRelacional
	 *
	 * Constraint:
	 *     (id=EInt? operadorRelacional=OperadorRelacion? ladoIzq=[Sentencia|EString] ladoDer=[Sentencia|EString])
	 */
	protected void sequence_ExpresionRelacional(ISerializationContext context, ExpresionRelacional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sentencia returns ExpresionTexto
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
	 *     (name=EString tipoDatoKey=[TipoDato|EString] tipoDatoValue=[TipoDato|EString])
	 */
	protected void sequence_Mapa(ISerializationContext context, Mapa semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BlockchainPackage.Literals.TIPO_DATO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BlockchainPackage.Literals.TIPO_DATO__NAME));
			if (transientValues.isValueTransient(semanticObject, BlockchainPackage.Literals.MAPA__TIPO_DATO_KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BlockchainPackage.Literals.MAPA__TIPO_DATO_KEY));
			if (transientValues.isValueTransient(semanticObject, BlockchainPackage.Literals.MAPA__TIPO_DATO_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BlockchainPackage.Literals.MAPA__TIPO_DATO_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMapaAccess().getNameEStringParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMapaAccess().getTipoDatoKeyTipoDatoEStringParserRuleCall_4_0_1(), semanticObject.eGet(BlockchainPackage.Literals.MAPA__TIPO_DATO_KEY, false));
		feeder.accept(grammarAccess.getMapaAccess().getTipoDatoValueTipoDatoEStringParserRuleCall_6_0_1(), semanticObject.eGet(BlockchainPackage.Literals.MAPA__TIPO_DATO_VALUE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operacion returns Operacion
	 *
	 * Constraint:
	 *     (
	 *         esUserDefined?=EBoolean+ 
	 *         name=EString 
	 *         (parametros+=Parametro parametros+=Parametro*)? 
	 *         retorno=[TipoDato|EString]? 
	 *         (sentencia+=Sentencia sentencia+=Sentencia*)?
	 *     )
	 */
	protected void sequence_Operacion(ISerializationContext context, Operacion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sentencia returns Parametro
	 *     Parametro returns Parametro
	 *
	 * Constraint:
	 *     (tipodato=[TipoDato|EString] name=EString)
	 */
	protected void sequence_Parametro(ISerializationContext context, Parametro semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BlockchainPackage.Literals.PARAMETRO__TIPODATO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BlockchainPackage.Literals.PARAMETRO__TIPODATO));
			if (transientValues.isValueTransient(semanticObject, BlockchainPackage.Literals.PARAMETRO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BlockchainPackage.Literals.PARAMETRO__NAME));
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
	 *     (tipo=DatoPrimitivo+ name=EString)
	 */
	protected void sequence_Primitivo(ISerializationContext context, Primitivo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SmartContract returns SmartContract
	 *
	 * Constraint:
	 *     (name=EString (entidades+=Entidad entidades+=Entidad*)* (estado+=Estado estado+=Estado*)* (operaciones+=Operacion operaciones+=Operacion*)*)
	 */
	protected void sequence_SmartContract(ISerializationContext context, SmartContract semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sentencia returns Variable
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     (name=EString tipodato=[TipoDato|EString])
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BlockchainPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BlockchainPackage.Literals.VARIABLE__NAME));
			if (transientValues.isValueTransient(semanticObject, BlockchainPackage.Literals.VARIABLE__TIPODATO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BlockchainPackage.Literals.VARIABLE__TIPODATO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableAccess().getTipodatoTipoDatoEStringParserRuleCall_4_0_1(), semanticObject.eGet(BlockchainPackage.Literals.VARIABLE__TIPODATO, false));
		feeder.finish();
	}
	
	
}
