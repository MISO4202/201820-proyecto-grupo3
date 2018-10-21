/**
 */
package blockchain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Map#getTipoDatoKey <em>Tipo Dato Key</em>}</li>
 *   <li>{@link blockchain.Map#getTipoDatoValue <em>Tipo Dato Value</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getMap()
 * @model
 * @generated
 */
public interface Map extends TipoDato {
	/**
	 * Returns the value of the '<em><b>Tipo Dato Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Dato Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Dato Key</em>' reference.
	 * @see #setTipoDatoKey(TipoDato)
	 * @see blockchain.BlockchainPackage#getMap_TipoDatoKey()
	 * @model required="true"
	 * @generated
	 */
	TipoDato getTipoDatoKey();

	/**
	 * Sets the value of the '{@link blockchain.Map#getTipoDatoKey <em>Tipo Dato Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Dato Key</em>' reference.
	 * @see #getTipoDatoKey()
	 * @generated
	 */
	void setTipoDatoKey(TipoDato value);

	/**
	 * Returns the value of the '<em><b>Tipo Dato Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Dato Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Dato Value</em>' reference.
	 * @see #setTipoDatoValue(TipoDato)
	 * @see blockchain.BlockchainPackage#getMap_TipoDatoValue()
	 * @model required="true"
	 * @generated
	 */
	TipoDato getTipoDatoValue();

	/**
	 * Sets the value of the '{@link blockchain.Map#getTipoDatoValue <em>Tipo Dato Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Dato Value</em>' reference.
	 * @see #getTipoDatoValue()
	 * @generated
	 */
	void setTipoDatoValue(TipoDato value);

} // Map
