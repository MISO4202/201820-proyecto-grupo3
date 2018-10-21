/**
 */
package blockchain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asignacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Asignacion#getOperador <em>Operador</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getAsignacion()
 * @model
 * @generated
 */
public interface Asignacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Operador</b></em>' attribute.
	 * The literals are from the enumeration {@link blockchain.Operador}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operador</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operador</em>' attribute.
	 * @see blockchain.Operador
	 * @see #setOperador(Operador)
	 * @see blockchain.BlockchainPackage#getAsignacion_Operador()
	 * @model
	 * @generated
	 */
	Operador getOperador();

	/**
	 * Sets the value of the '{@link blockchain.Asignacion#getOperador <em>Operador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operador</em>' attribute.
	 * @see blockchain.Operador
	 * @see #getOperador()
	 * @generated
	 */
	void setOperador(Operador value);

} // Asignacion
