/**
 */
package blockchain.util;

import blockchain.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see blockchain.BlockchainPackage
 * @generated
 */
public class BlockchainSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BlockchainPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchainSwitch() {
		if (modelPackage == null) {
			modelPackage = BlockchainPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BlockchainPackage.APLICACION: {
				Aplicacion aplicacion = (Aplicacion)theEObject;
				T result = caseAplicacion(aplicacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainPackage.ENTIDAD: {
				Entidad entidad = (Entidad)theEObject;
				T result = caseEntidad(entidad);
				if (result == null) result = caseTipoDato(entidad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainPackage.ATRIBUTO: {
				Atributo atributo = (Atributo)theEObject;
				T result = caseAtributo(atributo);
				if (result == null) result = caseNamedElement(atributo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainPackage.SMART_CONTRACT: {
				SmartContract smartContract = (SmartContract)theEObject;
				T result = caseSmartContract(smartContract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainPackage.OPERACION: {
				Operacion operacion = (Operacion)theEObject;
				T result = caseOperacion(operacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainPackage.PARAMETRO: {
				Parametro parametro = (Parametro)theEObject;
				T result = caseParametro(parametro);
				if (result == null) result = caseNamedElement(parametro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainPackage.ESTADO: {
				Estado estado = (Estado)theEObject;
				T result = caseEstado(estado);
				if (result == null) result = caseNamedElement(estado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainPackage.SENTENCIA: {
				Sentencia sentencia = (Sentencia)theEObject;
				T result = caseSentencia(sentencia);
				if (result == null) result = caseLinea(sentencia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainPackage.EXPRESION_LOGICA: {
				ExpresionLogica expresionLogica = (ExpresionLogica)theEObject;
				T result = caseExpresionLogica(expresionLogica);
				if (result == null) result = caseExpresionBinaria(expresionLogica);
				if (result == null) result = caseExpresion(expresionLogica);
				if (result == null) result = caseLinea(expresionLogica);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainPackage.PRIMITIVO: {
				Primitivo primitivo = (Primitivo)theEObject;
				T result = casePrimitivo(primitivo);
				if (result == null) result = caseTipoDato(primitivo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainPackage.TIPO_DATO: {
				TipoDato tipoDato = (TipoDato)theEObject;
				T result = caseTipoDato(tipoDato);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainPackage.EXPRESION_ARITMETICA: {
				ExpresionAritmetica expresionAritmetica = (ExpresionAritmetica)theEObject;
				T result = caseExpresionAritmetica(expresionAritmetica);
				if (result == null) result = caseExpresionBinaria(expresionAritmetica);
				if (result == null) result = caseExpresion(expresionAritmetica);
				if (result == null) result = caseLinea(expresionAritmetica);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseSentencia(variable);
				if (result == null) result = caseNamedElement(variable);
				if (result == null) result = caseLinea(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainPackage.MAPA: {
				Mapa mapa = (Mapa)theEObject;
				T result = caseMapa(mapa);
				if (result == null) result = caseTipoDato(mapa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainPackage.CONDICIONAL: {
				Condicional condicional = (Condicional)theEObject;
				T result = caseCondicional(condicional);
				if (result == null) result = caseSentencia(condicional);
				if (result == null) result = caseLinea(condicional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainPackage.EXPRESION: {
				Expresion expresion = (Expresion)theEObject;
				T result = caseExpresion(expresion);
				if (result == null) result = caseLinea(expresion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainPackage.EXPRESION_NUMERICA: {
				ExpresionNumerica expresionNumerica = (ExpresionNumerica)theEObject;
				T result = caseExpresionNumerica(expresionNumerica);
				if (result == null) result = caseExpresion(expresionNumerica);
				if (result == null) result = caseLinea(expresionNumerica);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainPackage.EXPRESION_TEXTO: {
				ExpresionTexto expresionTexto = (ExpresionTexto)theEObject;
				T result = caseExpresionTexto(expresionTexto);
				if (result == null) result = caseExpresion(expresionTexto);
				if (result == null) result = caseLinea(expresionTexto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainPackage.EXPRESION_BOOLEAN: {
				ExpresionBoolean expresionBoolean = (ExpresionBoolean)theEObject;
				T result = caseExpresionBoolean(expresionBoolean);
				if (result == null) result = caseExpresion(expresionBoolean);
				if (result == null) result = caseLinea(expresionBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainPackage.EXPRESION_REFERENCIADA: {
				ExpresionReferenciada expresionReferenciada = (ExpresionReferenciada)theEObject;
				T result = caseExpresionReferenciada(expresionReferenciada);
				if (result == null) result = caseExpresion(expresionReferenciada);
				if (result == null) result = caseLinea(expresionReferenciada);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainPackage.EXPRESION_RELACIONAL: {
				ExpresionRelacional expresionRelacional = (ExpresionRelacional)theEObject;
				T result = caseExpresionRelacional(expresionRelacional);
				if (result == null) result = caseExpresionBinaria(expresionRelacional);
				if (result == null) result = caseExpresion(expresionRelacional);
				if (result == null) result = caseLinea(expresionRelacional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainPackage.EXPRESION_BINARIA: {
				ExpresionBinaria expresionBinaria = (ExpresionBinaria)theEObject;
				T result = caseExpresionBinaria(expresionBinaria);
				if (result == null) result = caseExpresion(expresionBinaria);
				if (result == null) result = caseLinea(expresionBinaria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainPackage.LINEA: {
				Linea linea = (Linea)theEObject;
				T result = caseLinea(linea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BlockchainPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aplicacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aplicacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAplicacion(Aplicacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entidad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntidad(Entidad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atributo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtributo(Atributo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Smart Contract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Smart Contract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmartContract(SmartContract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperacion(Operacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parametro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parametro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametro(Parametro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Estado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Estado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEstado(Estado object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sentencia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sentencia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSentencia(Sentencia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expresion Logica</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expresion Logica</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpresionLogica(ExpresionLogica object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitivo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitivo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitivo(Primitivo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tipo Dato</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tipo Dato</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTipoDato(TipoDato object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expresion Aritmetica</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expresion Aritmetica</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpresionAritmetica(ExpresionAritmetica object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapa</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapa</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapa(Mapa object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condicional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condicional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondicional(Condicional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expresion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expresion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpresion(Expresion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expresion Numerica</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expresion Numerica</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpresionNumerica(ExpresionNumerica object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expresion Texto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expresion Texto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpresionTexto(ExpresionTexto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expresion Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expresion Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpresionBoolean(ExpresionBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expresion Referenciada</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expresion Referenciada</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpresionReferenciada(ExpresionReferenciada object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expresion Relacional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expresion Relacional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpresionRelacional(ExpresionRelacional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expresion Binaria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expresion Binaria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpresionBinaria(ExpresionBinaria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linea</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linea</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinea(Linea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BlockchainSwitch
