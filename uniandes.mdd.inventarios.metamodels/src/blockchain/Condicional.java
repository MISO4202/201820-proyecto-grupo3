/**
 */
package blockchain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getCondicional()
 * @model
 * @generated
 */
public interface Condicional extends EObject {
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
	 * Returns the value of the '<em><b>Expresionlogica</b></em>' containment reference list.
	 * The list contents are of type {@link blockchain.ExpresionLogica}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expresionlogica</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expresionlogica</em>' containment reference list.
	 * @see blockchain.BlockchainPackage#getCondicional_Expresionlogica()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ExpresionLogica> getExpresionlogica();

} // Condicional
