/**
 */
package blockchain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Else</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Else#getLineas <em>Lineas</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getElse()
 * @model
 * @generated
 */
public interface Else extends EObject {
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
	 * @see blockchain.BlockchainPackage#getElse_Lineas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Linea> getLineas();

} // Else
