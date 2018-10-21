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
	 * The number of structural features of the '<em>Aplicacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION_FEATURE_COUNT = 2;

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
	int TIPO_DATO = 12;

	/**
	 * The number of structural features of the '<em>Tipo Dato</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DATO_FEATURE_COUNT = 0;

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
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__ATRIBUTOS = TIPO_DATO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__NAME = TIPO_DATO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_FEATURE_COUNT = TIPO_DATO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_OPERATION_COUNT = TIPO_DATO_OPERATION_COUNT + 0;

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
	int ATRIBUTO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tipodato</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__TIPODATO = 1;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Sentencia</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__SENTENCIA = 2;

	/**
	 * The feature id for the '<em><b>Retorno</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__RETORNO = 3;

	/**
	 * The feature id for the '<em><b>Es User Defined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACION__ES_USER_DEFINED = 4;

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
	int PARAMETRO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tipo Dato</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO__TIPO_DATO = 1;

	/**
	 * The number of structural features of the '<em>Parametro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parametro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.SentenciaImpl <em>Sentencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.SentenciaImpl
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
	int SENTENCIA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Sentencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCIA_OPERATION_COUNT = 0;

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
	int ESTADO__NAME = SENTENCIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tipodato</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO__TIPODATO = SENTENCIA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Estado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO_FEATURE_COUNT = SENTENCIA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Estado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTADO_OPERATION_COUNT = SENTENCIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.ExpresionImpl <em>Expresion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.ExpresionImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getExpresion()
	 * @generated
	 */
	int EXPRESION = 18;

	/**
	 * The feature id for the '<em><b>Lado Izq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION__LADO_IZQ = SENTENCIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lado Der</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION__LADO_DER = SENTENCIA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expresion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_FEATURE_COUNT = SENTENCIA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expresion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_OPERATION_COUNT = SENTENCIA_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Lado Izq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_LOGICA__LADO_IZQ = EXPRESION__LADO_IZQ;

	/**
	 * The feature id for the '<em><b>Lado Der</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_LOGICA__LADO_DER = EXPRESION__LADO_DER;

	/**
	 * The feature id for the '<em><b>Operador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_LOGICA__OPERADOR = EXPRESION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expresion Logica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_LOGICA_FEATURE_COUNT = EXPRESION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expresion Logica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_LOGICA_OPERATION_COUNT = EXPRESION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.RetornoImpl <em>Retorno</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.RetornoImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getRetorno()
	 * @generated
	 */
	int RETORNO = 9;

	/**
	 * The number of structural features of the '<em>Retorno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETORNO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Retorno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETORNO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.AsignacionImpl <em>Asignacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.AsignacionImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getAsignacion()
	 * @generated
	 */
	int ASIGNACION = 10;

	/**
	 * The feature id for the '<em><b>Operador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION__OPERADOR = 0;

	/**
	 * The number of structural features of the '<em>Asignacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Asignacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.PrimitivoImpl <em>Primitivo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.PrimitivoImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getPrimitivo()
	 * @generated
	 */
	int PRIMITIVO = 11;

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
	int EXPRESION_ARITMETICA = 13;

	/**
	 * The feature id for the '<em><b>Lado Izq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_ARITMETICA__LADO_IZQ = EXPRESION__LADO_IZQ;

	/**
	 * The feature id for the '<em><b>Lado Der</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_ARITMETICA__LADO_DER = EXPRESION__LADO_DER;

	/**
	 * The feature id for the '<em><b>Operador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_ARITMETICA__OPERADOR = EXPRESION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expresion Aritmetica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_ARITMETICA_FEATURE_COUNT = EXPRESION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expresion Aritmetica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_ARITMETICA_OPERATION_COUNT = EXPRESION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.VariableImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 14;

	/**
	 * The feature id for the '<em><b>Tipo Dato</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TIPO_DATO = SENTENCIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = SENTENCIA_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link blockchain.impl.SeqImpl <em>Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.SeqImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getSeq()
	 * @generated
	 */
	int SEQ = 15;

	/**
	 * The feature id for the '<em><b>Tipo Dato</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__TIPO_DATO = TIPO_DATO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FEATURE_COUNT = TIPO_DATO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_OPERATION_COUNT = TIPO_DATO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.MapImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 16;

	/**
	 * The feature id for the '<em><b>Tipo Dato Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__TIPO_DATO_KEY = TIPO_DATO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tipo Dato Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__TIPO_DATO_VALUE = TIPO_DATO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = TIPO_DATO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OPERATION_COUNT = TIPO_DATO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.CondicionalImpl <em>Condicional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.CondicionalImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getCondicional()
	 * @generated
	 */
	int CONDICIONAL = 17;

	/**
	 * The feature id for the '<em><b>Tipo Condicional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDICIONAL__TIPO_CONDICIONAL = 0;

	/**
	 * The feature id for the '<em><b>Expresionlogica</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDICIONAL__EXPRESIONLOGICA = 1;

	/**
	 * The number of structural features of the '<em>Condicional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDICIONAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Condicional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDICIONAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.ValorElementosImpl <em>Valor Elementos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.ValorElementosImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getValorElementos()
	 * @generated
	 */
	int VALOR_ELEMENTOS = 19;

	/**
	 * The number of structural features of the '<em>Valor Elementos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_ELEMENTOS_FEATURE_COUNT = SENTENCIA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Valor Elementos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALOR_ELEMENTOS_OPERATION_COUNT = SENTENCIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.ExpresionNumericaImpl <em>Expresion Numerica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.ExpresionNumericaImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getExpresionNumerica()
	 * @generated
	 */
	int EXPRESION_NUMERICA = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_NUMERICA__VALUE = VALOR_ELEMENTOS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expresion Numerica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_NUMERICA_FEATURE_COUNT = VALOR_ELEMENTOS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expresion Numerica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_NUMERICA_OPERATION_COUNT = VALOR_ELEMENTOS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.ExpresionTextoImpl <em>Expresion Texto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.ExpresionTextoImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getExpresionTexto()
	 * @generated
	 */
	int EXPRESION_TEXTO = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_TEXTO__VALUE = VALOR_ELEMENTOS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expresion Texto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_TEXTO_FEATURE_COUNT = VALOR_ELEMENTOS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expresion Texto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_TEXTO_OPERATION_COUNT = VALOR_ELEMENTOS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.ExpresionBooleanImpl <em>Expresion Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.ExpresionBooleanImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getExpresionBoolean()
	 * @generated
	 */
	int EXPRESION_BOOLEAN = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_BOOLEAN__VALUE = VALOR_ELEMENTOS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expresion Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_BOOLEAN_FEATURE_COUNT = VALOR_ELEMENTOS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expresion Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_BOOLEAN_OPERATION_COUNT = VALOR_ELEMENTOS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.ExpresionReferenciadaImpl <em>Expresion Referenciada</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.ExpresionReferenciadaImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getExpresionReferenciada()
	 * @generated
	 */
	int EXPRESION_REFERENCIADA = 23;

	/**
	 * The feature id for the '<em><b>Tipodato</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_REFERENCIADA__TIPODATO = VALOR_ELEMENTOS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expresion Referenciada</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_REFERENCIADA_FEATURE_COUNT = VALOR_ELEMENTOS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expresion Referenciada</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_REFERENCIADA_OPERATION_COUNT = VALOR_ELEMENTOS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockchain.OperadorLogico <em>Operador Logico</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.OperadorLogico
	 * @see blockchain.impl.BlockchainPackageImpl#getOperadorLogico()
	 * @generated
	 */
	int OPERADOR_LOGICO = 24;

	/**
	 * The meta object id for the '{@link blockchain.Operador <em>Operador</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.Operador
	 * @see blockchain.impl.BlockchainPackageImpl#getOperador()
	 * @generated
	 */
	int OPERADOR = 25;

	/**
	 * The meta object id for the '{@link blockchain.DatoPrimitivo <em>Dato Primitivo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.DatoPrimitivo
	 * @see blockchain.impl.BlockchainPackageImpl#getDatoPrimitivo()
	 * @generated
	 */
	int DATO_PRIMITIVO = 26;

	/**
	 * The meta object id for the '{@link blockchain.TipoCondicion <em>Tipo Condicion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.TipoCondicion
	 * @see blockchain.impl.BlockchainPackageImpl#getTipoCondicion()
	 * @generated
	 */
	int TIPO_CONDICION = 27;


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
	 * Returns the meta object for the attribute '{@link blockchain.Entidad#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see blockchain.Entidad#getName()
	 * @see #getEntidad()
	 * @generated
	 */
	EAttribute getEntidad_Name();

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
	 * Returns the meta object for the attribute '{@link blockchain.Atributo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see blockchain.Atributo#getName()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Name();

	/**
	 * Returns the meta object for the containment reference '{@link blockchain.Atributo#getTipodato <em>Tipodato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tipodato</em>'.
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
	 * Returns the meta object for the containment reference list '{@link blockchain.Operacion#getSentencia <em>Sentencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sentencia</em>'.
	 * @see blockchain.Operacion#getSentencia()
	 * @see #getOperacion()
	 * @generated
	 */
	EReference getOperacion_Sentencia();

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
	 * Returns the meta object for class '{@link blockchain.Parametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametro</em>'.
	 * @see blockchain.Parametro
	 * @generated
	 */
	EClass getParametro();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Parametro#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see blockchain.Parametro#getName()
	 * @see #getParametro()
	 * @generated
	 */
	EAttribute getParametro_Name();

	/**
	 * Returns the meta object for the reference '{@link blockchain.Parametro#getTipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tipo Dato</em>'.
	 * @see blockchain.Parametro#getTipoDato()
	 * @see #getParametro()
	 * @generated
	 */
	EReference getParametro_TipoDato();

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
	 * Returns the meta object for the attribute '{@link blockchain.Estado#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see blockchain.Estado#getName()
	 * @see #getEstado()
	 * @generated
	 */
	EAttribute getEstado_Name();

	/**
	 * Returns the meta object for the containment reference '{@link blockchain.Estado#getTipodato <em>Tipodato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tipodato</em>'.
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
	 * Returns the meta object for class '{@link blockchain.Retorno <em>Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retorno</em>'.
	 * @see blockchain.Retorno
	 * @generated
	 */
	EClass getRetorno();

	/**
	 * Returns the meta object for class '{@link blockchain.Asignacion <em>Asignacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asignacion</em>'.
	 * @see blockchain.Asignacion
	 * @generated
	 */
	EClass getAsignacion();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Asignacion#getOperador <em>Operador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operador</em>'.
	 * @see blockchain.Asignacion#getOperador()
	 * @see #getAsignacion()
	 * @generated
	 */
	EAttribute getAsignacion_Operador();

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
	 * Returns the meta object for the reference '{@link blockchain.Variable#getTipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tipo Dato</em>'.
	 * @see blockchain.Variable#getTipoDato()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_TipoDato();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see blockchain.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link blockchain.Seq <em>Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seq</em>'.
	 * @see blockchain.Seq
	 * @generated
	 */
	EClass getSeq();

	/**
	 * Returns the meta object for the reference '{@link blockchain.Seq#getTipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tipo Dato</em>'.
	 * @see blockchain.Seq#getTipoDato()
	 * @see #getSeq()
	 * @generated
	 */
	EReference getSeq_TipoDato();

	/**
	 * Returns the meta object for class '{@link blockchain.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see blockchain.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the reference '{@link blockchain.Map#getTipoDatoKey <em>Tipo Dato Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tipo Dato Key</em>'.
	 * @see blockchain.Map#getTipoDatoKey()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_TipoDatoKey();

	/**
	 * Returns the meta object for the reference '{@link blockchain.Map#getTipoDatoValue <em>Tipo Dato Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tipo Dato Value</em>'.
	 * @see blockchain.Map#getTipoDatoValue()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_TipoDatoValue();

	/**
	 * Returns the meta object for class '{@link blockchain.Condicional <em>Condicional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condicional</em>'.
	 * @see blockchain.Condicional
	 * @generated
	 */
	EClass getCondicional();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Condicional#getTipoCondicional <em>Tipo Condicional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Condicional</em>'.
	 * @see blockchain.Condicional#getTipoCondicional()
	 * @see #getCondicional()
	 * @generated
	 */
	EAttribute getCondicional_TipoCondicional();

	/**
	 * Returns the meta object for the containment reference list '{@link blockchain.Condicional#getExpresionlogica <em>Expresionlogica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expresionlogica</em>'.
	 * @see blockchain.Condicional#getExpresionlogica()
	 * @see #getCondicional()
	 * @generated
	 */
	EReference getCondicional_Expresionlogica();

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
	 * Returns the meta object for the reference '{@link blockchain.Expresion#getLadoIzq <em>Lado Izq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lado Izq</em>'.
	 * @see blockchain.Expresion#getLadoIzq()
	 * @see #getExpresion()
	 * @generated
	 */
	EReference getExpresion_LadoIzq();

	/**
	 * Returns the meta object for the reference '{@link blockchain.Expresion#getLadoDer <em>Lado Der</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lado Der</em>'.
	 * @see blockchain.Expresion#getLadoDer()
	 * @see #getExpresion()
	 * @generated
	 */
	EReference getExpresion_LadoDer();

	/**
	 * Returns the meta object for class '{@link blockchain.ValorElementos <em>Valor Elementos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valor Elementos</em>'.
	 * @see blockchain.ValorElementos
	 * @generated
	 */
	EClass getValorElementos();

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
	 * Returns the meta object for the reference '{@link blockchain.ExpresionReferenciada#getTipodato <em>Tipodato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tipodato</em>'.
	 * @see blockchain.ExpresionReferenciada#getTipodato()
	 * @see #getExpresionReferenciada()
	 * @generated
	 */
	EReference getExpresionReferenciada_Tipodato();

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
	 * Returns the meta object for enum '{@link blockchain.TipoCondicion <em>Tipo Condicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Condicion</em>'.
	 * @see blockchain.TipoCondicion
	 * @generated
	 */
	EEnum getTipoCondicion();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTIDAD__NAME = eINSTANCE.getEntidad_Name();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__NAME = eINSTANCE.getAtributo_Name();

		/**
		 * The meta object literal for the '<em><b>Tipodato</b></em>' containment reference feature.
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
		 * The meta object literal for the '<em><b>Sentencia</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERACION__SENTENCIA = eINSTANCE.getOperacion_Sentencia();

		/**
		 * The meta object literal for the '<em><b>Retorno</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERACION__RETORNO = eINSTANCE.getOperacion_Retorno();

		/**
		 * The meta object literal for the '<em><b>Es User Defined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERACION__ES_USER_DEFINED = eINSTANCE.getOperacion_EsUserDefined();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETRO__NAME = eINSTANCE.getParametro_Name();

		/**
		 * The meta object literal for the '<em><b>Tipo Dato</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETRO__TIPO_DATO = eINSTANCE.getParametro_TipoDato();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTADO__NAME = eINSTANCE.getEstado_Name();

		/**
		 * The meta object literal for the '<em><b>Tipodato</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTADO__TIPODATO = eINSTANCE.getEstado_Tipodato();

		/**
		 * The meta object literal for the '{@link blockchain.impl.SentenciaImpl <em>Sentencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.SentenciaImpl
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
		 * The meta object literal for the '{@link blockchain.impl.RetornoImpl <em>Retorno</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.RetornoImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getRetorno()
		 * @generated
		 */
		EClass RETORNO = eINSTANCE.getRetorno();

		/**
		 * The meta object literal for the '{@link blockchain.impl.AsignacionImpl <em>Asignacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.AsignacionImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getAsignacion()
		 * @generated
		 */
		EClass ASIGNACION = eINSTANCE.getAsignacion();

		/**
		 * The meta object literal for the '<em><b>Operador</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASIGNACION__OPERADOR = eINSTANCE.getAsignacion_Operador();

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
		 * The meta object literal for the '<em><b>Tipo Dato</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TIPO_DATO = eINSTANCE.getVariable_TipoDato();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link blockchain.impl.SeqImpl <em>Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.SeqImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getSeq()
		 * @generated
		 */
		EClass SEQ = eINSTANCE.getSeq();

		/**
		 * The meta object literal for the '<em><b>Tipo Dato</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQ__TIPO_DATO = eINSTANCE.getSeq_TipoDato();

		/**
		 * The meta object literal for the '{@link blockchain.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.MapImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getMap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em><b>Tipo Dato Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__TIPO_DATO_KEY = eINSTANCE.getMap_TipoDatoKey();

		/**
		 * The meta object literal for the '<em><b>Tipo Dato Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__TIPO_DATO_VALUE = eINSTANCE.getMap_TipoDatoValue();

		/**
		 * The meta object literal for the '{@link blockchain.impl.CondicionalImpl <em>Condicional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.CondicionalImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getCondicional()
		 * @generated
		 */
		EClass CONDICIONAL = eINSTANCE.getCondicional();

		/**
		 * The meta object literal for the '<em><b>Tipo Condicional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDICIONAL__TIPO_CONDICIONAL = eINSTANCE.getCondicional_TipoCondicional();

		/**
		 * The meta object literal for the '<em><b>Expresionlogica</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDICIONAL__EXPRESIONLOGICA = eINSTANCE.getCondicional_Expresionlogica();

		/**
		 * The meta object literal for the '{@link blockchain.impl.ExpresionImpl <em>Expresion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.ExpresionImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getExpresion()
		 * @generated
		 */
		EClass EXPRESION = eINSTANCE.getExpresion();

		/**
		 * The meta object literal for the '<em><b>Lado Izq</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESION__LADO_IZQ = eINSTANCE.getExpresion_LadoIzq();

		/**
		 * The meta object literal for the '<em><b>Lado Der</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESION__LADO_DER = eINSTANCE.getExpresion_LadoDer();

		/**
		 * The meta object literal for the '{@link blockchain.impl.ValorElementosImpl <em>Valor Elementos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.ValorElementosImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getValorElementos()
		 * @generated
		 */
		EClass VALOR_ELEMENTOS = eINSTANCE.getValorElementos();

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
		 * The meta object literal for the '<em><b>Tipodato</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESION_REFERENCIADA__TIPODATO = eINSTANCE.getExpresionReferenciada_Tipodato();

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
		 * The meta object literal for the '{@link blockchain.TipoCondicion <em>Tipo Condicion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.TipoCondicion
		 * @see blockchain.impl.BlockchainPackageImpl#getTipoCondicion()
		 * @generated
		 */
		EEnum TIPO_CONDICION = eINSTANCE.getTipoCondicion();

	}

} //BlockchainPackage
