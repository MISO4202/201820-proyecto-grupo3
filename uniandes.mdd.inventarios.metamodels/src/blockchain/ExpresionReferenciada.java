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
 *   <li>{@link blockchain.ExpresionReferenciada#getId <em>Id</em>}</li>
 *   <li>{@link blockchain.ExpresionReferenciada#getReferencia <em>Referencia</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getExpresionReferenciada()
 * @model
 * @generated
 */
public interface ExpresionReferenciada extends Expresion {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see blockchain.BlockchainPackage#getExpresionReferenciada_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link blockchain.ExpresionReferenciada#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Referencia</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referencia</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencia</em>' reference.
	 * @see #setReferencia(NamedElement)
	 * @see blockchain.BlockchainPackage#getExpresionReferenciada_Referencia()
	 * @model required="true"
	 * @generated
	 */
	NamedElement getReferencia();

	/**
	 * Sets the value of the '{@link blockchain.ExpresionReferenciada#getReferencia <em>Referencia</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referencia</em>' reference.
	 * @see #getReferencia()
	 * @generated
	 */
	void setReferencia(NamedElement value);

} // ExpresionReferenciada
