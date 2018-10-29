/**
 */
package blockchain.impl;

import blockchain.BlockchainPackage;
import blockchain.Operacion;
import blockchain.Parametro;
import blockchain.Sentencia;
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
 * An implementation of the model object '<em><b>Operacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockchain.impl.OperacionImpl#getParametros <em>Parametros</em>}</li>
 *   <li>{@link blockchain.impl.OperacionImpl#getName <em>Name</em>}</li>
 *   <li>{@link blockchain.impl.OperacionImpl#getSentencia <em>Sentencia</em>}</li>
 *   <li>{@link blockchain.impl.OperacionImpl#isEsUserDefined <em>Es User Defined</em>}</li>
 *   <li>{@link blockchain.impl.OperacionImpl#getRetorno <em>Retorno</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperacionImpl extends MinimalEObjectImpl.Container implements Operacion {
	/**
	 * The cached value of the '{@link #getParametros() <em>Parametros</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametros()
	 * @generated
	 * @ordered
	 */
	protected EList<Parametro> parametros;

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
	 * The cached value of the '{@link #getSentencia() <em>Sentencia</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentencia()
	 * @generated
	 * @ordered
	 */
	protected EList<Sentencia> sentencia;

	/**
	 * The default value of the '{@link #isEsUserDefined() <em>Es User Defined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsUserDefined()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_USER_DEFINED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsUserDefined() <em>Es User Defined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsUserDefined()
	 * @generated
	 * @ordered
	 */
	protected boolean esUserDefined = ES_USER_DEFINED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRetorno() <em>Retorno</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetorno()
	 * @generated
	 * @ordered
	 */
	protected TipoDato retorno;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainPackage.Literals.OPERACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parametro> getParametros() {
		if (parametros == null) {
			parametros = new EObjectContainmentEList<Parametro>(Parametro.class, this, BlockchainPackage.OPERACION__PARAMETROS);
		}
		return parametros;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.OPERACION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sentencia> getSentencia() {
		if (sentencia == null) {
			sentencia = new EObjectContainmentEList<Sentencia>(Sentencia.class, this, BlockchainPackage.OPERACION__SENTENCIA);
		}
		return sentencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDato getRetorno() {
		if (retorno != null && retorno.eIsProxy()) {
			InternalEObject oldRetorno = (InternalEObject)retorno;
			retorno = (TipoDato)eResolveProxy(oldRetorno);
			if (retorno != oldRetorno) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockchainPackage.OPERACION__RETORNO, oldRetorno, retorno));
			}
		}
		return retorno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDato basicGetRetorno() {
		return retorno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetorno(TipoDato newRetorno) {
		TipoDato oldRetorno = retorno;
		retorno = newRetorno;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.OPERACION__RETORNO, oldRetorno, retorno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsUserDefined() {
		return esUserDefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsUserDefined(boolean newEsUserDefined) {
		boolean oldEsUserDefined = esUserDefined;
		esUserDefined = newEsUserDefined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.OPERACION__ES_USER_DEFINED, oldEsUserDefined, esUserDefined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BlockchainPackage.OPERACION__PARAMETROS:
				return ((InternalEList<?>)getParametros()).basicRemove(otherEnd, msgs);
			case BlockchainPackage.OPERACION__SENTENCIA:
				return ((InternalEList<?>)getSentencia()).basicRemove(otherEnd, msgs);
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
			case BlockchainPackage.OPERACION__PARAMETROS:
				return getParametros();
			case BlockchainPackage.OPERACION__NAME:
				return getName();
			case BlockchainPackage.OPERACION__SENTENCIA:
				return getSentencia();
			case BlockchainPackage.OPERACION__ES_USER_DEFINED:
				return isEsUserDefined();
			case BlockchainPackage.OPERACION__RETORNO:
				if (resolve) return getRetorno();
				return basicGetRetorno();
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
			case BlockchainPackage.OPERACION__PARAMETROS:
				getParametros().clear();
				getParametros().addAll((Collection<? extends Parametro>)newValue);
				return;
			case BlockchainPackage.OPERACION__NAME:
				setName((String)newValue);
				return;
			case BlockchainPackage.OPERACION__SENTENCIA:
				getSentencia().clear();
				getSentencia().addAll((Collection<? extends Sentencia>)newValue);
				return;
			case BlockchainPackage.OPERACION__ES_USER_DEFINED:
				setEsUserDefined((Boolean)newValue);
				return;
			case BlockchainPackage.OPERACION__RETORNO:
				setRetorno((TipoDato)newValue);
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
			case BlockchainPackage.OPERACION__PARAMETROS:
				getParametros().clear();
				return;
			case BlockchainPackage.OPERACION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BlockchainPackage.OPERACION__SENTENCIA:
				getSentencia().clear();
				return;
			case BlockchainPackage.OPERACION__ES_USER_DEFINED:
				setEsUserDefined(ES_USER_DEFINED_EDEFAULT);
				return;
			case BlockchainPackage.OPERACION__RETORNO:
				setRetorno((TipoDato)null);
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
			case BlockchainPackage.OPERACION__PARAMETROS:
				return parametros != null && !parametros.isEmpty();
			case BlockchainPackage.OPERACION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BlockchainPackage.OPERACION__SENTENCIA:
				return sentencia != null && !sentencia.isEmpty();
			case BlockchainPackage.OPERACION__ES_USER_DEFINED:
				return esUserDefined != ES_USER_DEFINED_EDEFAULT;
			case BlockchainPackage.OPERACION__RETORNO:
				return retorno != null;
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
		result.append(", esUserDefined: ");
		result.append(esUserDefined);
		result.append(')');
		return result.toString();
	}

} //OperacionImpl
