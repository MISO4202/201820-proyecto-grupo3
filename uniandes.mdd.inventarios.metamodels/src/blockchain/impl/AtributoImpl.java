/**
 */
package blockchain.impl;

import blockchain.Atributo;
import blockchain.BlockchainPackage;
import blockchain.TipoDato;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockchain.impl.AtributoImpl#getTipodato <em>Tipodato</em>}</li>
 *   <li>{@link blockchain.impl.AtributoImpl#isIsId <em>Is Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtributoImpl extends NamedElementImpl implements Atributo {
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
	 * The default value of the '{@link #isIsId() <em>Is Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsId()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ID_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsId() <em>Is Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsId()
	 * @generated
	 * @ordered
	 */
	protected boolean isId = IS_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainPackage.Literals.ATRIBUTO;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockchainPackage.ATRIBUTO__TIPODATO, oldTipodato, tipodato));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.ATRIBUTO__TIPODATO, oldTipodato, tipodato));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsId() {
		return isId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsId(boolean newIsId) {
		boolean oldIsId = isId;
		isId = newIsId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.ATRIBUTO__IS_ID, oldIsId, isId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlockchainPackage.ATRIBUTO__TIPODATO:
				if (resolve) return getTipodato();
				return basicGetTipodato();
			case BlockchainPackage.ATRIBUTO__IS_ID:
				return isIsId();
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
			case BlockchainPackage.ATRIBUTO__TIPODATO:
				setTipodato((TipoDato)newValue);
				return;
			case BlockchainPackage.ATRIBUTO__IS_ID:
				setIsId((Boolean)newValue);
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
			case BlockchainPackage.ATRIBUTO__TIPODATO:
				setTipodato((TipoDato)null);
				return;
			case BlockchainPackage.ATRIBUTO__IS_ID:
				setIsId(IS_ID_EDEFAULT);
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
			case BlockchainPackage.ATRIBUTO__TIPODATO:
				return tipodato != null;
			case BlockchainPackage.ATRIBUTO__IS_ID:
				return isId != IS_ID_EDEFAULT;
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
		result.append(" (isId: ");
		result.append(isId);
		result.append(')');
		return result.toString();
	}

} //AtributoImpl
