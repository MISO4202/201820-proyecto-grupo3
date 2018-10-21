/**
 */
package blockchain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitivo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Primitivo#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getPrimitivo()
 * @model
 * @generated
 */
public interface Primitivo extends TipoDato {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link blockchain.DatoPrimitivo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see blockchain.DatoPrimitivo
	 * @see #setTipo(DatoPrimitivo)
	 * @see blockchain.BlockchainPackage#getPrimitivo_Tipo()
	 * @model
	 * @generated
	 */
	DatoPrimitivo getTipo();

	/**
	 * Sets the value of the '{@link blockchain.Primitivo#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see blockchain.DatoPrimitivo
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(DatoPrimitivo value);

} // Primitivo
