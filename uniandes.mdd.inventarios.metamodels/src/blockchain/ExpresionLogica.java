/**
 */
package blockchain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expresion Logica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.ExpresionLogica#getOperador <em>Operador</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getExpresionLogica()
 * @model
 * @generated
 */
public interface ExpresionLogica extends Expresion {
	/**
	 * Returns the value of the '<em><b>Operador</b></em>' attribute.
	 * The literals are from the enumeration {@link blockchain.OperadorLogico}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operador</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operador</em>' attribute.
	 * @see blockchain.OperadorLogico
	 * @see #setOperador(OperadorLogico)
	 * @see blockchain.BlockchainPackage#getExpresionLogica_Operador()
	 * @model
	 * @generated
	 */
	OperadorLogico getOperador();

	/**
	 * Sets the value of the '{@link blockchain.ExpresionLogica#getOperador <em>Operador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operador</em>' attribute.
	 * @see blockchain.OperadorLogico
	 * @see #getOperador()
	 * @generated
	 */
	void setOperador(OperadorLogico value);

} // ExpresionLogica
