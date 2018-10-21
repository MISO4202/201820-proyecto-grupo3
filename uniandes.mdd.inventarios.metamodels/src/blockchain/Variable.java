/**
 */
package blockchain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Variable#getTipoDato <em>Tipo Dato</em>}</li>
 *   <li>{@link blockchain.Variable#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Sentencia {
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
	 * @see blockchain.BlockchainPackage#getVariable_TipoDato()
	 * @model required="true"
	 * @generated
	 */
	TipoDato getTipoDato();

	/**
	 * Sets the value of the '{@link blockchain.Variable#getTipoDato <em>Tipo Dato</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Dato</em>' reference.
	 * @see #getTipoDato()
	 * @generated
	 */
	void setTipoDato(TipoDato value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see blockchain.BlockchainPackage#getVariable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link blockchain.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Variable
