/**
 */
package blockchain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condicional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Condicional#getElse <em>Else</em>}</li>
 *   <li>{@link blockchain.Condicional#getExpresionlogica <em>Expresionlogica</em>}</li>
 *   <li>{@link blockchain.Condicional#getValidador <em>Validador</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getCondicional()
 * @model
 * @generated
 */
public interface Condicional extends Sentencia {
	/**
	 * Returns the value of the '<em><b>Expresionlogica</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expresionlogica</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expresionlogica</em>' containment reference.
	 * @see #setExpresionlogica(ExpresionLogica)
	 * @see blockchain.BlockchainPackage#getCondicional_Expresionlogica()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpresionLogica getExpresionlogica();

	/**
	 * Sets the value of the '{@link blockchain.Condicional#getExpresionlogica <em>Expresionlogica</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expresionlogica</em>' containment reference.
	 * @see #getExpresionlogica()
	 * @generated
	 */
	void setExpresionlogica(ExpresionLogica value);

	/**
	 * Returns the value of the '<em><b>Validador</b></em>' containment reference list.
	 * The list contents are of type {@link blockchain.Linea}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validador</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validador</em>' containment reference list.
	 * @see blockchain.BlockchainPackage#getCondicional_Validador()
	 * @model containment="true"
	 * @generated
	 */
	EList<Linea> getValidador();

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(Condicional)
	 * @see blockchain.BlockchainPackage#getCondicional_Else()
	 * @model containment="true"
	 * @generated
	 */
	Condicional getElse();

	/**
	 * Sets the value of the '{@link blockchain.Condicional#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(Condicional value);

} // Condicional
