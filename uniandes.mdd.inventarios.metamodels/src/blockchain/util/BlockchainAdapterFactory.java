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
			public Adapter caseRetorno(Retorno object) {
				return createRetornoAdapter();
			}
			@Override
			public Adapter caseAsignacion(Asignacion object) {
				return createAsignacionAdapter();
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
			public Adapter caseSeq(Seq object) {
				return createSeqAdapter();
			}
			@Override
			public Adapter caseMap(Map object) {
				return createMapAdapter();
			}
			@Override
			public Adapter caseCondicional(Condicional object) {
				return createCondicionalAdapter();
			}
			@Override
			public Adapter caseExpresion(Expresion object) {
				return createExpresionAdapter();
			}
			@Override
			public Adapter caseValorElementos(ValorElementos object) {
				return createValorElementosAdapter();
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
	 * Creates a new adapter for an object of class '{@link blockchain.Retorno <em>Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Retorno
	 * @generated
	 */
	public Adapter createRetornoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Asignacion <em>Asignacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Asignacion
	 * @generated
	 */
	public Adapter createAsignacionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link blockchain.Seq <em>Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Seq
	 * @generated
	 */
	public Adapter createSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Map
	 * @generated
	 */
	public Adapter createMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Condicional <em>Condicional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Condicional
	 * @generated
	 */
	public Adapter createCondicionalAdapter() {
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
	 * Creates a new adapter for an object of class '{@link blockchain.ValorElementos <em>Valor Elementos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.ValorElementos
	 * @generated
	 */
	public Adapter createValorElementosAdapter() {
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