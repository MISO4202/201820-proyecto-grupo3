/**
 */
package blockchain.impl;

import blockchain.Aplicacion;
import blockchain.Atributo;
import blockchain.BlockchainFactory;
import blockchain.BlockchainPackage;
import blockchain.Condicional;
import blockchain.DatoPrimitivo;
import blockchain.Entidad;
import blockchain.Estado;
import blockchain.Expresion;
import blockchain.ExpresionAritmetica;
import blockchain.ExpresionBinaria;
import blockchain.ExpresionBoolean;
import blockchain.ExpresionLogica;
import blockchain.ExpresionNumerica;
import blockchain.ExpresionReferenciada;
import blockchain.ExpresionRelacional;
import blockchain.ExpresionTexto;
import blockchain.Linea;
import blockchain.Mapa;
import blockchain.NamedElement;
import blockchain.Operacion;
import blockchain.Operador;
import blockchain.OperadorLogico;
import blockchain.OperadorRelacion;
import blockchain.Parametro;
import blockchain.Primitivo;
import blockchain.Sentencia;
import blockchain.SmartContract;
import blockchain.TipoDato;
import blockchain.Variable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockchainPackageImpl extends EPackageImpl implements BlockchainPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aplicacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entidadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atributoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smartContractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass estadoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sentenciaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expresionLogicaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitivoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tipoDatoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expresionAritmeticaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass condicionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expresionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expresionNumericaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expresionTextoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expresionBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expresionReferenciadaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expresionRelacionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expresionBinariaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operadorLogicoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operadorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum datoPrimitivoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operadorRelacionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see blockchain.BlockchainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BlockchainPackageImpl() {
		super(eNS_URI, BlockchainFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BlockchainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BlockchainPackage init() {
		if (isInited) return (BlockchainPackage)EPackage.Registry.INSTANCE.getEPackage(BlockchainPackage.eNS_URI);

		// Obtain or create and register package
		BlockchainPackageImpl theBlockchainPackage = (BlockchainPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BlockchainPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BlockchainPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBlockchainPackage.createPackageContents();

		// Initialize created meta-data
		theBlockchainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBlockchainPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BlockchainPackage.eNS_URI, theBlockchainPackage);
		return theBlockchainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAplicacion() {
		return aplicacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAplicacion_Smartcontract() {
		return (EReference)aplicacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAplicacion_Name() {
		return (EAttribute)aplicacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAplicacion_Tipodato() {
		return (EReference)aplicacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntidad() {
		return entidadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntidad_Atributos() {
		return (EReference)entidadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtributo() {
		return atributoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtributo_Tipodato() {
		return (EReference)atributoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmartContract() {
		return smartContractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartContract_Entidades() {
		return (EReference)smartContractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartContract_Operaciones() {
		return (EReference)smartContractEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartContract_Estado() {
		return (EReference)smartContractEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmartContract_Name() {
		return (EAttribute)smartContractEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperacion() {
		return operacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperacion_Parametros() {
		return (EReference)operacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperacion_Name() {
		return (EAttribute)operacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperacion_Retorno() {
		return (EReference)operacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperacion_Lineas() {
		return (EReference)operacionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperacion_EsUserDefined() {
		return (EAttribute)operacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametro() {
		return parametroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametro_Tipodato() {
		return (EReference)parametroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEstado() {
		return estadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEstado_Tipodato() {
		return (EReference)estadoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSentencia() {
		return sentenciaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpresionLogica() {
		return expresionLogicaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpresionLogica_Operador() {
		return (EAttribute)expresionLogicaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitivo() {
		return primitivoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitivo_Tipo() {
		return (EAttribute)primitivoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTipoDato() {
		return tipoDatoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTipoDato_Name() {
		return (EAttribute)tipoDatoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpresionAritmetica() {
		return expresionAritmeticaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpresionAritmetica_Operador() {
		return (EAttribute)expresionAritmeticaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Tipodato() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapa() {
		return mapaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapa_TipoDatoKey() {
		return (EReference)mapaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapa_TipoDatoValue() {
		return (EReference)mapaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondicional() {
		return condicionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondicional_Expresionlogica() {
		return (EReference)condicionalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondicional_Validador() {
		return (EReference)condicionalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondicional_Else() {
		return (EReference)condicionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpresion() {
		return expresionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpresionNumerica() {
		return expresionNumericaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpresionNumerica_Value() {
		return (EAttribute)expresionNumericaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpresionTexto() {
		return expresionTextoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpresionTexto_Value() {
		return (EAttribute)expresionTextoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpresionBoolean() {
		return expresionBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpresionBoolean_Value() {
		return (EAttribute)expresionBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpresionReferenciada() {
		return expresionReferenciadaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpresionReferenciada_Id() {
		return (EAttribute)expresionReferenciadaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpresionReferenciada_Referencia() {
		return (EReference)expresionReferenciadaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpresionRelacional() {
		return expresionRelacionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpresionRelacional_OperadorRelacional() {
		return (EAttribute)expresionRelacionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpresionBinaria() {
		return expresionBinariaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpresionBinaria_Izq() {
		return (EReference)expresionBinariaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpresionBinaria_Der() {
		return (EReference)expresionBinariaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinea() {
		return lineaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperadorLogico() {
		return operadorLogicoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperador() {
		return operadorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatoPrimitivo() {
		return datoPrimitivoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperadorRelacion() {
		return operadorRelacionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchainFactory getBlockchainFactory() {
		return (BlockchainFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		aplicacionEClass = createEClass(APLICACION);
		createEReference(aplicacionEClass, APLICACION__SMARTCONTRACT);
		createEAttribute(aplicacionEClass, APLICACION__NAME);
		createEReference(aplicacionEClass, APLICACION__TIPODATO);

		entidadEClass = createEClass(ENTIDAD);
		createEReference(entidadEClass, ENTIDAD__ATRIBUTOS);

		atributoEClass = createEClass(ATRIBUTO);
		createEReference(atributoEClass, ATRIBUTO__TIPODATO);

		smartContractEClass = createEClass(SMART_CONTRACT);
		createEReference(smartContractEClass, SMART_CONTRACT__ENTIDADES);
		createEReference(smartContractEClass, SMART_CONTRACT__OPERACIONES);
		createEReference(smartContractEClass, SMART_CONTRACT__ESTADO);
		createEAttribute(smartContractEClass, SMART_CONTRACT__NAME);

		operacionEClass = createEClass(OPERACION);
		createEReference(operacionEClass, OPERACION__PARAMETROS);
		createEAttribute(operacionEClass, OPERACION__NAME);
		createEAttribute(operacionEClass, OPERACION__ES_USER_DEFINED);
		createEReference(operacionEClass, OPERACION__RETORNO);
		createEReference(operacionEClass, OPERACION__LINEAS);

		parametroEClass = createEClass(PARAMETRO);
		createEReference(parametroEClass, PARAMETRO__TIPODATO);

		estadoEClass = createEClass(ESTADO);
		createEReference(estadoEClass, ESTADO__TIPODATO);

		sentenciaEClass = createEClass(SENTENCIA);

		expresionLogicaEClass = createEClass(EXPRESION_LOGICA);
		createEAttribute(expresionLogicaEClass, EXPRESION_LOGICA__OPERADOR);

		primitivoEClass = createEClass(PRIMITIVO);
		createEAttribute(primitivoEClass, PRIMITIVO__TIPO);

		tipoDatoEClass = createEClass(TIPO_DATO);
		createEAttribute(tipoDatoEClass, TIPO_DATO__NAME);

		expresionAritmeticaEClass = createEClass(EXPRESION_ARITMETICA);
		createEAttribute(expresionAritmeticaEClass, EXPRESION_ARITMETICA__OPERADOR);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__TIPODATO);

		mapaEClass = createEClass(MAPA);
		createEReference(mapaEClass, MAPA__TIPO_DATO_KEY);
		createEReference(mapaEClass, MAPA__TIPO_DATO_VALUE);

		condicionalEClass = createEClass(CONDICIONAL);
		createEReference(condicionalEClass, CONDICIONAL__ELSE);
		createEReference(condicionalEClass, CONDICIONAL__EXPRESIONLOGICA);
		createEReference(condicionalEClass, CONDICIONAL__VALIDADOR);

		expresionEClass = createEClass(EXPRESION);

		expresionNumericaEClass = createEClass(EXPRESION_NUMERICA);
		createEAttribute(expresionNumericaEClass, EXPRESION_NUMERICA__VALUE);

		expresionTextoEClass = createEClass(EXPRESION_TEXTO);
		createEAttribute(expresionTextoEClass, EXPRESION_TEXTO__VALUE);

		expresionBooleanEClass = createEClass(EXPRESION_BOOLEAN);
		createEAttribute(expresionBooleanEClass, EXPRESION_BOOLEAN__VALUE);

		expresionReferenciadaEClass = createEClass(EXPRESION_REFERENCIADA);
		createEAttribute(expresionReferenciadaEClass, EXPRESION_REFERENCIADA__ID);
		createEReference(expresionReferenciadaEClass, EXPRESION_REFERENCIADA__REFERENCIA);

		expresionRelacionalEClass = createEClass(EXPRESION_RELACIONAL);
		createEAttribute(expresionRelacionalEClass, EXPRESION_RELACIONAL__OPERADOR_RELACIONAL);

		expresionBinariaEClass = createEClass(EXPRESION_BINARIA);
		createEReference(expresionBinariaEClass, EXPRESION_BINARIA__IZQ);
		createEReference(expresionBinariaEClass, EXPRESION_BINARIA__DER);

		lineaEClass = createEClass(LINEA);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		// Create enums
		operadorLogicoEEnum = createEEnum(OPERADOR_LOGICO);
		operadorEEnum = createEEnum(OPERADOR);
		datoPrimitivoEEnum = createEEnum(DATO_PRIMITIVO);
		operadorRelacionEEnum = createEEnum(OPERADOR_RELACION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entidadEClass.getESuperTypes().add(this.getTipoDato());
		atributoEClass.getESuperTypes().add(this.getNamedElement());
		parametroEClass.getESuperTypes().add(this.getNamedElement());
		estadoEClass.getESuperTypes().add(this.getNamedElement());
		sentenciaEClass.getESuperTypes().add(this.getLinea());
		expresionLogicaEClass.getESuperTypes().add(this.getExpresionBinaria());
		primitivoEClass.getESuperTypes().add(this.getTipoDato());
		expresionAritmeticaEClass.getESuperTypes().add(this.getExpresionBinaria());
		variableEClass.getESuperTypes().add(this.getSentencia());
		variableEClass.getESuperTypes().add(this.getNamedElement());
		mapaEClass.getESuperTypes().add(this.getTipoDato());
		condicionalEClass.getESuperTypes().add(this.getSentencia());
		expresionEClass.getESuperTypes().add(this.getLinea());
		expresionNumericaEClass.getESuperTypes().add(this.getExpresion());
		expresionTextoEClass.getESuperTypes().add(this.getExpresion());
		expresionBooleanEClass.getESuperTypes().add(this.getExpresion());
		expresionReferenciadaEClass.getESuperTypes().add(this.getExpresion());
		expresionRelacionalEClass.getESuperTypes().add(this.getExpresionBinaria());
		expresionBinariaEClass.getESuperTypes().add(this.getExpresion());

		// Initialize classes, features, and operations; add parameters
		initEClass(aplicacionEClass, Aplicacion.class, "Aplicacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAplicacion_Smartcontract(), this.getSmartContract(), null, "smartcontract", null, 0, -1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAplicacion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAplicacion_Tipodato(), this.getTipoDato(), null, "tipodato", null, 0, -1, Aplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entidadEClass, Entidad.class, "Entidad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntidad_Atributos(), this.getAtributo(), null, "atributos", null, 0, -1, Entidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atributoEClass, Atributo.class, "Atributo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtributo_Tipodato(), this.getTipoDato(), null, "tipodato", null, 1, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smartContractEClass, SmartContract.class, "SmartContract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSmartContract_Entidades(), this.getEntidad(), null, "entidades", null, 0, -1, SmartContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartContract_Operaciones(), this.getOperacion(), null, "operaciones", null, 0, -1, SmartContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartContract_Estado(), this.getEstado(), null, "estado", null, 1, -1, SmartContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmartContract_Name(), ecorePackage.getEString(), "name", null, 0, 1, SmartContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operacionEClass, Operacion.class, "Operacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperacion_Parametros(), this.getParametro(), null, "parametros", null, 0, -1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperacion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperacion_EsUserDefined(), ecorePackage.getEBoolean(), "esUserDefined", null, 0, 1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperacion_Retorno(), this.getTipoDato(), null, "retorno", null, 0, 1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperacion_Lineas(), this.getLinea(), null, "lineas", null, 0, -1, Operacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parametroEClass, Parametro.class, "Parametro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParametro_Tipodato(), this.getTipoDato(), null, "tipodato", null, 1, 1, Parametro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(estadoEClass, Estado.class, "Estado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEstado_Tipodato(), this.getTipoDato(), null, "tipodato", null, 1, 1, Estado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sentenciaEClass, Sentencia.class, "Sentencia", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expresionLogicaEClass, ExpresionLogica.class, "ExpresionLogica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpresionLogica_Operador(), this.getOperadorLogico(), "operador", null, 0, 1, ExpresionLogica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitivoEClass, Primitivo.class, "Primitivo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitivo_Tipo(), this.getDatoPrimitivo(), "tipo", null, 0, 1, Primitivo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tipoDatoEClass, TipoDato.class, "TipoDato", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTipoDato_Name(), ecorePackage.getEString(), "name", null, 0, 1, TipoDato.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expresionAritmeticaEClass, ExpresionAritmetica.class, "ExpresionAritmetica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpresionAritmetica_Operador(), this.getOperador(), "operador", null, 0, 1, ExpresionAritmetica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_Tipodato(), this.getTipoDato(), null, "tipodato", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapaEClass, Mapa.class, "Mapa", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapa_TipoDatoKey(), this.getTipoDato(), null, "tipoDatoKey", null, 1, 1, Mapa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapa_TipoDatoValue(), this.getTipoDato(), null, "tipoDatoValue", null, 1, 1, Mapa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(condicionalEClass, Condicional.class, "Condicional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCondicional_Else(), this.getCondicional(), null, "else", null, 0, 1, Condicional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondicional_Expresionlogica(), this.getExpresionLogica(), null, "expresionlogica", null, 1, 1, Condicional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondicional_Validador(), this.getLinea(), null, "validador", null, 0, -1, Condicional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expresionEClass, Expresion.class, "Expresion", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expresionNumericaEClass, ExpresionNumerica.class, "ExpresionNumerica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpresionNumerica_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, ExpresionNumerica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expresionTextoEClass, ExpresionTexto.class, "ExpresionTexto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpresionTexto_Value(), ecorePackage.getEString(), "value", null, 0, 1, ExpresionTexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expresionBooleanEClass, ExpresionBoolean.class, "ExpresionBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpresionBoolean_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, ExpresionBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expresionReferenciadaEClass, ExpresionReferenciada.class, "ExpresionReferenciada", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpresionReferenciada_Id(), ecorePackage.getEInt(), "id", null, 0, 1, ExpresionReferenciada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpresionReferenciada_Referencia(), this.getNamedElement(), null, "referencia", null, 1, 1, ExpresionReferenciada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expresionRelacionalEClass, ExpresionRelacional.class, "ExpresionRelacional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpresionRelacional_OperadorRelacional(), this.getOperadorRelacion(), "operadorRelacional", null, 0, 1, ExpresionRelacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expresionBinariaEClass, ExpresionBinaria.class, "ExpresionBinaria", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpresionBinaria_Izq(), this.getExpresion(), null, "izq", null, 1, 1, ExpresionBinaria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpresionBinaria_Der(), this.getExpresion(), null, "der", null, 1, 1, ExpresionBinaria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineaEClass, Linea.class, "Linea", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(operadorLogicoEEnum, OperadorLogico.class, "OperadorLogico");
		addEEnumLiteral(operadorLogicoEEnum, OperadorLogico.IGUAL_IGUAL);
		addEEnumLiteral(operadorLogicoEEnum, OperadorLogico.DIFERENTE);
		addEEnumLiteral(operadorLogicoEEnum, OperadorLogico.MAYORQUE);
		addEEnumLiteral(operadorLogicoEEnum, OperadorLogico.MENORQUE);
		addEEnumLiteral(operadorLogicoEEnum, OperadorLogico.MAYORIGUAL);
		addEEnumLiteral(operadorLogicoEEnum, OperadorLogico.MENORIGUAL);
		addEEnumLiteral(operadorLogicoEEnum, OperadorLogico.AND);
		addEEnumLiteral(operadorLogicoEEnum, OperadorLogico.OR);

		initEEnum(operadorEEnum, Operador.class, "Operador");
		addEEnumLiteral(operadorEEnum, Operador.MAS);
		addEEnumLiteral(operadorEEnum, Operador.MENOS);
		addEEnumLiteral(operadorEEnum, Operador.PRODUCTO);
		addEEnumLiteral(operadorEEnum, Operador.DIVISION);
		addEEnumLiteral(operadorEEnum, Operador.IGUAL);
		addEEnumLiteral(operadorEEnum, Operador.GET);
		addEEnumLiteral(operadorEEnum, Operador.DELETE);

		initEEnum(datoPrimitivoEEnum, DatoPrimitivo.class, "DatoPrimitivo");
		addEEnumLiteral(datoPrimitivoEEnum, DatoPrimitivo.STRING);
		addEEnumLiteral(datoPrimitivoEEnum, DatoPrimitivo.NUMERICO);
		addEEnumLiteral(datoPrimitivoEEnum, DatoPrimitivo.BOOLEAN);
		addEEnumLiteral(datoPrimitivoEEnum, DatoPrimitivo.ADDRESS);

		initEEnum(operadorRelacionEEnum, OperadorRelacion.class, "OperadorRelacion");
		addEEnumLiteral(operadorRelacionEEnum, OperadorRelacion.PUNTO);

		// Create resource
		createResource(eNS_URI);
	}

} //BlockchainPackageImpl
