/**
 */
package blockchain.impl;

import blockchain.BlockchainPackage;
import blockchain.Entidad;
import blockchain.Estado;
import blockchain.Operacion;
import blockchain.SmartContract;

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
 * An implementation of the model object '<em><b>Smart Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockchain.impl.SmartContractImpl#getEntidades <em>Entidades</em>}</li>
 *   <li>{@link blockchain.impl.SmartContractImpl#getOperaciones <em>Operaciones</em>}</li>
 *   <li>{@link blockchain.impl.SmartContractImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link blockchain.impl.SmartContractImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmartContractImpl extends MinimalEObjectImpl.Container implements SmartContract {
	/**
	 * The cached value of the '{@link #getEntidades() <em>Entidades</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidades()
	 * @generated
	 * @ordered
	 */
	protected EList<Entidad> entidades;

	/**
	 * The cached value of the '{@link #getOperaciones() <em>Operaciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperaciones()
	 * @generated
	 * @ordered
	 */
	protected EList<Operacion> operaciones;

	/**
	 * The cached value of the '{@link #getEstado() <em>Estado</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected EList<Estado> estado;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainPackage.Literals.SMART_CONTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entidad> getEntidades() {
		if (entidades == null) {
			entidades = new EObjectContainmentEList<Entidad>(Entidad.class, this, BlockchainPackage.SMART_CONTRACT__ENTIDADES);
		}
		return entidades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operacion> getOperaciones() {
		if (operaciones == null) {
			operaciones = new EObjectContainmentEList<Operacion>(Operacion.class, this, BlockchainPackage.SMART_CONTRACT__OPERACIONES);
		}
		return operaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Estado> getEstado() {
		if (estado == null) {
			estado = new EObjectContainmentEList<Estado>(Estado.class, this, BlockchainPackage.SMART_CONTRACT__ESTADO);
		}
		return estado;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.SMART_CONTRACT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BlockchainPackage.SMART_CONTRACT__ENTIDADES:
				return ((InternalEList<?>)getEntidades()).basicRemove(otherEnd, msgs);
			case BlockchainPackage.SMART_CONTRACT__OPERACIONES:
				return ((InternalEList<?>)getOperaciones()).basicRemove(otherEnd, msgs);
			case BlockchainPackage.SMART_CONTRACT__ESTADO:
				return ((InternalEList<?>)getEstado()).basicRemove(otherEnd, msgs);
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
			case BlockchainPackage.SMART_CONTRACT__ENTIDADES:
				return getEntidades();
			case BlockchainPackage.SMART_CONTRACT__OPERACIONES:
				return getOperaciones();
			case BlockchainPackage.SMART_CONTRACT__ESTADO:
				return getEstado();
			case BlockchainPackage.SMART_CONTRACT__NAME:
				return getName();
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
			case BlockchainPackage.SMART_CONTRACT__ENTIDADES:
				getEntidades().clear();
				getEntidades().addAll((Collection<? extends Entidad>)newValue);
				return;
			case BlockchainPackage.SMART_CONTRACT__OPERACIONES:
				getOperaciones().clear();
				getOperaciones().addAll((Collection<? extends Operacion>)newValue);
				return;
			case BlockchainPackage.SMART_CONTRACT__ESTADO:
				getEstado().clear();
				getEstado().addAll((Collection<? extends Estado>)newValue);
				return;
			case BlockchainPackage.SMART_CONTRACT__NAME:
				setName((String)newValue);
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
			case BlockchainPackage.SMART_CONTRACT__ENTIDADES:
				getEntidades().clear();
				return;
			case BlockchainPackage.SMART_CONTRACT__OPERACIONES:
				getOperaciones().clear();
				return;
			case BlockchainPackage.SMART_CONTRACT__ESTADO:
				getEstado().clear();
				return;
			case BlockchainPackage.SMART_CONTRACT__NAME:
				setName(NAME_EDEFAULT);
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
			case BlockchainPackage.SMART_CONTRACT__ENTIDADES:
				return entidades != null && !entidades.isEmpty();
			case BlockchainPackage.SMART_CONTRACT__OPERACIONES:
				return operaciones != null && !operaciones.isEmpty();
			case BlockchainPackage.SMART_CONTRACT__ESTADO:
				return estado != null && !estado.isEmpty();
			case BlockchainPackage.SMART_CONTRACT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //SmartContractImpl
