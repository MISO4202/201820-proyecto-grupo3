/**
 */
package blockchain.impl;

import blockchain.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockchainFactoryImpl extends EFactoryImpl implements BlockchainFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BlockchainFactory init() {
		try {
			BlockchainFactory theBlockchainFactory = (BlockchainFactory)EPackage.Registry.INSTANCE.getEFactory(BlockchainPackage.eNS_URI);
			if (theBlockchainFactory != null) {
				return theBlockchainFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BlockchainFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchainFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BlockchainPackage.APLICACION: return createAplicacion();
			case BlockchainPackage.ENTIDAD: return createEntidad();
			case BlockchainPackage.ATRIBUTO: return createAtributo();
			case BlockchainPackage.SMART_CONTRACT: return createSmartContract();
			case BlockchainPackage.OPERACION: return createOperacion();
			case BlockchainPackage.PARAMETRO: return createParametro();
			case BlockchainPackage.ESTADO: return createEstado();
			case BlockchainPackage.EXPRESION_LOGICA: return createExpresionLogica();
			case BlockchainPackage.PRIMITIVO: return createPrimitivo();
			case BlockchainPackage.EXPRESION_ARITMETICA: return createExpresionAritmetica();
			case BlockchainPackage.VARIABLE: return createVariable();
			case BlockchainPackage.MAPA: return createMapa();
			case BlockchainPackage.CONDICIONAL: return createCondicional();
			case BlockchainPackage.EXPRESION_NUMERICA: return createExpresionNumerica();
			case BlockchainPackage.EXPRESION_TEXTO: return createExpresionTexto();
			case BlockchainPackage.EXPRESION_BOOLEAN: return createExpresionBoolean();
			case BlockchainPackage.EXPRESION_REFERENCIADA: return createExpresionReferenciada();
			case BlockchainPackage.EXPRESION_RELACIONAL: return createExpresionRelacional();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BlockchainPackage.OPERADOR_LOGICO:
				return createOperadorLogicoFromString(eDataType, initialValue);
			case BlockchainPackage.OPERADOR:
				return createOperadorFromString(eDataType, initialValue);
			case BlockchainPackage.DATO_PRIMITIVO:
				return createDatoPrimitivoFromString(eDataType, initialValue);
			case BlockchainPackage.OPERADOR_RELACION:
				return createOperadorRelacionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BlockchainPackage.OPERADOR_LOGICO:
				return convertOperadorLogicoToString(eDataType, instanceValue);
			case BlockchainPackage.OPERADOR:
				return convertOperadorToString(eDataType, instanceValue);
			case BlockchainPackage.DATO_PRIMITIVO:
				return convertDatoPrimitivoToString(eDataType, instanceValue);
			case BlockchainPackage.OPERADOR_RELACION:
				return convertOperadorRelacionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aplicacion createAplicacion() {
		AplicacionImpl aplicacion = new AplicacionImpl();
		return aplicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad createEntidad() {
		EntidadImpl entidad = new EntidadImpl();
		return entidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atributo createAtributo() {
		AtributoImpl atributo = new AtributoImpl();
		return atributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartContract createSmartContract() {
		SmartContractImpl smartContract = new SmartContractImpl();
		return smartContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operacion createOperacion() {
		OperacionImpl operacion = new OperacionImpl();
		return operacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parametro createParametro() {
		ParametroImpl parametro = new ParametroImpl();
		return parametro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Estado createEstado() {
		EstadoImpl estado = new EstadoImpl();
		return estado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpresionLogica createExpresionLogica() {
		ExpresionLogicaImpl expresionLogica = new ExpresionLogicaImpl();
		return expresionLogica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Primitivo createPrimitivo() {
		PrimitivoImpl primitivo = new PrimitivoImpl();
		return primitivo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpresionAritmetica createExpresionAritmetica() {
		ExpresionAritmeticaImpl expresionAritmetica = new ExpresionAritmeticaImpl();
		return expresionAritmetica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapa createMapa() {
		MapaImpl mapa = new MapaImpl();
		return mapa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condicional createCondicional() {
		CondicionalImpl condicional = new CondicionalImpl();
		return condicional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpresionNumerica createExpresionNumerica() {
		ExpresionNumericaImpl expresionNumerica = new ExpresionNumericaImpl();
		return expresionNumerica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpresionTexto createExpresionTexto() {
		ExpresionTextoImpl expresionTexto = new ExpresionTextoImpl();
		return expresionTexto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpresionBoolean createExpresionBoolean() {
		ExpresionBooleanImpl expresionBoolean = new ExpresionBooleanImpl();
		return expresionBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpresionReferenciada createExpresionReferenciada() {
		ExpresionReferenciadaImpl expresionReferenciada = new ExpresionReferenciadaImpl();
		return expresionReferenciada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpresionRelacional createExpresionRelacional() {
		ExpresionRelacionalImpl expresionRelacional = new ExpresionRelacionalImpl();
		return expresionRelacional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperadorLogico createOperadorLogicoFromString(EDataType eDataType, String initialValue) {
		OperadorLogico result = OperadorLogico.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperadorLogicoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operador createOperadorFromString(EDataType eDataType, String initialValue) {
		Operador result = Operador.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperadorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatoPrimitivo createDatoPrimitivoFromString(EDataType eDataType, String initialValue) {
		DatoPrimitivo result = DatoPrimitivo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatoPrimitivoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperadorRelacion createOperadorRelacionFromString(EDataType eDataType, String initialValue) {
		OperadorRelacion result = OperadorRelacion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperadorRelacionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchainPackage getBlockchainPackage() {
		return (BlockchainPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BlockchainPackage getPackage() {
		return BlockchainPackage.eINSTANCE;
	}

} //BlockchainFactoryImpl
