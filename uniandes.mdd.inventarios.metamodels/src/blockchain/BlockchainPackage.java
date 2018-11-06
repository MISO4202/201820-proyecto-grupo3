/**
 */
package blockchain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see blockchain.BlockchainFactory
 * @model kind="package"
 * @generated
 */
public interface BlockchainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "blockchain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/blockchain";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "blockchain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BlockchainPackage eINSTANCE = blockchain.impl.BlockchainPackageImpl.init();

	/**
	 * The meta object id for the '{@link blockchain.impl.AplicacionImpl <em>Aplicacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.AplicacionImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getAplicacion()
	 * @generated
	 */
	int APLICACION = 0;

	/**
	 * The feature id for the '<em><b>Smartcontract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__SMARTCONTRACT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Tipodato</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__TIPODATO = 2;

	/**
	 * The number of structural features of the '<em>Aplicacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Aplicacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.TipoDatoImpl <em>Tipo Dato</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.TipoDatoImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getTipoDato()
	 * @generated
	 */
	int TIPO_DATO = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DATO__NAME = 0;

	/**
	 * The number of structural features of the '<em>Tipo Dato</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DATO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tipo Dato</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DATO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.EntidadImpl <em>Entidad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.EntidadImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getEntidad()
	 * @generated
	 */
	int ENTIDAD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__NAME = TIPO_DATO__NAME;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__ATRIBUTOS = TIPO_DATO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_FEATURE_COUNT = TIPO_DATO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_OPERATION_COUNT = TIPO_DATO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.NamedElementImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.AtributoImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tipodato</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__TIPODATO = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.SmartContractImpl <em>Smart Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.SmartContractImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getSmartContract()
	 * @generated
	 */
	int SMART_CONTRACT = 3;

	/**
	 * The feature id for the '<em><b>Entidades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACT__ENTIDADES = 0;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACT__OPERACIONES = 1;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACT__ESTADO = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACT__NAME = 3;

	/**
	 * The number of structural features of the '<em>Smart Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Smart Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.OperacionImpl <em>Operacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.OperacionImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getOperacion()
	 * @generated
	 */
	int OPERACION = 4;

	/**
	 * The feature id for the '<em><b>Parametros</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__PARAMETROS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Es User Defined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__ES_USER_DEFINED = 2;

	/**
	 * The feature id for the '<em><b>Retorno</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__RETORNO = 3;

	/**
	 * The feature id for the '<em><b>Lineas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__LINEAS = 4;

	/**
	 * The number of structural features of the '<em>Operacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Operacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.ParametroImpl <em>Parametro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.ParametroImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getParametro()
	 * @generated
	 */
	int PARAMETRO = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tipodato</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO__TIPODATO = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parametro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parametro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.EstadoImpl <em>Estado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.EstadoImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getEstado()
	 * @generated
	 */
	int ESTADO = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tipodato</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO__TIPODATO = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Estado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Estado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.Linea <em>Linea</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.Linea
	 * @see blockchain.impl.BlockchainPackageImpl#getLinea()
	 * @generated
	 */
	int LINEA = 22;

	/**
	 * The number of structural features of the '<em>Linea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Linea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockchain.Sentencia <em>Sentencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.Sentencia
	 * @see blockchain.impl.BlockchainPackageImpl#getSentencia()
	 * @generated
	 */
	int SENTENCIA = 7;

	/**
	 * The number of structural features of the '<em>Sentencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCIA_FEATURE_COUNT = LINEA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sentencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCIA_OPERATION_COUNT = LINEA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.Expresion <em>Expresion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.Expresion
	 * @see blockchain.impl.BlockchainPackageImpl#getExpresion()
	 * @generated
	 */
	int EXPRESION = 15;

	/**
	 * The number of structural features of the '<em>Expresion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_FEATURE_COUNT = LINEA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expresion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_OPERATION_COUNT = LINEA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.ExpresionBinariaImpl <em>Expresion Binaria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.ExpresionBinariaImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getExpresionBinaria()
	 * @generated
	 */
	int EXPRESION_BINARIA = 21;

	/**
	 * The feature id for the '<em><b>Izq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_BINARIA__IZQ = EXPRESION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Der</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_BINARIA__DER = EXPRESION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expresion Binaria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_BINARIA_FEATURE_COUNT = EXPRESION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expresion Binaria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_BINARIA_OPERATION_COUNT = EXPRESION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.ExpresionLogicaImpl <em>Expresion Logica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.ExpresionLogicaImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getExpresionLogica()
	 * @generated
	 */
	int EXPRESION_LOGICA = 8;

	/**
	 * The feature id for the '<em><b>Izq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_LOGICA__IZQ = EXPRESION_BINARIA__IZQ;

	/**
	 * The feature id for the '<em><b>Der</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_LOGICA__DER = EXPRESION_BINARIA__DER;

	/**
	 * The feature id for the '<em><b>Operador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_LOGICA__OPERADOR = EXPRESION_BINARIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expresion Logica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_LOGICA_FEATURE_COUNT = EXPRESION_BINARIA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expresion Logica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_LOGICA_OPERATION_COUNT = EXPRESION_BINARIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.PrimitivoImpl <em>Primitivo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.PrimitivoImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getPrimitivo()
	 * @generated
	 */
	int PRIMITIVO = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVO__NAME = TIPO_DATO__NAME;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVO__TIPO = TIPO_DATO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitivo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVO_FEATURE_COUNT = TIPO_DATO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitivo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVO_OPERATION_COUNT = TIPO_DATO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.ExpresionAritmeticaImpl <em>Expresion Aritmetica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.ExpresionAritmeticaImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getExpresionAritmetica()
	 * @generated
	 */
	int EXPRESION_ARITMETICA = 11;

	/**
	 * The feature id for the '<em><b>Izq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_ARITMETICA__IZQ = EXPRESION_BINARIA__IZQ;

	/**
	 * The feature id for the '<em><b>Der</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_ARITMETICA__DER = EXPRESION_BINARIA__DER;

	/**
	 * The feature id for the '<em><b>Operador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_ARITMETICA__OPERADOR = EXPRESION_BINARIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expresion Aritmetica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_ARITMETICA_FEATURE_COUNT = EXPRESION_BINARIA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expresion Aritmetica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_ARITMETICA_OPERATION_COUNT = EXPRESION_BINARIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.VariableImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = SENTENCIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tipodato</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TIPODATO = SENTENCIA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = SENTENCIA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = SENTENCIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.MapaImpl <em>Mapa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.MapaImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getMapa()
	 * @generated
	 */
	int MAPA = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPA__NAME = TIPO_DATO__NAME;

	/**
	 * The feature id for the '<em><b>Tipo Dato Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPA__TIPO_DATO_KEY = TIPO_DATO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tipo Dato Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPA__TIPO_DATO_VALUE = TIPO_DATO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mapa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPA_FEATURE_COUNT = TIPO_DATO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mapa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPA_OPERATION_COUNT = TIPO_DATO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.IfImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getIf()
	 * @generated
	 */
	int IF = 14;

	/**
	 * The feature id for the '<em><b>Expresionlogica</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__EXPRESIONLOGICA = SENTENCIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lineas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__LINEAS = SENTENCIA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE = SENTENCIA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = SENTENCIA_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = SENTENCIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.ExpresionNumericaImpl <em>Expresion Numerica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.ExpresionNumericaImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getExpresionNumerica()
	 * @generated
	 */
	int EXPRESION_NUMERICA = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_NUMERICA__VALUE = EXPRESION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expresion Numerica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_NUMERICA_FEATURE_COUNT = EXPRESION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expresion Numerica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_NUMERICA_OPERATION_COUNT = EXPRESION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.ExpresionTextoImpl <em>Expresion Texto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.ExpresionTextoImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getExpresionTexto()
	 * @generated
	 */
	int EXPRESION_TEXTO = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_TEXTO__VALUE = EXPRESION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expresion Texto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_TEXTO_FEATURE_COUNT = EXPRESION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expresion Texto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_TEXTO_OPERATION_COUNT = EXPRESION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.ExpresionBooleanImpl <em>Expresion Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.ExpresionBooleanImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getExpresionBoolean()
	 * @generated
	 */
	int EXPRESION_BOOLEAN = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_BOOLEAN__VALUE = EXPRESION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expresion Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_BOOLEAN_FEATURE_COUNT = EXPRESION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expresion Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_BOOLEAN_OPERATION_COUNT = EXPRESION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.ExpresionReferenciadaImpl <em>Expresion Referenciada</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.ExpresionReferenciadaImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getExpresionReferenciada()
	 * @generated
	 */
	int EXPRESION_REFERENCIADA = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_REFERENCIADA__ID = EXPRESION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referencia</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_REFERENCIADA__REFERENCIA = EXPRESION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expresion Referenciada</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_REFERENCIADA_FEATURE_COUNT = EXPRESION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expresion Referenciada</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_REFERENCIADA_OPERATION_COUNT = EXPRESION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.ExpresionRelacionalImpl <em>Expresion Relacional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.ExpresionRelacionalImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getExpresionRelacional()
	 * @generated
	 */
	int EXPRESION_RELACIONAL = 20;

	/**
	 * The feature id for the '<em><b>Izq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_RELACIONAL__IZQ = EXPRESION_BINARIA__IZQ;

	/**
	 * The feature id for the '<em><b>Der</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_RELACIONAL__DER = EXPRESION_BINARIA__DER;

	/**
	 * The feature id for the '<em><b>Operador Relacional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_RELACIONAL__OPERADOR_RELACIONAL = EXPRESION_BINARIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expresion Relacional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_RELACIONAL_FEATURE_COUNT = EXPRESION_BINARIA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expresion Relacional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_RELACIONAL_OPERATION_COUNT = EXPRESION_BINARIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.ElseImpl <em>Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.ElseImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getElse()
	 * @generated
	 */
	int ELSE = 24;

	/**
	 * The feature id for the '<em><b>Lineas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE__LINEAS = 0;

	/**
	 * The number of structural features of the '<em>Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockchain.OperadorLogico <em>Operador Logico</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.OperadorLogico
	 * @see blockchain.impl.BlockchainPackageImpl#getOperadorLogico()
	 * @generated
	 */
	int OPERADOR_LOGICO = 25;

	/**
	 * The meta object id for the '{@link blockchain.Operador <em>Operador</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.Operador
	 * @see blockchain.impl.BlockchainPackageImpl#getOperador()
	 * @generated
	 */
	int OPERADOR = 26;

	/**
	 * The meta object id for the '{@link blockchain.DatoPrimitivo <em>Dato Primitivo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.DatoPrimitivo
	 * @see blockchain.impl.BlockchainPackageImpl#getDatoPrimitivo()
	 * @generated
	 */
	int DATO_PRIMITIVO = 27;

	/**
	 * The meta object id for the '{@link blockchain.OperadorRelacion <em>Operador Relacion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.OperadorRelacion
	 * @see blockchain.impl.BlockchainPackageImpl#getOperadorRelacion()
	 * @generated
	 */
	int OPERADOR_RELACION = 28;


	/**
	 * Returns the meta object for class '{@link blockchain.Aplicacion <em>Aplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aplicacion</em>'.
	 * @see blockchain.Aplicacion
	 * @generated
	 */
	EClass getAplicacion();

	/**
	 * Returns the meta object for the containment reference list '{@link blockchain.Aplicacion#getSmartcontract <em>Smartcontract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Smartcontract</em>'.
	 * @see blockchain.Aplicacion#getSmartcontract()
	 * @see #getAplicacion()
	 * @generated
	 */
	EReference getAplicacion_Smartcontract();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Aplicacion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see blockchain.Aplicacion#getName()
	 * @see #getAplicacion()
	 * @generated
	 */
	EAttribute getAplicacion_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link blockchain.Aplicacion#getTipodato <em>Tipodato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tipodato</em>'.
	 * @see blockchain.Aplicacion#getTipodato()
	 * @see #getAplicacion()
	 * @generated
	 */
	EReference getAplicacion_Tipodato();

	/**
	 * Returns the meta object for class '{@link blockchain.Entidad <em>Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad</em>'.
	 * @see blockchain.Entidad
	 * @generated
	 */
	EClass getEntidad();

	/**
	 * Returns the meta object for the containment reference list '{@link blockchain.Entidad#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see blockchain.Entidad#getAtributos()
	 * @see #getEntidad()
	 * @generated
	 */
	EReference getEntidad_Atributos();

	/**
	 * Returns the meta object for class '{@link blockchain.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see blockchain.Atributo
	 * @generated
	 */
	EClass getAtributo();

	/**
	 * Returns the meta object for the reference '{@link blockchain.Atributo#getTipodato <em>Tipodato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tipodato</em>'.
	 * @see blockchain.Atributo#getTipodato()
	 * @see #getAtributo()
	 * @generated
	 */
	EReference getAtributo_Tipodato();

	/**
	 * Returns the meta object for class '{@link blockchain.SmartContract <em>Smart Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart Contract</em>'.
	 * @see blockchain.SmartContract
	 * @generated
	 */
	EClass getSmartContract();

	/**
	 * Returns the meta object for the containment reference list '{@link blockchain.SmartContract#getEntidades <em>Entidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entidades</em>'.
	 * @see blockchain.SmartContract#getEntidades()
	 * @see #getSmartContract()
	 * @generated
	 */
	EReference getSmartContract_Entidades();

	/**
	 * Returns the meta object for the containment reference list '{@link blockchain.SmartContract#getOperaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operaciones</em>'.
	 * @see blockchain.SmartContract#getOperaciones()
	 * @see #getSmartContract()
	 * @generated
	 */
	EReference getSmartContract_Operaciones();

	/**
	 * Returns the meta object for the containment reference list '{@link blockchain.SmartContract#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Estado</em>'.
	 * @see blockchain.SmartContract#getEstado()
	 * @see #getSmartContract()
	 * @generated
	 */
	EReference getSmartContract_Estado();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.SmartContract#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see blockchain.SmartContract#getName()
	 * @see #getSmartContract()
	 * @generated
	 */
	EAttribute getSmartContract_Name();

	/**
	 * Returns the meta object for class '{@link blockchain.Operacion <em>Operacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operacion</em>'.
	 * @see blockchain.Operacion
	 * @generated
	 */
	EClass getOperacion();

	/**
	 * Returns the meta object for the containment reference list '{@link blockchain.Operacion#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametros</em>'.
	 * @see blockchain.Operacion#getParametros()
	 * @see #getOperacion()
	 * @generated
	 */
	EReference getOperacion_Parametros();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Operacion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see blockchain.Operacion#getName()
	 * @see #getOperacion()
	 * @generated
	 */
	EAttribute getOperacion_Name();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Operacion#isEsUserDefined <em>Es User Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es User Defined</em>'.
	 * @see blockchain.Operacion#isEsUserDefined()
	 * @see #getOperacion()
	 * @generated
	 */
	EAttribute getOperacion_EsUserDefined();

	/**
	 * Returns the meta object for the reference '{@link blockchain.Operacion#getRetorno <em>Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Retorno</em>'.
	 * @see blockchain.Operacion#getRetorno()
	 * @see #getOperacion()
	 * @generated
	 */
	EReference getOperacion_Retorno();

	/**
	 * Returns the meta object for the containment reference list '{@link blockchain.Operacion#getLineas <em>Lineas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lineas</em>'.
	 * @see blockchain.Operacion#getLineas()
	 * @see #getOperacion()
	 * @generated
	 */
	EReference getOperacion_Lineas();

	/**
	 * Returns the meta object for class '{@link blockchain.Parametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametro</em>'.
	 * @see blockchain.Parametro
	 * @generated
	 */
	EClass getParametro();

	/**
	 * Returns the meta object for the reference '{@link blockchain.Parametro#getTipodato <em>Tipodato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tipodato</em>'.
	 * @see blockchain.Parametro#getTipodato()
	 * @see #getParametro()
	 * @generated
	 */
	EReference getParametro_Tipodato();

	/**
	 * Returns the meta object for class '{@link blockchain.Estado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Estado</em>'.
	 * @see blockchain.Estado
	 * @generated
	 */
	EClass getEstado();

	/**
	 * Returns the meta object for the reference '{@link blockchain.Estado#getTipodato <em>Tipodato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tipodato</em>'.
	 * @see blockchain.Estado#getTipodato()
	 * @see #getEstado()
	 * @generated
	 */
	EReference getEstado_Tipodato();

	/**
	 * Returns the meta object for class '{@link blockchain.Sentencia <em>Sentencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sentencia</em>'.
	 * @see blockchain.Sentencia
	 * @generated
	 */
	EClass getSentencia();

	/**
	 * Returns the meta object for class '{@link blockchain.ExpresionLogica <em>Expresion Logica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expresion Logica</em>'.
	 * @see blockchain.ExpresionLogica
	 * @generated
	 */
	EClass getExpresionLogica();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.ExpresionLogica#getOperador <em>Operador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operador</em>'.
	 * @see blockchain.ExpresionLogica#getOperador()
	 * @see #getExpresionLogica()
	 * @generated
	 */
	EAttribute getExpresionLogica_Operador();

	/**
	 * Returns the meta object for class '{@link blockchain.Primitivo <em>Primitivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitivo</em>'.
	 * @see blockchain.Primitivo
	 * @generated
	 */
	EClass getPrimitivo();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Primitivo#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see blockchain.Primitivo#getTipo()
	 * @see #getPrimitivo()
	 * @generated
	 */
	EAttribute getPrimitivo_Tipo();

	/**
	 * Returns the meta object for class '{@link blockchain.TipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tipo Dato</em>'.
	 * @see blockchain.TipoDato
	 * @generated
	 */
	EClass getTipoDato();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.TipoDato#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see blockchain.TipoDato#getName()
	 * @see #getTipoDato()
	 * @generated
	 */
	EAttribute getTipoDato_Name();

	/**
	 * Returns the meta object for class '{@link blockchain.ExpresionAritmetica <em>Expresion Aritmetica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expresion Aritmetica</em>'.
	 * @see blockchain.ExpresionAritmetica
	 * @generated
	 */
	EClass getExpresionAritmetica();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.ExpresionAritmetica#getOperador <em>Operador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operador</em>'.
	 * @see blockchain.ExpresionAritmetica#getOperador()
	 * @see #getExpresionAritmetica()
	 * @generated
	 */
	EAttribute getExpresionAritmetica_Operador();

	/**
	 * Returns the meta object for class '{@link blockchain.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see blockchain.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the reference '{@link blockchain.Variable#getTipodato <em>Tipodato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tipodato</em>'.
	 * @see blockchain.Variable#getTipodato()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Tipodato();

	/**
	 * Returns the meta object for class '{@link blockchain.Mapa <em>Mapa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapa</em>'.
	 * @see blockchain.Mapa
	 * @generated
	 */
	EClass getMapa();

	/**
	 * Returns the meta object for the reference '{@link blockchain.Mapa#getTipoDatoKey <em>Tipo Dato Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tipo Dato Key</em>'.
	 * @see blockchain.Mapa#getTipoDatoKey()
	 * @see #getMapa()
	 * @generated
	 */
	EReference getMapa_TipoDatoKey();

	/**
	 * Returns the meta object for the reference '{@link blockchain.Mapa#getTipoDatoValue <em>Tipo Dato Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tipo Dato Value</em>'.
	 * @see blockchain.Mapa#getTipoDatoValue()
	 * @see #getMapa()
	 * @generated
	 */
	EReference getMapa_TipoDatoValue();

	/**
	 * Returns the meta object for class '{@link blockchain.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see blockchain.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link blockchain.If#getExpresionlogica <em>Expresionlogica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expresionlogica</em>'.
	 * @see blockchain.If#getExpresionlogica()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Expresionlogica();

	/**
	 * Returns the meta object for the containment reference list '{@link blockchain.If#getLineas <em>Lineas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lineas</em>'.
	 * @see blockchain.If#getLineas()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Lineas();

	/**
	 * Returns the meta object for the containment reference '{@link blockchain.If#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see blockchain.If#getElse()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Else();

	/**
	 * Returns the meta object for class '{@link blockchain.Expresion <em>Expresion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expresion</em>'.
	 * @see blockchain.Expresion
	 * @generated
	 */
	EClass getExpresion();

	/**
	 * Returns the meta object for class '{@link blockchain.ExpresionNumerica <em>Expresion Numerica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expresion Numerica</em>'.
	 * @see blockchain.ExpresionNumerica
	 * @generated
	 */
	EClass getExpresionNumerica();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.ExpresionNumerica#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see blockchain.ExpresionNumerica#getValue()
	 * @see #getExpresionNumerica()
	 * @generated
	 */
	EAttribute getExpresionNumerica_Value();

	/**
	 * Returns the meta object for class '{@link blockchain.ExpresionTexto <em>Expresion Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expresion Texto</em>'.
	 * @see blockchain.ExpresionTexto
	 * @generated
	 */
	EClass getExpresionTexto();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.ExpresionTexto#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see blockchain.ExpresionTexto#getValue()
	 * @see #getExpresionTexto()
	 * @generated
	 */
	EAttribute getExpresionTexto_Value();

	/**
	 * Returns the meta object for class '{@link blockchain.ExpresionBoolean <em>Expresion Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expresion Boolean</em>'.
	 * @see blockchain.ExpresionBoolean
	 * @generated
	 */
	EClass getExpresionBoolean();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.ExpresionBoolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see blockchain.ExpresionBoolean#isValue()
	 * @see #getExpresionBoolean()
	 * @generated
	 */
	EAttribute getExpresionBoolean_Value();

	/**
	 * Returns the meta object for class '{@link blockchain.ExpresionReferenciada <em>Expresion Referenciada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expresion Referenciada</em>'.
	 * @see blockchain.ExpresionReferenciada
	 * @generated
	 */
	EClass getExpresionReferenciada();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.ExpresionReferenciada#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see blockchain.ExpresionReferenciada#getId()
	 * @see #getExpresionReferenciada()
	 * @generated
	 */
	EAttribute getExpresionReferenciada_Id();

	/**
	 * Returns the meta object for the reference '{@link blockchain.ExpresionReferenciada#getReferencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referencia</em>'.
	 * @see blockchain.ExpresionReferenciada#getReferencia()
	 * @see #getExpresionReferenciada()
	 * @generated
	 */
	EReference getExpresionReferenciada_Referencia();

	/**
	 * Returns the meta object for class '{@link blockchain.ExpresionRelacional <em>Expresion Relacional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expresion Relacional</em>'.
	 * @see blockchain.ExpresionRelacional
	 * @generated
	 */
	EClass getExpresionRelacional();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.ExpresionRelacional#getOperadorRelacional <em>Operador Relacional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operador Relacional</em>'.
	 * @see blockchain.ExpresionRelacional#getOperadorRelacional()
	 * @see #getExpresionRelacional()
	 * @generated
	 */
	EAttribute getExpresionRelacional_OperadorRelacional();

	/**
	 * Returns the meta object for class '{@link blockchain.ExpresionBinaria <em>Expresion Binaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expresion Binaria</em>'.
	 * @see blockchain.ExpresionBinaria
	 * @generated
	 */
	EClass getExpresionBinaria();

	/**
	 * Returns the meta object for the containment reference '{@link blockchain.ExpresionBinaria#getIzq <em>Izq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Izq</em>'.
	 * @see blockchain.ExpresionBinaria#getIzq()
	 * @see #getExpresionBinaria()
	 * @generated
	 */
	EReference getExpresionBinaria_Izq();

	/**
	 * Returns the meta object for the containment reference '{@link blockchain.ExpresionBinaria#getDer <em>Der</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Der</em>'.
	 * @see blockchain.ExpresionBinaria#getDer()
	 * @see #getExpresionBinaria()
	 * @generated
	 */
	EReference getExpresionBinaria_Der();

	/**
	 * Returns the meta object for class '{@link blockchain.Linea <em>Linea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linea</em>'.
	 * @see blockchain.Linea
	 * @generated
	 */
	EClass getLinea();

	/**
	 * Returns the meta object for class '{@link blockchain.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see blockchain.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see blockchain.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link blockchain.Else <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else</em>'.
	 * @see blockchain.Else
	 * @generated
	 */
	EClass getElse();

	/**
	 * Returns the meta object for the containment reference list '{@link blockchain.Else#getLineas <em>Lineas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lineas</em>'.
	 * @see blockchain.Else#getLineas()
	 * @see #getElse()
	 * @generated
	 */
	EReference getElse_Lineas();

	/**
	 * Returns the meta object for enum '{@link blockchain.OperadorLogico <em>Operador Logico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operador Logico</em>'.
	 * @see blockchain.OperadorLogico
	 * @generated
	 */
	EEnum getOperadorLogico();

	/**
	 * Returns the meta object for enum '{@link blockchain.Operador <em>Operador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operador</em>'.
	 * @see blockchain.Operador
	 * @generated
	 */
	EEnum getOperador();

	/**
	 * Returns the meta object for enum '{@link blockchain.DatoPrimitivo <em>Dato Primitivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dato Primitivo</em>'.
	 * @see blockchain.DatoPrimitivo
	 * @generated
	 */
	EEnum getDatoPrimitivo();

	/**
	 * Returns the meta object for enum '{@link blockchain.OperadorRelacion <em>Operador Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operador Relacion</em>'.
	 * @see blockchain.OperadorRelacion
	 * @generated
	 */
	EEnum getOperadorRelacion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BlockchainFactory getBlockchainFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link blockchain.impl.AplicacionImpl <em>Aplicacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.AplicacionImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getAplicacion()
		 * @generated
		 */
		EClass APLICACION = eINSTANCE.getAplicacion();

		/**
		 * The meta object literal for the '<em><b>Smartcontract</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APLICACION__SMARTCONTRACT = eINSTANCE.getAplicacion_Smartcontract();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APLICACION__NAME = eINSTANCE.getAplicacion_Name();

		/**
		 * The meta object literal for the '<em><b>Tipodato</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APLICACION__TIPODATO = eINSTANCE.getAplicacion_Tipodato();

		/**
		 * The meta object literal for the '{@link blockchain.impl.EntidadImpl <em>Entidad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.EntidadImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getEntidad()
		 * @generated
		 */
		EClass ENTIDAD = eINSTANCE.getEntidad();

		/**
		 * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD__ATRIBUTOS = eINSTANCE.getEntidad_Atributos();

		/**
		 * The meta object literal for the '{@link blockchain.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.AtributoImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getAtributo()
		 * @generated
		 */
		EClass ATRIBUTO = eINSTANCE.getAtributo();

		/**
		 * The meta object literal for the '<em><b>Tipodato</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATRIBUTO__TIPODATO = eINSTANCE.getAtributo_Tipodato();

		/**
		 * The meta object literal for the '{@link blockchain.impl.SmartContractImpl <em>Smart Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.SmartContractImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getSmartContract()
		 * @generated
		 */
		EClass SMART_CONTRACT = eINSTANCE.getSmartContract();

		/**
		 * The meta object literal for the '<em><b>Entidades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_CONTRACT__ENTIDADES = eINSTANCE.getSmartContract_Entidades();

		/**
		 * The meta object literal for the '<em><b>Operaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_CONTRACT__OPERACIONES = eINSTANCE.getSmartContract_Operaciones();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_CONTRACT__ESTADO = eINSTANCE.getSmartContract_Estado();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_CONTRACT__NAME = eINSTANCE.getSmartContract_Name();

		/**
		 * The meta object literal for the '{@link blockchain.impl.OperacionImpl <em>Operacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.OperacionImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getOperacion()
		 * @generated
		 */
		EClass OPERACION = eINSTANCE.getOperacion();

		/**
		 * The meta object literal for the '<em><b>Parametros</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERACION__PARAMETROS = eINSTANCE.getOperacion_Parametros();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERACION__NAME = eINSTANCE.getOperacion_Name();

		/**
		 * The meta object literal for the '<em><b>Es User Defined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERACION__ES_USER_DEFINED = eINSTANCE.getOperacion_EsUserDefined();

		/**
		 * The meta object literal for the '<em><b>Retorno</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERACION__RETORNO = eINSTANCE.getOperacion_Retorno();

		/**
		 * The meta object literal for the '<em><b>Lineas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERACION__LINEAS = eINSTANCE.getOperacion_Lineas();

		/**
		 * The meta object literal for the '{@link blockchain.impl.ParametroImpl <em>Parametro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.ParametroImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getParametro()
		 * @generated
		 */
		EClass PARAMETRO = eINSTANCE.getParametro();

		/**
		 * The meta object literal for the '<em><b>Tipodato</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETRO__TIPODATO = eINSTANCE.getParametro_Tipodato();

		/**
		 * The meta object literal for the '{@link blockchain.impl.EstadoImpl <em>Estado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.EstadoImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getEstado()
		 * @generated
		 */
		EClass ESTADO = eINSTANCE.getEstado();

		/**
		 * The meta object literal for the '<em><b>Tipodato</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTADO__TIPODATO = eINSTANCE.getEstado_Tipodato();

		/**
		 * The meta object literal for the '{@link blockchain.Sentencia <em>Sentencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.Sentencia
		 * @see blockchain.impl.BlockchainPackageImpl#getSentencia()
		 * @generated
		 */
		EClass SENTENCIA = eINSTANCE.getSentencia();

		/**
		 * The meta object literal for the '{@link blockchain.impl.ExpresionLogicaImpl <em>Expresion Logica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.ExpresionLogicaImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getExpresionLogica()
		 * @generated
		 */
		EClass EXPRESION_LOGICA = eINSTANCE.getExpresionLogica();

		/**
		 * The meta object literal for the '<em><b>Operador</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESION_LOGICA__OPERADOR = eINSTANCE.getExpresionLogica_Operador();

		/**
		 * The meta object literal for the '{@link blockchain.impl.PrimitivoImpl <em>Primitivo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.PrimitivoImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getPrimitivo()
		 * @generated
		 */
		EClass PRIMITIVO = eINSTANCE.getPrimitivo();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVO__TIPO = eINSTANCE.getPrimitivo_Tipo();

		/**
		 * The meta object literal for the '{@link blockchain.impl.TipoDatoImpl <em>Tipo Dato</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.TipoDatoImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getTipoDato()
		 * @generated
		 */
		EClass TIPO_DATO = eINSTANCE.getTipoDato();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIPO_DATO__NAME = eINSTANCE.getTipoDato_Name();

		/**
		 * The meta object literal for the '{@link blockchain.impl.ExpresionAritmeticaImpl <em>Expresion Aritmetica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.ExpresionAritmeticaImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getExpresionAritmetica()
		 * @generated
		 */
		EClass EXPRESION_ARITMETICA = eINSTANCE.getExpresionAritmetica();

		/**
		 * The meta object literal for the '<em><b>Operador</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESION_ARITMETICA__OPERADOR = eINSTANCE.getExpresionAritmetica_Operador();

		/**
		 * The meta object literal for the '{@link blockchain.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.VariableImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Tipodato</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TIPODATO = eINSTANCE.getVariable_Tipodato();

		/**
		 * The meta object literal for the '{@link blockchain.impl.MapaImpl <em>Mapa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.MapaImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getMapa()
		 * @generated
		 */
		EClass MAPA = eINSTANCE.getMapa();

		/**
		 * The meta object literal for the '<em><b>Tipo Dato Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPA__TIPO_DATO_KEY = eINSTANCE.getMapa_TipoDatoKey();

		/**
		 * The meta object literal for the '<em><b>Tipo Dato Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPA__TIPO_DATO_VALUE = eINSTANCE.getMapa_TipoDatoValue();

		/**
		 * The meta object literal for the '{@link blockchain.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.IfImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Expresionlogica</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__EXPRESIONLOGICA = eINSTANCE.getIf_Expresionlogica();

		/**
		 * The meta object literal for the '<em><b>Lineas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__LINEAS = eINSTANCE.getIf_Lineas();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE = eINSTANCE.getIf_Else();

		/**
		 * The meta object literal for the '{@link blockchain.Expresion <em>Expresion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.Expresion
		 * @see blockchain.impl.BlockchainPackageImpl#getExpresion()
		 * @generated
		 */
		EClass EXPRESION = eINSTANCE.getExpresion();

		/**
		 * The meta object literal for the '{@link blockchain.impl.ExpresionNumericaImpl <em>Expresion Numerica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.ExpresionNumericaImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getExpresionNumerica()
		 * @generated
		 */
		EClass EXPRESION_NUMERICA = eINSTANCE.getExpresionNumerica();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESION_NUMERICA__VALUE = eINSTANCE.getExpresionNumerica_Value();

		/**
		 * The meta object literal for the '{@link blockchain.impl.ExpresionTextoImpl <em>Expresion Texto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.ExpresionTextoImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getExpresionTexto()
		 * @generated
		 */
		EClass EXPRESION_TEXTO = eINSTANCE.getExpresionTexto();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESION_TEXTO__VALUE = eINSTANCE.getExpresionTexto_Value();

		/**
		 * The meta object literal for the '{@link blockchain.impl.ExpresionBooleanImpl <em>Expresion Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.ExpresionBooleanImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getExpresionBoolean()
		 * @generated
		 */
		EClass EXPRESION_BOOLEAN = eINSTANCE.getExpresionBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESION_BOOLEAN__VALUE = eINSTANCE.getExpresionBoolean_Value();

		/**
		 * The meta object literal for the '{@link blockchain.impl.ExpresionReferenciadaImpl <em>Expresion Referenciada</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.ExpresionReferenciadaImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getExpresionReferenciada()
		 * @generated
		 */
		EClass EXPRESION_REFERENCIADA = eINSTANCE.getExpresionReferenciada();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESION_REFERENCIADA__ID = eINSTANCE.getExpresionReferenciada_Id();

		/**
		 * The meta object literal for the '<em><b>Referencia</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESION_REFERENCIADA__REFERENCIA = eINSTANCE.getExpresionReferenciada_Referencia();

		/**
		 * The meta object literal for the '{@link blockchain.impl.ExpresionRelacionalImpl <em>Expresion Relacional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.ExpresionRelacionalImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getExpresionRelacional()
		 * @generated
		 */
		EClass EXPRESION_RELACIONAL = eINSTANCE.getExpresionRelacional();

		/**
		 * The meta object literal for the '<em><b>Operador Relacional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESION_RELACIONAL__OPERADOR_RELACIONAL = eINSTANCE.getExpresionRelacional_OperadorRelacional();

		/**
		 * The meta object literal for the '{@link blockchain.impl.ExpresionBinariaImpl <em>Expresion Binaria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.ExpresionBinariaImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getExpresionBinaria()
		 * @generated
		 */
		EClass EXPRESION_BINARIA = eINSTANCE.getExpresionBinaria();

		/**
		 * The meta object literal for the '<em><b>Izq</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESION_BINARIA__IZQ = eINSTANCE.getExpresionBinaria_Izq();

		/**
		 * The meta object literal for the '<em><b>Der</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESION_BINARIA__DER = eINSTANCE.getExpresionBinaria_Der();

		/**
		 * The meta object literal for the '{@link blockchain.Linea <em>Linea</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.Linea
		 * @see blockchain.impl.BlockchainPackageImpl#getLinea()
		 * @generated
		 */
		EClass LINEA = eINSTANCE.getLinea();

		/**
		 * The meta object literal for the '{@link blockchain.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.NamedElementImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link blockchain.impl.ElseImpl <em>Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.ElseImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getElse()
		 * @generated
		 */
		EClass ELSE = eINSTANCE.getElse();

		/**
		 * The meta object literal for the '<em><b>Lineas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE__LINEAS = eINSTANCE.getElse_Lineas();

		/**
		 * The meta object literal for the '{@link blockchain.OperadorLogico <em>Operador Logico</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.OperadorLogico
		 * @see blockchain.impl.BlockchainPackageImpl#getOperadorLogico()
		 * @generated
		 */
		EEnum OPERADOR_LOGICO = eINSTANCE.getOperadorLogico();

		/**
		 * The meta object literal for the '{@link blockchain.Operador <em>Operador</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.Operador
		 * @see blockchain.impl.BlockchainPackageImpl#getOperador()
		 * @generated
		 */
		EEnum OPERADOR = eINSTANCE.getOperador();

		/**
		 * The meta object literal for the '{@link blockchain.DatoPrimitivo <em>Dato Primitivo</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.DatoPrimitivo
		 * @see blockchain.impl.BlockchainPackageImpl#getDatoPrimitivo()
		 * @generated
		 */
		EEnum DATO_PRIMITIVO = eINSTANCE.getDatoPrimitivo();

		/**
		 * The meta object literal for the '{@link blockchain.OperadorRelacion <em>Operador Relacion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.OperadorRelacion
		 * @see blockchain.impl.BlockchainPackageImpl#getOperadorRelacion()
		 * @generated
		 */
		EEnum OPERADOR_RELACION = eINSTANCE.getOperadorRelacion();

	}

} //BlockchainPackage
