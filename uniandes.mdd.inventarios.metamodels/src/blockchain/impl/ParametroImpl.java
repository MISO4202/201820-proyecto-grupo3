/**
 */
package blockchain.impl;

import blockchain.BlockchainPackage;
import blockchain.Parametro;
import blockchain.TipoDato;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parametro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockchain.impl.ParametroImpl#getTipodato <em>Tipodato</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParametroImpl extends NamedElementImpl implements Parametro {
	/**
	 * The cached value of the '{@link #getTipodato() <em>Tipodato</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipodato()
	 * @generated
	 * @ordered
	 */
	protected TipoDato tipodato;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParametroImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainPackage.Literals.PARAMETRO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDato getTipodato() {
		if (tipodato != null && tipodato.eIsProxy()) {
			InternalEObject oldTipodato = (InternalEObject)tipodato;
			tipodato = (TipoDato)eResolveProxy(oldTipodato);
			if (tipodato != oldTipodato) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockchainPackage.PARAMETRO__TIPODATO, oldTipodato, tipodato));
			}
		}
		return tipodato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDato basicGetTipodato() {
		return tipodato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipodato(TipoDato newTipodato) {
		TipoDato oldTipodato = tipodato;
		tipodato = newTipodato;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.PARAMETRO__TIPODATO, oldTipodato, tipodato));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlockchainPackage.PARAMETRO__TIPODATO:
				if (resolve) return getTipodato();
				return basicGetTipodato();
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
			case BlockchainPackage.PARAMETRO__TIPODATO:
				setTipodato((TipoDato)newValue);
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
			case BlockchainPackage.PARAMETRO__TIPODATO:
				setTipodato((TipoDato)null);
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
			case BlockchainPackage.PARAMETRO__TIPODATO:
				return tipodato != null;
		}
		return super.eIsSet(featureID);
	}

} //ParametroImpl
