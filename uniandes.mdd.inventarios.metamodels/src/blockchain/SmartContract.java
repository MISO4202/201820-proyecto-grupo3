/**
 */
package blockchain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.SmartContract#getEntidades <em>Entidades</em>}</li>
 *   <li>{@link blockchain.SmartContract#getOperaciones <em>Operaciones</em>}</li>
 *   <li>{@link blockchain.SmartContract#getEstado <em>Estado</em>}</li>
 *   <li>{@link blockchain.SmartContract#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getSmartContract()
 * @model
 * @generated
 */
public interface SmartContract extends EObject {
	/**
	 * Returns the value of the '<em><b>Entidades</b></em>' containment reference list.
	 * The list contents are of type {@link blockchain.Entidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidades</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidades</em>' containment reference list.
	 * @see blockchain.BlockchainPackage#getSmartContract_Entidades()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entidad> getEntidades();

	/**
	 * Returns the value of the '<em><b>Operaciones</b></em>' containment reference list.
	 * The list contents are of type {@link blockchain.Operacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operaciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operaciones</em>' containment reference list.
	 * @see blockchain.BlockchainPackage#getSmartContract_Operaciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operacion> getOperaciones();

	/**
	 * Returns the value of the '<em><b>Estado</b></em>' containment reference list.
	 * The list contents are of type {@link blockchain.Estado}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estado</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado</em>' containment reference list.
	 * @see blockchain.BlockchainPackage#getSmartContract_Estado()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Estado> getEstado();

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
	 * @see blockchain.BlockchainPackage#getSmartContract_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link blockchain.SmartContract#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SmartContract
