/**
 */
package blockchain.impl;

import blockchain.BlockchainPackage;
import blockchain.Else;
import blockchain.ExpresionLogica;
import blockchain.If;
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
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockchain.impl.IfImpl#getExpresionlogica <em>Expresionlogica</em>}</li>
 *   <li>{@link blockchain.impl.IfImpl#getLineas <em>Lineas</em>}</li>
 *   <li>{@link blockchain.impl.IfImpl#getElseLines <em>Else Lines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfImpl extends MinimalEObjectImpl.Container implements If {
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
	 * The cached value of the '{@link #getLineas() <em>Lineas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineas()
	 * @generated
	 * @ordered
	 */
	protected EList<Linea> lineas;

	/**
	 * The cached value of the '{@link #getElseLines() <em>Else Lines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseLines()
	 * @generated
	 * @ordered
	 */
	protected Else elseLines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainPackage.Literals.IF;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockchainPackage.IF__EXPRESIONLOGICA, oldExpresionlogica, newExpresionlogica);
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
				msgs = ((InternalEObject)expresionlogica).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockchainPackage.IF__EXPRESIONLOGICA, null, msgs);
			if (newExpresionlogica != null)
				msgs = ((InternalEObject)newExpresionlogica).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockchainPackage.IF__EXPRESIONLOGICA, null, msgs);
			msgs = basicSetExpresionlogica(newExpresionlogica, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.IF__EXPRESIONLOGICA, newExpresionlogica, newExpresionlogica));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Linea> getLineas() {
		if (lineas == null) {
			lineas = new EObjectContainmentEList<Linea>(Linea.class, this, BlockchainPackage.IF__LINEAS);
		}
		return lineas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Else getElseLines() {
		return elseLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseLines(Else newElseLines, NotificationChain msgs) {
		Else oldElseLines = elseLines;
		elseLines = newElseLines;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockchainPackage.IF__ELSE_LINES, oldElseLines, newElseLines);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseLines(Else newElseLines) {
		if (newElseLines != elseLines) {
			NotificationChain msgs = null;
			if (elseLines != null)
				msgs = ((InternalEObject)elseLines).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockchainPackage.IF__ELSE_LINES, null, msgs);
			if (newElseLines != null)
				msgs = ((InternalEObject)newElseLines).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockchainPackage.IF__ELSE_LINES, null, msgs);
			msgs = basicSetElseLines(newElseLines, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.IF__ELSE_LINES, newElseLines, newElseLines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BlockchainPackage.IF__EXPRESIONLOGICA:
				return basicSetExpresionlogica(null, msgs);
			case BlockchainPackage.IF__LINEAS:
				return ((InternalEList<?>)getLineas()).basicRemove(otherEnd, msgs);
			case BlockchainPackage.IF__ELSE_LINES:
				return basicSetElseLines(null, msgs);
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
			case BlockchainPackage.IF__EXPRESIONLOGICA:
				return getExpresionlogica();
			case BlockchainPackage.IF__LINEAS:
				return getLineas();
			case BlockchainPackage.IF__ELSE_LINES:
				return getElseLines();
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
			case BlockchainPackage.IF__EXPRESIONLOGICA:
				setExpresionlogica((ExpresionLogica)newValue);
				return;
			case BlockchainPackage.IF__LINEAS:
				getLineas().clear();
				getLineas().addAll((Collection<? extends Linea>)newValue);
				return;
			case BlockchainPackage.IF__ELSE_LINES:
				setElseLines((Else)newValue);
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
			case BlockchainPackage.IF__EXPRESIONLOGICA:
				setExpresionlogica((ExpresionLogica)null);
				return;
			case BlockchainPackage.IF__LINEAS:
				getLineas().clear();
				return;
			case BlockchainPackage.IF__ELSE_LINES:
				setElseLines((Else)null);
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
			case BlockchainPackage.IF__EXPRESIONLOGICA:
				return expresionlogica != null;
			case BlockchainPackage.IF__LINEAS:
				return lineas != null && !lineas.isEmpty();
			case BlockchainPackage.IF__ELSE_LINES:
				return elseLines != null;
		}
		return super.eIsSet(featureID);
	}

} //IfImpl
