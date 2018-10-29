/**
 */
package blockchain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entidad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Entidad#getAtributos <em>Atributos</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getEntidad()
 * @model
 * @generated
 */
public interface Entidad extends TipoDato {
	/**
	 * Returns the value of the '<em><b>Atributos</b></em>' containment reference list.
	 * The list contents are of type {@link blockchain.Atributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos</em>' containment reference list.
	 * @see blockchain.BlockchainPackage#getEntidad_Atributos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Atributo> getAtributos();

} // Entidad
