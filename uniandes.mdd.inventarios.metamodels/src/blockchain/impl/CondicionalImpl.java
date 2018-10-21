/**
 */
package blockchain.impl;

import blockchain.BlockchainPackage;
import blockchain.Condicional;
import blockchain.ExpresionLogica;
import blockchain.TipoCondicion;

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
 * An implementation of the model object '<em><b>Condicional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockchain.impl.CondicionalImpl#getTipoCondicional <em>Tipo Condicional</em>}</li>
 *   <li>{@link blockchain.impl.CondicionalImpl#getExpresionlogica <em>Expresionlogica</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CondicionalImpl extends MinimalEObjectImpl.Container implements Condicional {
	/**
	 * The default value of the '{@link #getTipoCondicional() <em>Tipo Condicional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoCondicional()
	 * @generated
	 * @ordered
	 */
	protected static final TipoCondicion TIPO_CONDICIONAL_EDEFAULT = TipoCondicion.IF;

	/**
	 * The cached value of the '{@link #getTipoCondicional() <em>Tipo Condicional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoCondicional()
	 * @generated
	 * @ordered
	 */
	protected TipoCondicion tipoCondicional = TIPO_CONDICIONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpresionlogica() <em>Expresionlogica</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpresionlogica()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpresionLogica> expresionlogica;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CondicionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainPackage.Literals.CONDICIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoCondicion getTipoCondicional() {
		return tipoCondicional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoCondicional(TipoCondicion newTipoCondicional) {
		TipoCondicion oldTipoCondicional = tipoCondicional;
		tipoCondicional = newTipoCondicional == null ? TIPO_CONDICIONAL_EDEFAULT : newTipoCondicional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.CONDICIONAL__TIPO_CONDICIONAL, oldTipoCondicional, tipoCondicional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpresionLogica> getExpresionlogica() {
		if (expresionlogica == null) {
			expresionlogica = new EObjectContainmentEList<ExpresionLogica>(ExpresionLogica.class, this, BlockchainPackage.CONDICIONAL__EXPRESIONLOGICA);
		}
		return expresionlogica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BlockchainPackage.CONDICIONAL__EXPRESIONLOGICA:
				return ((InternalEList<?>)getExpresionlogica()).basicRemove(otherEnd, msgs);
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
			case BlockchainPackage.CONDICIONAL__TIPO_CONDICIONAL:
				return getTipoCondicional();
			case BlockchainPackage.CONDICIONAL__EXPRESIONLOGICA:
				return getExpresionlogica();
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
			case BlockchainPackage.CONDICIONAL__TIPO_CONDICIONAL:
				setTipoCondicional((TipoCondicion)newValue);
				return;
			case BlockchainPackage.CONDICIONAL__EXPRESIONLOGICA:
				getExpresionlogica().clear();
				getExpresionlogica().addAll((Collection<? extends ExpresionLogica>)newValue);
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
			case BlockchainPackage.CONDICIONAL__TIPO_CONDICIONAL:
				setTipoCondicional(TIPO_CONDICIONAL_EDEFAULT);
				return;
			case BlockchainPackage.CONDICIONAL__EXPRESIONLOGICA:
				getExpresionlogica().clear();
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
			case BlockchainPackage.CONDICIONAL__TIPO_CONDICIONAL:
				return tipoCondicional != TIPO_CONDICIONAL_EDEFAULT;
			case BlockchainPackage.CONDICIONAL__EXPRESIONLOGICA:
				return expresionlogica != null && !expresionlogica.isEmpty();
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
		result.append(" (tipoCondicional: ");
		result.append(tipoCondicional);
		result.append(')');
		return result.toString();
	}

} //CondicionalImpl
