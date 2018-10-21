/**
 */
package blockchain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expresion Referenciada</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.ExpresionReferenciada#getTipodato <em>Tipodato</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getExpresionReferenciada()
 * @model
 * @generated
 */
public interface ExpresionReferenciada extends ValorElementos {
	/**
	 * Returns the value of the '<em><b>Tipodato</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipodato</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipodato</em>' reference.
	 * @see #setTipodato(TipoDato)
	 * @see blockchain.BlockchainPackage#getExpresionReferenciada_Tipodato()
	 * @model
	 * @generated
	 */
	TipoDato getTipodato();

	/**
	 * Sets the value of the '{@link blockchain.ExpresionReferenciada#getTipodato <em>Tipodato</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipodato</em>' reference.
	 * @see #getTipodato()
	 * @generated
	 */
	void setTipodato(TipoDato value);

} // ExpresionReferenciada
