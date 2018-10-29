/**
 */
package blockchain.impl;

import blockchain.Aplicacion;
import blockchain.BlockchainPackage;
import blockchain.SmartContract;

import blockchain.TipoDato;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aplicacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockchain.impl.AplicacionImpl#getSmartcontract <em>Smartcontract</em>}</li>
 *   <li>{@link blockchain.impl.AplicacionImpl#getName <em>Name</em>}</li>
 *   <li>{@link blockchain.impl.AplicacionImpl#getTipodato <em>Tipodato</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AplicacionImpl extends MinimalEObjectImpl.Container implements Aplicacion {
	/**
	 * The cached value of the '{@link #getSmartcontract() <em>Smartcontract</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmartcontract()
	 * @generated
	 * @ordered
	 */
	protected EList<SmartContract> smartcontract;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTipodato() <em>Tipodato</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipodato()
	 * @generated
	 * @ordered
	 */
	protected EList<TipoDato> tipodato;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AplicacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainPackage.Literals.APLICACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmartContract> getSmartcontract() {
		if (smartcontract == null) {
			smartcontract = new EObjectContainmentEList<SmartContract>(SmartContract.class, this, BlockchainPackage.APLICACION__SMARTCONTRACT);
		}
		return smartcontract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.APLICACION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TipoDato> getTipodato() {
		if (tipodato == null) {
			tipodato = new EObjectContainmentEList<TipoDato>(TipoDato.class, this, BlockchainPackage.APLICACION__TIPODATO);
		}
		return tipodato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BlockchainPackage.APLICACION__SMARTCONTRACT:
				return ((InternalEList<?>)getSmartcontract()).basicRemove(otherEnd, msgs);
			case BlockchainPackage.APLICACION__TIPODATO:
				return ((InternalEList<?>)getTipodato()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlockchainPackage.APLICACION__SMARTCONTRACT:
				return getSmartcontract();
			case BlockchainPackage.APLICACION__NAME:
				return getName();
			case BlockchainPackage.APLICACION__TIPODATO:
				return getTipodato();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BlockchainPackage.APLICACION__SMARTCONTRACT:
				getSmartcontract().clear();
				getSmartcontract().addAll((Collection<? extends SmartContract>)newValue);
				return;
			case BlockchainPackage.APLICACION__NAME:
				setName((String)newValue);
				return;
			case BlockchainPackage.APLICACION__TIPODATO:
				getTipodato().clear();
				getTipodato().addAll((Collection<? extends TipoDato>)newValue);
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
			case BlockchainPackage.APLICACION__SMARTCONTRACT:
				getSmartcontract().clear();
				return;
			case BlockchainPackage.APLICACION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BlockchainPackage.APLICACION__TIPODATO:
				getTipodato().clear();
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
			case BlockchainPackage.APLICACION__SMARTCONTRACT:
				return smartcontract != null && !smartcontract.isEmpty();
			case BlockchainPackage.APLICACION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BlockchainPackage.APLICACION__TIPODATO:
				return tipodato != null && !tipodato.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AplicacionImpl
