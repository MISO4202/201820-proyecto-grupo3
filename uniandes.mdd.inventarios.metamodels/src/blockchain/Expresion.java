/**
 */
package blockchain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expresion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Expresion#getLadoIzq <em>Lado Izq</em>}</li>
 *   <li>{@link blockchain.Expresion#getLadoDer <em>Lado Der</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getExpresion()
 * @model abstract="true"
 * @generated
 */
public interface Expresion extends Sentencia {
	/**
	 * Returns the value of the '<em><b>Lado Izq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lado Izq</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lado Izq</em>' reference.
	 * @see #setLadoIzq(Sentencia)
	 * @see blockchain.BlockchainPackage#getExpresion_LadoIzq()
	 * @model required="true"
	 * @generated
	 */
	Sentencia getLadoIzq();

	/**
	 * Sets the value of the '{@link blockchain.Expresion#getLadoIzq <em>Lado Izq</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lado Izq</em>' reference.
	 * @see #getLadoIzq()
	 * @generated
	 */
	void setLadoIzq(Sentencia value);

	/**
	 * Returns the value of the '<em><b>Lado Der</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lado Der</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lado Der</em>' reference.
	 * @see #setLadoDer(Sentencia)
	 * @see blockchain.BlockchainPackage#getExpresion_LadoDer()
	 * @model required="true"
	 * @generated
	 */
	Sentencia getLadoDer();

	/**
	 * Sets the value of the '{@link blockchain.Expresion#getLadoDer <em>Lado Der</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lado Der</em>' reference.
	 * @see #getLadoDer()
	 * @generated
	 */
	void setLadoDer(Sentencia value);

} // Expresion
