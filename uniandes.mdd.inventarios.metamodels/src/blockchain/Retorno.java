/**
 */
package blockchain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Retorno</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Retorno#getLineaRetorno <em>Linea Retorno</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getRetorno()
 * @model
 * @generated
 */
public interface Retorno extends Sentencia {
	/**
	 * Returns the value of the '<em><b>Linea Retorno</b></em>' containment reference list.
	 * The list contents are of type {@link blockchain.Linea}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linea Retorno</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linea Retorno</em>' containment reference list.
	 * @see blockchain.BlockchainPackage#getRetorno_LineaRetorno()
	 * @model containment="true"
	 * @generated
	 */
	EList<Linea> getLineaRetorno();

} // Retorno
