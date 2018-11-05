/**
 */
package blockchain.impl;

import blockchain.BlockchainPackage;
import blockchain.Condicional;
import blockchain.ExpresionLogica;
import blockchain.Linea;
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
 *   <li>{@link blockchain.impl.CondicionalImpl#getElse <em>Else</em>}</li>
 *   <li>{@link blockchain.impl.CondicionalImpl#getExpresionlogica <em>Expresionlogica</em>}</li>
 *   <li>{@link blockchain.impl.CondicionalImpl#getValidador <em>Validador</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CondicionalImpl extends MinimalEObjectImpl.Container implements Condicional {
	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected Condicional else_;

	/**
	 * The cached value of the '{@link #getExpresionlogica() <em>Expresionlogica</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpresionlogica()
	 * @generated
	 * @ordered
	 */
	protected ExpresionLogica expresionlogica;

	/**
	 * The cached value of the '{@link #getValidador() <em>Validador</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidador()
	 * @generated
	 * @ordered
	 */
	protected EList<Linea> validador;

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
	public ExpresionLogica getExpresionlogica() {
		return expresionlogica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpresionlogica(ExpresionLogica newExpresionlogica, NotificationChain msgs) {
		ExpresionLogica oldExpresionlogica = expresionlogica;
		expresionlogica = newExpresionlogica;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockchainPackage.CONDICIONAL__EXPRESIONLOGICA, oldExpresionlogica, newExpresionlogica);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpresionlogica(ExpresionLogica newExpresionlogica) {
		if (newExpresionlogica != expresionlogica) {
			NotificationChain msgs = null;
			if (expresionlogica != null)
				msgs = ((InternalEObject)expresionlogica).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockchainPackage.CONDICIONAL__EXPRESIONLOGICA, null, msgs);
			if (newExpresionlogica != null)
				msgs = ((InternalEObject)newExpresionlogica).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockchainPackage.CONDICIONAL__EXPRESIONLOGICA, null, msgs);
			msgs = basicSetExpresionlogica(newExpresionlogica, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.CONDICIONAL__EXPRESIONLOGICA, newExpresionlogica, newExpresionlogica));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Linea> getValidador() {
		if (validador == null) {
			validador = new EObjectContainmentEList<Linea>(Linea.class, this, BlockchainPackage.CONDICIONAL__VALIDADOR);
		}
		return validador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condicional getElse() {
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElse(Condicional newElse, NotificationChain msgs) {
		Condicional oldElse = else_;
		else_ = newElse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockchainPackage.CONDICIONAL__ELSE, oldElse, newElse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElse(Condicional newElse) {
		if (newElse != else_) {
			NotificationChain msgs = null;
			if (else_ != null)
				msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockchainPackage.CONDICIONAL__ELSE, null, msgs);
			if (newElse != null)
				msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockchainPackage.CONDICIONAL__ELSE, null, msgs);
			msgs = basicSetElse(newElse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.CONDICIONAL__ELSE, newElse, newElse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BlockchainPackage.CONDICIONAL__ELSE:
				return basicSetElse(null, msgs);
			case BlockchainPackage.CONDICIONAL__EXPRESIONLOGICA:
				return basicSetExpresionlogica(null, msgs);
			case BlockchainPackage.CONDICIONAL__VALIDADOR:
				return ((InternalEList<?>)getValidador()).basicRemove(otherEnd, msgs);
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
			case BlockchainPackage.CONDICIONAL__ELSE:
				return getElse();
			case BlockchainPackage.CONDICIONAL__EXPRESIONLOGICA:
				return getExpresionlogica();
			case BlockchainPackage.CONDICIONAL__VALIDADOR:
				return getValidador();
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
			case BlockchainPackage.CONDICIONAL__ELSE:
				setElse((Condicional)newValue);
				return;
			case BlockchainPackage.CONDICIONAL__EXPRESIONLOGICA:
				setExpresionlogica((ExpresionLogica)newValue);
				return;
			case BlockchainPackage.CONDICIONAL__VALIDADOR:
				getValidador().clear();
				getValidador().addAll((Collection<? extends Linea>)newValue);
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
			case BlockchainPackage.CONDICIONAL__ELSE:
				setElse((Condicional)null);
				return;
			case BlockchainPackage.CONDICIONAL__EXPRESIONLOGICA:
				setExpresionlogica((ExpresionLogica)null);
				return;
			case BlockchainPackage.CONDICIONAL__VALIDADOR:
				getValidador().clear();
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
			case BlockchainPackage.CONDICIONAL__ELSE:
				return else_ != null;
			case BlockchainPackage.CONDICIONAL__EXPRESIONLOGICA:
				return expresionlogica != null;
			case BlockchainPackage.CONDICIONAL__VALIDADOR:
				return validador != null && !validador.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CondicionalImpl
