/**
 */
package blockchain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.If#getExpresionlogica <em>Expresionlogica</em>}</li>
 *   <li>{@link blockchain.If#getLineas <em>Lineas</em>}</li>
 *   <li>{@link blockchain.If#getElseLines <em>Else Lines</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getIf()
 * @model
 * @generated
 */
public interface If extends Sentencia {
	/**
	 * Returns the value of the '<em><b>Expresionlogica</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expresionlogica</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expresionlogica</em>' containment reference.
	 * @see #setExpresionlogica(ExpresionLogica)
	 * @see blockchain.BlockchainPackage#getIf_Expresionlogica()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpresionLogica getExpresionlogica();

	/**
	 * Sets the value of the '{@link blockchain.If#getExpresionlogica <em>Expresionlogica</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expresionlogica</em>' containment reference.
	 * @see #getExpresionlogica()
	 * @generated
	 */
	void setExpresionlogica(ExpresionLogica value);

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
	 * @see blockchain.BlockchainPackage#getIf_Lineas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Linea> getLineas();

	/**
	 * Returns the value of the '<em><b>Else Lines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Lines</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Lines</em>' containment reference.
	 * @see #setElseLines(Else)
	 * @see blockchain.BlockchainPackage#getIf_ElseLines()
	 * @model containment="true"
	 * @generated
	 */
	Else getElseLines();

	/**
	 * Sets the value of the '{@link blockchain.If#getElseLines <em>Else Lines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Lines</em>' containment reference.
	 * @see #getElseLines()
	 * @generated
	 */
	void setElseLines(Else value);

} // If
