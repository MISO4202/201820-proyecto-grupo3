/**
 */
package blockchain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Atributo#getTipodato <em>Tipodato</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getAtributo()
 * @model
 * @generated
 */
public interface Atributo extends NamedElement {
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
	 * @see blockchain.BlockchainPackage#getAtributo_Tipodato()
	 * @model required="true"
	 * @generated
	 */
	TipoDato getTipodato();

	/**
	 * Sets the value of the '{@link blockchain.Atributo#getTipodato <em>Tipodato</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipodato</em>' reference.
	 * @see #getTipodato()
	 * @generated
	 */
	void setTipodato(TipoDato value);

} // Atributo
