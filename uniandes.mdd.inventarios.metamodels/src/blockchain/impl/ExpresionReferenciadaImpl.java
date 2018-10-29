/**
 */
package blockchain.impl;

import blockchain.Atributo;
import blockchain.BlockchainPackage;
import blockchain.Entidad;
import blockchain.ExpresionReferenciada;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expresion Referenciada</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockchain.impl.ExpresionReferenciadaImpl#getEntReferenciada <em>Ent Referenciada</em>}</li>
 *   <li>{@link blockchain.impl.ExpresionReferenciadaImpl#getAtrReferenciado <em>Atr Referenciado</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpresionReferenciadaImpl extends ValorElementosImpl implements ExpresionReferenciada {
	/**
	 * The cached value of the '{@link #getEntReferenciada() <em>Ent Referenciada</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntReferenciada()
	 * @generated
	 * @ordered
	 */
	protected Entidad entReferenciada;
	/**
	 * The cached value of the '{@link #getAtrReferenciado() <em>Atr Referenciado</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtrReferenciado()
	 * @generated
	 * @ordered
	 */
	protected Atributo atrReferenciado;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpresionReferenciadaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainPackage.Literals.EXPRESION_REFERENCIADA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad getEntReferenciada() {
		if (entReferenciada != null && entReferenciada.eIsProxy()) {
			InternalEObject oldEntReferenciada = (InternalEObject)entReferenciada;
			entReferenciada = (Entidad)eResolveProxy(oldEntReferenciada);
			if (entReferenciada != oldEntReferenciada) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockchainPackage.EXPRESION_REFERENCIADA__ENT_REFERENCIADA, oldEntReferenciada, entReferenciada));
			}
		}
		return entReferenciada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad basicGetEntReferenciada() {
		return entReferenciada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntReferenciada(Entidad newEntReferenciada) {
		Entidad oldEntReferenciada = entReferenciada;
		entReferenciada = newEntReferenciada;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.EXPRESION_REFERENCIADA__ENT_REFERENCIADA, oldEntReferenciada, entReferenciada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atributo getAtrReferenciado() {
		if (atrReferenciado != null && atrReferenciado.eIsProxy()) {
			InternalEObject oldAtrReferenciado = (InternalEObject)atrReferenciado;
			atrReferenciado = (Atributo)eResolveProxy(oldAtrReferenciado);
			if (atrReferenciado != oldAtrReferenciado) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockchainPackage.EXPRESION_REFERENCIADA__ATR_REFERENCIADO, oldAtrReferenciado, atrReferenciado));
			}
		}
		return atrReferenciado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atributo basicGetAtrReferenciado() {
		return atrReferenciado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtrReferenciado(Atributo newAtrReferenciado) {
		Atributo oldAtrReferenciado = atrReferenciado;
		atrReferenciado = newAtrReferenciado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.EXPRESION_REFERENCIADA__ATR_REFERENCIADO, oldAtrReferenciado, atrReferenciado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlockchainPackage.EXPRESION_REFERENCIADA__ENT_REFERENCIADA:
				if (resolve) return getEntReferenciada();
				return basicGetEntReferenciada();
			case BlockchainPackage.EXPRESION_REFERENCIADA__ATR_REFERENCIADO:
				if (resolve) return getAtrReferenciado();
				return basicGetAtrReferenciado();
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
			case BlockchainPackage.EXPRESION_REFERENCIADA__ENT_REFERENCIADA:
				setEntReferenciada((Entidad)newValue);
				return;
			case BlockchainPackage.EXPRESION_REFERENCIADA__ATR_REFERENCIADO:
				setAtrReferenciado((Atributo)newValue);
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
			case BlockchainPackage.EXPRESION_REFERENCIADA__ENT_REFERENCIADA:
				setEntReferenciada((Entidad)null);
				return;
			case BlockchainPackage.EXPRESION_REFERENCIADA__ATR_REFERENCIADO:
				setAtrReferenciado((Atributo)null);
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
			case BlockchainPackage.EXPRESION_REFERENCIADA__ENT_REFERENCIADA:
				return entReferenciada != null;
			case BlockchainPackage.EXPRESION_REFERENCIADA__ATR_REFERENCIADO:
				return atrReferenciado != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpresionReferenciadaImpl
