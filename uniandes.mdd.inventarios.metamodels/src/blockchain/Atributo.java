/**
 */
package blockchain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Atributo#getName <em>Name</em>}</li>
 *   <li>{@link blockchain.Atributo#getTipodato <em>Tipodato</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getAtributo()
 * @model
 * @generated
 */
public interface Atributo extends EObject {
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
	 * @see blockchain.BlockchainPackage#getAtributo_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link blockchain.Atributo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tipodato</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipodato</em>' containment reference isn't clear,
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
