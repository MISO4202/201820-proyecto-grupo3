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
 *   <li>{@link blockchain.ExpresionReferenciada#getEntReferenciada <em>Ent Referenciada</em>}</li>
 *   <li>{@link blockchain.ExpresionReferenciada#getId <em>Id</em>}</li>
 *   <li>{@link blockchain.ExpresionReferenciada#getAtrReferenciado <em>Atr Referenciado</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getExpresionReferenciada()
 * @model
 * @generated
 */
public interface ExpresionReferenciada extends ValorElementos {
	/**
	 * Returns the value of the '<em><b>Ent Referenciada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ent Referenciada</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ent Referenciada</em>' reference.
	 * @see #setEntReferenciada(Entidad)
	 * @see blockchain.BlockchainPackage#getExpresionReferenciada_EntReferenciada()
	 * @model
	 * @generated
	 */
	Entidad getEntReferenciada();

	/**
	 * Sets the value of the '{@link blockchain.ExpresionReferenciada#getEntReferenciada <em>Ent Referenciada</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ent Referenciada</em>' reference.
	 * @see #getEntReferenciada()
	 * @generated
	 */
	void setEntReferenciada(Entidad value);

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
	 * Returns the value of the '<em><b>Atr Referenciado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atr Referenciado</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atr Referenciado</em>' reference.
	 * @see #setAtrReferenciado(Atributo)
	 * @see blockchain.BlockchainPackage#getExpresionReferenciada_AtrReferenciado()
	 * @model
	 * @generated
	 */
	Atributo getAtrReferenciado();

	/**
	 * Sets the value of the '{@link blockchain.ExpresionReferenciada#getAtrReferenciado <em>Atr Referenciado</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atr Referenciado</em>' reference.
	 * @see #getAtrReferenciado()
	 * @generated
	 */
	void setAtrReferenciado(Atributo value);

} // ExpresionReferenciada
