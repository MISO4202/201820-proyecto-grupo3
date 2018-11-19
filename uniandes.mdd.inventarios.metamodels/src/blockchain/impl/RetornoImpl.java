/**
 */
package blockchain.impl;

import blockchain.BlockchainPackage;
import blockchain.Linea;
import blockchain.Retorno;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Retorno</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockchain.impl.RetornoImpl#getLineaRetorno <em>Linea Retorno</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RetornoImpl extends MinimalEObjectImpl.Container implements Retorno {
	/**
	 * The cached value of the '{@link #getLineaRetorno() <em>Linea Retorno</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineaRetorno()
	 * @generated
	 * @ordered
	 */
	protected EList<Linea> lineaRetorno;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RetornoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainPackage.Literals.RETORNO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Linea> getLineaRetorno() {
		if (lineaRetorno == null) {
			lineaRetorno = new EObjectContainmentEList<Linea>(Linea.class, this, BlockchainPackage.RETORNO__LINEA_RETORNO);
		}
		return lineaRetorno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BlockchainPackage.RETORNO__LINEA_RETORNO:
				return ((InternalEList<?>)getLineaRetorno()).basicRemove(otherEnd, msgs);
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
			case BlockchainPackage.RETORNO__LINEA_RETORNO:
				return getLineaRetorno();
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
			case BlockchainPackage.RETORNO__LINEA_RETORNO:
				getLineaRetorno().clear();
				getLineaRetorno().addAll((Collection<? extends Linea>)newValue);
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
			case BlockchainPackage.RETORNO__LINEA_RETORNO:
				getLineaRetorno().clear();
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
			case BlockchainPackage.RETORNO__LINEA_RETORNO:
				return lineaRetorno != null && !lineaRetorno.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RetornoImpl
