/**
 */
package blockchain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aplicacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Aplicacion#getSmartcontract <em>Smartcontract</em>}</li>
 *   <li>{@link blockchain.Aplicacion#getName <em>Name</em>}</li>
 *   <li>{@link blockchain.Aplicacion#getTipodato <em>Tipodato</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getAplicacion()
 * @model
 * @generated
 */
public interface Aplicacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Smartcontract</b></em>' containment reference list.
	 * The list contents are of type {@link blockchain.SmartContract}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smartcontract</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smartcontract</em>' containment reference list.
	 * @see blockchain.BlockchainPackage#getAplicacion_Smartcontract()
	 * @model containment="true"
	 * @generated
	 */
	EList<SmartContract> getSmartcontract();

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
	 * @see blockchain.BlockchainPackage#getAplicacion_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link blockchain.Aplicacion#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tipodato</b></em>' containment reference list.
	 * The list contents are of type {@link blockchain.TipoDato}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipodato</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipodato</em>' containment reference list.
	 * @see blockchain.BlockchainPackage#getAplicacion_Tipodato()
	 * @model containment="true"
	 * @generated
	 */
	EList<TipoDato> getTipodato();

} // Aplicacion
