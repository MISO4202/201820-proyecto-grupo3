/**
 */
package blockchain.impl;

import blockchain.BlockchainPackage;
import blockchain.Estado;
import blockchain.Sentencia;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sentencia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockchain.impl.SentenciaImpl#getEstado <em>Estado</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SentenciaImpl extends MinimalEObjectImpl.Container implements Sentencia {
	/**
	 * The cached value of the '{@link #getEstado() <em>Estado</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected EList<Estado> estado;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SentenciaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainPackage.Literals.SENTENCIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Estado> getEstado() {
		if (estado == null) {
			estado = new EObjectResolvingEList<Estado>(Estado.class, this, BlockchainPackage.SENTENCIA__ESTADO);
		}
		return estado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlockchainPackage.SENTENCIA__ESTADO:
				return getEstado();
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
			case BlockchainPackage.SENTENCIA__ESTADO:
				getEstado().clear();
				getEstado().addAll((Collection<? extends Estado>)newValue);
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
			case BlockchainPackage.SENTENCIA__ESTADO:
				getEstado().clear();
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
			case BlockchainPackage.SENTENCIA__ESTADO:
				return estado != null && !estado.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SentenciaImpl
