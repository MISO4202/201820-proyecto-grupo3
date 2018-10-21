/**
 */
package blockchain.impl;

import blockchain.BlockchainPackage;
import blockchain.Seq;
import blockchain.TipoDato;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockchain.impl.SeqImpl#getTipoDato <em>Tipo Dato</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeqImpl extends TipoDatoImpl implements Seq {
	/**
	 * The cached value of the '{@link #getTipoDato() <em>Tipo Dato</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDato()
	 * @generated
	 * @ordered
	 */
	protected TipoDato tipoDato;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainPackage.Literals.SEQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDato getTipoDato() {
		if (tipoDato != null && tipoDato.eIsProxy()) {
			InternalEObject oldTipoDato = (InternalEObject)tipoDato;
			tipoDato = (TipoDato)eResolveProxy(oldTipoDato);
			if (tipoDato != oldTipoDato) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockchainPackage.SEQ__TIPO_DATO, oldTipoDato, tipoDato));
			}
		}
		return tipoDato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDato basicGetTipoDato() {
		return tipoDato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoDato(TipoDato newTipoDato) {
		TipoDato oldTipoDato = tipoDato;
		tipoDato = newTipoDato;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.SEQ__TIPO_DATO, oldTipoDato, tipoDato));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlockchainPackage.SEQ__TIPO_DATO:
				if (resolve) return getTipoDato();
				return basicGetTipoDato();
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
			case BlockchainPackage.SEQ__TIPO_DATO:
				setTipoDato((TipoDato)newValue);
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
			case BlockchainPackage.SEQ__TIPO_DATO:
				setTipoDato((TipoDato)null);
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
			case BlockchainPackage.SEQ__TIPO_DATO:
				return tipoDato != null;
		}
		return super.eIsSet(featureID);
	}

} //SeqImpl
