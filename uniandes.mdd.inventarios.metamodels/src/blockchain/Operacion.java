/**
 */
package blockchain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Operacion#getParametros <em>Parametros</em>}</li>
 *   <li>{@link blockchain.Operacion#getName <em>Name</em>}</li>
 *   <li>{@link blockchain.Operacion#isEsUserDefined <em>Es User Defined</em>}</li>
 *   <li>{@link blockchain.Operacion#getRetorno <em>Retorno</em>}</li>
 *   <li>{@link blockchain.Operacion#getLineas <em>Lineas</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getOperacion()
 * @model
 * @generated
 */
public interface Operacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Parametros</b></em>' containment reference list.
	 * The list contents are of type {@link blockchain.Parametro}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametros</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametros</em>' containment reference list.
	 * @see blockchain.BlockchainPackage#getOperacion_Parametros()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parametro> getParametros();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see blockchain.BlockchainPackage#getOperacion_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link blockchain.Operacion#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Es User Defined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es User Defined</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es User Defined</em>' attribute.
	 * @see #setEsUserDefined(boolean)
	 * @see blockchain.BlockchainPackage#getOperacion_EsUserDefined()
	 * @model
	 * @generated
	 */
	boolean isEsUserDefined();

	/**
	 * Sets the value of the '{@link blockchain.Operacion#isEsUserDefined <em>Es User Defined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es User Defined</em>' attribute.
	 * @see #isEsUserDefined()
	 * @generated
	 */
	void setEsUserDefined(boolean value);

	/**
	 * Returns the value of the '<em><b>Retorno</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retorno</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retorno</em>' reference.
	 * @see #setRetorno(TipoDato)
	 * @see blockchain.BlockchainPackage#getOperacion_Retorno()
	 * @model
	 * @generated
	 */
	TipoDato getRetorno();

	/**
	 * Sets the value of the '{@link blockchain.Operacion#getRetorno <em>Retorno</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retorno</em>' reference.
	 * @see #getRetorno()
	 * @generated
	 */
	void setRetorno(TipoDato value);

	/**
	 * Returns the value of the '<em><b>Lineas</b></em>' containment reference list.
	 * The list contents are of type {@link blockchain.Linea}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lineas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lineas</em>' containment reference list.
	 * @see blockchain.BlockchainPackage#getOperacion_Lineas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Linea> getLineas();

} // Operacion
