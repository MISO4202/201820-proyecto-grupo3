/**
 */
package blockchain.impl;

import blockchain.BlockchainPackage;
import blockchain.ExpresionAritmetica;
import blockchain.Operador;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expresion Aritmetica</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockchain.impl.ExpresionAritmeticaImpl#getOperador <em>Operador</em>}</li>
 *   <li>{@link blockchain.impl.ExpresionAritmeticaImpl#getSubExpArit <em>Sub Exp Arit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpresionAritmeticaImpl extends ExpresionImpl implements ExpresionAritmetica {
	/**
	 * The default value of the '{@link #getOperador() <em>Operador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperador()
	 * @generated
	 * @ordered
	 */
	protected static final Operador OPERADOR_EDEFAULT = Operador.MAS;

	/**
	 * The cached value of the '{@link #getOperador() <em>Operador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperador()
	 * @generated
	 * @ordered
	 */
	protected Operador operador = OPERADOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubExpArit() <em>Sub Exp Arit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubExpArit()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpresionAritmetica> subExpArit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpresionAritmeticaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainPackage.Literals.EXPRESION_ARITMETICA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operador getOperador() {
		return operador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperador(Operador newOperador) {
		Operador oldOperador = operador;
		operador = newOperador == null ? OPERADOR_EDEFAULT : newOperador;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.EXPRESION_ARITMETICA__OPERADOR, oldOperador, operador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpresionAritmetica> getSubExpArit() {
		if (subExpArit == null) {
			subExpArit = new EObjectResolvingEList<ExpresionAritmetica>(ExpresionAritmetica.class, this, BlockchainPackage.EXPRESION_ARITMETICA__SUB_EXP_ARIT);
		}
		return subExpArit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlockchainPackage.EXPRESION_ARITMETICA__OPERADOR:
				return getOperador();
			case BlockchainPackage.EXPRESION_ARITMETICA__SUB_EXP_ARIT:
				return getSubExpArit();
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
			case BlockchainPackage.EXPRESION_ARITMETICA__OPERADOR:
				setOperador((Operador)newValue);
				return;
			case BlockchainPackage.EXPRESION_ARITMETICA__SUB_EXP_ARIT:
				getSubExpArit().clear();
				getSubExpArit().addAll((Collection<? extends ExpresionAritmetica>)newValue);
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
			case BlockchainPackage.EXPRESION_ARITMETICA__OPERADOR:
				setOperador(OPERADOR_EDEFAULT);
				return;
			case BlockchainPackage.EXPRESION_ARITMETICA__SUB_EXP_ARIT:
				getSubExpArit().clear();
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
			case BlockchainPackage.EXPRESION_ARITMETICA__OPERADOR:
				return operador != OPERADOR_EDEFAULT;
			case BlockchainPackage.EXPRESION_ARITMETICA__SUB_EXP_ARIT:
				return subExpArit != null && !subExpArit.isEmpty();
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
		result.append(" (operador: ");
		result.append(operador);
		result.append(')');
		return result.toString();
	}

} //ExpresionAritmeticaImpl
