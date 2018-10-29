/**
 */
package blockchain;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see blockchain.BlockchainPackage
 * @generated
 */
public interface BlockchainFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BlockchainFactory eINSTANCE = blockchain.impl.BlockchainFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Aplicacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aplicacion</em>'.
	 * @generated
	 */
	Aplicacion createAplicacion();

	/**
	 * Returns a new object of class '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entidad</em>'.
	 * @generated
	 */
	Entidad createEntidad();

	/**
	 * Returns a new object of class '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo</em>'.
	 * @generated
	 */
	Atributo createAtributo();

	/**
	 * Returns a new object of class '<em>Smart Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smart Contract</em>'.
	 * @generated
	 */
	SmartContract createSmartContract();

	/**
	 * Returns a new object of class '<em>Operacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operacion</em>'.
	 * @generated
	 */
	Operacion createOperacion();

	/**
	 * Returns a new object of class '<em>Parametro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parametro</em>'.
	 * @generated
	 */
	Parametro createParametro();

	/**
	 * Returns a new object of class '<em>Estado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Estado</em>'.
	 * @generated
	 */
	Estado createEstado();

	/**
	 * Returns a new object of class '<em>Expresion Logica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expresion Logica</em>'.
	 * @generated
	 */
	ExpresionLogica createExpresionLogica();

	/**
	 * Returns a new object of class '<em>Primitivo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitivo</em>'.
	 * @generated
	 */
	Primitivo createPrimitivo();

	/**
	 * Returns a new object of class '<em>Expresion Aritmetica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expresion Aritmetica</em>'.
	 * @generated
	 */
	ExpresionAritmetica createExpresionAritmetica();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Mapa</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapa</em>'.
	 * @generated
	 */
	Mapa createMapa();

	/**
	 * Returns a new object of class '<em>Condicional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condicional</em>'.
	 * @generated
	 */
	Condicional createCondicional();

	/**
	 * Returns a new object of class '<em>Expresion Numerica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expresion Numerica</em>'.
	 * @generated
	 */
	ExpresionNumerica createExpresionNumerica();

	/**
	 * Returns a new object of class '<em>Expresion Texto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expresion Texto</em>'.
	 * @generated
	 */
	ExpresionTexto createExpresionTexto();

	/**
	 * Returns a new object of class '<em>Expresion Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expresion Boolean</em>'.
	 * @generated
	 */
	ExpresionBoolean createExpresionBoolean();

	/**
	 * Returns a new object of class '<em>Expresion Referenciada</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expresion Referenciada</em>'.
	 * @generated
	 */
	ExpresionReferenciada createExpresionReferenciada();

	/**
	 * Returns a new object of class '<em>Expresion Relacional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expresion Relacional</em>'.
	 * @generated
	 */
	ExpresionRelacional createExpresionRelacional();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BlockchainPackage getBlockchainPackage();

} //BlockchainFactory
