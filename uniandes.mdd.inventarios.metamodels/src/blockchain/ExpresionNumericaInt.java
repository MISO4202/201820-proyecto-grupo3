/**
 */
package blockchain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expresion Numerica Int</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.ExpresionNumericaInt#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getExpresionNumericaInt()
 * @model
 * @generated
 */
public interface ExpresionNumericaInt extends Expresion {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see blockchain.BlockchainPackage#getExpresionNumericaInt_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link blockchain.ExpresionNumericaInt#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // ExpresionNumericaInt
