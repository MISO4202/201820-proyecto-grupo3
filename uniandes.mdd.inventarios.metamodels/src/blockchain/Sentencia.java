/**
 */
package blockchain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sentencia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Sentencia#getEstado <em>Estado</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getSentencia()
 * @model abstract="true"
 * @generated
 */
public interface Sentencia extends EObject {

	/**
	 * Returns the value of the '<em><b>Estado</b></em>' reference list.
	 * The list contents are of type {@link blockchain.Estado}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estado</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado</em>' reference list.
	 * @see blockchain.BlockchainPackage#getSentencia_Estado()
	 * @model
	 * @generated
	 */
	EList<Estado> getEstado();
} // Sentencia
