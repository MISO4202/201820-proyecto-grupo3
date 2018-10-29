/**
 */
package blockchain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expresion Relacional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.ExpresionRelacional#getOperadorRelacional <em>Operador Relacional</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getExpresionRelacional()
 * @model
 * @generated
 */
public interface ExpresionRelacional extends Expresion {
	/**
	 * Returns the value of the '<em><b>Operador Relacional</b></em>' attribute.
	 * The literals are from the enumeration {@link blockchain.OperadorRelacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operador Relacional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operador Relacional</em>' attribute.
	 * @see blockchain.OperadorRelacion
	 * @see #setOperadorRelacional(OperadorRelacion)
	 * @see blockchain.BlockchainPackage#getExpresionRelacional_OperadorRelacional()
	 * @model
	 * @generated
	 */
	OperadorRelacion getOperadorRelacional();

	/**
	 * Sets the value of the '{@link blockchain.ExpresionRelacional#getOperadorRelacional <em>Operador Relacional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operador Relacional</em>' attribute.
	 * @see blockchain.OperadorRelacion
	 * @see #getOperadorRelacional()
	 * @generated
	 */
	void setOperadorRelacional(OperadorRelacion value);

} // ExpresionRelacional
