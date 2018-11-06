/**
 */
package blockchain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expresion Aritmetica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.ExpresionAritmetica#getOperador <em>Operador</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getExpresionAritmetica()
 * @model
 * @generated
 */
public interface ExpresionAritmetica extends ExpresionBinaria {
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
	 * @see blockchain.BlockchainPackage#getExpresionAritmetica_Operador()
	 * @model
	 * @generated
	 */
	Operador getOperador();

	/**
	 * Sets the value of the '{@link blockchain.ExpresionAritmetica#getOperador <em>Operador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operador</em>' attribute.
	 * @see blockchain.Operador
	 * @see #getOperador()
	 * @generated
	 */
	void setOperador(Operador value);

} // ExpresionAritmetica
