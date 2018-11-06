/**
 */
package blockchain.util;

import blockchain.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see blockchain.BlockchainPackage
 * @generated
 */
public class BlockchainAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BlockchainPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchainAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BlockchainPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockchainSwitch<Adapter> modelSwitch =
		new BlockchainSwitch<Adapter>() {
			@Override
			public Adapter caseAplicacion(Aplicacion object) {
				return createAplicacionAdapter();
			}
			@Override
			public Adapter caseEntidad(Entidad object) {
				return createEntidadAdapter();
			}
			@Override
			public Adapter caseAtributo(Atributo object) {
				return createAtributoAdapter();
			}
			@Override
			public Adapter caseSmartContract(SmartContract object) {
				return createSmartContractAdapter();
			}
			@Override
			public Adapter caseOperacion(Operacion object) {
				return createOperacionAdapter();
			}
			@Override
			public Adapter caseParametro(Parametro object) {
				return createParametroAdapter();
			}
			@Override
			public Adapter caseEstado(Estado object) {
				return createEstadoAdapter();
			}
			@Override
			public Adapter caseSentencia(Sentencia object) {
				return createSentenciaAdapter();
			}
			@Override
			public Adapter caseExpresionLogica(ExpresionLogica object) {
				return createExpresionLogicaAdapter();
			}
			@Override
			public Adapter casePrimitivo(Primitivo object) {
				return createPrimitivoAdapter();
			}
			@Override
			public Adapter caseTipoDato(TipoDato object) {
				return createTipoDatoAdapter();
			}
			@Override
			public Adapter caseExpresionAritmetica(ExpresionAritmetica object) {
				return createExpresionAritmeticaAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseMapa(Mapa object) {
				return createMapaAdapter();
			}
			@Override
			public Adapter caseIf(If object) {
				return createIfAdapter();
			}
			@Override
			public Adapter caseExpresion(Expresion object) {
				return createExpresionAdapter();
			}
			@Override
			public Adapter caseExpresionNumerica(ExpresionNumerica object) {
				return createExpresionNumericaAdapter();
			}
			@Override
			public Adapter caseExpresionTexto(ExpresionTexto object) {
				return createExpresionTextoAdapter();
			}
			@Override
			public Adapter caseExpresionBoolean(ExpresionBoolean object) {
				return createExpresionBooleanAdapter();
			}
			@Override
			public Adapter caseExpresionReferenciada(ExpresionReferenciada object) {
				return createExpresionReferenciadaAdapter();
			}
			@Override
			public Adapter caseExpresionRelacional(ExpresionRelacional object) {
				return createExpresionRelacionalAdapter();
			}
			@Override
			public Adapter caseExpresionBinaria(ExpresionBinaria object) {
				return createExpresionBinariaAdapter();
			}
			@Override
			public Adapter caseLinea(Linea object) {
				return createLineaAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseElse(Else object) {
				return createElseAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Aplicacion <em>Aplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Aplicacion
	 * @generated
	 */
	public Adapter createAplicacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Entidad <em>Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Entidad
	 * @generated
	 */
	public Adapter createEntidadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Atributo
	 * @generated
	 */
	public Adapter createAtributoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.SmartContract <em>Smart Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.SmartContract
	 * @generated
	 */
	public Adapter createSmartContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Operacion <em>Operacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Operacion
	 * @generated
	 */
	public Adapter createOperacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Parametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Parametro
	 * @generated
	 */
	public Adapter createParametroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Estado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Estado
	 * @generated
	 */
	public Adapter createEstadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Sentencia <em>Sentencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Sentencia
	 * @generated
	 */
	public Adapter createSentenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.ExpresionLogica <em>Expresion Logica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.ExpresionLogica
	 * @generated
	 */
	public Adapter createExpresionLogicaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Primitivo <em>Primitivo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Primitivo
	 * @generated
	 */
	public Adapter createPrimitivoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.TipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.TipoDato
	 * @generated
	 */
	public Adapter createTipoDatoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.ExpresionAritmetica <em>Expresion Aritmetica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.ExpresionAritmetica
	 * @generated
	 */
	public Adapter createExpresionAritmeticaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Mapa <em>Mapa</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Mapa
	 * @generated
	 */
	public Adapter createMapaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.If
	 * @generated
	 */
	public Adapter createIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Expresion <em>Expresion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Expresion
	 * @generated
	 */
	public Adapter createExpresionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.ExpresionNumerica <em>Expresion Numerica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.ExpresionNumerica
	 * @generated
	 */
	public Adapter createExpresionNumericaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.ExpresionTexto <em>Expresion Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.ExpresionTexto
	 * @generated
	 */
	public Adapter createExpresionTextoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.ExpresionBoolean <em>Expresion Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.ExpresionBoolean
	 * @generated
	 */
	public Adapter createExpresionBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.ExpresionReferenciada <em>Expresion Referenciada</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.ExpresionReferenciada
	 * @generated
	 */
	public Adapter createExpresionReferenciadaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.ExpresionRelacional <em>Expresion Relacional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.ExpresionRelacional
	 * @generated
	 */
	public Adapter createExpresionRelacionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.ExpresionBinaria <em>Expresion Binaria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.ExpresionBinaria
	 * @generated
	 */
	public Adapter createExpresionBinariaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Linea <em>Linea</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Linea
	 * @generated
	 */
	public Adapter createLineaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Else <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Else
	 * @generated
	 */
	public Adapter createElseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BlockchainAdapterFactory
