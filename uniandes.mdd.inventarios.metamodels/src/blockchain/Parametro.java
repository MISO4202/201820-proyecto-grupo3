/**
 */
package blockchain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Parametro#getName <em>Name</em>}</li>
 *   <li>{@link blockchain.Parametro#getTipoDato <em>Tipo Dato</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getParametro()
 * @model
 * @generated
 */
public interface Parametro extends EObject {
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
	 * @see blockchain.BlockchainPackage#getParametro_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link blockchain.Parametro#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see blockchain.BlockchainPackage#getParametro_TipoDato()
	 * @model required="true"
	 * @generated
	 */
	TipoDato getTipoDato();

	/**
	 * Sets the value of the '{@link blockchain.Parametro#getTipoDato <em>Tipo Dato</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Dato</em>' reference.
	 * @see #getTipoDato()
	 * @generated
	 */
	void setTipoDato(TipoDato value);

} // Parametro
