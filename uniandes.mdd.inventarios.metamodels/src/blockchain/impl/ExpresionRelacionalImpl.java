/**
 */
package blockchain.impl;

import blockchain.BlockchainPackage;
import blockchain.ExpresionRelacional;
import blockchain.OperadorRelacion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expresion Relacional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockchain.impl.ExpresionRelacionalImpl#getOperadorRelacional <em>Operador Relacional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpresionRelacionalImpl extends ExpresionImpl implements ExpresionRelacional {
	/**
	 * The default value of the '{@link #getOperadorRelacional() <em>Operador Relacional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperadorRelacional()
	 * @generated
	 * @ordered
	 */
	protected static final OperadorRelacion OPERADOR_RELACIONAL_EDEFAULT = OperadorRelacion.PUNTO;

	/**
	 * The cached value of the '{@link #getOperadorRelacional() <em>Operador Relacional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperadorRelacional()
	 * @generated
	 * @ordered
	 */
	protected OperadorRelacion operadorRelacional = OPERADOR_RELACIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpresionRelacionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainPackage.Literals.EXPRESION_RELACIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperadorRelacion getOperadorRelacional() {
		return operadorRelacional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperadorRelacional(OperadorRelacion newOperadorRelacional) {
		OperadorRelacion oldOperadorRelacional = operadorRelacional;
		operadorRelacional = newOperadorRelacional == null ? OPERADOR_RELACIONAL_EDEFAULT : newOperadorRelacional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.EXPRESION_RELACIONAL__OPERADOR_RELACIONAL, oldOperadorRelacional, operadorRelacional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlockchainPackage.EXPRESION_RELACIONAL__OPERADOR_RELACIONAL:
				return getOperadorRelacional();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BlockchainPackage.EXPRESION_RELACIONAL__OPERADOR_RELACIONAL:
				setOperadorRelacional((OperadorRelacion)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BlockchainPackage.EXPRESION_RELACIONAL__OPERADOR_RELACIONAL:
				setOperadorRelacional(OPERADOR_RELACIONAL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BlockchainPackage.EXPRESION_RELACIONAL__OPERADOR_RELACIONAL:
				return operadorRelacional != OPERADOR_RELACIONAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operadorRelacional: ");
		result.append(operadorRelacional);
		result.append(')');
		return result.toString();
	}

} //ExpresionRelacionalImpl
