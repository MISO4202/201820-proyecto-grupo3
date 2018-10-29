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
 *   <li>{@link blockchain.Condicional#getTipoCondicional <em>Tipo Condicional</em>}</li>
 *   <li>{@link blockchain.Condicional#getExpresionlogica <em>Expresionlogica</em>}</li>
 *   <li>{@link blockchain.Condicional#getSentencias <em>Sentencias</em>}</li>
 *   <li>{@link blockchain.Condicional#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getCondicional()
 * @model
 * @generated
 */
public interface Condicional extends Sentencia {
	/**
	 * Returns the value of the '<em><b>Tipo Condicional</b></em>' attribute.
	 * The literals are from the enumeration {@link blockchain.TipoCondicion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Condicional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Condicional</em>' attribute.
	 * @see blockchain.TipoCondicion
	 * @see #setTipoCondicional(TipoCondicion)
	 * @see blockchain.BlockchainPackage#getCondicional_TipoCondicional()
	 * @model
	 * @generated
	 */
	TipoCondicion getTipoCondicional();

	/**
	 * Sets the value of the '{@link blockchain.Condicional#getTipoCondicional <em>Tipo Condicional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Condicional</em>' attribute.
	 * @see blockchain.TipoCondicion
	 * @see #getTipoCondicional()
	 * @generated
	 */
	void setTipoCondicional(TipoCondicion value);

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
	 * Returns the value of the '<em><b>Sentencias</b></em>' containment reference list.
	 * The list contents are of type {@link blockchain.Sentencia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sentencias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentencias</em>' containment reference list.
	 * @see blockchain.BlockchainPackage#getCondicional_Sentencias()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Sentencia> getSentencias();

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference list.
	 * The list contents are of type {@link blockchain.Condicional}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference list.
	 * @see blockchain.BlockchainPackage#getCondicional_Else()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condicional> getElse();

} // Condicional
