/**
 */
package blockchain.impl;

import blockchain.BlockchainPackage;
import blockchain.Map;
import blockchain.TipoDato;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockchain.impl.MapImpl#getTipoDatoKey <em>Tipo Dato Key</em>}</li>
 *   <li>{@link blockchain.impl.MapImpl#getTipoDatoValue <em>Tipo Dato Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapImpl extends TipoDatoImpl implements Map {
	/**
	 * The cached value of the '{@link #getTipoDatoKey() <em>Tipo Dato Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDatoKey()
	 * @generated
	 * @ordered
	 */
	protected TipoDato tipoDatoKey;

	/**
	 * The cached value of the '{@link #getTipoDatoValue() <em>Tipo Dato Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDatoValue()
	 * @generated
	 * @ordered
	 */
	protected TipoDato tipoDatoValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainPackage.Literals.MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDato getTipoDatoKey() {
		if (tipoDatoKey != null && tipoDatoKey.eIsProxy()) {
			InternalEObject oldTipoDatoKey = (InternalEObject)tipoDatoKey;
			tipoDatoKey = (TipoDato)eResolveProxy(oldTipoDatoKey);
			if (tipoDatoKey != oldTipoDatoKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockchainPackage.MAP__TIPO_DATO_KEY, oldTipoDatoKey, tipoDatoKey));
			}
		}
		return tipoDatoKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDato basicGetTipoDatoKey() {
		return tipoDatoKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoDatoKey(TipoDato newTipoDatoKey) {
		TipoDato oldTipoDatoKey = tipoDatoKey;
		tipoDatoKey = newTipoDatoKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.MAP__TIPO_DATO_KEY, oldTipoDatoKey, tipoDatoKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDato getTipoDatoValue() {
		if (tipoDatoValue != null && tipoDatoValue.eIsProxy()) {
			InternalEObject oldTipoDatoValue = (InternalEObject)tipoDatoValue;
			tipoDatoValue = (TipoDato)eResolveProxy(oldTipoDatoValue);
			if (tipoDatoValue != oldTipoDatoValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockchainPackage.MAP__TIPO_DATO_VALUE, oldTipoDatoValue, tipoDatoValue));
			}
		}
		return tipoDatoValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDato basicGetTipoDatoValue() {
		return tipoDatoValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoDatoValue(TipoDato newTipoDatoValue) {
		TipoDato oldTipoDatoValue = tipoDatoValue;
		tipoDatoValue = newTipoDatoValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.MAP__TIPO_DATO_VALUE, oldTipoDatoValue, tipoDatoValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlockchainPackage.MAP__TIPO_DATO_KEY:
				if (resolve) return getTipoDatoKey();
				return basicGetTipoDatoKey();
			case BlockchainPackage.MAP__TIPO_DATO_VALUE:
				if (resolve) return getTipoDatoValue();
				return basicGetTipoDatoValue();
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
			case BlockchainPackage.MAP__TIPO_DATO_KEY:
				setTipoDatoKey((TipoDato)newValue);
				return;
			case BlockchainPackage.MAP__TIPO_DATO_VALUE:
				setTipoDatoValue((TipoDato)newValue);
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
			case BlockchainPackage.MAP__TIPO_DATO_KEY:
				setTipoDatoKey((TipoDato)null);
				return;
			case BlockchainPackage.MAP__TIPO_DATO_VALUE:
				setTipoDatoValue((TipoDato)null);
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
			case BlockchainPackage.MAP__TIPO_DATO_KEY:
				return tipoDatoKey != null;
			case BlockchainPackage.MAP__TIPO_DATO_VALUE:
				return tipoDatoValue != null;
		}
		return super.eIsSet(featureID);
	}

} //MapImpl
