/**
 */
package blockchain.impl;

import blockchain.BlockchainPackage;
import blockchain.Expresion;
import blockchain.Sentencia;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expresion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockchain.impl.ExpresionImpl#getLadoIzq <em>Lado Izq</em>}</li>
 *   <li>{@link blockchain.impl.ExpresionImpl#getLadoDer <em>Lado Der</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExpresionImpl extends SentenciaImpl implements Expresion {
	/**
	 * The cached value of the '{@link #getLadoIzq() <em>Lado Izq</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLadoIzq()
	 * @generated
	 * @ordered
	 */
	protected Sentencia ladoIzq;

	/**
	 * The cached value of the '{@link #getLadoDer() <em>Lado Der</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLadoDer()
	 * @generated
	 * @ordered
	 */
	protected Sentencia ladoDer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpresionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainPackage.Literals.EXPRESION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sentencia getLadoIzq() {
		if (ladoIzq != null && ladoIzq.eIsProxy()) {
			InternalEObject oldLadoIzq = (InternalEObject)ladoIzq;
			ladoIzq = (Sentencia)eResolveProxy(oldLadoIzq);
			if (ladoIzq != oldLadoIzq) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockchainPackage.EXPRESION__LADO_IZQ, oldLadoIzq, ladoIzq));
			}
		}
		return ladoIzq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sentencia basicGetLadoIzq() {
		return ladoIzq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLadoIzq(Sentencia newLadoIzq) {
		Sentencia oldLadoIzq = ladoIzq;
		ladoIzq = newLadoIzq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.EXPRESION__LADO_IZQ, oldLadoIzq, ladoIzq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sentencia getLadoDer() {
		if (ladoDer != null && ladoDer.eIsProxy()) {
			InternalEObject oldLadoDer = (InternalEObject)ladoDer;
			ladoDer = (Sentencia)eResolveProxy(oldLadoDer);
			if (ladoDer != oldLadoDer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockchainPackage.EXPRESION__LADO_DER, oldLadoDer, ladoDer));
			}
		}
		return ladoDer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sentencia basicGetLadoDer() {
		return ladoDer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLadoDer(Sentencia newLadoDer) {
		Sentencia oldLadoDer = ladoDer;
		ladoDer = newLadoDer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.EXPRESION__LADO_DER, oldLadoDer, ladoDer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlockchainPackage.EXPRESION__LADO_IZQ:
				if (resolve) return getLadoIzq();
				return basicGetLadoIzq();
			case BlockchainPackage.EXPRESION__LADO_DER:
				if (resolve) return getLadoDer();
				return basicGetLadoDer();
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
			case BlockchainPackage.EXPRESION__LADO_IZQ:
				setLadoIzq((Sentencia)newValue);
				return;
			case BlockchainPackage.EXPRESION__LADO_DER:
				setLadoDer((Sentencia)newValue);
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
			case BlockchainPackage.EXPRESION__LADO_IZQ:
				setLadoIzq((Sentencia)null);
				return;
			case BlockchainPackage.EXPRESION__LADO_DER:
				setLadoDer((Sentencia)null);
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
			case BlockchainPackage.EXPRESION__LADO_IZQ:
				return ladoIzq != null;
			case BlockchainPackage.EXPRESION__LADO_DER:
				return ladoDer != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpresionImpl
