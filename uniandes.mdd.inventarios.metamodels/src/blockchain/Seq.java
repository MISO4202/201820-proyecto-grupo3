/**
 */
package blockchain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Seq#getTipoDato <em>Tipo Dato</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getSeq()
 * @model
 * @generated
 */
public interface Seq extends TipoDato {
	/**
	 * Returns the value of the '<em><b>Tipo Dato</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Dato</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Dato</em>' reference.
	 * @see #setTipoDato(TipoDato)
	 * @see blockchain.BlockchainPackage#getSeq_TipoDato()
	 * @model required="true"
	 * @generated
	 */
	TipoDato getTipoDato();

	/**
	 * Sets the value of the '{@link blockchain.Seq#getTipoDato <em>Tipo Dato</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Dato</em>' reference.
	 * @see #getTipoDato()
	 * @generated
	 */
	void setTipoDato(TipoDato value);

} // Seq
