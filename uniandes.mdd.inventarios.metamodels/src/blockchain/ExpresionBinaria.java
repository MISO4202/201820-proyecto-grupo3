/**
 */
package blockchain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expresion Binaria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.ExpresionBinaria#getIzq <em>Izq</em>}</li>
 *   <li>{@link blockchain.ExpresionBinaria#getDer <em>Der</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getExpresionBinaria()
 * @model abstract="true"
 * @generated
 */
public interface ExpresionBinaria extends Expresion {
	/**
	 * Returns the value of the '<em><b>Izq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Izq</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Izq</em>' containment reference.
	 * @see #setIzq(Expresion)
	 * @see blockchain.BlockchainPackage#getExpresionBinaria_Izq()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expresion getIzq();

	/**
	 * Sets the value of the '{@link blockchain.ExpresionBinaria#getIzq <em>Izq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Izq</em>' containment reference.
	 * @see #getIzq()
	 * @generated
	 */
	void setIzq(Expresion value);

	/**
	 * Returns the value of the '<em><b>Der</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Der</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Der</em>' containment reference.
	 * @see #setDer(Expresion)
	 * @see blockchain.BlockchainPackage#getExpresionBinaria_Der()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expresion getDer();

	/**
	 * Sets the value of the '{@link blockchain.ExpresionBinaria#getDer <em>Der</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Der</em>' containment reference.
	 * @see #getDer()
	 * @generated
	 */
	void setDer(Expresion value);

} // ExpresionBinaria
